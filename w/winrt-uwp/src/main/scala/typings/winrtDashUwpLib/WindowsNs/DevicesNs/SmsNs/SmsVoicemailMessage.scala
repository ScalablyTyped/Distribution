package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS voicemail message. */
@JSGlobal("Windows.Devices.Sms.SmsVoicemailMessage")
@js.native
abstract class SmsVoicemailMessage () extends js.Object {
  /** Gets the body of the voicemail message. */
  var body: java.lang.String = js.native
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the unique device identifier associated with the message. */
  var deviceId: java.lang.String = js.native
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the number of available messages. */
  var messageCount: scala.Double = js.native
  /** Gets the type of the message. */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: java.lang.String = js.native
  /** The timestamp of the message. */
  var timestamp: stdLib.Date = js.native
  /** The phone number the message was sent to. */
  var to: java.lang.String = js.native
}

