package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "AnswerCountValidator")
@js.native
class AnswerCountValidator () extends SurveyValidator {
  def this(minCount: scala.Double) = this()
  def this(minCount: scala.Double, maxCount: scala.Double) = this()
  var maxCount: scala.Double = js.native
  var minCount: scala.Double = js.native
}

