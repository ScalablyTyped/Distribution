package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "WebRequestError")
@js.native
class WebRequestError protected () extends SurveyError {
  def this(status: String, response: String) = this()
  def this(status: String, response: String, errorOwner: ISurveyErrorOwner) = this()
  var response: String = js.native
  var status: String = js.native
}

