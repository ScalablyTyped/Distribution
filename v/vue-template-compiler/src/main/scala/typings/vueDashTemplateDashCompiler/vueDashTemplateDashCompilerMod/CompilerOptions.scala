package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import typings.std.Record
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerStrings.condense
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Template compilation options / results
  */
trait CompilerOptions extends js.Object {
  var directives: js.UndefOr[Record[String, DirectiveFunction]] = js.undefined
  var modules: js.UndefOr[js.Array[ModuleOptions]] = js.undefined
  var outputSourceRange: js.UndefOr[js.Any] = js.undefined
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  var whitespace: js.UndefOr[preserve | condense] = js.undefined
}

object CompilerOptions {
  @scala.inline
  def apply(
    directives: Record[String, DirectiveFunction] = null,
    modules: js.Array[ModuleOptions] = null,
    outputSourceRange: js.Any = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    whitespace: preserve | condense = null
  ): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (outputSourceRange != null) __obj.updateDynamic("outputSourceRange")(outputSourceRange.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (whitespace != null) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptions]
  }
}

