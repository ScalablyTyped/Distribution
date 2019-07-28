package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "CustomError")
@js.native
class CustomError protected () extends SurveyError {
  def this(text: String) = this()
  def this(text: String, errorOwner: ISurveyErrorOwner) = this()
}

