package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS status message. */
@JSGlobal("Windows.Devices.Sms.SmsStatusMessage")
@js.native
abstract class SmsStatusMessage () extends js.Object {
  /** Gets the body of the status message. */
  var body: java.lang.String = js.native
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the device identifier associated with the status message. */
  var deviceId: java.lang.String = js.native
  /** The discharge time of the status message. */
  var dischargeTime: stdLib.Date = js.native
  /** Gets the phone number that sent the status message. */
  var from: java.lang.String = js.native
  /** Gets the message class of the status message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the reference number of the status message. */
  var messageReferenceNumber: scala.Double = js.native
  /** Gets the message type of the status message. */
  var messageType: SmsMessageType = js.native
  /** Gets the service center timestamp of the status message. */
  var serviceCenterTimestamp: stdLib.Date = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: java.lang.String = js.native
  /** The status code associated with this message. */
  var status: scala.Double = js.native
  /** Gets the phone number the status message was sent to. */
  var to: java.lang.String = js.native
}

