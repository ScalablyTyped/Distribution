package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.LANDSCAPE_PRIMARY
import typings.tizenCommonWeb.tizenCommonWebStrings.LANDSCAPE_SECONDARY
import typings.tizenCommonWeb.tizenCommonWebStrings.PORTRAIT_PRIMARY
import typings.tizenCommonWeb.tizenCommonWebStrings.PORTRAIT_SECONDARY
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
  val status: SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY
}
object SystemInfoDeviceOrientation {
  
  inline def apply(
    isAutoRotation: Boolean,
    status: SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY
  ): SystemInfoDeviceOrientation = {
    val __obj = js.Dynamic.literal(isAutoRotation = isAutoRotation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoDeviceOrientation]
  }
  
  extension [Self <: SystemInfoDeviceOrientation](x: Self) {
    
    inline def setIsAutoRotation(value: Boolean): Self = StObject.set(x, "isAutoRotation", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
