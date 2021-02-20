package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLResolveInfo extends StObject {
  
  var fieldASTs: js.Array[Field] = js.native
  
  var fieldName: String = js.native
  
  var fragments: StringDictionary[FragmentDefinition] = js.native
  
  var operation: OperationDefinition = js.native
  
  var parentType: GraphQLCompositeType = js.native
  
  var returnType: GraphQLOutputType = js.native
  
  var rootValue: js.Any = js.native
  
  var schema: GraphQLSchema = js.native
  
  var variableValues: StringDictionary[js.Any] = js.native
}
object GraphQLResolveInfo {
  
  @scala.inline
  def apply(
    fieldASTs: js.Array[Field],
    fieldName: String,
    fragments: StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    parentType: GraphQLCompositeType,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any]
  ): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(fieldASTs = fieldASTs.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
  
  @scala.inline
  implicit class GraphQLResolveInfoMutableBuilder[Self <: GraphQLResolveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldASTs(value: js.Array[Field]): Self = StObject.set(x, "fieldASTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldASTsVarargs(value: Field*): Self = StObject.set(x, "fieldASTs", js.Array(value :_*))
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragments(value: StringDictionary[FragmentDefinition]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: OperationDefinition): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentType(value: GraphQLCompositeType): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GraphQLOutputType): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootValue(value: js.Any): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "variableValues", value.asInstanceOf[js.Any])
  }
}
