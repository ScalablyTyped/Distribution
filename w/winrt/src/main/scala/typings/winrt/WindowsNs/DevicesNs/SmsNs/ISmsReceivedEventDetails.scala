package typings.winrt.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsReceivedEventDetails extends js.Object {
  var deviceId: String
  var messageIndex: Double
}

object ISmsReceivedEventDetails {
  @scala.inline
  def apply(deviceId: String, messageIndex: Double): ISmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, messageIndex = messageIndex)
  
    __obj.asInstanceOf[ISmsReceivedEventDetails]
  }
}

