package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface specifies base functionality for all SMS message types. */
@js.native
trait ISmsMessageBase extends js.Object {
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the unique device identifier associated with this message. */
  var deviceId: String = js.native
  /** Gets the message class of this message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the message type of this message. */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
}

object ISmsMessageBase {
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    deviceId: String,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    simIccId: String
  ): ISmsMessageBase = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsMessageBase]
  }
  @scala.inline
  implicit class ISmsMessageBaseOps[Self <: ISmsMessageBase] (val x: Self) extends AnyVal {
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
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = this.set("messageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimIccId(value: String): Self = this.set("simIccId", value.asInstanceOf[js.Any])
  }
  
}

