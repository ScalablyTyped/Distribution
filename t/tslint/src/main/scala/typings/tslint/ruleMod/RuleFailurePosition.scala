package typings.tslint.ruleMod

import typings.typescript.mod.LineAndCharacter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/language/rule/rule", "RuleFailurePosition")
@js.native
class RuleFailurePosition protected () extends js.Object {
  def this(position: Double, lineAndCharacter: LineAndCharacter) = this()
  
  def equals(ruleFailurePosition: RuleFailurePosition): Boolean = js.native
  
  def getLineAndCharacter(): LineAndCharacter = js.native
  
  def getPosition(): Double = js.native
  
  val lineAndCharacter: js.Any = js.native
  
  val position: js.Any = js.native
  
  def toJson(): IRuleFailurePositionJson = js.native
}
