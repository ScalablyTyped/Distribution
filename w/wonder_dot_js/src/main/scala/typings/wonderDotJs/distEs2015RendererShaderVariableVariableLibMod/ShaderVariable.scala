package typings.wonderDotJs.distEs2015RendererShaderVariableVariableLibMod

import typings.wonderDotJs.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType
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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShaderVariable]
  }
}

