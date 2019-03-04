package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMessage extends js.Object {
  var body: java.lang.String
  var cC: EmailRecipients
  var inReplyTo: java.lang.String
  var messageId: java.lang.String
  var replyBy: stdLib.Date
  var replyTo: EmailRecipients
  var sections: js.Array[MailSectionType]
  var senderType: SenderType
  var subject: java.lang.String
  var to: EmailRecipients
}

object MailMessage {
  @scala.inline
  def apply(
    body: java.lang.String,
    cC: EmailRecipients,
    inReplyTo: java.lang.String,
    messageId: java.lang.String,
    replyBy: stdLib.Date,
    replyTo: EmailRecipients,
    sections: js.Array[MailSectionType],
    senderType: SenderType,
    subject: java.lang.String,
    to: EmailRecipients
  ): MailMessage = {
    val __obj = js.Dynamic.literal(body = body, cC = cC, inReplyTo = inReplyTo, messageId = messageId, replyBy = replyBy, replyTo = replyTo, sections = sections, senderType = senderType, subject = subject, to = to)
  
    __obj.asInstanceOf[MailMessage]
  }
}

