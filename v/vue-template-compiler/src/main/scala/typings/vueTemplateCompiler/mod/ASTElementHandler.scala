package typings.vueTemplateCompiler.mod

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
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTElementHandler]
  }
}

