package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

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
    features: js.UndefOr[Double] = js.undefined,
    text_characters: js.UndefOr[Double] = js.undefined,
    text_units: js.UndefOr[Double] = js.undefined
  ): AnalysisResultsUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(features)) __obj.updateDynamic("features")(features.get.asInstanceOf[js.Any])
    if (!js.isUndefined(text_characters)) __obj.updateDynamic("text_characters")(text_characters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(text_units)) __obj.updateDynamic("text_units")(text_units.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisResultsUsage]
  }
}

