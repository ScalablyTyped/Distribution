package typings
package atVueComponentDashCompilerDashUtilsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerResults extends js.Object {
  var ast: js.Object | scala.Unit
  var errors: js.Array[java.lang.String | ErrorWithRange]
  var render: java.lang.String
  var staticRenderFns: js.Array[java.lang.String]
  var tips: js.Array[java.lang.String | ErrorWithRange]
}

object VueTemplateCompilerResults {
  @scala.inline
  def apply(
    ast: js.Object | scala.Unit,
    errors: js.Array[java.lang.String | ErrorWithRange],
    render: java.lang.String,
    staticRenderFns: js.Array[java.lang.String],
    tips: js.Array[java.lang.String | ErrorWithRange]
  ): VueTemplateCompilerResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("staticRenderFns")(staticRenderFns)
    __obj.updateDynamic("tips")(tips)
    __obj.asInstanceOf[VueTemplateCompilerResults]
  }
}

