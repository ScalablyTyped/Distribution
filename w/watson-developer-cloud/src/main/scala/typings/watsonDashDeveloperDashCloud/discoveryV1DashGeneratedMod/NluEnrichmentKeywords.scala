package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifying the Keyword enrichment and related parameters. */
trait NluEnrichmentKeywords extends js.Object {
  /** When `true`, emotion detection of keywords will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of keywords to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
  /** When `true`, sentiment analysis of keywords will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.undefined
}

object NluEnrichmentKeywords {
  @scala.inline
  def apply(
    emotion: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    sentiment: js.UndefOr[Boolean] = js.undefined
  ): NluEnrichmentKeywords = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emotion)) __obj.updateDynamic("emotion")(emotion)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(sentiment)) __obj.updateDynamic("sentiment")(sentiment)
    __obj.asInstanceOf[NluEnrichmentKeywords]
  }
}

