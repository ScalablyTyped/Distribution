package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyTrigger")
@js.native
class SurveyTrigger () extends Trigger {
  val isOnNextPage: scala.Boolean = js.native
  var owner: ISurveyTriggerOwner = js.native
  def setOwner(owner: ISurveyTriggerOwner): scala.Unit = js.native
}

