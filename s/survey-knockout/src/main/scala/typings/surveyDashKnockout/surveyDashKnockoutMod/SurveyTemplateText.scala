package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyTemplateText")
@js.native
class SurveyTemplateText () extends js.Object {
  var text: String = js.native
  def addText(newText: String, id: String, name: String): Unit = js.native
  /* protected */ def getId(id: String, questionType: String): String = js.native
  def replaceText(replaceText: String, id: String): Unit = js.native
  def replaceText(replaceText: String, id: String, questionType: String): Unit = js.native
}

