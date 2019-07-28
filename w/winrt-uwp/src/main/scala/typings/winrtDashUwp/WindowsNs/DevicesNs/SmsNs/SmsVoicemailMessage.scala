package typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS voicemail message. */
@JSGlobal("Windows.Devices.Sms.SmsVoicemailMessage")
@js.native
abstract class SmsVoicemailMessage () extends js.Object {
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

