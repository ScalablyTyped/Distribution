package typings.workboxCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<workbox-core.workbox-core/setCacheNameDetails.CacheNameDetails> */
@js.native
trait PartialCacheNameDetails extends js.Object {
  var googleAnalytics: js.UndefOr[String] = js.native
  var precache: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var runtime: js.UndefOr[String] = js.native
  var suffix: js.UndefOr[String] = js.native
}

object PartialCacheNameDetails {
  @scala.inline
  def apply(): PartialCacheNameDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCacheNameDetails]
  }
  @scala.inline
  implicit class PartialCacheNameDetailsOps[Self <: PartialCacheNameDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGoogleAnalytics(value: String): Self = this.set("googleAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleAnalytics: Self = this.set("googleAnalytics", js.undefined)
    @scala.inline
    def setPrecache(value: String): Self = this.set("precache", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecache: Self = this.set("precache", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

