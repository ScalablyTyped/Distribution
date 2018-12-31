package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ConditionsParser")
@js.native
class ConditionsParser () extends js.Object {
  val ERROR_EndExpected: java.lang.String = js.native
  val ERROR_ExpressionExpected: java.lang.String = js.native
  val ERROR_OperatorExpected: java.lang.String = js.native
  val ERROR_RightPartExpected: java.lang.String = js.native
  val error: ConditionsParserError = js.native
  def createCondition(text: java.lang.String): ConditionNode = js.native
  def parse(text: java.lang.String, root: ConditionNode): scala.Boolean = js.native
  def parseExpression(text: java.lang.String): Operand = js.native
  def toString(root: ConditionNode): java.lang.String = js.native
}

