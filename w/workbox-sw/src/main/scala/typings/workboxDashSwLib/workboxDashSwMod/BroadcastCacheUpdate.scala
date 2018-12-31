package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uses the Broadcast Channel API to notify interested parties when a cached response has been updated.
  * For efficiency's sake, the underlying response bodies are not compared; only specific response headers are checked
  */
trait BroadcastCacheUpdate extends js.Object {
  /**
  	 * Compare two Responses and send a message via the Broadcast Channel API if they differ.
  	 * Neither of the Responses can be opaque.
  	 * @param {Response} firstResponse - First response to compare.
  	 * @param {Response} secondResponse - Second response to compare.
  	 * @param {string} url - The URL of the updated request.
  	 * @param {string} cacheName - Name of the cache the responses belong to. This is included in the message posted on the broadcast channel.
  	 */
  def notifyIfUpdated(
    firstResponse: stdLib.Response,
    secondResponse: stdLib.Response,
    url: java.lang.String,
    cacheName: java.lang.String
  ): scala.Unit
}

