package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WordAlternativeResult. */
trait WordAlternativeResult extends js.Object {
  /** A confidence score for the word alternative hypothesis in the range of 0.0 to 1.0. */
  var confidence: Double
  /** An alternative hypothesis for a word from the input audio. */
  var word: String
}

object WordAlternativeResult {
  @scala.inline
  def apply(confidence: Double, word: String): WordAlternativeResult = {
    val __obj = js.Dynamic.literal(confidence = confidence, word = word)
  
    __obj.asInstanceOf[WordAlternativeResult]
  }
}

