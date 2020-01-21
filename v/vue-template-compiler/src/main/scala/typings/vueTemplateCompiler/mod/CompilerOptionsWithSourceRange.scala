package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.condense
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerOptionsWithSourceRange extends CompilerOptions {
  @JSName("outputSourceRange")
  var outputSourceRange_CompilerOptionsWithSourceRange: `true`
}

object CompilerOptionsWithSourceRange {
  @scala.inline
  def apply(
    outputSourceRange: `true`,
    directives: Record[String, DirectiveFunction] = null,
    modules: js.Array[ModuleOptions] = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    whitespace: preserve | condense = null
  ): CompilerOptionsWithSourceRange = {
    val __obj = js.Dynamic.literal(outputSourceRange = outputSourceRange.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (whitespace != null) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptionsWithSourceRange]
  }
}

