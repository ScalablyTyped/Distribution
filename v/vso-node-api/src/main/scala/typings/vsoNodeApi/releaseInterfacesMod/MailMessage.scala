package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMessage extends StObject {
  
  var body: String = js.native
  
  var cC: EmailRecipients = js.native
  
  var inReplyTo: String = js.native
  
  var messageId: String = js.native
  
  var replyBy: Date = js.native
  
  var replyTo: EmailRecipients = js.native
  
  var sections: js.Array[MailSectionType] = js.native
  
  var senderType: SenderType = js.native
  
  var subject: String = js.native
  
  var to: EmailRecipients = js.native
}
object MailMessage {
  
  @scala.inline
  def apply(
    body: String,
    cC: EmailRecipients,
    inReplyTo: String,
    messageId: String,
    replyBy: Date,
    replyTo: EmailRecipients,
    sections: js.Array[MailSectionType],
    senderType: SenderType,
    subject: String,
    to: EmailRecipients
  ): MailMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cC = cC.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], replyBy = replyBy.asInstanceOf[js.Any], replyTo = replyTo.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], senderType = senderType.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMessage]
  }
  
  @scala.inline
  implicit class MailMessageMutableBuilder[Self <: MailMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: EmailRecipients): Self = StObject.set(x, "cC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyBy(value: Date): Self = StObject.set(x, "replyBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyTo(value: EmailRecipients): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSections(value: js.Array[MailSectionType]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: MailSectionType*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setSenderType(value: SenderType): Self = StObject.set(x, "senderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: EmailRecipients): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
