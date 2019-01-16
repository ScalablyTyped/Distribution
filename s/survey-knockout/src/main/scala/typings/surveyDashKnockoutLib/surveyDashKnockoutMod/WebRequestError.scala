package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "WebRequestError")
@js.native
class WebRequestError protected () extends SurveyError {
  def this(status: java.lang.String, response: java.lang.String) = this()
  def this(status: java.lang.String, response: java.lang.String, errorOwner: ISurveyErrorOwner) = this()
  var response: java.lang.String = js.native
  var status: java.lang.String = js.native
}

