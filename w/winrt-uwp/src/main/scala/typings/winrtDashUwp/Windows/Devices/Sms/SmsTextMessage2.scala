package typings.winrtDashUwp.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage2")
@js.native
/** Constructs a new, default instance of this class. */
class SmsTextMessage2 () extends js.Object {
  /** Gets or sets the body of the text message. */
  var body: String = js.native
  /** Gets or sets the callback number for the message. */
  var callbackNumber: String = js.native
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the device identifier for the device associated with the SMS text message. */
  var deviceId: String = js.native
  /** Gets or sets the encoding scheme used for the message. */
  var encoding: SmsEncoding = js.native
  /** gets the phone number of the sender of the message. */
  var from: String = js.native
  /** Gets or sets whether text message delivery notification is enabled for this message. */
  var isDeliveryNotificationEnabled: Boolean = js.native
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the message type of the message. */
  var messageType: SmsMessageType = js.native
  /** Gets the protocol identifier for the message. */
  var protocolId: Double = js.native
  /** Gets or sets the number of retry attempts for the message. */
  var retryAttemptCount: Double = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** Gets the teleservice identifier associated with this message. */
  var teleserviceId: Double = js.native
  /** The timestamp of this message. */
  var timestamp: Date = js.native
  /** Gets or sets the recipient phone number for the message. */
  var to: String = js.native
}

