package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDefinition extends Node {
  var defaultValue: js.UndefOr[Value] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: Type
  var variable: Variable
}

object VariableDefinition {
  @scala.inline
  def apply(
    kind: java.lang.String,
    `type`: Type,
    variable: Variable,
    defaultValue: Value = null,
    loc: Location = null
  ): VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, variable = variable)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[VariableDefinition]
  }
}

