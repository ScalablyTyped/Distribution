package typings.urqlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDebugMeta extends js.Object {
  var cacheOutcome: js.UndefOr[CacheOutcome] = js.undefined
  var networkLatency: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
}

object OperationDebugMeta {
  @scala.inline
  def apply(
    cacheOutcome: CacheOutcome = null,
    networkLatency: js.UndefOr[Double] = js.undefined,
    source: String = null,
    startTime: js.UndefOr[Double] = js.undefined
  ): OperationDebugMeta = {
    val __obj = js.Dynamic.literal()
    if (cacheOutcome != null) __obj.updateDynamic("cacheOutcome")(cacheOutcome.asInstanceOf[js.Any])
    if (!js.isUndefined(networkLatency)) __obj.updateDynamic("networkLatency")(networkLatency.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDebugMeta]
  }
}

