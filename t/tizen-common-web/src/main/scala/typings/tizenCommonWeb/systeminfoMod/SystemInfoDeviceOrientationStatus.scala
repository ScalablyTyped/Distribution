package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoDeviceOrientationStatus extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoDeviceOrientationStatus")
@js.native
object SystemInfoDeviceOrientationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoDeviceOrientationStatus & String] = js.native
  
  @js.native
  sealed trait LANDSCAPE_PRIMARY
    extends StObject
       with SystemInfoDeviceOrientationStatus
  /* "LANDSCAPE_PRIMARY" */ val LANDSCAPE_PRIMARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.LANDSCAPE_PRIMARY & String = js.native
  
  @js.native
  sealed trait LANDSCAPE_SECONDARY
    extends StObject
       with SystemInfoDeviceOrientationStatus
  /* "LANDSCAPE_SECONDARY" */ val LANDSCAPE_SECONDARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.LANDSCAPE_SECONDARY & String = js.native
  
  @js.native
  sealed trait PORTRAIT_PRIMARY
    extends StObject
       with SystemInfoDeviceOrientationStatus
  /* "PORTRAIT_PRIMARY" */ val PORTRAIT_PRIMARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.PORTRAIT_PRIMARY & String = js.native
  
  @js.native
  sealed trait PORTRAIT_SECONDARY
    extends StObject
       with SystemInfoDeviceOrientationStatus
  /* "PORTRAIT_SECONDARY" */ val PORTRAIT_SECONDARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.PORTRAIT_SECONDARY & String = js.native
}
