package typings.winrtUwp.global.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS voicemail message. */
@JSGlobal("Windows.Devices.Sms.SmsVoicemailMessage")
@js.native
abstract class SmsVoicemailMessage ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsVoicemailMessage {
  /** Gets the body of the voicemail message. */
  /* CompleteClass */
  override var body: String = js.native
  /** Gets the cellular class of the message. */
  /* CompleteClass */
  override var cellularClass: typings.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets the unique device identifier associated with the message. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the message class of the message. */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Gets the number of available messages. */
  /* CompleteClass */
  override var messageCount: Double = js.native
  /** Gets the type of the message. */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  /* CompleteClass */
  override var simIccId: String = js.native
  /** The timestamp of the message. */
  /* CompleteClass */
  override var timestamp: Date = js.native
  /** The phone number the message was sent to. */
  /* CompleteClass */
  override var to: String = js.native
}

