package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRule
import typings.tslint.libLanguageRuleRuleMod.RuleConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/ruleLoader", JSImport.Namespace)
@js.native
object libRuleLoaderMod extends js.Object {
  def findRule(name: String): js.UndefOr[RuleConstructor] = js.native
  def findRule(name: String, rulesDirectories: String): js.UndefOr[RuleConstructor] = js.native
  def findRule(name: String, rulesDirectories: js.Array[String]): js.UndefOr[RuleConstructor] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions]): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String, isJs: Boolean): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String]): js.Array[IRule] = js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String], isJs: Boolean): js.Array[IRule] = js.native
}

