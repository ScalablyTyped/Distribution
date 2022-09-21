package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// execution/*.js
trait ExecutionContext extends StObject {
  
  var errors: js.Array[js.Error]
  
  var fragments: StringDictionary[FragmentDefinition]
  
  var operation: OperationDefinition
  
  var rootValue: Any
  
  var schema: GraphQLSchema
  
  var variableValues: StringDictionary[Any]
}
object ExecutionContext {
  
  inline def apply(
    errors: js.Array[js.Error],
    fragments: StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    rootValue: Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[Any]
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContext]
  }
  
  extension [Self <: ExecutionContext](x: Self) {
    
    inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFragments(value: StringDictionary[FragmentDefinition]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: OperationDefinition): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setRootValue(value: Any): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: GraphQLSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setVariableValues(value: StringDictionary[Any]): Self = StObject.set(x, "variableValues", value.asInstanceOf[js.Any])
  }
}
