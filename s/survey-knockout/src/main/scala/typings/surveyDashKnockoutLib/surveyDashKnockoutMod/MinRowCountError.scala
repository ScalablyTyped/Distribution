package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MinRowCountError")
@js.native
class MinRowCountError protected () extends SurveyError {
  def this(minRowCount: scala.Double) = this()
  def this(minRowCount: scala.Double, errorOwner: ISurveyErrorOwner) = this()
  var minRowCount: scala.Double = js.native
}

