package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ConditionsParser")
@js.native
class ConditionsParser () extends js.Object {
  val error: ConditionsParserError = js.native
  def createCondition(text: String): Operand = js.native
  def parseExpression(text: String): Operand = js.native
}

