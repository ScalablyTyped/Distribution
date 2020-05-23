package typings.workboxBroadcastUpdate.broadcastCacheUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastCacheUpdateOptions extends js.Object {
  var channelName: js.UndefOr[String] = js.undefined
  var deferNoticationTimeout: js.UndefOr[Double] = js.undefined
  var headersToCheck: js.UndefOr[js.Array[String]] = js.undefined
}

object BroadcastCacheUpdateOptions {
  @scala.inline
  def apply(
    channelName: String = null,
    deferNoticationTimeout: js.UndefOr[Double] = js.undefined,
    headersToCheck: js.Array[String] = null
  ): BroadcastCacheUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (!js.isUndefined(deferNoticationTimeout)) __obj.updateDynamic("deferNoticationTimeout")(deferNoticationTimeout.get.asInstanceOf[js.Any])
    if (headersToCheck != null) __obj.updateDynamic("headersToCheck")(headersToCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastCacheUpdateOptions]
  }
}

