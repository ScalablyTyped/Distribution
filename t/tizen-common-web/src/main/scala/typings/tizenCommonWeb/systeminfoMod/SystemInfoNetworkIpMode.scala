package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoNetworkIpMode extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkIpMode")
@js.native
object SystemInfoNetworkIpMode extends js.Object {
  @js.native
  sealed trait AUTO extends SystemInfoNetworkIpMode
  
  @js.native
  sealed trait DYNAMIC extends SystemInfoNetworkIpMode
  
  @js.native
  sealed trait FIXED extends SystemInfoNetworkIpMode
  
  @js.native
  sealed trait NONE extends SystemInfoNetworkIpMode
  
  @js.native
  sealed trait STATIC extends SystemInfoNetworkIpMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkIpMode with String] = js.native
  /* "AUTO" */ @js.native
  object AUTO extends TopLevel[AUTO with String]
  
  /* "DYNAMIC" */ @js.native
  object DYNAMIC extends TopLevel[DYNAMIC with String]
  
  /* "FIXED" */ @js.native
  object FIXED extends TopLevel[FIXED with String]
  
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "STATIC" */ @js.native
  object STATIC extends TopLevel[STATIC with String]
  
}

