package com.example.email.EmailService;

import java.io.FileNotFoundException;

import javax.mail.MessagingException;

public interface EmailService {

	public void sendEmailWithAttachment(String email, String string, String string2, String string3) throws MessagingException, FileNotFoundException ;

	public void sendSimpleEmail(String email, String string, String string2) ;

}
