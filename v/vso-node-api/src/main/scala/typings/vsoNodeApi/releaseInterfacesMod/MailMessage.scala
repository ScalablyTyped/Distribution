package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMessage extends StObject {
  
  var body: String
  
  var cC: EmailRecipients
  
  var inReplyTo: String
  
  var messageId: String
  
  var replyBy: js.Date
  
  var replyTo: EmailRecipients
  
  var sections: js.Array[MailSectionType]
  
  var senderType: SenderType
  
  var subject: String
  
  var to: EmailRecipients
}
object MailMessage {
  
  inline def apply(
    body: String,
    cC: EmailRecipients,
    inReplyTo: String,
    messageId: String,
    replyBy: js.Date,
    replyTo: EmailRecipients,
    sections: js.Array[MailSectionType],
    senderType: SenderType,
    subject: String,
    to: EmailRecipients
  ): MailMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cC = cC.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], replyBy = replyBy.asInstanceOf[js.Any], replyTo = replyTo.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], senderType = senderType.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMessage]
  }
  
  extension [Self <: MailMessage](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCC(value: EmailRecipients): Self = StObject.set(x, "cC", value.asInstanceOf[js.Any])
    
    inline def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setReplyBy(value: js.Date): Self = StObject.set(x, "replyBy", value.asInstanceOf[js.Any])
    
    inline def setReplyTo(value: EmailRecipients): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[MailSectionType]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: MailSectionType*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setSenderType(value: SenderType): Self = StObject.set(x, "senderType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTo(value: EmailRecipients): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
