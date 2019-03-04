package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
    val __obj = js.Dynamic.literal(message = message, resultCode = resultCode)
  
    __obj.asInstanceOf[IUssdReply]
  }
}

