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
    val __obj = js.Dynamic.literal(cacheName = cacheName, newResponse = newResponse, url = url)
    if (event != null) __obj.updateDynamic("event")(event)
    if (oldResponse != null) __obj.updateDynamic("oldResponse")(oldResponse)
    __obj.asInstanceOf[NotifyIfUpdatedOptions]
  }
}

