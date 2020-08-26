package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS voicemail message. */
@js.native
trait SmsVoicemailMessage extends js.Object {
  /** Gets the body of the voicemail message. */
  var body: String = js.native
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the unique device identifier associated with the message. */
  var deviceId: String = js.native
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the number of available messages. */
  var messageCount: Double = js.native
  /** Gets the type of the message. */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** The timestamp of the message. */
  var timestamp: Date = js.native
  /** The phone number the message was sent to. */
  var to: String = js.native
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
  @scala.inline
  implicit class SmsVoicemailMessageOps[Self <: SmsVoicemailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = this.set("messageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageCount(value: Double): Self = this.set("messageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimIccId(value: String): Self = this.set("simIccId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

