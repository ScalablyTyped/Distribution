package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyTrigger")
@js.native
class SurveyTrigger () extends Trigger {
  val isOnNextPage: Boolean = js.native
  var owner: ISurveyTriggerOwner = js.native
  def setOwner(owner: ISurveyTriggerOwner): Unit = js.native
}

