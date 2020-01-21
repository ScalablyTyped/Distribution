package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "AnswerCountValidator")
@js.native
class AnswerCountValidator () extends SurveyValidator {
  def this(minCount: Double) = this()
  def this(minCount: Double, maxCount: Double) = this()
  var maxCount: Double = js.native
  var minCount: Double = js.native
}

