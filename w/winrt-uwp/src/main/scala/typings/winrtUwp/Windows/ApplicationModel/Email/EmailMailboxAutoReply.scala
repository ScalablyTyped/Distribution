package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an auto-reply message set on a mailbox. */
trait EmailMailboxAutoReply extends js.Object {
  /** Gets or sets a Boolean value that indicates if the auto-reply message is enabled. */
  var isEnabled: Boolean
  /** Gets or sets the auto-reply response text. */
  var response: String
}

object EmailMailboxAutoReply {
  @scala.inline
  def apply(isEnabled: Boolean, response: String): EmailMailboxAutoReply = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAutoReply]
  }
}

