package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ConditionRunner")
@js.native
class ConditionRunner protected () extends ExpressionRunnerBase {
  def this(expression: String) = this()
  
  def onRunComplete(result: Boolean): Unit = js.native
  
  def run(values: HashTable[_]): Boolean = js.native
  def run(values: HashTable[_], properties: HashTable[_]): Boolean = js.native
}
