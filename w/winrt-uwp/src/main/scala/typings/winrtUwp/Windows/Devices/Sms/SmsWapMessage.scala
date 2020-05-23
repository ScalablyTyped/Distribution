package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an SMS WAP push message. */
trait SmsWapMessage extends js.Object {
  /** Gets the value of the X-Wap-Application-Id header of the SmsWapMessage . */
  var applicationId: String
  /** Gets the binary body of the blob in the SmsWapMessage . */
  var binaryBody: IBuffer
  /** Gets the cellular class of the SMS device that received the message. */
  var cellularClass: CellularClass
  /** Gets the value of the Content-Type header in the SmsWapMessage . Parameters are presents in the Headers property. */
  var contentType: String
  /** Gets the device information ID of the SmsDevice that receives the SmsWapMessage . */
  var deviceId: String
  /** Gets the phone number of the sender of the SmsWapMessage . */
  var from: String
  /** Gets the header name-value pairs of the WAP push message. */
  var headers: IMap[String, String]
  /** Gets the message class of the SmsWapMessage . */
  var messageClass: SmsMessageClass
  /** Gets the message type of the SmsWapMessage . */
  var messageType: SmsMessageType
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
  /** Gets the timestamp of the SmsWapMessage . */
  var timestamp: Date
  /** Gets the recipient phone number of this SmsWapMessage . */
  var to: String
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
}

