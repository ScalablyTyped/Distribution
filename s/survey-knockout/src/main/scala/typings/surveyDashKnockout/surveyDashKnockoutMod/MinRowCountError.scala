package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MinRowCountError")
@js.native
class MinRowCountError protected () extends SurveyError {
  def this(minRowCount: Double) = this()
  def this(minRowCount: Double, errorOwner: ISurveyErrorOwner) = this()
  var minRowCount: Double = js.native
}

