package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uses the [Broadcast Channel API]{@link https://developers.google.com/web/updates/2016/09/broadcastchannel}
  * to notify interested parties when a cached response has been updated.
  * In browsers that do not support the Broadcast Channel API, the instance
  * falls back to sending the update via `postMessage()` to all window clients.
  *
  * For efficiency's sake, the underlying response bodies are not compared;
  * only specific response headers are checked.
  */
trait BroadcastCacheUpdate extends js.Object {
  /**
  	 * Compare two [Responses](https://developer.mozilla.org/en-US/docs/Web/API/Response) and send a message via the
  	 * {@link https://developers.google.com/web/updates/2016/09/broadcastchannel|Broadcast Channel API}
  	 * if they differ.
  	 * Neither of the Responses can be {@link http://stackoverflow.com/questions/39109789|opaque}.
  	 *
  	 * @param {NotifyIfUpdatedOptions} options
  	 * @returns {Promise<void>} Resolves once the update is sent.
  	 */
  def notifyIfUpdated(options: NotifyIfUpdatedOptions): js.Promise[scala.Unit]
}

object BroadcastCacheUpdate {
  @scala.inline
  def apply(notifyIfUpdated: NotifyIfUpdatedOptions => js.Promise[scala.Unit]): BroadcastCacheUpdate = {
    val __obj = js.Dynamic.literal(notifyIfUpdated = js.Any.fromFunction1(notifyIfUpdated))
  
    __obj.asInstanceOf[BroadcastCacheUpdate]
  }
}

