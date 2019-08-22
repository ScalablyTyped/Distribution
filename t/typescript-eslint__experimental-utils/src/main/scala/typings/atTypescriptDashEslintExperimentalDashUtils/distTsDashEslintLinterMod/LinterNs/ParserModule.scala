package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.LinterNs

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserModule extends js.Object {
  var parse: js.UndefOr[js.Function2[/* text */ String, /* options */ js.UndefOr[js.Any], Program]] = js.undefined
  var parseForESLint: js.UndefOr[
    js.Function2[/* text */ String, /* options */ js.UndefOr[js.Any], ESLintParseResult]
  ] = js.undefined
}

object ParserModule {
  @scala.inline
  def apply(
    parse: (/* text */ String, /* options */ js.UndefOr[js.Any]) => Program = null,
    parseForESLint: (/* text */ String, /* options */ js.UndefOr[js.Any]) => ESLintParseResult = null
  ): ParserModule = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2(parse))
    if (parseForESLint != null) __obj.updateDynamic("parseForESLint")(js.Any.fromFunction2(parseForESLint))
    __obj.asInstanceOf[ParserModule]
  }
}

