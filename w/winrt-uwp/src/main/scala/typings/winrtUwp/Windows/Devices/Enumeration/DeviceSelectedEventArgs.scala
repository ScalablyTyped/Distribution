package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DeviceSelected event on the DevicePicker object. */
trait DeviceSelectedEventArgs extends StObject {
  
  /** The device selected by the user in the picker. */
  var selectedDevice: DeviceInformation
}
object DeviceSelectedEventArgs {
  
  inline def apply(selectedDevice: DeviceInformation): DeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDevice = selectedDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSelectedEventArgs]
  }
  
  extension [Self <: DeviceSelectedEventArgs](x: Self) {
    
    inline def setSelectedDevice(value: DeviceInformation): Self = StObject.set(x, "selectedDevice", value.asInstanceOf[js.Any])
  }
}
