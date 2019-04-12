package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueEntry extends js.Object {
  /**
  	 * Any metadata you want associated with the
  	 * stored request. When requests are replayed you'll have access to this
  	 * metadata object in case you need to modify the request beforehand.
  	 */
  var metadata: js.Any
  /**
  	 * The request to store in the queue.
  	 */
  var request: stdLib.Request
  /**
  	 * The timestamp (Epoch time in milliseconds) when the request was first added to the queue.
  	 * This is used along with `maxRetentionTime` to remove outdated requests.
  	 * In general you don't need to set this value, as it's automatically set for you (defaulting to `Date.now()`),
  	 * but you can update it if you don't want particular requests to expire.
  	 */
  var timestamp: scala.Double
}

object QueueEntry {
  @scala.inline
  def apply(metadata: js.Any, request: stdLib.Request, timestamp: scala.Double): QueueEntry = {
    val __obj = js.Dynamic.literal(metadata = metadata, request = request, timestamp = timestamp)
  
    __obj.asInstanceOf[QueueEntry]
  }
}

