package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.ETHERNET
import typings.tizenCommonWeb.tizenCommonWebStrings.NET_PROXY
import typings.tizenCommonWeb.tizenCommonWebStrings.NONE
import typings.tizenCommonWeb.tizenCommonWebStrings.UNKNOWN
import typings.tizenCommonWeb.tizenCommonWebStrings.WIFI
import typings.tizenCommonWeb.tizenCommonWebStrings.`2Dot5G`
import typings.tizenCommonWeb.tizenCommonWebStrings.`2G`
import typings.tizenCommonWeb.tizenCommonWebStrings.`3G`
import typings.tizenCommonWeb.tizenCommonWebStrings.`4G`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoNetwork
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the network type of the current data network.
    */
  val networkType: SystemInfoNetworkType | NONE | `2G` | `2Dot5G` | `3G` | `4G` | WIFI | ETHERNET | NET_PROXY | UNKNOWN
}
object SystemInfoNetwork {
  
  inline def apply(
    networkType: SystemInfoNetworkType | NONE | `2G` | `2Dot5G` | `3G` | `4G` | WIFI | ETHERNET | NET_PROXY | UNKNOWN
  ): SystemInfoNetwork = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoNetwork]
  }
  
  extension [Self <: SystemInfoNetwork](x: Self) {
    
    inline def setNetworkType(
      value: SystemInfoNetworkType | NONE | `2G` | `2Dot5G` | `3G` | `4G` | WIFI | ETHERNET | NET_PROXY | UNKNOWN
    ): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
