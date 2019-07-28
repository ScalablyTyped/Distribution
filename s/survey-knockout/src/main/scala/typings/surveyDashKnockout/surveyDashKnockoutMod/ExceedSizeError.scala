package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ExceedSizeError")
@js.native
class ExceedSizeError protected () extends SurveyError {
  def this(maxSize: Double) = this()
  def this(maxSize: Double, errorOwner: ISurveyErrorOwner) = this()
}

