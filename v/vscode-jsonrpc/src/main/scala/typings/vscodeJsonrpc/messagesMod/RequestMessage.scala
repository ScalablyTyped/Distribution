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
  var id: Double | String | Null
  
  /**
    * The method to be invoked.
    */
  var method: String
  
  /**
    * The method's params.
    */
  var params: js.UndefOr[js.Array[Any] | js.Object] = js.undefined
}
object RequestMessage {
  
  inline def apply(jsonrpc: String, method: String): RequestMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], id = null)
    __obj.asInstanceOf[RequestMessage]
  }
  
  extension [Self <: RequestMessage](x: Self) {
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Any] | js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
  }
}
