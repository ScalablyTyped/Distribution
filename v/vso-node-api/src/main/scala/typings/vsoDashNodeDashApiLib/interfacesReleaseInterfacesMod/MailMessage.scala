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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("cC")(cC)
    __obj.updateDynamic("inReplyTo")(inReplyTo)
    __obj.updateDynamic("messageId")(messageId)
    __obj.updateDynamic("replyBy")(replyBy)
    __obj.updateDynamic("replyTo")(replyTo)
    __obj.updateDynamic("sections")(sections)
    __obj.updateDynamic("senderType")(senderType)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[MailMessage]
  }
}

