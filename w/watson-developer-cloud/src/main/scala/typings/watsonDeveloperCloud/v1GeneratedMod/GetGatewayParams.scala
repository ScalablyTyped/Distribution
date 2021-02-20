package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getGateway` operation. */
@js.native
trait GetGatewayParams extends StObject {
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  /** The requested gateway ID. */
  var gateway_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object GetGatewayParams {
  
  @scala.inline
  def apply(environment_id: String, gateway_id: String): GetGatewayParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], gateway_id = gateway_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayParams]
  }
  
  @scala.inline
  implicit class GetGatewayParamsMutableBuilder[Self <: GetGatewayParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway_id(value: String): Self = StObject.set(x, "gateway_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
