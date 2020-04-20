package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdReply extends js.Object {
  var message: UssdMessage
  var resultCode: UssdResultCode
}

object IUssdReply {
  @scala.inline
  def apply(message: UssdMessage, resultCode: UssdResultCode): IUssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUssdReply]
  }
}

