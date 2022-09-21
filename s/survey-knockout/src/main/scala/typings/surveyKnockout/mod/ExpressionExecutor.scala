package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionExecutor")
@js.native
open class ExpressionExecutor protected ()
  extends StObject
     with IExpresionExecutor {
  def this(expression: String) = this()
  
  var asyncFuncList: Any = js.native
  
  def canRun(): Boolean = js.native
  
  def expression: String = js.native
  
  var expressionValue: String = js.native
  
  def getVariables(): js.Array[Any] = js.native
  
  def hasFunction(): Boolean = js.native
  
  var hasFunctionValue: Boolean = js.native
  
  def isAsync: Boolean = js.native
  
  var isAsyncValue: Boolean = js.native
  
  /*
    * This call back runs on executing expression if there is at least one async function
    */
  /* CompleteClass */
  override def onComplete(res: Any): Unit = js.native
  
  var operand: Operand = js.native
  
  var parser: ConditionsParser = js.native
  
  var processValue: ProcessValue = js.native
  
  def run(values: Any): Any = js.native
  def run(values: Any, properties: Any): Any = js.native
}
/* static members */
object ExpressionExecutor {
  
  @JSImport("survey-knockout", "ExpressionExecutor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createExpressionExecutor(expression: String): IExpresionExecutor = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpressionExecutor")(expression.asInstanceOf[js.Any]).asInstanceOf[IExpresionExecutor]
}
