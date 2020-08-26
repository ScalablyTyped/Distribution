package typings.workboxBroadcastUpdate.broadcastCacheUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastCacheUpdateOptions extends js.Object {
  var channelName: js.UndefOr[String] = js.native
  var deferNoticationTimeout: js.UndefOr[Double] = js.native
  var headersToCheck: js.UndefOr[js.Array[String]] = js.native
}

object BroadcastCacheUpdateOptions {
  @scala.inline
  def apply(): BroadcastCacheUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastCacheUpdateOptions]
  }
  @scala.inline
  implicit class BroadcastCacheUpdateOptionsOps[Self <: BroadcastCacheUpdateOptions] (val x: Self) extends AnyVal {
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
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    @scala.inline
    def setDeferNoticationTimeout(value: Double): Self = this.set("deferNoticationTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferNoticationTimeout: Self = this.set("deferNoticationTimeout", js.undefined)
    @scala.inline
    def setHeadersToCheckVarargs(value: String*): Self = this.set("headersToCheck", js.Array(value :_*))
    @scala.inline
    def setHeadersToCheck(value: js.Array[String]): Self = this.set("headersToCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersToCheck: Self = this.set("headersToCheck", js.undefined)
  }
  
}

