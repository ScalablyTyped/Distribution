package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionRunner")
@js.native
open class ExpressionRunner protected () extends ExpressionRunnerBase {
  def this(expression: String) = this()
  
  def onRunComplete(result: Any): Unit = js.native
  
  def run(values: Any): Any = js.native
  def run(values: Any, properties: Any): Any = js.native
}
