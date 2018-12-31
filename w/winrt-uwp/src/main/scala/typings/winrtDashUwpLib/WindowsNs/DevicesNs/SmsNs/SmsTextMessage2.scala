package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage2")
@js.native
/** Constructs a new, default instance of this class. */
class SmsTextMessage2 () extends js.Object {
  /** Gets or sets the body of the text message. */
  var body: java.lang.String = js.native
  /** Gets or sets the callback number for the message. */
  var callbackNumber: java.lang.String = js.native
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the device identifier for the device associated with the SMS text message. */
  var deviceId: java.lang.String = js.native
  /** Gets or sets the encoding scheme used for the message. */
  var encoding: SmsEncoding = js.native
  /** gets the phone number of the sender of the message. */
  var from: java.lang.String = js.native
  /** Gets or sets whether text message delivery notification is enabled for this message. */
  var isDeliveryNotificationEnabled: scala.Boolean = js.native
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the message type of the message. */
  var messageType: SmsMessageType = js.native
  /** Gets the protocol identifier for the message. */
  var protocolId: scala.Double = js.native
  /** Gets or sets the number of retry attempts for the message. */
  var retryAttemptCount: scala.Double = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: java.lang.String = js.native
  /** Gets the teleservice identifier associated with this message. */
  var teleserviceId: scala.Double = js.native
  /** The timestamp of this message. */
  var timestamp: stdLib.Date = js.native
  /** Gets or sets the recipient phone number for the message. */
  var to: java.lang.String = js.native
}

