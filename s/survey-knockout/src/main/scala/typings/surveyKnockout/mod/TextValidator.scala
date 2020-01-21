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
  var allowDigits: Boolean = js.native
  var maxLength: Double = js.native
  var minLength: Double = js.native
}

