package typings.vueComponentCompilerUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerResults extends js.Object {
  var ast: js.UndefOr[js.Object] = js.undefined
  var errors: js.Array[String | ErrorWithRange]
  var render: String
  var staticRenderFns: js.Array[String]
  var tips: js.Array[String | ErrorWithRange]
}

object VueTemplateCompilerResults {
  @scala.inline
  def apply(
    errors: js.Array[String | ErrorWithRange],
    render: String,
    staticRenderFns: js.Array[String],
    tips: js.Array[String | ErrorWithRange],
    ast: js.Object = null
  ): VueTemplateCompilerResults = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTemplateCompilerResults]
  }
}

