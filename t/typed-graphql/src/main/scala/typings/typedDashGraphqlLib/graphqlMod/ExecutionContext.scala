package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// execution/*.js
trait ExecutionContext extends js.Object {
  var errors: js.Array[GraphQLError]
  var fragments: org.scalablytyped.runtime.StringDictionary[FragmentDefinition]
  var operation: OperationDefinition
  var rootValue: js.Any
  var schema: GraphQLSchema
  var variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ExecutionContext {
  @scala.inline
  def apply(
    errors: js.Array[GraphQLError],
    fragments: org.scalablytyped.runtime.StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("fragments")(fragments)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("rootValue")(rootValue)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("variableValues")(variableValues)
    __obj.asInstanceOf[ExecutionContext]
  }
}

