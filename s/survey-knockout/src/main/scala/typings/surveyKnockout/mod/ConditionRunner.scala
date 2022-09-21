package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ConditionRunner")
@js.native
open class ConditionRunner protected () extends ExpressionRunnerBase {
  def this(expression: String) = this()
  
  def onRunComplete(result: Boolean): Unit = js.native
  
  def run(values: Any): Boolean = js.native
  def run(values: Any, properties: Any): Boolean = js.native
}
