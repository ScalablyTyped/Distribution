package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the KeypadPressed event. */
trait KeypadPressedEventArgs extends StObject {
  
  /** Returns the value of the keypad button on the device that was pressed. */
  var telephonyKey: TelephonyKey
}
object KeypadPressedEventArgs {
  
  inline def apply(telephonyKey: TelephonyKey): KeypadPressedEventArgs = {
    val __obj = js.Dynamic.literal(telephonyKey = telephonyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeypadPressedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeypadPressedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setTelephonyKey(value: TelephonyKey): Self = StObject.set(x, "telephonyKey", value.asInstanceOf[js.Any])
  }
}
