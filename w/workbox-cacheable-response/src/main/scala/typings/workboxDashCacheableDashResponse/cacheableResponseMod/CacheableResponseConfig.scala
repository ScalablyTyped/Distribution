package typings.workboxDashCacheableDashResponse.cacheableResponseMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheableResponseConfig extends js.Object {
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}

object CacheableResponseConfig {
  @scala.inline
  def apply(headers: Record[String, String] = null, statuses: js.Array[Double] = null): CacheableResponseConfig = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    __obj.asInstanceOf[CacheableResponseConfig]
  }
}

