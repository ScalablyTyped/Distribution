package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsReceivedEventDetails extends js.Object {
  var deviceId: java.lang.String
  var messageIndex: scala.Double
}

object ISmsReceivedEventDetails {
  @scala.inline
  def apply(deviceId: java.lang.String, messageIndex: scala.Double): ISmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, messageIndex = messageIndex)
  
    __obj.asInstanceOf[ISmsReceivedEventDetails]
  }
}

