package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information for the KeypadPressed event. */
@JSGlobal("Windows.Media.Devices.KeypadPressedEventArgs")
@js.native
abstract class KeypadPressedEventArgs () extends js.Object {
  /** Returns the value of the keypad button on the device that was pressed. */
  var telephonyKey: TelephonyKey = js.native
}

