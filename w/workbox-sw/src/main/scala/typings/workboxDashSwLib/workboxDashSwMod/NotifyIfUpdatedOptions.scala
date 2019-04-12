package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyIfUpdatedOptions extends js.Object {
  /**
  	 * Name of the cache the responses belong to. This is included in the broadcast message.
  	 */
  var cacheName: java.lang.String
  /**
  	 * An optional event that triggered this possible cache update.
  	 */
  var event: js.UndefOr[stdLib.Event] = js.undefined
  /**
  	 * Possibly updated response to compare.
  	 */
  var newResponse: stdLib.Response
  /**
  	 * Cached response to compare.
  	 */
  var oldResponse: stdLib.Response
  /**
  	 * The URL of the request.
  	 */
  var url: java.lang.String
}

object NotifyIfUpdatedOptions {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    newResponse: stdLib.Response,
    oldResponse: stdLib.Response,
    url: java.lang.String,
    event: stdLib.Event = null
  ): NotifyIfUpdatedOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, newResponse = newResponse, oldResponse = oldResponse, url = url)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[NotifyIfUpdatedOptions]
  }
}

