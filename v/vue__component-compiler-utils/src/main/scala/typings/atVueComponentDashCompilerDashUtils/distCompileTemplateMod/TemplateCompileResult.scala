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
    val __obj = js.Dynamic.literal(code = code, errors = errors, source = source, tips = tips)
  
    __obj.asInstanceOf[TemplateCompileResult]
  }
}

