package typings
package wonderDotJsLib.distEs2015RendererShaderShaderShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderData extends js.Object {
  var textureId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: wonderDotJsLib.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType
  var value: js.UndefOr[js.Any] = js.undefined
}

object ShaderData {
  @scala.inline
  def apply(
    `type`: wonderDotJsLib.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType,
    textureId: java.lang.String = null,
    value: js.Any = null
  ): ShaderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (textureId != null) __obj.updateDynamic("textureId")(textureId)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ShaderData]
  }
}

