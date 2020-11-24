package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "BinaryOperand")
@js.native
class BinaryOperand protected () extends Operand {
  def this(operatorName: String) = this()
  def this(operatorName: String, left: js.Any) = this()
  def this(operatorName: String, left: js.UndefOr[scala.Nothing], right: js.Any) = this()
  def this(operatorName: String, left: js.Any, right: js.Any) = this()
  def this(
    operatorName: String,
    left: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    isArithmeticOp: Boolean
  ) = this()
  def this(operatorName: String, left: js.UndefOr[scala.Nothing], right: js.Any, isArithmeticOp: Boolean) = this()
  def this(operatorName: String, left: js.Any, right: js.UndefOr[scala.Nothing], isArithmeticOp: Boolean) = this()
  def this(operatorName: String, left: js.Any, right: js.Any, isArithmeticOp: Boolean) = this()
  
  val conjunction: String = js.native
  
  val isArithmetic: Boolean = js.native
  
  val isConjunction: Boolean = js.native
  
  val leftOperand: js.Any = js.native
  
  val operator: String = js.native
  
  val rightOperand: js.Any = js.native
}
