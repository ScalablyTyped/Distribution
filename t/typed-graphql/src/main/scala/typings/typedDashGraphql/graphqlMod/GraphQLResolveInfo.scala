package typings.typedDashGraphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  var fieldASTs: js.Array[Field]
  var fieldName: String
  var fragments: StringDictionary[FragmentDefinition]
  var operation: OperationDefinition
  var parentType: GraphQLCompositeType
  var returnType: GraphQLOutputType
  var rootValue: js.Any
  var schema: GraphQLSchema
  var variableValues: StringDictionary[js.Any]
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
    val __obj = js.Dynamic.literal(fieldASTs = fieldASTs, fieldName = fieldName, fragments = fragments, operation = operation, parentType = parentType, returnType = returnType, rootValue = rootValue, schema = schema, variableValues = variableValues)
  
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

