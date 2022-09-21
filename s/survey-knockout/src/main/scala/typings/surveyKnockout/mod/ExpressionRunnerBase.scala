package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionRunnerBase")
@js.native
open class ExpressionRunnerBase protected () extends StObject {
  def this(expression: String) = this()
  
  def canRun(): Boolean = js.native
  
  /* protected */ def doOnComplete(res: Any): Unit = js.native
  
  def expression: String = js.native
  
  var expressionExecutor: IExpresionExecutor = js.native
  
  def expression_=(`val`: String): Unit = js.native
  
  def getVariables(): js.Array[Any] = js.native
  
  def hasFunction(): Boolean = js.native
  
  def isAsync: Boolean = js.native
  
  /* protected */ def runCore(values: Any): Any = js.native
  /* protected */ def runCore(values: Any, properties: Any): Any = js.native
}
