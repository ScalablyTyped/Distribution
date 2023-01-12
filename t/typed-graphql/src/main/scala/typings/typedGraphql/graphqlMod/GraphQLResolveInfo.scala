package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLResolveInfo extends StObject {
  
  var fieldASTs: js.Array[Field]
  
  var fieldName: String
  
  var fragments: StringDictionary[FragmentDefinition]
  
  var operation: OperationDefinition
  
  var parentType: GraphQLCompositeType
  
  var returnType: GraphQLOutputType
  
  var rootValue: Any
  
  var schema: GraphQLSchema
  
  var variableValues: StringDictionary[Any]
}
object GraphQLResolveInfo {
  
  inline def apply(
    fieldASTs: js.Array[Field],
    fieldName: String,
    fragments: StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    parentType: GraphQLCompositeType,
    returnType: GraphQLOutputType,
    rootValue: Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[Any]
  ): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(fieldASTs = fieldASTs.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQLResolveInfo] (val x: Self) extends AnyVal {
    
    inline def setFieldASTs(value: js.Array[Field]): Self = StObject.set(x, "fieldASTs", value.asInstanceOf[js.Any])
    
    inline def setFieldASTsVarargs(value: Field*): Self = StObject.set(x, "fieldASTs", js.Array(value*))
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFragments(value: StringDictionary[FragmentDefinition]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: OperationDefinition): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setParentType(value: GraphQLCompositeType): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: GraphQLOutputType): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setRootValue(value: Any): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: GraphQLSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setVariableValues(value: StringDictionary[Any]): Self = StObject.set(x, "variableValues", value.asInstanceOf[js.Any])
  }
}
