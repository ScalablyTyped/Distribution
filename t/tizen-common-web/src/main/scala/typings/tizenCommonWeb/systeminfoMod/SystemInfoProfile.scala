package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoProfile extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoProfile")
@js.native
object SystemInfoProfile extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoProfile & String] = js.native
  
  @js.native
  sealed trait MOBILE
    extends StObject
       with SystemInfoProfile
  /* "MOBILE" */ val MOBILE: typings.tizenCommonWeb.systeminfoMod.SystemInfoProfile.MOBILE & String = js.native
  
  @js.native
  sealed trait MOBILE_FULL
    extends StObject
       with SystemInfoProfile
  /* "MOBILE_FULL" */ val MOBILE_FULL: typings.tizenCommonWeb.systeminfoMod.SystemInfoProfile.MOBILE_FULL & String = js.native
  
  @js.native
  sealed trait MOBILE_WEB
    extends StObject
       with SystemInfoProfile
  /* "MOBILE_WEB" */ val MOBILE_WEB: typings.tizenCommonWeb.systeminfoMod.SystemInfoProfile.MOBILE_WEB & String = js.native
  
  @js.native
  sealed trait TV
    extends StObject
       with SystemInfoProfile
  /* "TV" */ val TV: typings.tizenCommonWeb.systeminfoMod.SystemInfoProfile.TV & String = js.native
  
  @js.native
  sealed trait WEARABLE
    extends StObject
       with SystemInfoProfile
  /* "WEARABLE" */ val WEARABLE: typings.tizenCommonWeb.systeminfoMod.SystemInfoProfile.WEARABLE & String = js.native
}
