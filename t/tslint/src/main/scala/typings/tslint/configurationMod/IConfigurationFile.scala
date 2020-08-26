package typings.tslint.configurationMod

import typings.std.Map
import typings.tslint.anon.PartialIOptions
import typings.tslint.anon.PartialexcludeArraystring
import typings.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigurationFile extends js.Object {
  /**
    * @deprecated property is never set
    *
    * The severity that is applied to rules in this config file as well as rules
    * in any inherited config files which have their severity set to "default".
    * Not inherited.
    */
  var defaultSeverity: js.UndefOr[RuleSeverity] = js.native
  /**
    * An array of config files whose rules are inherited by this config file.
    */
  var `extends`: js.Array[String] = js.native
  /**
    * Rules that are used to lint to JavaScript files.
    */
  var jsRules: Map[String, PartialIOptions] = js.native
  /**
    * A subset of the CLI options.
    */
  var linterOptions: js.UndefOr[PartialexcludeArraystring] = js.native
  /**
    * Rules that are used to lint TypeScript files.
    */
  var rules: Map[String, PartialIOptions] = js.native
  /**
    * Directories containing custom rules. Resolved using node module semantics.
    */
  var rulesDirectory: js.Array[String] = js.native
}

object IConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, PartialIOptions],
    rules: Map[String, PartialIOptions],
    rulesDirectory: js.Array[String]
  ): IConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurationFile]
  }
  @scala.inline
  implicit class IConfigurationFileOps[Self <: IConfigurationFile] (val x: Self) extends AnyVal {
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
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsRules(value: Map[String, PartialIOptions]): Self = this.set("jsRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setRules(value: Map[String, PartialIOptions]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesDirectoryVarargs(value: String*): Self = this.set("rulesDirectory", js.Array(value :_*))
    @scala.inline
    def setRulesDirectory(value: js.Array[String]): Self = this.set("rulesDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSeverity(value: RuleSeverity): Self = this.set("defaultSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSeverity: Self = this.set("defaultSeverity", js.undefined)
    @scala.inline
    def setLinterOptions(value: PartialexcludeArraystring): Self = this.set("linterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinterOptions: Self = this.set("linterOptions", js.undefined)
  }
  
}

