package typings
package tslintLib.libConfigurationMod

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
  var defaultSeverity: js.UndefOr[tslintLib.libLanguageRuleRuleMod.RuleSeverity] = js.undefined
  /**
    * An array of config files whose rules are inherited by this config file.
    */
  var `extends`: js.Array[java.lang.String]
  /**
    * Rules that are used to lint to JavaScript files.
    */
  var jsRules: nodeLib.Map[java.lang.String, stdLib.Partial[tslintLib.libLanguageRuleRuleMod.IOptions]]
  /**
    * A subset of the CLI options.
    */
  var linterOptions: js.UndefOr[stdLib.Partial[tslintLib.Anon_Exclude]] = js.undefined
  /**
    * Rules that are used to lint TypeScript files.
    */
  var rules: nodeLib.Map[java.lang.String, stdLib.Partial[tslintLib.libLanguageRuleRuleMod.IOptions]]
  /**
    * Directories containing custom rules. Resolved using node module semantics.
    */
  var rulesDirectory: js.Array[java.lang.String]
}

object IConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[java.lang.String],
    jsRules: nodeLib.Map[java.lang.String, stdLib.Partial[tslintLib.libLanguageRuleRuleMod.IOptions]],
    rules: nodeLib.Map[java.lang.String, stdLib.Partial[tslintLib.libLanguageRuleRuleMod.IOptions]],
    rulesDirectory: js.Array[java.lang.String],
    defaultSeverity: tslintLib.libLanguageRuleRuleMod.RuleSeverity = null,
    linterOptions: stdLib.Partial[tslintLib.Anon_Exclude] = null
  ): IConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules, rules = rules, rulesDirectory = rulesDirectory)
    __obj.updateDynamic("extends")(`extends`)
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity)
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions)
    __obj.asInstanceOf[IConfigurationFile]
  }
}

