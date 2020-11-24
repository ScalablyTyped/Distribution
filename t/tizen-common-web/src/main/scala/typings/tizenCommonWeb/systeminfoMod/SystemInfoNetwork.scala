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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoNetwork extends SystemInfoProperty {
  
  /**
    * Represents the network type of the current data network.
    */
  val networkType: SystemInfoNetworkType | NONE | `2G` | `2Dot5G` | `3G` | `4G` | WIFI | ETHERNET | NET_PROXY | UNKNOWN = js.native
}
object SystemInfoNetwork {
  
  @scala.inline
  def apply(
    networkType: SystemInfoNetworkType | NONE | `2G` | `2Dot5G` | `3G` | `4G` | WIFI | ETHERNET | NET_PROXY | UNKNOWN
  ): SystemInfoNetwork = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoNetwork]
  }
  
  @scala.inline
  implicit class SystemInfoNetworkOps[Self <: SystemInfoNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNetworkType(
      value: SystemInfoNetworkType | NONE | `2G` | `2Dot5G` | `3G` | `4G` | WIFI | ETHERNET | NET_PROXY | UNKNOWN
    ): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
}
