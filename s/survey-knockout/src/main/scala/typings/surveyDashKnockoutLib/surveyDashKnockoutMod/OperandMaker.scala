package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "OperandMaker")
@js.native
class OperandMaker () extends js.Object

/* static members */
@JSImport("survey-knockout", "OperandMaker")
@js.native
object OperandMaker extends js.Object {
  var binaryFunctions: surveyDashKnockoutLib.surveyDashKnockoutMod.HashTable[js.Function] = js.native
  var signs: surveyDashKnockoutLib.surveyDashKnockoutMod.HashTable[java.lang.String] = js.native
  var unaryFunctions: surveyDashKnockoutLib.surveyDashKnockoutMod.HashTable[js.Function] = js.native
  def isBooleanValue(value: java.lang.String): scala.Boolean = js.native
  def isNumeric(value: java.lang.String): scala.Boolean = js.native
  def operatorToString(operatorName: java.lang.String): java.lang.String = js.native
  def safeToString(operand: surveyDashKnockoutLib.surveyDashKnockoutMod.Operand): java.lang.String = js.native
  def throwInvalidOperatorError(op: java.lang.String): scala.Unit = js.native
  def toOperandString(value: java.lang.String): java.lang.String = js.native
}

