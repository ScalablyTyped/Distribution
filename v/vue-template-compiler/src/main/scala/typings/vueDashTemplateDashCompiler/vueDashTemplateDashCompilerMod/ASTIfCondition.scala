package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTIfCondition extends js.Object {
  var block: ASTElement
  var exp: js.UndefOr[String] = js.undefined
}

object ASTIfCondition {
  @scala.inline
  def apply(block: ASTElement, exp: String = null): ASTIfCondition = {
    val __obj = js.Dynamic.literal(block = block)
    if (exp != null) __obj.updateDynamic("exp")(exp)
    __obj.asInstanceOf[ASTIfCondition]
  }
}

