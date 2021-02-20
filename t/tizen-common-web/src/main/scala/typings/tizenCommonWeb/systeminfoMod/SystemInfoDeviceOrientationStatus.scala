package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoDeviceOrientationStatus extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoDeviceOrientationStatus")
@js.native
object SystemInfoDeviceOrientationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoDeviceOrientationStatus with String] = js.native
  
  @js.native
  sealed trait LANDSCAPE_PRIMARY extends SystemInfoDeviceOrientationStatus
  /* "LANDSCAPE_PRIMARY" */ val LANDSCAPE_PRIMARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.LANDSCAPE_PRIMARY with String = js.native
  
  @js.native
  sealed trait LANDSCAPE_SECONDARY extends SystemInfoDeviceOrientationStatus
  /* "LANDSCAPE_SECONDARY" */ val LANDSCAPE_SECONDARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.LANDSCAPE_SECONDARY with String = js.native
  
  @js.native
  sealed trait PORTRAIT_PRIMARY extends SystemInfoDeviceOrientationStatus
  /* "PORTRAIT_PRIMARY" */ val PORTRAIT_PRIMARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.PORTRAIT_PRIMARY with String = js.native
  
  @js.native
  sealed trait PORTRAIT_SECONDARY extends SystemInfoDeviceOrientationStatus
  /* "PORTRAIT_SECONDARY" */ val PORTRAIT_SECONDARY: typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientationStatus.PORTRAIT_SECONDARY with String = js.native
}
