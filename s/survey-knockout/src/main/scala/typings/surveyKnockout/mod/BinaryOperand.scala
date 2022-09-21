package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "BinaryOperand")
@js.native
open class BinaryOperand protected () extends Operand {
  def this(operatorName: String) = this()
  def this(operatorName: String, left: Any) = this()
  def this(operatorName: String, left: Any, right: Any) = this()
  def this(operatorName: String, left: Unit, right: Any) = this()
  def this(operatorName: String, left: Any, right: Any, isArithmeticOp: Boolean) = this()
  def this(operatorName: String, left: Any, right: Unit, isArithmeticOp: Boolean) = this()
  def this(operatorName: String, left: Unit, right: Any, isArithmeticOp: Boolean) = this()
  def this(operatorName: String, left: Unit, right: Unit, isArithmeticOp: Boolean) = this()
  
  def conjunction: String = js.native
  
  var consumer: Any = js.native
  
  def isArithmetic: Boolean = js.native
  
  var isArithmeticValue: Boolean = js.native
  
  def isConjunction: Boolean = js.native
  
  def leftOperand: Any = js.native
  
  def operator: String = js.native
  
  def rightOperand: Any = js.native
}
