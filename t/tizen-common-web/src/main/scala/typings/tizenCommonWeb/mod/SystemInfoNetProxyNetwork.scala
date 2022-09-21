package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoNetProxyNetwork
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the status (ON or OFF) of the net\_proxy network.
    */
  val status: String
}
object SystemInfoNetProxyNetwork {
  
  inline def apply(status: String): SystemInfoNetProxyNetwork = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoNetProxyNetwork]
  }
  
  extension [Self <: SystemInfoNetProxyNetwork](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
