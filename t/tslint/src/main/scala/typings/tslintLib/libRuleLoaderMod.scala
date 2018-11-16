package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/ruleLoader", JSImport.Namespace)
@js.native
object libRuleLoaderMod extends js.Object {
  def findRule(name: java.lang.String): js.UndefOr[tslintLib.libLanguageRuleRuleMod.RuleConstructor] = js.native
  def findRule(name: java.lang.String, rulesDirectories: java.lang.String): js.UndefOr[tslintLib.libLanguageRuleRuleMod.RuleConstructor] = js.native
  def findRule(name: java.lang.String, rulesDirectories: js.Array[java.lang.String]): js.UndefOr[tslintLib.libLanguageRuleRuleMod.RuleConstructor] = js.native
  def loadRules(ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions]): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: java.lang.String
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: java.lang.String,
    isJs: scala.Boolean
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String],
    isJs: scala.Boolean
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
}

