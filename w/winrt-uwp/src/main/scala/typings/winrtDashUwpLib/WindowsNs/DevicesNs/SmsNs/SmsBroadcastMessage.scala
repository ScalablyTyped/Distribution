package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a broadcast SMS message. */
@JSGlobal("Windows.Devices.Sms.SmsBroadcastMessage")
@js.native
abstract class SmsBroadcastMessage () extends js.Object {
  /** Gets the body of the broadcast SMS message. */
  var body: java.lang.String = js.native
  /** Gets the type of this broadcast SMS message. */
  var broadcastType: SmsBroadcastType = js.native
  /** Gets the cellular class of this broadcast message. */
  var cellularClass: CellularClass = js.native
  /** Gets the channel associated with the broadcast SMS message. */
  var channel: scala.Double = js.native
  /** Gets the device ID of the device that received the broadcast SMS message. */
  var deviceId: java.lang.String = js.native
  /** Gets the geographical scope associated with this broadcast SMS message. */
  var geographicalScope: SmsGeographicalScope = js.native
  /** True when the broadcast SMS message is an emergency alert. */
  var isEmergencyAlert: scala.Boolean = js.native
  /** True when a user popup is requested by this broadcast SMS message. */
  var isUserPopupRequested: scala.Boolean = js.native
  /** Gets the message class associated with this broadcast SMS message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets a code value associated with this broadcast SMS message. */
  var messageCode: scala.Double = js.native
  /** Gets the message type of the broadcast SMS message. */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: java.lang.String = js.native
  /** Gets the timestamp of the broadcast SMS message. */
  var timestamp: stdLib.Date = js.native
  /** Gets the recipient phone number of the broadcast SMS message. */
  var to: java.lang.String = js.native
  /** Gets the update number associated with this broadcast SMS message. */
  var updateNumber: scala.Double = js.native
}

