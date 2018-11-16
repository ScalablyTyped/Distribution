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

