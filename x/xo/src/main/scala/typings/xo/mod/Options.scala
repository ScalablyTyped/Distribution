package typings.xo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.RuleLevel
import typings.eslint.mod.Linter.RuleLevelAndOptions
import typings.xo.xoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  esnext ? :boolean,   ignores ? :std.Array<string>,   nodeVersion ? :string | boolean,   prettier ? :boolean,   semicolon ? :boolean,   space ? :number | string,   webpack ? :boolean | object} & xo.xo.CLIEngineOptions & xo.xo.ESLintConfig & xo.xo.ESLintOptions */
trait Options extends js.Object {
  var baseConfig: js.UndefOr[`false` | StringDictionary[js.Any]] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var envs: js.UndefOr[js.Array[String]] = js.undefined
  /** Enforce ES2015+ rules. Disabling this will make it not enforce ES2015+ syntax and conventions */
  var esnext: js.UndefOr[Boolean] = js.undefined
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var fix: js.UndefOr[Boolean] = js.undefined
  var globals: js.UndefOr[js.Array[String]] = js.undefined
  var ignore: js.UndefOr[Boolean] = js.undefined
  /** Some paths are ignored by default, including paths in .gitignore and .eslintignore. Additional ignores can be added here */
  var ignores: js.UndefOr[js.Array[String]] = js.undefined
  /** Enable rules specific to the Node.js versions within the configured range */
  var nodeVersion: js.UndefOr[String | Boolean] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  /** Format code with Prettier */
  var prettier: js.UndefOr[Boolean] = js.undefined
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.undefined
  /** Set it to false to enforce no-semicolon style. */
  var semicolon: js.UndefOr[Boolean] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** Set it to true to get 2-space indentation or specify the number of spaces. */
  var space: js.UndefOr[Double | String] = js.undefined
  /**
    * Use {@link https://github.com/benmosher/eslint-plugin-import/tree/master/resolvers/webpack}
    * to resolve import search paths. This is enabled automatically if a `webpack.config.js` file is found.
    * Set this to a boolean to explicitly enable or disable the resolver.
    * @default false
    */
  var webpack: js.UndefOr[Boolean | js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseConfig: `false` | StringDictionary[js.Any] = null,
    cwd: String = null,
    envs: js.Array[String] = null,
    esnext: js.UndefOr[Boolean] = js.undefined,
    `extends`: String | js.Array[String] = null,
    extensions: js.Array[String] = null,
    filename: String = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    ignores: js.Array[String] = null,
    nodeVersion: String | Boolean = null,
    parser: String = null,
    plugins: js.Array[String] = null,
    prettier: js.UndefOr[Boolean] = js.undefined,
    rules: StringDictionary[RuleLevel | RuleLevelAndOptions] = null,
    semicolon: js.UndefOr[Boolean] = js.undefined,
    settings: StringDictionary[js.Any] = null,
    space: Double | String = null,
    webpack: Boolean | js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseConfig != null) __obj.updateDynamic("baseConfig")(baseConfig.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (envs != null) __obj.updateDynamic("envs")(envs.asInstanceOf[js.Any])
    if (!js.isUndefined(esnext)) __obj.updateDynamic("esnext")(esnext.get.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.get.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.get.asInstanceOf[js.Any])
    if (ignores != null) __obj.updateDynamic("ignores")(ignores.asInstanceOf[js.Any])
    if (nodeVersion != null) __obj.updateDynamic("nodeVersion")(nodeVersion.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(prettier)) __obj.updateDynamic("prettier")(prettier.get.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon.get.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(webpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

