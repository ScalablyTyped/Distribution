package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the event arguments for the DialDeviceSelected event on the DialDevicePicker object. */
@js.native
trait DialDeviceSelectedEventArgs extends StObject {
  
  /** Gets the DialDevice object that represents the remote device that has been selected by the user in a DialDevicePicker . */
  var selectedDialDevice: DialDevice = js.native
}
object DialDeviceSelectedEventArgs {
  
  @scala.inline
  def apply(selectedDialDevice: DialDevice): DialDeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDialDevice = selectedDialDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDeviceSelectedEventArgs]
  }
  
  @scala.inline
  implicit class DialDeviceSelectedEventArgsMutableBuilder[Self <: DialDeviceSelectedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedDialDevice(value: DialDevice): Self = StObject.set(x, "selectedDialDevice", value.asInstanceOf[js.Any])
  }
}
