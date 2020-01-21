package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an auto-reply message set on a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReply")
@js.native
abstract class EmailMailboxAutoReply () extends js.Object {
  /** Gets or sets a Boolean value that indicates if the auto-reply message is enabled. */
  var isEnabled: Boolean = js.native
  /** Gets or sets the auto-reply response text. */
  var response: String = js.native
}

