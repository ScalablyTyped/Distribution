package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an auto-reply message set on a mailbox. */
@js.native
trait EmailMailboxAutoReply extends js.Object {
  /** Gets or sets a Boolean value that indicates if the auto-reply message is enabled. */
  var isEnabled: Boolean = js.native
  /** Gets or sets the auto-reply response text. */
  var response: String = js.native
}

object EmailMailboxAutoReply {
  @scala.inline
  def apply(isEnabled: Boolean, response: String): EmailMailboxAutoReply = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAutoReply]
  }
  @scala.inline
  implicit class EmailMailboxAutoReplyOps[Self <: EmailMailboxAutoReply] (val x: Self) extends AnyVal {
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

