package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** API usage information for the request. */
trait AnalysisResultsUsage extends js.Object {
  /** Number of features used in the API call. */
  var features: js.UndefOr[Double] = js.undefined
  /** Number of text characters processed. */
  var text_characters: js.UndefOr[Double] = js.undefined
  /** Number of 10,000-character units processed. */
  var text_units: js.UndefOr[Double] = js.undefined
}

object AnalysisResultsUsage {
  @scala.inline
  def apply(
    features: Int | Double = null,
    text_characters: Int | Double = null,
    text_units: Int | Double = null
  ): AnalysisResultsUsage = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (text_characters != null) __obj.updateDynamic("text_characters")(text_characters.asInstanceOf[js.Any])
    if (text_units != null) __obj.updateDynamic("text_units")(text_units.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisResultsUsage]
  }
}

