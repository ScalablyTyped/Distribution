package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AccessChanged event. */
trait DeviceAccessChangedEventArgs extends StObject {
  
  /** The new status of access to a device. */
  var status: DeviceAccessStatus
}
object DeviceAccessChangedEventArgs {
  
  inline def apply(status: DeviceAccessStatus): DeviceAccessChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAccessChangedEventArgs]
  }
  
  extension [Self <: DeviceAccessChangedEventArgs](x: Self) {
    
    inline def setStatus(value: DeviceAccessStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
