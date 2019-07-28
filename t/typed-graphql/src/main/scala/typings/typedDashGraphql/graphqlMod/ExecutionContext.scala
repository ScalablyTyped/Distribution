package typings.typedDashGraphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// execution/*.js
trait ExecutionContext extends js.Object {
  var errors: js.Array[GraphQLError]
  var fragments: StringDictionary[FragmentDefinition]
  var operation: OperationDefinition
  var rootValue: js.Any
  var schema: GraphQLSchema
  var variableValues: StringDictionary[js.Any]
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
    val __obj = js.Dynamic.literal(errors = errors, fragments = fragments, operation = operation, rootValue = rootValue, schema = schema, variableValues = variableValues)
  
    __obj.asInstanceOf[ExecutionContext]
  }
}

