package typings.tslint.libLanguageRuleRuleMod

import typings.typescript.typescriptMod.LineAndCharacter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/rule", "RuleFailurePosition")
@js.native
class RuleFailurePosition protected () extends js.Object {
  def this(position: Double, lineAndCharacter: LineAndCharacter) = this()
  val lineAndCharacter: js.Any = js.native
  val position: js.Any = js.native
  def equals(ruleFailurePosition: RuleFailurePosition): Boolean = js.native
  def getLineAndCharacter(): LineAndCharacter = js.native
  def getPosition(): Double = js.native
  def toJson(): IRuleFailurePositionJson = js.native
}

