package typings.workboxDashBroadcastDashUpdate.broadcastUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastUpdateOptions extends js.Object {
  var cacheName: String
  var channel: js.UndefOr[String] = js.undefined
  var url: String
}

object BroadcastUpdateOptions {
  @scala.inline
  def apply(cacheName: String, url: String, channel: String = null): BroadcastUpdateOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, url = url)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[BroadcastUpdateOptions]
  }
}

