package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRule
import typings.tslint.libLanguageRuleRuleMod.RuleConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuleLoaderMod {
  
  @JSImport("tslint/lib/ruleLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findRule(name: String): js.UndefOr[RuleConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RuleConstructor]]
  inline def findRule(name: String, rulesDirectories: String): js.UndefOr[RuleConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RuleConstructor]]
  inline def findRule(name: String, rulesDirectories: js.Array[String]): js.UndefOr[RuleConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RuleConstructor]]
  
  inline def loadRules(ruleOptionsList: js.Array[IOptions]): js.Array[IRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any]).asInstanceOf[js.Array[IRule]]
  inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
  inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String, isJs: Boolean): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
  inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String]): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
  inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String], isJs: Boolean): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
  inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: Unit, isJs: Boolean): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
}
