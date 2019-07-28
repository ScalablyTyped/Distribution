package typings.tslint.libConfigurationMod

import typings.std.Map
import typings.std.Partial
import typings.tslint.Anon_Exclude
import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurationFile extends js.Object {
  /**
    * @deprecated property is never set
    *
    * The severity that is applied to rules in this config file as well as rules
    * in any inherited config files which have their severity set to "default".
    * Not inherited.
    */
  var defaultSeverity: js.UndefOr[RuleSeverity] = js.undefined
  /**
    * An array of config files whose rules are inherited by this config file.
    */
  var `extends`: js.Array[String]
  /**
    * Rules that are used to lint to JavaScript files.
    */
  var jsRules: Map[String, Partial[IOptions]]
  /**
    * A subset of the CLI options.
    */
  var linterOptions: js.UndefOr[Partial[Anon_Exclude]] = js.undefined
  /**
    * Rules that are used to lint TypeScript files.
    */
  var rules: Map[String, Partial[IOptions]]
  /**
    * Directories containing custom rules. Resolved using node module semantics.
    */
  var rulesDirectory: js.Array[String]
}

object IConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, Partial[IOptions]],
    rules: Map[String, Partial[IOptions]],
    rulesDirectory: js.Array[String],
    defaultSeverity: RuleSeverity = null,
    linterOptions: Partial[Anon_Exclude] = null
  ): IConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules, rules = rules, rulesDirectory = rulesDirectory)
    __obj.updateDynamic("extends")(`extends`)
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity)
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions)
    __obj.asInstanceOf[IConfigurationFile]
  }
}

