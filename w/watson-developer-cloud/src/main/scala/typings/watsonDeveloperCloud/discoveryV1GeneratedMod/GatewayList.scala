package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing gateways array. */
trait GatewayList extends StObject {
  
  /** Array of configured gateway connections. */
  var gateways: js.UndefOr[js.Array[Gateway]] = js.undefined
}
object GatewayList {
  
  inline def apply(): GatewayList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayList]
  }
  
  extension [Self <: GatewayList](x: Self) {
    
    inline def setGateways(value: js.Array[Gateway]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: Gateway*): Self = StObject.set(x, "gateways", js.Array(value*))
  }
}
