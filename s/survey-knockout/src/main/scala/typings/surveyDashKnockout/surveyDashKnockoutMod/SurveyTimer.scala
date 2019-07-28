package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyTimer")
@js.native
class SurveyTimer () extends js.Object {
  var onTimer: Event[js.Function0[_], _] = js.native
  def doTimer(): Unit = js.native
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

