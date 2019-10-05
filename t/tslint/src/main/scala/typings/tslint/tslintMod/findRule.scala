package typings.tslint.tslintMod

import typings.tslint.libLanguageRuleRuleMod.RuleConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "findRule")
@js.native
object findRule extends js.Object {
  def apply(name: String): js.UndefOr[RuleConstructor] = js.native
  def apply(name: String, rulesDirectories: String): js.UndefOr[RuleConstructor] = js.native
  def apply(name: String, rulesDirectories: js.Array[String]): js.UndefOr[RuleConstructor] = js.native
}

