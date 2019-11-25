package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

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
  def apply(hits: js.Array[QueryResult] = null, matching_results: Int | Double = null): TopHitsResults = {
    val __obj = js.Dynamic.literal()
    if (hits != null) __obj.updateDynamic("hits")(hits.asInstanceOf[js.Any])
    if (matching_results != null) __obj.updateDynamic("matching_results")(matching_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopHitsResults]
  }
}

