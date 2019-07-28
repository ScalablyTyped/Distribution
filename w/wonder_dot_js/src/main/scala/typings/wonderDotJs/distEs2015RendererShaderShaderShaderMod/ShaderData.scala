package typings.wonderDotJs.distEs2015RendererShaderShaderShaderMod

import typings.wonderDotJs.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderData extends js.Object {
  var textureId: js.UndefOr[String] = js.undefined
  var `type`: EVariableType
  var value: js.UndefOr[js.Any] = js.undefined
}

object ShaderData {
  @scala.inline
  def apply(`type`: EVariableType, textureId: String = null, value: js.Any = null): ShaderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (textureId != null) __obj.updateDynamic("textureId")(textureId)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ShaderData]
  }
}

