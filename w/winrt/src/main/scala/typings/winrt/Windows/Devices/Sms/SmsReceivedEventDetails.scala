package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsReceivedEventDetails extends ISmsReceivedEventDetails

object SmsReceivedEventDetails {
  @scala.inline
  def apply(deviceId: String, messageIndex: Double): SmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], messageIndex = messageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsReceivedEventDetails]
  }
}

