package typings
package wonderDotJsLib.distEs2015RendererShaderVariableVariableLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderVariable extends js.Object {
  var `type`: wonderDotJsLib.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType
  var value: js.Any
}

object ShaderVariable {
  @scala.inline
  def apply(
    `type`: wonderDotJsLib.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType,
    value: js.Any
  ): ShaderVariable = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShaderVariable]
  }
}

