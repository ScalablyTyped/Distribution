package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the network response after sending a USSD message. */
@js.native
trait UssdReply extends js.Object {
  /** Gets the message for the USSD response. */
  var message: UssdMessage = js.native
  /** Gets the result code for the USSD response. */
  var resultCode: UssdResultCode = js.native
}

object UssdReply {
  @scala.inline
  def apply(message: UssdMessage, resultCode: UssdResultCode): UssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UssdReply]
  }
  @scala.inline
  implicit class UssdReplyOps[Self <: UssdReply] (val x: Self) extends AnyVal {
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
    def setMessage(value: UssdMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCode(value: UssdResultCode): Self = this.set("resultCode", value.asInstanceOf[js.Any])
  }
  
}

