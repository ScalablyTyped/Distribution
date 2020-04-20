package typings.urqlCore

import typings.urqlCore.urqlCoreStrings.hit
import typings.urqlCore.urqlCoreStrings.miss
import typings.urqlCore.urqlCoreStrings.partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheOutcome extends js.Object {
  var cacheOutcome: js.UndefOr[miss | partial | hit] = js.undefined
  var networkLatency: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
}

object AnonCacheOutcome {
  @scala.inline
  def apply(
    cacheOutcome: miss | partial | hit = null,
    networkLatency: Int | Double = null,
    source: String = null,
    startTime: Int | Double = null
  ): AnonCacheOutcome = {
    val __obj = js.Dynamic.literal()
    if (cacheOutcome != null) __obj.updateDynamic("cacheOutcome")(cacheOutcome.asInstanceOf[js.Any])
    if (networkLatency != null) __obj.updateDynamic("networkLatency")(networkLatency.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheOutcome]
  }
}

