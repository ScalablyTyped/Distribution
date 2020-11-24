package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyTimer")
@js.native
class SurveyTimer () extends js.Object {
  
  def doTimer(): Unit = js.native
  
  var onTimer: Event[js.Function0[_], _] = js.native
  
  def start(): Unit = js.native
  def start(func: js.Function0[_]): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(func: js.Function0[_]): Unit = js.native
}
/* static members */
@JSImport("survey-knockout", "SurveyTimer")
@js.native
object SurveyTimer extends js.Object {
  
  val instance: SurveyTimer = js.native
}
