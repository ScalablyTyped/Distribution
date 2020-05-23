package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
trait SmsTextMessage2 extends js.Object {
  /** Gets or sets the body of the text message. */
  var body: String
  /** Gets or sets the callback number for the message. */
  var callbackNumber: String
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  /** Gets the device identifier for the device associated with the SMS text message. */
  var deviceId: String
  /** Gets or sets the encoding scheme used for the message. */
  var encoding: SmsEncoding
  /** gets the phone number of the sender of the message. */
  var from: String
  /** Gets or sets whether text message delivery notification is enabled for this message. */
  var isDeliveryNotificationEnabled: Boolean
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass
  /** Gets the message type of the message. */
  var messageType: SmsMessageType
  /** Gets the protocol identifier for the message. */
  var protocolId: Double
  /** Gets or sets the number of retry attempts for the message. */
  var retryAttemptCount: Double
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
  /** Gets the teleservice identifier associated with this message. */
  var teleserviceId: Double
  /** The timestamp of this message. */
  var timestamp: Date
  /** Gets or sets the recipient phone number for the message. */
  var to: String
}

object SmsTextMessage2 {
  @scala.inline
  def apply(
    body: String,
    callbackNumber: String,
    cellularClass: CellularClass,
    deviceId: String,
    encoding: SmsEncoding,
    from: String,
    isDeliveryNotificationEnabled: Boolean,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    protocolId: Double,
    retryAttemptCount: Double,
    simIccId: String,
    teleserviceId: Double,
    timestamp: Date,
    to: String
  ): SmsTextMessage2 = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], callbackNumber = callbackNumber.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDeliveryNotificationEnabled = isDeliveryNotificationEnabled.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], protocolId = protocolId.asInstanceOf[js.Any], retryAttemptCount = retryAttemptCount.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], teleserviceId = teleserviceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsTextMessage2]
  }
}

