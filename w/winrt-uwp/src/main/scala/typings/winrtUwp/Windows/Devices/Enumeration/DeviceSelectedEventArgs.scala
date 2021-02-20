package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DeviceSelected event on the DevicePicker object. */
@js.native
trait DeviceSelectedEventArgs extends StObject {
  
  /** The device selected by the user in the picker. */
  var selectedDevice: DeviceInformation = js.native
}
object DeviceSelectedEventArgs {
  
  @scala.inline
  def apply(selectedDevice: DeviceInformation): DeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDevice = selectedDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSelectedEventArgs]
  }
  
  @scala.inline
  implicit class DeviceSelectedEventArgsMutableBuilder[Self <: DeviceSelectedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedDevice(value: DeviceInformation): Self = StObject.set(x, "selectedDevice", value.asInstanceOf[js.Any])
  }
}
