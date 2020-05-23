package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Presents the details of SMS message events to the background work item that handles messages while your app is suspended. */
trait SmsReceivedEventDetails extends js.Object {
  /** Gets the binary message object for the SMS message received by the background task. */
  var binaryMessage: SmsBinaryMessage
  /** Returns the DeviceInformation ID of the network interface that received the SMS message. This ID can be passed to SmsDevice.FromIdAsync to activate the device and retrieve additional message details. */
  var deviceId: String
  /** Gets the message class for the SMS message received by the background task. */
  var messageClass: SmsMessageClass
  /** Returns the index of the new message that raised the event. You can pass this to SmsDevice.GetMessageAsync to retrieve the new message itself. */
  var messageIndex: Double
}

object SmsReceivedEventDetails {
  @scala.inline
  def apply(
    binaryMessage: SmsBinaryMessage,
    deviceId: String,
    messageClass: SmsMessageClass,
    messageIndex: Double
  ): SmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageIndex = messageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsReceivedEventDetails]
  }
}

