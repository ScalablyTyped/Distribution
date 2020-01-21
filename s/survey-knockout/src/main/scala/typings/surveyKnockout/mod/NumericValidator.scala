package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "NumericValidator")
@js.native
class NumericValidator () extends SurveyValidator {
  def this(minValue: Double) = this()
  def this(minValue: Double, maxValue: Double) = this()
  var maxValue: Double = js.native
  var minValue: Double = js.native
}

