package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TopHitsResults. */
trait TopHitsResults extends js.Object {
  /** Top results returned by the aggregation. */
  var hits: js.UndefOr[js.Array[QueryResult]] = js.undefined
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}

object TopHitsResults {
  @scala.inline
  def apply(hits: js.Array[QueryResult] = null, matching_results: js.UndefOr[Double] = js.undefined): TopHitsResults = {
    val __obj = js.Dynamic.literal()
    if (hits != null) __obj.updateDynamic("hits")(hits.asInstanceOf[js.Any])
    if (!js.isUndefined(matching_results)) __obj.updateDynamic("matching_results")(matching_results.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopHitsResults]
  }
}

