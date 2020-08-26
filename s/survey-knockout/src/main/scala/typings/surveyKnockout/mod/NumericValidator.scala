package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "NumericValidator")
@js.native
class NumericValidator () extends SurveyValidator {
  def this(minValue: Double) = this()
  def this(minValue: js.UndefOr[scala.Nothing], maxValue: Double) = this()
  def this(minValue: Double, maxValue: Double) = this()
  /**
    * The maxValue property.
    */
  var maxValue: Double = js.native
  /**
    * The minValue property.
    */
  var minValue: Double = js.native
}

