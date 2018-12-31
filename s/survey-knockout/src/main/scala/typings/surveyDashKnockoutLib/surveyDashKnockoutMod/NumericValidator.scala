package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "NumericValidator")
@js.native
class NumericValidator () extends SurveyValidator {
  def this(minValue: scala.Double) = this()
  def this(minValue: scala.Double, maxValue: scala.Double) = this()
  var maxValue: scala.Double = js.native
  var minValue: scala.Double = js.native
}

