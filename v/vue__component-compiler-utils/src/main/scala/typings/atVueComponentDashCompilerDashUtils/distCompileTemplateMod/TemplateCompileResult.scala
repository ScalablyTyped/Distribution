package typings.atVueComponentDashCompilerDashUtils.distCompileTemplateMod

import typings.atVueComponentDashCompilerDashUtils.distTypesMod.ErrorWithRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCompileResult extends js.Object {
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
    tips: js.Array[String | ErrorWithRange]
  ): TemplateCompileResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplateCompileResult]
  }
}

