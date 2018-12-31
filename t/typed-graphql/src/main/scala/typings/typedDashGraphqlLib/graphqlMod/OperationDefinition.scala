package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDefinition extends js.Object {
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: js.UndefOr[Name] = js.undefined
  // Note: subscription is an experimental non-spec addition.
  var operation: java.lang.String
  var selectionSet: SelectionSet
  var variableDefinitions: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}

