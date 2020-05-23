package typings.winrtUwp.global.Windows.Devices.Sms

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a broadcast SMS message. */
@JSGlobal("Windows.Devices.Sms.SmsBroadcastMessage")
@js.native
abstract class SmsBroadcastMessage ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastMessage {
  /** Gets the body of the broadcast SMS message. */
  /* CompleteClass */
  override var body: String = js.native
  /** Gets the type of this broadcast SMS message. */
  /* CompleteClass */
  override var broadcastType: typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType = js.native
  /** Gets the cellular class of this broadcast message. */
  /* CompleteClass */
  override var cellularClass: typings.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets the channel associated with the broadcast SMS message. */
  /* CompleteClass */
  override var channel: Double = js.native
  /** Gets the device ID of the device that received the broadcast SMS message. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the geographical scope associated with this broadcast SMS message. */
  /* CompleteClass */
  override var geographicalScope: typings.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope = js.native
  /** True when the broadcast SMS message is an emergency alert. */
  /* CompleteClass */
  override var isEmergencyAlert: Boolean = js.native
  /** True when a user popup is requested by this broadcast SMS message. */
  /* CompleteClass */
  override var isUserPopupRequested: Boolean = js.native
  /** Gets the message class associated with this broadcast SMS message. */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Gets a code value associated with this broadcast SMS message. */
  /* CompleteClass */
  override var messageCode: Double = js.native
  /** Gets the message type of the broadcast SMS message. */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  /* CompleteClass */
  override var simIccId: String = js.native
  /** Gets the timestamp of the broadcast SMS message. */
  /* CompleteClass */
  override var timestamp: Date = js.native
  /** Gets the recipient phone number of the broadcast SMS message. */
  /* CompleteClass */
  override var to: String = js.native
  /** Gets the update number associated with this broadcast SMS message. */
  /* CompleteClass */
  override var updateNumber: Double = js.native
}

