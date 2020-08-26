package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a broadcast SMS message. */
@js.native
trait SmsBroadcastMessage extends js.Object {
  /** Gets the body of the broadcast SMS message. */
  var body: String = js.native
  /** Gets the type of this broadcast SMS message. */
  var broadcastType: SmsBroadcastType = js.native
  /** Gets the cellular class of this broadcast message. */
  var cellularClass: CellularClass = js.native
  /** Gets the channel associated with the broadcast SMS message. */
  var channel: Double = js.native
  /** Gets the device ID of the device that received the broadcast SMS message. */
  var deviceId: String = js.native
  /** Gets the geographical scope associated with this broadcast SMS message. */
  var geographicalScope: SmsGeographicalScope = js.native
  /** True when the broadcast SMS message is an emergency alert. */
  var isEmergencyAlert: Boolean = js.native
  /** True when a user popup is requested by this broadcast SMS message. */
  var isUserPopupRequested: Boolean = js.native
  /** Gets the message class associated with this broadcast SMS message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets a code value associated with this broadcast SMS message. */
  var messageCode: Double = js.native
  /** Gets the message type of the broadcast SMS message. */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** Gets the timestamp of the broadcast SMS message. */
  var timestamp: Date = js.native
  /** Gets the recipient phone number of the broadcast SMS message. */
  var to: String = js.native
  /** Gets the update number associated with this broadcast SMS message. */
  var updateNumber: Double = js.native
}

object SmsBroadcastMessage {
  @scala.inline
  def apply(
    body: String,
    broadcastType: SmsBroadcastType,
    cellularClass: CellularClass,
    channel: Double,
    deviceId: String,
    geographicalScope: SmsGeographicalScope,
    isEmergencyAlert: Boolean,
    isUserPopupRequested: Boolean,
    messageClass: SmsMessageClass,
    messageCode: Double,
    messageType: SmsMessageType,
    simIccId: String,
    timestamp: Date,
    to: String,
    updateNumber: Double
  ): SmsBroadcastMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], broadcastType = broadcastType.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], geographicalScope = geographicalScope.asInstanceOf[js.Any], isEmergencyAlert = isEmergencyAlert.asInstanceOf[js.Any], isUserPopupRequested = isUserPopupRequested.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageCode = messageCode.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], updateNumber = updateNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsBroadcastMessage]
  }
  @scala.inline
  implicit class SmsBroadcastMessageOps[Self <: SmsBroadcastMessage] (val x: Self) extends AnyVal {
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
    def setBroadcastType(value: SmsBroadcastType): Self = this.set("broadcastType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Double): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeographicalScope(value: SmsGeographicalScope): Self = this.set("geographicalScope", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEmergencyAlert(value: Boolean): Self = this.set("isEmergencyAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUserPopupRequested(value: Boolean): Self = this.set("isUserPopupRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = this.set("messageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageCode(value: Double): Self = this.set("messageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimIccId(value: String): Self = this.set("simIccId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateNumber(value: Double): Self = this.set("updateNumber", value.asInstanceOf[js.Any])
  }
  
}

