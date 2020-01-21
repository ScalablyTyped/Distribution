package typings.wonderJs.variableLibMod

import typings.wonderJs.evariabletypeMod.EVariableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderVariable extends js.Object {
  var `type`: EVariableType
  var value: js.Any
}

object ShaderVariable {
  @scala.inline
  def apply(`type`: EVariableType, value: js.Any): ShaderVariable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderVariable]
  }
}

