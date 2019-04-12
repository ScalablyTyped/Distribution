package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== BroadcastUpdateNamespace =====
  */
trait BroadcastUpdateOptions extends js.Object {
  /**
  	 * The name of the cache in which the updated `Response` was stored.
  	 */
  var cacheName: java.lang.String
  /**
  	 * The `BroadcastChannel` to use. If no channel is set or the browser doesn't support the BroadcastChannel
  	 * api, then an attempt will be made to `postMessage` each window client.
  	 */
  var channel: js.UndefOr[stdLib.BroadcastChannel] = js.undefined
  /**
  	 * The URL associated with the updated `Response`.
  	 */
  var url: java.lang.String
}

object BroadcastUpdateOptions {
  @scala.inline
  def apply(cacheName: java.lang.String, url: java.lang.String, channel: stdLib.BroadcastChannel = null): BroadcastUpdateOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, url = url)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[BroadcastUpdateOptions]
  }
}

