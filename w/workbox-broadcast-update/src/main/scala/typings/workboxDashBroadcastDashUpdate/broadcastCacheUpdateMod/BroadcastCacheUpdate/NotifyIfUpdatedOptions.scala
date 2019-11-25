package typings.workboxDashBroadcastDashUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate

import typings.std.Event
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyIfUpdatedOptions extends js.Object {
  var cacheName: String
  var event: js.UndefOr[Event] = js.undefined
  var newResponse: Response
  var oldResponse: js.UndefOr[Response] = js.undefined
  var url: String
}

object NotifyIfUpdatedOptions {
  @scala.inline
  def apply(
    cacheName: String,
    newResponse: Response,
    url: String,
    event: Event = null,
    oldResponse: Response = null
  ): NotifyIfUpdatedOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (oldResponse != null) __obj.updateDynamic("oldResponse")(oldResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyIfUpdatedOptions]
  }
}

