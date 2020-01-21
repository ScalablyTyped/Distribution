package typings.vueComponentCompilerUtils.compileTemplateMod

import typings.vueComponentCompilerUtils.typesMod.ErrorWithRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCompileResult extends js.Object {
  var ast: js.UndefOr[js.Object] = js.undefined
  var code: String
  var errors: js.Array[String | ErrorWithRange]
  var source: String
  var tips: js.Array[String | ErrorWithRange]
}

object TemplateCompileResult {
  @scala.inline
  def apply(
    code: String,
    errors: js.Array[String | ErrorWithRange],
    source: String,
    tips: js.Array[String | ErrorWithRange],
    ast: js.Object = null
  ): TemplateCompileResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCompileResult]
  }
}

