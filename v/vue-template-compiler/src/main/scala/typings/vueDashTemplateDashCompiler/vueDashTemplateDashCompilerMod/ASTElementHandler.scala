package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTElementHandler extends js.Object {
  var modifiers: js.UndefOr[ASTModifiers] = js.undefined
  var params: js.UndefOr[js.Array[_]] = js.undefined
  var value: String
}

object ASTElementHandler {
  @scala.inline
  def apply(value: String, modifiers: ASTModifiers = null, params: js.Array[_] = null): ASTElementHandler = {
    val __obj = js.Dynamic.literal(value = value)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[ASTElementHandler]
  }
}

