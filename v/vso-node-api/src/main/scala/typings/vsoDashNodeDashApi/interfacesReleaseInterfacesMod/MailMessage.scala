package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMessage extends js.Object {
  var body: String
  var cC: EmailRecipients
  var inReplyTo: String
  var messageId: String
  var replyBy: Date
  var replyTo: EmailRecipients
  var sections: js.Array[MailSectionType]
  var senderType: SenderType
  var subject: String
  var to: EmailRecipients
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
}

