package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoProfile extends js.Object
@JSImport("tizen-common-web/systeminfo", "SystemInfoProfile")
@js.native
object SystemInfoProfile extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoProfile with String] = js.native
  
  @js.native
  sealed trait MOBILE extends SystemInfoProfile
  /* "MOBILE" */ @js.native
  object MOBILE extends TopLevel[MOBILE with String]
  
  @js.native
  sealed trait MOBILE_FULL extends SystemInfoProfile
  /* "MOBILE_FULL" */ @js.native
  object MOBILE_FULL extends TopLevel[MOBILE_FULL with String]
  
  @js.native
  sealed trait MOBILE_WEB extends SystemInfoProfile
  /* "MOBILE_WEB" */ @js.native
  object MOBILE_WEB extends TopLevel[MOBILE_WEB with String]
  
  @js.native
  sealed trait TV extends SystemInfoProfile
  /* "TV" */ @js.native
  object TV extends TopLevel[TV with String]
  
  @js.native
  sealed trait WEARABLE extends SystemInfoProfile
  /* "WEARABLE" */ @js.native
  object WEARABLE extends TopLevel[WEARABLE with String]
}
