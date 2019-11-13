package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledResult[ErrorType] extends js.Object {
  var ast: js.UndefOr[ASTElement] = js.undefined
  var errors: js.Array[ErrorType]
  var render: String
  var staticRenderFns: js.Array[String]
  var tips: js.Array[ErrorType]
}

object CompiledResult {
  @scala.inline
  def apply[ErrorType](
    errors: js.Array[ErrorType],
    render: String,
    staticRenderFns: js.Array[String],
    tips: js.Array[ErrorType],
    ast: ASTElement = null
  ): CompiledResult[ErrorType] = {
    val __obj = js.Dynamic.literal(errors = errors, render = render, staticRenderFns = staticRenderFns, tips = tips)
    if (ast != null) __obj.updateDynamic("ast")(ast)
    __obj.asInstanceOf[CompiledResult[ErrorType]]
  }
}

