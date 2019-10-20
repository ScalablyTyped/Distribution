package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Warning. */
trait Warning extends js.Object {
  /** The message associated with the `warning_id`: * `WORD_COUNT_MESSAGE`: "There were {number} words in the input. We need a minimum of 600, preferably 1,200 or more, to compute statistically significant estimates." * `JSON_AS_TEXT`: "Request input was processed as text/plain as indicated, however detected a JSON input. Did you mean application/json?" * `CONTENT_TRUNCATED`: "For maximum accuracy while also optimizing processing time, only the first 250KB of input text (excluding markup) was analyzed. Accuracy levels off at approximately 3,000 words so this did not affect the accuracy of the profile." * `PARTIAL_TEXT_USED`, "The text provided to compute the profile was trimmed for performance reasons. This action does not affect the accuracy of the output, as not all of the input text was required." Applies only when Arabic input text exceeds a threshold at which additional words do not contribute to the accuracy of the profile. */
  var message: String
  /** The identifier of the warning message. */
  var warning_id: String
}

object Warning {
  @scala.inline
  def apply(message: String, warning_id: String): Warning = {
    val __obj = js.Dynamic.literal(message = message, warning_id = warning_id)
  
    __obj.asInstanceOf[Warning]
  }
}

