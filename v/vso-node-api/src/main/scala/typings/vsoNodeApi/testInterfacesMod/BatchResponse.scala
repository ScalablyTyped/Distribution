package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchResponse extends StObject {
  
  var error: String
  
  var responses: js.Array[Response]
  
  var status: String
}
object BatchResponse {
  
  inline def apply(error: String, responses: js.Array[Response], status: String): BatchResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResponse]
  }
  
  extension [Self <: BatchResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: js.Array[Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: Response*): Self = StObject.set(x, "responses", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
