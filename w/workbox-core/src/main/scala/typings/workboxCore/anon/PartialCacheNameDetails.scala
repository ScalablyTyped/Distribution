package typings.workboxCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<workbox-core.workbox-core/setCacheNameDetails.CacheNameDetails> */
trait PartialCacheNameDetails extends js.Object {
  var googleAnalytics: js.UndefOr[String] = js.undefined
  var precache: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var runtime: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object PartialCacheNameDetails {
  @scala.inline
  def apply(
    googleAnalytics: String = null,
    precache: String = null,
    prefix: String = null,
    runtime: String = null,
    suffix: String = null
  ): PartialCacheNameDetails = {
    val __obj = js.Dynamic.literal()
    if (googleAnalytics != null) __obj.updateDynamic("googleAnalytics")(googleAnalytics.asInstanceOf[js.Any])
    if (precache != null) __obj.updateDynamic("precache")(precache.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCacheNameDetails]
  }
}

