package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface specifies base functionality for all SMS message types. */
trait ISmsMessageBase extends js.Object {
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  /** Gets the unique device identifier associated with this message. */
  var deviceId: java.lang.String
  /** Gets the message class of this message. */
  var messageClass: SmsMessageClass
  /** Gets the message type of this message. */
  var messageType: SmsMessageType
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: java.lang.String
}

