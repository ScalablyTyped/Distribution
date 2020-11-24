package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMessage extends js.Object {
  
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
  implicit class MailMessageOps[Self <: MailMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: EmailRecipients): Self = this.set("cC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyTo(value: String): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyBy(value: Date): Self = this.set("replyBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyTo(value: EmailRecipients): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: MailSectionType*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[MailSectionType]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderType(value: SenderType): Self = this.set("senderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: EmailRecipients): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
