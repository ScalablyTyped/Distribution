package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoNetworkIpMode extends js.Object
@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkIpMode")
@js.native
object SystemInfoNetworkIpMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkIpMode with String] = js.native
  
  @js.native
  sealed trait AUTO extends SystemInfoNetworkIpMode
  /* "AUTO" */ @js.native
  object AUTO extends TopLevel[AUTO with String]
  
  @js.native
  sealed trait DYNAMIC extends SystemInfoNetworkIpMode
  /* "DYNAMIC" */ @js.native
  object DYNAMIC extends TopLevel[DYNAMIC with String]
  
  @js.native
  sealed trait FIXED extends SystemInfoNetworkIpMode
  /* "FIXED" */ @js.native
  object FIXED extends TopLevel[FIXED with String]
  
  @js.native
  sealed trait NONE extends SystemInfoNetworkIpMode
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  @js.native
  sealed trait STATIC extends SystemInfoNetworkIpMode
  /* "STATIC" */ @js.native
  object STATIC extends TopLevel[STATIC with String]
}
