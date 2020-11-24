package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the KeypadPressed event. */
@js.native
trait KeypadPressedEventArgs extends js.Object {
  
  /** Returns the value of the keypad button on the device that was pressed. */
  var telephonyKey: TelephonyKey = js.native
}
object KeypadPressedEventArgs {
  
  @scala.inline
  def apply(telephonyKey: TelephonyKey): KeypadPressedEventArgs = {
    val __obj = js.Dynamic.literal(telephonyKey = telephonyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeypadPressedEventArgs]
  }
  
  @scala.inline
  implicit class KeypadPressedEventArgsOps[Self <: KeypadPressedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTelephonyKey(value: TelephonyKey): Self = this.set("telephonyKey", value.asInstanceOf[js.Any])
  }
}
