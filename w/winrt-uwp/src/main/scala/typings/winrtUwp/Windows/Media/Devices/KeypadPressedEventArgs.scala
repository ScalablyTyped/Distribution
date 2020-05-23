package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information for the KeypadPressed event. */
trait KeypadPressedEventArgs extends js.Object {
  /** Returns the value of the keypad button on the device that was pressed. */
  var telephonyKey: TelephonyKey
}

object KeypadPressedEventArgs {
  @scala.inline
  def apply(telephonyKey: TelephonyKey): KeypadPressedEventArgs = {
    val __obj = js.Dynamic.literal(telephonyKey = telephonyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeypadPressedEventArgs]
  }
}

