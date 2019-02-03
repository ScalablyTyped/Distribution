package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyTimer")
@js.native
class SurveyTimer () extends js.Object {
  var onTimer: Event[js.Function0[_], _] = js.native
  def doTimer(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def start(func: js.Function0[_]): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stop(func: js.Function0[_]): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "SurveyTimer")
@js.native
object SurveyTimer extends js.Object {
  val instance: surveyDashKnockoutLib.surveyDashKnockoutMod.SurveyTimer = js.native
}

