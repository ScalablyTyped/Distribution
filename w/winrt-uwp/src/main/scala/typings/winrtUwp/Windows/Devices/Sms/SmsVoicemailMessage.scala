package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS voicemail message. */
trait SmsVoicemailMessage extends js.Object {
  /** Gets the body of the voicemail message. */
  var body: String
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  /** Gets the unique device identifier associated with the message. */
  var deviceId: String
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass
  /** Gets the number of available messages. */
  var messageCount: Double
  /** Gets the type of the message. */
  var messageType: SmsMessageType
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
  /** The timestamp of the message. */
  var timestamp: Date
  /** The phone number the message was sent to. */
  var to: String
}

object SmsVoicemailMessage {
  @scala.inline
  def apply(
    body: String,
    cellularClass: CellularClass,
    deviceId: String,
    messageClass: SmsMessageClass,
    messageCount: Double,
    messageType: SmsMessageType,
    simIccId: String,
    timestamp: Date,
    to: String
  ): SmsVoicemailMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsVoicemailMessage]
  }
}

