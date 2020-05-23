package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the network response after sending a USSD message. */
trait UssdReply extends js.Object {
  /** Gets the message for the USSD response. */
  var message: UssdMessage
  /** Gets the result code for the USSD response. */
  var resultCode: UssdResultCode
}

object UssdReply {
  @scala.inline
  def apply(message: UssdMessage, resultCode: UssdResultCode): UssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UssdReply]
  }
}

