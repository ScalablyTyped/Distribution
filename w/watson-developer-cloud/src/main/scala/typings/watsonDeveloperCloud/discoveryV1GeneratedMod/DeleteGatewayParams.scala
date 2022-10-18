package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteGateway` operation. */
trait DeleteGatewayParams extends StObject {
  
  /** The ID of the environment. */
  var environment_id: String
  
  /** The requested gateway ID. */
  var gateway_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object DeleteGatewayParams {
  
  inline def apply(environment_id: String, gateway_id: String): DeleteGatewayParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], gateway_id = gateway_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayParams]
  }
  
  extension [Self <: DeleteGatewayParams](x: Self) {
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setGateway_id(value: String): Self = StObject.set(x, "gateway_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
