package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoDeviceOrientationStatus extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoDeviceOrientationStatus")
@js.native
object SystemInfoDeviceOrientationStatus extends js.Object {
  @js.native
  sealed trait LANDSCAPE_PRIMARY extends SystemInfoDeviceOrientationStatus
  
  @js.native
  sealed trait LANDSCAPE_SECONDARY extends SystemInfoDeviceOrientationStatus
  
  @js.native
  sealed trait PORTRAIT_PRIMARY extends SystemInfoDeviceOrientationStatus
  
  @js.native
  sealed trait PORTRAIT_SECONDARY extends SystemInfoDeviceOrientationStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoDeviceOrientationStatus with String] = js.native
  /* "LANDSCAPE_PRIMARY" */ @js.native
  object LANDSCAPE_PRIMARY extends TopLevel[LANDSCAPE_PRIMARY with String]
  
  /* "LANDSCAPE_SECONDARY" */ @js.native
  object LANDSCAPE_SECONDARY extends TopLevel[LANDSCAPE_SECONDARY with String]
  
  /* "PORTRAIT_PRIMARY" */ @js.native
  object PORTRAIT_PRIMARY extends TopLevel[PORTRAIT_PRIMARY with String]
  
  /* "PORTRAIT_SECONDARY" */ @js.native
  object PORTRAIT_SECONDARY extends TopLevel[PORTRAIT_SECONDARY with String]
  
}

