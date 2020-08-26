package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoProfile extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoProfile")
@js.native
object SystemInfoProfile extends js.Object {
  @js.native
  sealed trait MOBILE extends SystemInfoProfile
  
  @js.native
  sealed trait MOBILE_FULL extends SystemInfoProfile
  
  @js.native
  sealed trait MOBILE_WEB extends SystemInfoProfile
  
  @js.native
  sealed trait TV extends SystemInfoProfile
  
  @js.native
  sealed trait WEARABLE extends SystemInfoProfile
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoProfile with String] = js.native
  /* "MOBILE" */ @js.native
  object MOBILE extends TopLevel[MOBILE with String]
  
  /* "MOBILE_FULL" */ @js.native
  object MOBILE_FULL extends TopLevel[MOBILE_FULL with String]
  
  /* "MOBILE_WEB" */ @js.native
  object MOBILE_WEB extends TopLevel[MOBILE_WEB with String]
  
  /* "TV" */ @js.native
  object TV extends TopLevel[TV with String]
  
  /* "WEARABLE" */ @js.native
  object WEARABLE extends TopLevel[WEARABLE with String]
  
}

