package typings.winrtUwp.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS status message. */
trait SmsStatusMessage extends js.Object {
  /** Gets the body of the status message. */
  var body: String
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  /** Gets the device identifier associated with the status message. */
  var deviceId: String
  /** The discharge time of the status message. */
  var dischargeTime: Date
  /** Gets the phone number that sent the status message. */
  var from: String
  /** Gets the message class of the status message. */
  var messageClass: SmsMessageClass
  /** Gets the reference number of the status message. */
  var messageReferenceNumber: Double
  /** Gets the message type of the status message. */
  var messageType: SmsMessageType
  /** Gets the service center timestamp of the status message. */
  var serviceCenterTimestamp: Date
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
  /** The status code associated with this message. */
  var status: Double
  /** Gets the phone number the status message was sent to. */
  var to: String
}

object SmsStatusMessage {
  @scala.inline
  def apply(
    body: String,
    cellularClass: CellularClass,
    deviceId: String,
    dischargeTime: Date,
    from: String,
    messageClass: SmsMessageClass,
    messageReferenceNumber: Double,
    messageType: SmsMessageType,
    serviceCenterTimestamp: Date,
    simIccId: String,
    status: Double,
    to: String
  ): SmsStatusMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], dischargeTime = dischargeTime.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageReferenceNumber = messageReferenceNumber.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], serviceCenterTimestamp = serviceCenterTimestamp.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsStatusMessage]
  }
}

