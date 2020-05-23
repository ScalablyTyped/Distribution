package typings.urqlCore.anon

import typings.urqlCore.urqlCoreStrings.hit
import typings.urqlCore.urqlCoreStrings.miss
import typings.urqlCore.urqlCoreStrings.partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOutcome extends js.Object {
  var cacheOutcome: js.UndefOr[miss | partial | hit] = js.undefined
  var networkLatency: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
}

object CacheOutcome {
  @scala.inline
  def apply(
    cacheOutcome: miss | partial | hit = null,
    networkLatency: js.UndefOr[Double] = js.undefined,
    source: String = null,
    startTime: js.UndefOr[Double] = js.undefined
  ): CacheOutcome = {
    val __obj = js.Dynamic.literal()
    if (cacheOutcome != null) __obj.updateDynamic("cacheOutcome")(cacheOutcome.asInstanceOf[js.Any])
    if (!js.isUndefined(networkLatency)) __obj.updateDynamic("networkLatency")(networkLatency.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOutcome]
  }
}

