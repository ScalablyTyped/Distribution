package typings.atVueComponentDashCompilerDashUtils.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerOptions extends js.Object {
  var modules: js.UndefOr[js.Array[js.Object]] = js.undefined
  var outputSourceRange: js.UndefOr[Boolean] = js.undefined
}

object VueTemplateCompilerOptions {
  @scala.inline
  def apply(modules: js.Array[js.Object] = null, outputSourceRange: js.UndefOr[Boolean] = js.undefined): VueTemplateCompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(outputSourceRange)) __obj.updateDynamic("outputSourceRange")(outputSourceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTemplateCompilerOptions]
  }
}

