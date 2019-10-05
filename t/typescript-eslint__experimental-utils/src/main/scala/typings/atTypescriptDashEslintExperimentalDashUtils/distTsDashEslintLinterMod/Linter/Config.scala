package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var env: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var globals: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var parserOptions: js.UndefOr[ParserOptions] = js.undefined
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    env: StringDictionary[Boolean] = null,
    globals: StringDictionary[Boolean] = null,
    parser: String = null,
    parserOptions: ParserOptions = null,
    rules: StringDictionary[RuleLevel | RuleLevelAndOptions] = null,
    settings: StringDictionary[js.Any] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Config]
  }
}

