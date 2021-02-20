package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionResult extends StObject {
  
  var data: js.Any = js.native
  
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
}
object ExecutionResult {
  
  @scala.inline
  def apply(data: js.Any): ExecutionResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionResult]
  }
  
  @scala.inline
  implicit class ExecutionResultMutableBuilder[Self <: ExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
