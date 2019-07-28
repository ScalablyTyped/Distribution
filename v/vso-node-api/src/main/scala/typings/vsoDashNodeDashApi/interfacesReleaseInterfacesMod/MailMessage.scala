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
    val __obj = js.Dynamic.literal(body = body, cC = cC, inReplyTo = inReplyTo, messageId = messageId, replyBy = replyBy, replyTo = replyTo, sections = sections, senderType = senderType, subject = subject, to = to)
  
    __obj.asInstanceOf[MailMessage]
  }
}

