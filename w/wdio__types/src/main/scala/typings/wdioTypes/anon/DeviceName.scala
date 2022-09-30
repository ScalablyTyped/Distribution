package typings.wdioTypes.anon

import typings.wdioTypes.capabilitiesMod.MoonMobileDeviceOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceName extends StObject {
  
  var deviceName: String
  
  var orientation: MoonMobileDeviceOrientation
}
object DeviceName {
  
  inline def apply(deviceName: String, orientation: MoonMobileDeviceOrientation): DeviceName = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceName]
  }
  
  extension [Self <: DeviceName](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: MoonMobileDeviceOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
