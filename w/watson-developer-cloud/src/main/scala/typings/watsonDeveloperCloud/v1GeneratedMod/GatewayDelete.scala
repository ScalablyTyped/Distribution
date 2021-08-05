package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gatway deletion confirmation. */
trait GatewayDelete extends StObject {
  
  /** The gateway ID of the deleted gateway. */
  var gateway_id: js.UndefOr[String] = js.undefined
  
  /** The status of the request. */
  var status: js.UndefOr[String] = js.undefined
}
object GatewayDelete {
  
  inline def apply(): GatewayDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayDelete]
  }
  
  extension [Self <: GatewayDelete](x: Self) {
    
    inline def setGateway_id(value: String): Self = StObject.set(x, "gateway_id", value.asInstanceOf[js.Any])
    
    inline def setGateway_idUndefined: Self = StObject.set(x, "gateway_id", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
