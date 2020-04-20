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
    networkLatency: Int | Double = null,
    source: String = null,
    startTime: Int | Double = null
  ): OperationDebugMeta = {
    val __obj = js.Dynamic.literal()
    if (cacheOutcome != null) __obj.updateDynamic("cacheOutcome")(cacheOutcome.asInstanceOf[js.Any])
    if (networkLatency != null) __obj.updateDynamic("networkLatency")(networkLatency.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDebugMeta]
  }
}

