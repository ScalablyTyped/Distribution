package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionRunnerBase")
@js.native
class ExpressionRunnerBase protected () extends StObject {
  def this(expression: String) = this()
  
  def canRun(): Boolean = js.native
  
  /* protected */ def doOnComplete(res: js.Any): Unit = js.native
  
  var expression: String = js.native
  
  def getVariables(): js.Array[String] = js.native
  
  def hasFunction(): Boolean = js.native
  
  val isAsync: Boolean = js.native
  
  /* protected */ def runCore(values: HashTable[js.Any]): js.Any = js.native
  /* protected */ def runCore(values: HashTable[js.Any], properties: HashTable[js.Any]): js.Any = js.native
}
