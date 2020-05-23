package typings.winrtUwp.global.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage2")
@js.native
/** Constructs a new, default instance of this class. */
class SmsTextMessage2 ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage2 {
  /** Gets or sets the body of the text message. */
  /* CompleteClass */
  override var body: String = js.native
  /** Gets or sets the callback number for the message. */
  /* CompleteClass */
  override var callbackNumber: String = js.native
  /** Gets the cellular class of the message. */
  /* CompleteClass */
  override var cellularClass: typings.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets the device identifier for the device associated with the SMS text message. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets or sets the encoding scheme used for the message. */
  /* CompleteClass */
  override var encoding: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding = js.native
  /** gets the phone number of the sender of the message. */
  /* CompleteClass */
  override var from: String = js.native
  /** Gets or sets whether text message delivery notification is enabled for this message. */
  /* CompleteClass */
  override var isDeliveryNotificationEnabled: Boolean = js.native
  /** Gets the message class of the message. */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Gets the message type of the message. */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** Gets the protocol identifier for the message. */
  /* CompleteClass */
  override var protocolId: Double = js.native
  /** Gets or sets the number of retry attempts for the message. */
  /* CompleteClass */
  override var retryAttemptCount: Double = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  /* CompleteClass */
  override var simIccId: String = js.native
  /** Gets the teleservice identifier associated with this message. */
  /* CompleteClass */
  override var teleserviceId: Double = js.native
  /** The timestamp of this message. */
  /* CompleteClass */
  override var timestamp: Date = js.native
  /** Gets or sets the recipient phone number for the message. */
  /* CompleteClass */
  override var to: String = js.native
}

