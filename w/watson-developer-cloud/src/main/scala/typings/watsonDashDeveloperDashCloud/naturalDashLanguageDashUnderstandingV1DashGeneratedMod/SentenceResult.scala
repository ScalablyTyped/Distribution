package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SentenceResult. */
trait SentenceResult extends js.Object {
  /** Character offsets indicating the beginning and end of the sentence in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  /** The sentence. */
  var text: js.UndefOr[String] = js.undefined
}

object SentenceResult {
  @scala.inline
  def apply(location: js.Array[Double] = null, text: String = null): SentenceResult = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceResult]
  }
}

