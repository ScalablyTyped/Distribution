package typings.xo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.RuleLevel
import typings.eslint.mod.Linter.RuleLevelAndOptions
import typings.xo.xoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xo.xo.Pick<eslint.eslint.CLIEngine.Options, 'baseConfig' | 'cwd' | 'envs' | 'extensions' | 'fix' | 'globals' | 'ignore' | 'parser' | 'plugins' | 'rules'> */
trait CLIEngineOptions extends js.Object {
  var baseConfig: js.UndefOr[`false` | StringDictionary[js.Any]] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var envs: js.UndefOr[js.Array[String]] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var fix: js.UndefOr[Boolean] = js.undefined
  var globals: js.UndefOr[js.Array[String]] = js.undefined
  var ignore: js.UndefOr[Boolean] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.undefined
}

object CLIEngineOptions {
  @scala.inline
  def apply(
    baseConfig: `false` | StringDictionary[js.Any] = null,
    cwd: String = null,
    envs: js.Array[String] = null,
    extensions: js.Array[String] = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    parser: String = null,
    plugins: js.Array[String] = null,
    rules: StringDictionary[RuleLevel | RuleLevelAndOptions] = null
  ): CLIEngineOptions = {
    val __obj = js.Dynamic.literal()
    if (baseConfig != null) __obj.updateDynamic("baseConfig")(baseConfig.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (envs != null) __obj.updateDynamic("envs")(envs.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.get.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.get.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLIEngineOptions]
  }
}

