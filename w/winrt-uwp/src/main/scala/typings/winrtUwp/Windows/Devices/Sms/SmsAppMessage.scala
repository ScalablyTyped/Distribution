package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface for manipulating an SMS Application message. Application messages are those which cannot be characterized as any other message type. */
trait SmsAppMessage extends js.Object {
  /** Reads or writes the binary part of the Application message. */
  var binaryBody: IBuffer
  /** The plain text body of the message. */
  var body: String
  /** The number to be dialed in reply to a received SMS message. */
  var callbackNumber: String
  /** The class of the cellular device that received the message. */
  var cellularClass: CellularClass
  /** The device ID of the device that received the message. */
  var deviceId: String
  /** The encoding used to send the message. */
  var encoding: SmsEncoding
  /** The telephone number of the sender of the message. */
  var from: String
  /** Indicates whether an SMS delivery status report was sent by the SMSC. */
  var isDeliveryNotificationEnabled: Boolean
  /** The message class of the message. */
  var messageClass: SmsMessageClass
  /** The message type of the message. */
  var messageType: SmsMessageType
  /** The port number of the message. */
  var portNumber: Double
  /** The Protocol identifier for the message. */
  var protocolId: Double
  /** The retry attempt count for the message. */
  var retryAttemptCount: Double
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
  /** The Teleservice identifier for the message. */
  var teleserviceId: Double
  /** The timestamp of the message. */
  var timestamp: Date
  /** The telephone number of the recipient of this message. */
  var to: String
}

object SmsAppMessage {
  @scala.inline
  def apply(
    binaryBody: IBuffer,
    body: String,
    callbackNumber: String,
    cellularClass: CellularClass,
    deviceId: String,
    encoding: SmsEncoding,
    from: String,
    isDeliveryNotificationEnabled: Boolean,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    portNumber: Double,
    protocolId: Double,
    retryAttemptCount: Double,
    simIccId: String,
    teleserviceId: Double,
    timestamp: Date,
    to: String
  ): SmsAppMessage = {
    val __obj = js.Dynamic.literal(binaryBody = binaryBody.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], callbackNumber = callbackNumber.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDeliveryNotificationEnabled = isDeliveryNotificationEnabled.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], portNumber = portNumber.asInstanceOf[js.Any], protocolId = protocolId.asInstanceOf[js.Any], retryAttemptCount = retryAttemptCount.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], teleserviceId = teleserviceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsAppMessage]
  }
}

