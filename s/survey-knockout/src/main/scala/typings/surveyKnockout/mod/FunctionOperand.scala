package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "FunctionOperand")
@js.native
class FunctionOperand protected () extends Operand {
  def this(origionalValue: String, parameters: ArrayOperand) = this()
  
  def evaluateAsync(processValue: ProcessValue): Unit = js.native
  
  val isReady: Boolean = js.native
  
  def onAsyncReady(): Unit = js.native
}
