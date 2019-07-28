package typings.surveyDashKnockout.surveyDashKnockoutMod

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
  var binaryFunctions: HashTable[js.Function] = js.native
  var signs: HashTable[String] = js.native
  var unaryFunctions: HashTable[js.Function] = js.native
  def isBooleanValue(value: String): Boolean = js.native
  def isNumeric(value: String): Boolean = js.native
  def operatorToString(operatorName: String): String = js.native
  def safeToString(operand: Operand): String = js.native
  def throwInvalidOperatorError(op: String): Unit = js.native
  def toOperandString(value: String): String = js.native
}

