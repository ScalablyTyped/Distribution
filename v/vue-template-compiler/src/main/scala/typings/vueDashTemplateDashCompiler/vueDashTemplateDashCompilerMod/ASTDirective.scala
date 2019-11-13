package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTDirective extends js.Object {
  var arg: js.UndefOr[String] = js.undefined
  var modifiers: js.UndefOr[ASTModifiers] = js.undefined
  var name: String
  var rawName: String
  var value: String
}

object ASTDirective {
  @scala.inline
  def apply(name: String, rawName: String, value: String, arg: String = null, modifiers: ASTModifiers = null): ASTDirective = {
    val __obj = js.Dynamic.literal(name = name, rawName = rawName, value = value)
    if (arg != null) __obj.updateDynamic("arg")(arg)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    __obj.asInstanceOf[ASTDirective]
  }
}

