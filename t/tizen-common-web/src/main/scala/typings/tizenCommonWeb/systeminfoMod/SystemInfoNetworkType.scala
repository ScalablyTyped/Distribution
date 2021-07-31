package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoNetworkType extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkType")
@js.native
object SystemInfoNetworkType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkType & String] = js.native
  
  @js.native
  sealed trait `2Dot5G`
    extends StObject
       with SystemInfoNetworkType
  /* "2.5G" */ val `2Dot5G`: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`2Dot5G` & String = js.native
  
  @js.native
  sealed trait `2G`
    extends StObject
       with SystemInfoNetworkType
  /* "2G" */ val `2G`: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`2G` & String = js.native
  
  @js.native
  sealed trait `3G`
    extends StObject
       with SystemInfoNetworkType
  /* "3G" */ val `3G`: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`3G` & String = js.native
  
  @js.native
  sealed trait `4G`
    extends StObject
       with SystemInfoNetworkType
  /* "4G" */ val `4G`: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`4G` & String = js.native
  
  @js.native
  sealed trait ETHERNET
    extends StObject
       with SystemInfoNetworkType
  /* "ETHERNET" */ val ETHERNET: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.ETHERNET & String = js.native
  
  @js.native
  sealed trait NET_PROXY
    extends StObject
       with SystemInfoNetworkType
  /* "NET_PROXY" */ val NET_PROXY: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.NET_PROXY & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with SystemInfoNetworkType
  /* "NONE" */ val NONE: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.NONE & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with SystemInfoNetworkType
  /* "UNKNOWN" */ val UNKNOWN: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.UNKNOWN & String = js.native
  
  @js.native
  sealed trait WIFI
    extends StObject
       with SystemInfoNetworkType
  /* "WIFI" */ val WIFI: typings.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.WIFI & String = js.native
}
