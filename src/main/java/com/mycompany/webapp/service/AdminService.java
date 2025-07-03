package com.mycompany.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.EduProgramDao;
import com.mycompany.webapp.dao.VolProgramDao;
import com.mycompany.webapp.dto.EduProgramDto;
import com.mycompany.webapp.dto.VolProgramDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminService {
	@Autowired 
	private VolProgramDao volProgramDao;
	@Autowired
	private EduProgramDao eduProgramDao;
	
	public int registerVolProgram(VolProgramDto volProgram) {
		return volProgramDao.insertVolProgram(volProgram);
	}

	public int registerEduProgram(EduProgramDto eduProgram) {
		return eduProgramDao.insertEduProgram(eduProgram);
	}

	public VolProgramDto getVolProgram(int programNo) {
		return volProgramDao.selectVolProgramByNo(programNo);
	}

	public EduProgramDto getEduProgram(int programNo) {
		return eduProgramDao.selectEduProgramByNo(programNo);
	}

	public int modifyVolProgram(VolProgramDto volProgram) {
		return volProgramDao.updateVolProgram(volProgram);
		
	}

	public int modifyeduProgram(EduProgramDto eduProgram) {
		return eduProgramDao.updateEduProgram(eduProgram);
		
	}

	public int removeVolProgram(int programNo) {
		return volProgramDao.updateVolProgramEnabled(programNo);
	}

	public int removeEduProgram(int programNo) {
		return eduProgramDao.updateEduProgramEnabled(programNo);
	}

}
