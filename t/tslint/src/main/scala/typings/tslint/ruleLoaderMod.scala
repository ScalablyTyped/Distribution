package typings.tslint

import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRule
import typings.tslint.ruleMod.RuleConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleLoaderMod {
  
  @JSImport("tslint/lib/ruleLoader", "findRule")
  @js.native
  def findRule(name: String): js.UndefOr[RuleConstructor] = js.native
  @JSImport("tslint/lib/ruleLoader", "findRule")
  @js.native
  def findRule(name: String, rulesDirectories: String): js.UndefOr[RuleConstructor] = js.native
  @JSImport("tslint/lib/ruleLoader", "findRule")
  @js.native
  def findRule(name: String, rulesDirectories: js.Array[String]): js.UndefOr[RuleConstructor] = js.native
  
  @JSImport("tslint/lib/ruleLoader", "loadRules")
  @js.native
  def loadRules(ruleOptionsList: js.Array[IOptions]): js.Array[IRule] = js.native
  @JSImport("tslint/lib/ruleLoader", "loadRules")
  @js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.UndefOr[scala.Nothing], isJs: Boolean): js.Array[IRule] = js.native
  @JSImport("tslint/lib/ruleLoader", "loadRules")
  @js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String): js.Array[IRule] = js.native
  @JSImport("tslint/lib/ruleLoader", "loadRules")
  @js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String, isJs: Boolean): js.Array[IRule] = js.native
  @JSImport("tslint/lib/ruleLoader", "loadRules")
  @js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String]): js.Array[IRule] = js.native
  @JSImport("tslint/lib/ruleLoader", "loadRules")
  @js.native
  def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String], isJs: Boolean): js.Array[IRule] = js.native
}
