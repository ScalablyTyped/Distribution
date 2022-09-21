package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoNetwork
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the network type of the current data network.
    */
  val networkType: SystemInfoNetworkType
}
object SystemInfoNetwork {
  
  inline def apply(networkType: SystemInfoNetworkType): SystemInfoNetwork = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoNetwork]
  }
  
  extension [Self <: SystemInfoNetwork](x: Self) {
    
    inline def setNetworkType(value: SystemInfoNetworkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
