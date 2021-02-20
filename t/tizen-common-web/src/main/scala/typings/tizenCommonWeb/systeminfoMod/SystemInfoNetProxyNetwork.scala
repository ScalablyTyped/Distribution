package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoNetProxyNetwork extends SystemInfoProperty {
  
  /**
    * Represents the status (ON or OFF) of the net_proxy network.
    */
  val status: String = js.native
}
object SystemInfoNetProxyNetwork {
  
  @scala.inline
  def apply(status: String): SystemInfoNetProxyNetwork = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoNetProxyNetwork]
  }
  
  @scala.inline
  implicit class SystemInfoNetProxyNetworkMutableBuilder[Self <: SystemInfoNetProxyNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
