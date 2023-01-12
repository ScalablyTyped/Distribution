package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the event arguments for the DialDeviceSelected event on the DialDevicePicker object. */
trait DialDeviceSelectedEventArgs extends StObject {
  
  /** Gets the DialDevice object that represents the remote device that has been selected by the user in a DialDevicePicker . */
  var selectedDialDevice: DialDevice
}
object DialDeviceSelectedEventArgs {
  
  inline def apply(selectedDialDevice: DialDevice): DialDeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDialDevice = selectedDialDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDeviceSelectedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialDeviceSelectedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSelectedDialDevice(value: DialDevice): Self = StObject.set(x, "selectedDialDevice", value.asInstanceOf[js.Any])
  }
}
