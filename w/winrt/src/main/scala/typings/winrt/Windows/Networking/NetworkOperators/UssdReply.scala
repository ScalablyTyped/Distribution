package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UssdReply extends IUssdReply

object UssdReply {
  @scala.inline
  def apply(message: UssdMessage, resultCode: UssdResultCode): UssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UssdReply]
  }
}

