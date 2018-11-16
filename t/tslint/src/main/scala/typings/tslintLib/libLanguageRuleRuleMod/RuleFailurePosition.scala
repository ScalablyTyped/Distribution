package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/rule", "RuleFailurePosition")
@js.native
class RuleFailurePosition protected () extends js.Object {
  def this(position: scala.Double, lineAndCharacter: typescriptLib.typescriptMod.tsNs.LineAndCharacter) = this()
  val lineAndCharacter: js.Any = js.native
  val position: js.Any = js.native
  def equals(ruleFailurePosition: RuleFailurePosition): scala.Boolean = js.native
  def getLineAndCharacter(): typescriptLib.typescriptMod.tsNs.LineAndCharacter = js.native
  def getPosition(): scala.Double = js.native
  def toJson(): IRuleFailurePositionJson = js.native
}

