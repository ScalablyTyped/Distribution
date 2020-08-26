package typings.xo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.RuleLevel
import typings.eslint.mod.Linter.RuleLevelAndOptions
import typings.xo.xoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xo.xo.Pick<eslint.eslint.CLIEngine.Options, 'baseConfig' | 'cwd' | 'envs' | 'extensions' | 'fix' | 'globals' | 'ignore' | 'parser' | 'plugins' | 'rules'> */
@js.native
trait CLIEngineOptions extends js.Object {
  var baseConfig: js.UndefOr[`false` | StringDictionary[js.Any]] = js.native
  var cwd: js.UndefOr[String] = js.native
  var envs: js.UndefOr[js.Array[String]] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var fix: js.UndefOr[Boolean] = js.native
  var globals: js.UndefOr[js.Array[String]] = js.native
  var ignore: js.UndefOr[Boolean] = js.native
  var parser: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.native
}

object CLIEngineOptions {
  @scala.inline
  def apply(): CLIEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CLIEngineOptions]
  }
  @scala.inline
  implicit class CLIEngineOptionsOps[Self <: CLIEngineOptions] (val x: Self) extends AnyVal {
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
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
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
    def setRules(value: StringDictionary[RuleLevel | RuleLevelAndOptions]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

