package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TopHits. */
trait TopHits extends js.Object {
  var hits: js.UndefOr[TopHitsResults] = js.undefined
  /** Number of top hits returned by the aggregation. */
  var size: js.UndefOr[Double] = js.undefined
}

object TopHits {
  @scala.inline
  def apply(hits: TopHitsResults = null, size: Int | Double = null): TopHits = {
    val __obj = js.Dynamic.literal()
    if (hits != null) __obj.updateDynamic("hits")(hits.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopHits]
  }
}

