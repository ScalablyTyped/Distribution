package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Presents the details of SMS message events to the background work item that handles messages while your app is suspended. */
@JSGlobal("Windows.Devices.Sms.SmsReceivedEventDetails")
@js.native
abstract class SmsReceivedEventDetails ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsReceivedEventDetails {
  /** Gets the binary message object for the SMS message received by the background task. */
  /* CompleteClass */
  override var binaryMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage = js.native
  /** Returns the DeviceInformation ID of the network interface that received the SMS message. This ID can be passed to SmsDevice.FromIdAsync to activate the device and retrieve additional message details. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the message class for the SMS message received by the background task. */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Returns the index of the new message that raised the event. You can pass this to SmsDevice.GetMessageAsync to retrieve the new message itself. */
  /* CompleteClass */
  override var messageIndex: Double = js.native
}

