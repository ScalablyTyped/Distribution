package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDefinition
  extends Definition
     with HasSelectionSet
     with Node {
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: js.UndefOr[Name] = js.undefined
  // Note: subscription is an experimental non-spec addition.
  var operation: String
  var selectionSet: SelectionSet
  var variableDefinitions: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}

object OperationDefinition {
  @scala.inline
  def apply(
    kind: String,
    operation: String,
    selectionSet: SelectionSet,
    directives: js.Array[Directive] = null,
    loc: Location = null,
    name: Name = null,
    variableDefinitions: js.Array[VariableDefinition] = null
  ): OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, operation = operation, selectionSet = selectionSet)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions)
    __obj.asInstanceOf[OperationDefinition]
  }
}

