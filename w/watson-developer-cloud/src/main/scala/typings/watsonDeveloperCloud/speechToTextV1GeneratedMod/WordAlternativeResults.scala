package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WordAlternativeResults. */
trait WordAlternativeResults extends js.Object {
  /** An array of alternative hypotheses for a word from the input audio. */
  var alternatives: js.Array[WordAlternativeResult]
  /** The end time in seconds of the word from the input audio that corresponds to the word alternatives. */
  var end_time: Double
  /** The start time in seconds of the word from the input audio that corresponds to the word alternatives. */
  var start_time: Double
}

object WordAlternativeResults {
  @scala.inline
  def apply(alternatives: js.Array[WordAlternativeResult], end_time: Double, start_time: Double): WordAlternativeResults = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WordAlternativeResults]
  }
}

