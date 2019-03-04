package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  var fieldASTs: js.Array[Field]
  var fieldName: java.lang.String
  var fragments: org.scalablytyped.runtime.StringDictionary[FragmentDefinition]
  var operation: OperationDefinition
  var parentType: GraphQLCompositeType
  var returnType: GraphQLOutputType
  var rootValue: js.Any
  var schema: GraphQLSchema
  var variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(
    fieldASTs: js.Array[Field],
    fieldName: java.lang.String,
    fragments: org.scalablytyped.runtime.StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    parentType: GraphQLCompositeType,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(fieldASTs = fieldASTs, fieldName = fieldName, fragments = fragments, operation = operation, parentType = parentType, returnType = returnType, rootValue = rootValue, schema = schema, variableValues = variableValues)
  
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

