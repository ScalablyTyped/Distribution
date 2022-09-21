package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "FunctionOperand")
@js.native
open class FunctionOperand protected () extends Operand {
  def this(originalValue: String, parameters: ArrayOperand) = this()
  
  var asynResult: Any = js.native
  
  def evaluateAsync(processValue: ProcessValue): Unit = js.native
  
  def isReady: Boolean = js.native
  
  var isReadyValue: Boolean = js.native
  
  var onAsyncReady: Any = js.native
}
