package typings.wonderJs.shaderMod

import typings.wonderJs.evariabletypeMod.EVariableType
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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (textureId != null) __obj.updateDynamic("textureId")(textureId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderData]
  }
}

