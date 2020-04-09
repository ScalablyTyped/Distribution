package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "TextValidator")
@js.native
class TextValidator () extends SurveyValidator {
  def this(minLength: Double) = this()
  def this(minLength: Double, maxLength: Double) = this()
  def this(minLength: Double, maxLength: Double, allowDigits: Boolean) = this()
  /**
    * The allowDigits property.
    */
  var allowDigits: Boolean = js.native
  /**
    * The maxLength property.
    */
  var maxLength: Double = js.native
  /**
    * The minLength property.
    */
  var minLength: Double = js.native
}

