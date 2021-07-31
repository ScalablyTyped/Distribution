package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoNetworkIpMode extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkIpMode")
@js.native
object SystemInfoNetworkIpMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkIpMode & String] = js.native
  
  @js.native
  sealed trait AUTO
    extends StObject
       with SystemInfoNetworkIpMode
  /* "AUTO" */ val AUTO: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.AUTO & String = js.native
  
  @js.native
  sealed trait DYNAMIC
    extends StObject
       with SystemInfoNetworkIpMode
  /* "DYNAMIC" */ val DYNAMIC: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.DYNAMIC & String = js.native
  
  @js.native
  sealed trait FIXED
    extends StObject
       with SystemInfoNetworkIpMode
  /* "FIXED" */ val FIXED: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.FIXED & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with SystemInfoNetworkIpMode
  /* "NONE" */ val NONE: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.NONE & String = js.native
  
  @js.native
  sealed trait STATIC
    extends StObject
       with SystemInfoNetworkIpMode
  /* "STATIC" */ val STATIC: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.STATIC & String = js.native
}
