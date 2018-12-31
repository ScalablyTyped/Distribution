package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "TextValidator")
@js.native
class TextValidator () extends SurveyValidator {
  def this(minLength: scala.Double) = this()
  def this(minLength: scala.Double, maxLength: scala.Double) = this()
  def this(minLength: scala.Double, maxLength: scala.Double, allowDigits: scala.Boolean) = this()
  var allowDigits: scala.Boolean = js.native
  var maxLength: scala.Double = js.native
  var minLength: scala.Double = js.native
}

