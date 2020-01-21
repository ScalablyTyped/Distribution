package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "AnswerRequiredError")
@js.native
class AnswerRequiredError () extends SurveyError {
  def this(text: String) = this()
  def this(text: String, errorOwner: ISurveyErrorOwner) = this()
}

