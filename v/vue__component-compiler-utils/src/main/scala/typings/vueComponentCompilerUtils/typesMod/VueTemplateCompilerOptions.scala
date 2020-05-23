package typings.vueComponentCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.condense
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerOptions extends js.Object {
  var directives: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var modules: js.UndefOr[js.Array[js.Object]] = js.undefined
  var outputSourceRange: js.UndefOr[Boolean] = js.undefined
  var whitespace: js.UndefOr[preserve | condense] = js.undefined
}

object VueTemplateCompilerOptions {
  @scala.inline
  def apply(
    directives: StringDictionary[js.Function] = null,
    modules: js.Array[js.Object] = null,
    outputSourceRange: js.UndefOr[Boolean] = js.undefined,
    whitespace: preserve | condense = null
  ): VueTemplateCompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(outputSourceRange)) __obj.updateDynamic("outputSourceRange")(outputSourceRange.get.asInstanceOf[js.Any])
    if (whitespace != null) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTemplateCompilerOptions]
  }
}

