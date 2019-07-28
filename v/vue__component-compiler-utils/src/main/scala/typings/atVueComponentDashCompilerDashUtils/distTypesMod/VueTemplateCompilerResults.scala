package typings.atVueComponentDashCompilerDashUtils.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerResults extends js.Object {
  var ast: js.Object | Unit
  var errors: js.Array[String | ErrorWithRange]
  var render: String
  var staticRenderFns: js.Array[String]
  var tips: js.Array[String | ErrorWithRange]
}

object VueTemplateCompilerResults {
  @scala.inline
  def apply(
    ast: js.Object | Unit,
    errors: js.Array[String | ErrorWithRange],
    render: String,
    staticRenderFns: js.Array[String],
    tips: js.Array[String | ErrorWithRange]
  ): VueTemplateCompilerResults = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], errors = errors, render = render, staticRenderFns = staticRenderFns, tips = tips)
  
    __obj.asInstanceOf[VueTemplateCompilerResults]
  }
}

