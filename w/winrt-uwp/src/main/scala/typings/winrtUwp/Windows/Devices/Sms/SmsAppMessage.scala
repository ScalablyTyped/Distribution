package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface for manipulating an SMS Application message. Application messages are those which cannot be characterized as any other message type. */
@JSGlobal("Windows.Devices.Sms.SmsAppMessage")
@js.native
/** Constructor. Used to create an SmsAppMessage prior to sending it. */
class SmsAppMessage () extends js.Object {
  /** Reads or writes the binary part of the Application message. */
  var binaryBody: IBuffer = js.native
  /** The plain text body of the message. */
  var body: String = js.native
  /** The number to be dialed in reply to a received SMS message. */
  var callbackNumber: String = js.native
  /** The class of the cellular device that received the message. */
  var cellularClass: CellularClass = js.native
  /** The device ID of the device that received the message. */
  var deviceId: String = js.native
  /** The encoding used to send the message. */
  var encoding: SmsEncoding = js.native
  /** The telephone number of the sender of the message. */
  var from: String = js.native
  /** Indicates whether an SMS delivery status report was sent by the SMSC. */
  var isDeliveryNotificationEnabled: Boolean = js.native
  /** The message class of the message. */
  var messageClass: SmsMessageClass = js.native
  /** The message type of the message. */
  var messageType: SmsMessageType = js.native
  /** The port number of the message. */
  var portNumber: Double = js.native
  /** The Protocol identifier for the message. */
  var protocolId: Double = js.native
  /** The retry attempt count for the message. */
  var retryAttemptCount: Double = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** The Teleservice identifier for the message. */
  var teleserviceId: Double = js.native
  /** The timestamp of the message. */
  var timestamp: Date = js.native
  /** The telephone number of the recipient of this message. */
  var to: String = js.native
}

