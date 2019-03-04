package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsMessage extends js.Object {
  var id: scala.Double
  var messageClass: SmsMessageClass
}

object ISmsMessage {
  @scala.inline
  def apply(id: scala.Double, messageClass: SmsMessageClass): ISmsMessage = {
    val __obj = js.Dynamic.literal(id = id, messageClass = messageClass)
  
    __obj.asInstanceOf[ISmsMessage]
  }
}

