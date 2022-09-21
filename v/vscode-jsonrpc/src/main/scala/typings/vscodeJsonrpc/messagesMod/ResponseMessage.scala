package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseMessage
  extends StObject
     with Message {
  
  /**
    * The error object in case a request fails.
    */
  var error: js.UndefOr[ResponseErrorLiteral[Any]] = js.undefined
  
  /**
    * The request id.
    */
  var id: Double | String | Null
  
  /**
    * The result of a request. This member is REQUIRED on success.
    * This member MUST NOT exist if there was an error invoking the method.
    */
  var result: js.UndefOr[String | Double | Boolean | js.Object | js.Array[Any] | Null] = js.undefined
}
object ResponseMessage {
  
  inline def apply(jsonrpc: String): ResponseMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], id = null)
    __obj.asInstanceOf[ResponseMessage]
  }
  
  extension [Self <: ResponseMessage](x: Self) {
    
    inline def setError(value: ResponseErrorLiteral[Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setResult(value: String | Double | Boolean | js.Object | js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
