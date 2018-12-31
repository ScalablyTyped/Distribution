package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Condition")
@js.native
class Condition () extends js.Object {
  var left: Operand = js.native
  var operator: java.lang.String = js.native
  var right: Operand = js.native
  def fillVariables(vars: js.Array[java.lang.String]): scala.Unit = js.native
  def perform(): scala.Boolean = js.native
  def perform(left: js.Any): scala.Boolean = js.native
  def perform(left: js.Any, right: js.Any): scala.Boolean = js.native
  def perform(left: js.Any, right: js.Any, processValue: ProcessValue): scala.Boolean = js.native
  def performExplicit(left: js.Any, right: js.Any, processValue: ProcessValue): scala.Boolean = js.native
}

@JSImport("survey-knockout", "Condition")
@js.native
object Condition extends js.Object {
  val operators: surveyDashKnockoutLib.surveyDashKnockoutMod.HashTable[js.Function] = js.native
  var operatorsValue: surveyDashKnockoutLib.surveyDashKnockoutMod.HashTable[js.Function] = js.native
  def getOperator(opName: java.lang.String): js.Any = js.native
  def isCorrectOperator(opName: java.lang.String): scala.Boolean = js.native
  def isNoRightOperation(op: java.lang.String): scala.Boolean = js.native
  def setOperator(opName: java.lang.String, func: js.Function2[/* left */ js.Any, /* right */ js.Any, scala.Boolean]): scala.Unit = js.native
}

