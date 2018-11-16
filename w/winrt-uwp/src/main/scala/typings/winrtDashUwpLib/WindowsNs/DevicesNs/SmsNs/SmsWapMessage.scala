package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an SMS WAP push message. */
@JSGlobal("Windows.Devices.Sms.SmsWapMessage")
@js.native
abstract class SmsWapMessage () extends js.Object {
  /** Gets the value of the X-Wap-Application-Id header of the SmsWapMessage . */
  var applicationId: java.lang.String = js.native
  /** Gets the binary body of the blob in the SmsWapMessage . */
  var binaryBody: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the cellular class of the SMS device that received the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the value of the Content-Type header in the SmsWapMessage . Parameters are presents in the Headers property. */
  var contentType: java.lang.String = js.native
  /** Gets the device information ID of the SmsDevice that receives the SmsWapMessage . */
  var deviceId: java.lang.String = js.native
  /** Gets the phone number of the sender of the SmsWapMessage . */
  var from: java.lang.String = js.native
  /** Gets the header name-value pairs of the WAP push message. */
  var headers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets the message class of the SmsWapMessage . */
  var messageClass: SmsMessageClass = js.native
  /** Gets the message type of the SmsWapMessage . */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: java.lang.String = js.native
  /** Gets the timestamp of the SmsWapMessage . */
  var timestamp: stdLib.Date = js.native
  /** Gets the recipient phone number of this SmsWapMessage . */
  var to: java.lang.String = js.native
}

