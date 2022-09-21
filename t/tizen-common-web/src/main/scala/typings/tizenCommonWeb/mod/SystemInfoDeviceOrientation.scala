package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoDeviceOrientation
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Indicates whether the device is in autorotation.
    *
    * @since 2.2
    */
  val isAutoRotation: Boolean
  
  /**
    * Represents the status of the current device orientation.
    */
  val status: SystemInfoDeviceOrientationStatus
}
object SystemInfoDeviceOrientation {
  
  inline def apply(isAutoRotation: Boolean, status: SystemInfoDeviceOrientationStatus): SystemInfoDeviceOrientation = {
    val __obj = js.Dynamic.literal(isAutoRotation = isAutoRotation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoDeviceOrientation]
  }
  
  extension [Self <: SystemInfoDeviceOrientation](x: Self) {
    
    inline def setIsAutoRotation(value: Boolean): Self = StObject.set(x, "isAutoRotation", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SystemInfoDeviceOrientationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
