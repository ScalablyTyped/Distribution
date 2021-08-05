package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionResult extends StObject {
  
  var data: js.Any
  
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
}
object ExecutionResult {
  
  inline def apply(data: js.Any): ExecutionResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionResult]
  }
  
  extension [Self <: ExecutionResult](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[GraphQLError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GraphQLError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
