package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** KeywordResult. */
trait KeywordResult extends js.Object {
  /** A confidence score for the keyword match in the range of 0.0 to 1.0. */
  var confidence: Double
  /** The end time in seconds of the keyword match. */
  var end_time: Double
  /** A specified keyword normalized to the spoken phrase that matched in the audio input. */
  var normalized_text: String
  /** The start time in seconds of the keyword match. */
  var start_time: Double
}

object KeywordResult {
  @scala.inline
  def apply(confidence: Double, end_time: Double, normalized_text: String, start_time: Double): KeywordResult = {
    val __obj = js.Dynamic.literal(confidence = confidence, end_time = end_time, normalized_text = normalized_text, start_time = start_time)
  
    __obj.asInstanceOf[KeywordResult]
  }
}

