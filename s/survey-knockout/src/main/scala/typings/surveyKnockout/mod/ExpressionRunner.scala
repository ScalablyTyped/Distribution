package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionRunner")
@js.native
class ExpressionRunner protected () extends ExpressionRunnerBase {
  def this(expression: String) = this()
  
  def onRunComplete(result: js.Any): Unit = js.native
  
  def run(values: HashTable[js.Any]): js.Any = js.native
  def run(values: HashTable[js.Any], properties: HashTable[js.Any]): js.Any = js.native
}
