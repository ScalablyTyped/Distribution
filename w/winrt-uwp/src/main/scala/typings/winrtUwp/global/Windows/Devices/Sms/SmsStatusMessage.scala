package typings.winrtUwp.global.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS status message. */
@JSGlobal("Windows.Devices.Sms.SmsStatusMessage")
@js.native
abstract class SmsStatusMessage ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsStatusMessage {
  /** Gets the body of the status message. */
  /* CompleteClass */
  override var body: String = js.native
  /** Gets the cellular class of the message. */
  /* CompleteClass */
  override var cellularClass: typings.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets the device identifier associated with the status message. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** The discharge time of the status message. */
  /* CompleteClass */
  override var dischargeTime: Date = js.native
  /** Gets the phone number that sent the status message. */
  /* CompleteClass */
  override var from: String = js.native
  /** Gets the message class of the status message. */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Gets the reference number of the status message. */
  /* CompleteClass */
  override var messageReferenceNumber: Double = js.native
  /** Gets the message type of the status message. */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** Gets the service center timestamp of the status message. */
  /* CompleteClass */
  override var serviceCenterTimestamp: Date = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  /* CompleteClass */
  override var simIccId: String = js.native
  /** The status code associated with this message. */
  /* CompleteClass */
  override var status: Double = js.native
  /** Gets the phone number the status message was sent to. */
  /* CompleteClass */
  override var to: String = js.native
}

