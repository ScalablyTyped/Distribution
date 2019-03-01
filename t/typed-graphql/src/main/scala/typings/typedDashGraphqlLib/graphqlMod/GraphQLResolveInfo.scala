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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldASTs")(fieldASTs)
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("fragments")(fragments)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("parentType")(parentType)
    __obj.updateDynamic("returnType")(returnType)
    __obj.updateDynamic("rootValue")(rootValue)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("variableValues")(variableValues)
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

