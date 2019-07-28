package typings.workboxDashSw.workboxDashSwMod

import typings.std.Event
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyIfUpdatedOptions extends js.Object {
  /**
  	 * Name of the cache the responses belong to. This is included in the broadcast message.
  	 */
  var cacheName: String
  /**
  	 * An optional event that triggered this possible cache update.
  	 */
  var event: js.UndefOr[Event] = js.undefined
  /**
  	 * Possibly updated response to compare.
  	 */
  var newResponse: Response
  /**
  	 * Cached response to compare.
  	 */
  var oldResponse: Response
  /**
  	 * The URL of the request.
  	 */
  var url: String
}

object NotifyIfUpdatedOptions {
  @scala.inline
  def apply(cacheName: String, newResponse: Response, oldResponse: Response, url: String, event: Event = null): NotifyIfUpdatedOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, newResponse = newResponse, oldResponse = oldResponse, url = url)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[NotifyIfUpdatedOptions]
  }
}

