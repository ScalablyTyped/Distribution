package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DisconnectButtonClicked event on the DevicePicker object. */
trait DeviceDisconnectButtonClickedEventArgs extends StObject {
  
  /** The device that the user clicked the disconnect button for. */
  var device: DeviceInformation
}
object DeviceDisconnectButtonClickedEventArgs {
  
  inline def apply(device: DeviceInformation): DeviceDisconnectButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDisconnectButtonClickedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDisconnectButtonClickedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: DeviceInformation): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
