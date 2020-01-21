package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "BinaryOperand")
@js.native
class BinaryOperand protected () extends Operand {
  def this(operatorName: String) = this()
  def this(operatorName: String, left: js.Any) = this()
  def this(operatorName: String, left: js.Any, right: js.Any) = this()
  def this(operatorName: String, left: js.Any, right: js.Any, isArithmeticOp: Boolean) = this()
  val isArithmetic: Boolean = js.native
  val isConjunction: Boolean = js.native
  val leftOperand: js.Any = js.native
  val rightOperand: js.Any = js.native
}

