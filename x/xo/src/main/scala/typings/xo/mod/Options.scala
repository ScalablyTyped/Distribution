package typings.xo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.RuleLevel
import typings.eslint.mod.Linter.RuleLevelAndOptions
import typings.xo.xoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  esnext :boolean | undefined,   ignores :std.Array<string> | undefined,   nodeVersion :string | boolean | undefined,   prettier :boolean | undefined,   semicolon :boolean | undefined,   space :number | string | undefined,   webpack :boolean | object | undefined} & xo.xo.CLIEngineOptions & xo.xo.ESLintConfig & xo.xo.ESLintOptions */
@js.native
trait Options extends js.Object {
  var baseConfig: js.UndefOr[`false` | StringDictionary[js.Any]] = js.native
  var cwd: js.UndefOr[String] = js.native
  var envs: js.UndefOr[js.Array[String]] = js.native
  /** Enforce ES2015+ rules. Disabling this will make it not enforce ES2015+ syntax and conventions */
  var esnext: js.UndefOr[Boolean] = js.native
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var filename: js.UndefOr[String] = js.native
  var fix: js.UndefOr[Boolean] = js.native
  var globals: js.UndefOr[js.Array[String]] = js.native
  var ignore: js.UndefOr[Boolean] = js.native
  /** Some paths are ignored by default, including paths in .gitignore and .eslintignore. Additional ignores can be added here */
  var ignores: js.UndefOr[js.Array[String]] = js.native
  /** Enable rules specific to the Node.js versions within the configured range */
  var nodeVersion: js.UndefOr[String | Boolean] = js.native
  var parser: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  /** Format code with Prettier */
  var prettier: js.UndefOr[Boolean] = js.native
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.native
  /** Set it to false to enforce no-semicolon style. */
  var semicolon: js.UndefOr[Boolean] = js.native
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** Set it to true to get 2-space indentation or specify the number of spaces. */
  var space: js.UndefOr[Double | String] = js.native
  /**
    * Use {@link https://github.com/benmosher/eslint-plugin-import/tree/master/resolvers/webpack}
    * to resolve import search paths. This is enabled automatically if a `webpack.config.js` file is found.
    * Set this to a boolean to explicitly enable or disable the resolver.
    * @default false
    */
  var webpack: js.UndefOr[Boolean | js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseConfig(value: `false` | StringDictionary[js.Any]): Self = this.set("baseConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseConfig: Self = this.set("baseConfig", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setEnvsVarargs(value: String*): Self = this.set("envs", js.Array(value :_*))
    @scala.inline
    def setEnvs(value: js.Array[String]): Self = this.set("envs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvs: Self = this.set("envs", js.undefined)
    @scala.inline
    def setEsnext(value: Boolean): Self = this.set("esnext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEsnext: Self = this.set("esnext", js.undefined)
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: String | js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setGlobalsVarargs(value: String*): Self = this.set("globals", js.Array(value :_*))
    @scala.inline
    def setGlobals(value: js.Array[String]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnoresVarargs(value: String*): Self = this.set("ignores", js.Array(value :_*))
    @scala.inline
    def setIgnores(value: js.Array[String]): Self = this.set("ignores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnores: Self = this.set("ignores", js.undefined)
    @scala.inline
    def setNodeVersion(value: String | Boolean): Self = this.set("nodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeVersion: Self = this.set("nodeVersion", js.undefined)
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPrettier(value: Boolean): Self = this.set("prettier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettier: Self = this.set("prettier", js.undefined)
    @scala.inline
    def setRules(value: StringDictionary[RuleLevel | RuleLevelAndOptions]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSemicolon(value: Boolean): Self = this.set("semicolon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemicolon: Self = this.set("semicolon", js.undefined)
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setSpace(value: Double | String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setWebpack(value: Boolean | js.Object): Self = this.set("webpack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebpack: Self = this.set("webpack", js.undefined)
  }
  
}

