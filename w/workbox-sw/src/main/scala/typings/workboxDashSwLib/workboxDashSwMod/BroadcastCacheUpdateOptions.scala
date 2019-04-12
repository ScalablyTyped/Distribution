package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastCacheUpdateOptions extends js.Object {
  /**
  	 * The name that will be used when creating the `BroadcastChannel`,
  	 * which defaults to 'workbox' (the channel name used by the `workbox-window` package).
  	 */
  var channelName: java.lang.String
  /**
  	 * The amount of time to wait for a ready message from the window on navigation requests
  	 * before sending the update.
  	 */
  var deferNoticationTimeout: scala.Double
  /**
  	 * A list of headers that will be used to determine whether the responses differ.
  	 */
  var headersToCheck: js.Array[java.lang.String]
}

object BroadcastCacheUpdateOptions {
  @scala.inline
  def apply(
    channelName: java.lang.String,
    deferNoticationTimeout: scala.Double,
    headersToCheck: js.Array[java.lang.String]
  ): BroadcastCacheUpdateOptions = {
    val __obj = js.Dynamic.literal(channelName = channelName, deferNoticationTimeout = deferNoticationTimeout, headersToCheck = headersToCheck)
  
    __obj.asInstanceOf[BroadcastCacheUpdateOptions]
  }
}

