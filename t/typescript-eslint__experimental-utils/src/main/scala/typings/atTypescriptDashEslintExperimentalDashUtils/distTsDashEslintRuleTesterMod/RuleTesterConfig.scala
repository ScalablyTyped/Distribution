package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`@typescript-eslint/parser`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`babel-eslint`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.espree
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.esprima
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintParserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterConfig extends js.Object {
  var parser: js.UndefOr[`@typescript-eslint/parser` | espree | `babel-eslint` | esprima | String] = js.undefined
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
}

object RuleTesterConfig {
  @scala.inline
  def apply(
    parser: `@typescript-eslint/parser` | espree | `babel-eslint` | esprima | String = null,
    parserOptions: ParserOptions = null
  ): RuleTesterConfig = {
    val __obj = js.Dynamic.literal()
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    __obj.asInstanceOf[RuleTesterConfig]
  }
}

