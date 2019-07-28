package typings.workboxDashSw.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastCacheUpdateOptions extends js.Object {
  /**
  	 * The name that will be used when creating the `BroadcastChannel`,
  	 * which defaults to 'workbox' (the channel name used by the `workbox-window` package).
  	 */
  var channelName: String
  /**
  	 * The amount of time to wait for a ready message from the window on navigation requests
  	 * before sending the update.
  	 */
  var deferNoticationTimeout: Double
  /**
  	 * A list of headers that will be used to determine whether the responses differ.
  	 */
  var headersToCheck: js.Array[String]
}

object BroadcastCacheUpdateOptions {
  @scala.inline
  def apply(channelName: String, deferNoticationTimeout: Double, headersToCheck: js.Array[String]): BroadcastCacheUpdateOptions = {
    val __obj = js.Dynamic.literal(channelName = channelName, deferNoticationTimeout = deferNoticationTimeout, headersToCheck = headersToCheck)
  
    __obj.asInstanceOf[BroadcastCacheUpdateOptions]
  }
}

