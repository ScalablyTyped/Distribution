package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// execution/*.js
@js.native
trait ExecutionContext extends StObject {
  
  var errors: js.Array[GraphQLError] = js.native
  
  var fragments: StringDictionary[FragmentDefinition] = js.native
  
  var operation: OperationDefinition = js.native
  
  var rootValue: js.Any = js.native
  
  var schema: GraphQLSchema = js.native
  
  var variableValues: StringDictionary[js.Any] = js.native
}
object ExecutionContext {
  
  @scala.inline
  def apply(
    errors: js.Array[GraphQLError],
    fragments: StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any]
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContext]
  }
  
  @scala.inline
  implicit class ExecutionContextMutableBuilder[Self <: ExecutionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFragments(value: StringDictionary[FragmentDefinition]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: OperationDefinition): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootValue(value: js.Any): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "variableValues", value.asInstanceOf[js.Any])
  }
}
