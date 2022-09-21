package typings.web3CoreHelpers.mod

import typings.web3CoreHelpers.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonRpcResponse extends StObject {
  
  var error: js.UndefOr[Code] = js.undefined
  
  var id: String | Double
  
  var jsonrpc: String
  
  var result: js.UndefOr[Any] = js.undefined
}
object JsonRpcResponse {
  
  inline def apply(id: String | Double, jsonrpc: String): JsonRpcResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonRpcResponse]
  }
  
  extension [Self <: JsonRpcResponse](x: Self) {
    
    inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
