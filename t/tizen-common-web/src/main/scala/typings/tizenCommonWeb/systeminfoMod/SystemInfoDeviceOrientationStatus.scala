package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoDeviceOrientationStatus extends js.Object
@JSImport("tizen-common-web/systeminfo", "SystemInfoDeviceOrientationStatus")
@js.native
object SystemInfoDeviceOrientationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoDeviceOrientationStatus with String] = js.native
  
  @js.native
  sealed trait LANDSCAPE_PRIMARY extends SystemInfoDeviceOrientationStatus
  /* "LANDSCAPE_PRIMARY" */ @js.native
  object LANDSCAPE_PRIMARY extends TopLevel[LANDSCAPE_PRIMARY with String]
  
  @js.native
  sealed trait LANDSCAPE_SECONDARY extends SystemInfoDeviceOrientationStatus
  /* "LANDSCAPE_SECONDARY" */ @js.native
  object LANDSCAPE_SECONDARY extends TopLevel[LANDSCAPE_SECONDARY with String]
  
  @js.native
  sealed trait PORTRAIT_PRIMARY extends SystemInfoDeviceOrientationStatus
  /* "PORTRAIT_PRIMARY" */ @js.native
  object PORTRAIT_PRIMARY extends TopLevel[PORTRAIT_PRIMARY with String]
  
  @js.native
  sealed trait PORTRAIT_SECONDARY extends SystemInfoDeviceOrientationStatus
  /* "PORTRAIT_SECONDARY" */ @js.native
  object PORTRAIT_SECONDARY extends TopLevel[PORTRAIT_SECONDARY with String]
}
