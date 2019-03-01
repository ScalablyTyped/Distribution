package typings
package atVueComponentDashCompilerDashUtilsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerParseOptions extends js.Object {
  var pad: js.UndefOr[
    atVueComponentDashCompilerDashUtilsLib.atVueComponentDashCompilerDashUtilsLibStrings.line | atVueComponentDashCompilerDashUtilsLib.atVueComponentDashCompilerDashUtilsLibStrings.space
  ] = js.undefined
}

object VueTemplateCompilerParseOptions {
  @scala.inline
  def apply(
    pad: atVueComponentDashCompilerDashUtilsLib.atVueComponentDashCompilerDashUtilsLibStrings.line | atVueComponentDashCompilerDashUtilsLib.atVueComponentDashCompilerDashUtilsLibStrings.space = null
  ): VueTemplateCompilerParseOptions = {
    val __obj = js.Dynamic.literal()
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTemplateCompilerParseOptions]
  }
}

