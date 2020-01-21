package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDefinition extends Node {
  var defaultValue: js.UndefOr[Value] = js.undefined
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: Type
  var variable: Variable
}

object VariableDefinition {
  @scala.inline
  def apply(kind: String, `type`: Type, variable: Variable, defaultValue: Value = null, loc: Location = null): VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDefinition]
  }
}

