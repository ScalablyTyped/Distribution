package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMessage
  extends StObject
     with Message {
  
  /**
    * The request id.
    */
  var id: Double | String
  
  /**
    * The method to be invoked.
    */
  var method: String
  
  /**
    * The method's params.
    */
  var params: js.UndefOr[js.Any] = js.undefined
}
object RequestMessage {
  
  inline def apply(id: Double | String, jsonrpc: String, method: String): RequestMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMessage]
  }
  
  extension [Self <: RequestMessage](x: Self) {
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
