package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// execution/*.js

trait ExecutionContext extends js.Object {
  var errors: js.Array[GraphQLError]
  var fragments: ScalablyTyped.runtime.StringDictionary[FragmentDefinition]
  var operation: OperationDefinition
  var rootValue: js.Any
  var schema: GraphQLSchema
  var variableValues: ScalablyTyped.runtime.StringDictionary[js.Any]
}

