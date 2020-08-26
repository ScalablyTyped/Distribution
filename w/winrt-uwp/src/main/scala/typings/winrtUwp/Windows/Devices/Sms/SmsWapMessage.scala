package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an SMS WAP push message. */
@js.native
trait SmsWapMessage extends js.Object {
  /** Gets the value of the X-Wap-Application-Id header of the SmsWapMessage . */
  var applicationId: String = js.native
  /** Gets the binary body of the blob in the SmsWapMessage . */
  var binaryBody: IBuffer = js.native
  /** Gets the cellular class of the SMS device that received the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the value of the Content-Type header in the SmsWapMessage . Parameters are presents in the Headers property. */
  var contentType: String = js.native
  /** Gets the device information ID of the SmsDevice that receives the SmsWapMessage . */
  var deviceId: String = js.native
  /** Gets the phone number of the sender of the SmsWapMessage . */
  var from: String = js.native
  /** Gets the header name-value pairs of the WAP push message. */
  var headers: IMap[String, String] = js.native
  /** Gets the message class of the SmsWapMessage . */
  var messageClass: SmsMessageClass = js.native
  /** Gets the message type of the SmsWapMessage . */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** Gets the timestamp of the SmsWapMessage . */
  var timestamp: Date = js.native
  /** Gets the recipient phone number of this SmsWapMessage . */
  var to: String = js.native
}

object SmsWapMessage {
  @scala.inline
  def apply(
    applicationId: String,
    binaryBody: IBuffer,
    cellularClass: CellularClass,
    contentType: String,
    deviceId: String,
    from: String,
    headers: IMap[String, String],
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    simIccId: String,
    timestamp: Date,
    to: String
  ): SmsWapMessage = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], binaryBody = binaryBody.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsWapMessage]
  }
  @scala.inline
  implicit class SmsWapMessageOps[Self <: SmsWapMessage] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: String): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinaryBody(value: IBuffer): Self = this.set("binaryBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: IMap[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = this.set("messageClass", value.asInstanceOf[js.Any])
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

