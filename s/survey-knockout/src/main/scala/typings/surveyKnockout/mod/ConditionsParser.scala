package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ConditionsParser")
@js.native
class ConditionsParser () extends js.Object {
  
  def createCondition(text: String): Operand = js.native
  
  val error: ConditionsParserError = js.native
  
  def parseExpression(text: String): Operand = js.native
}
