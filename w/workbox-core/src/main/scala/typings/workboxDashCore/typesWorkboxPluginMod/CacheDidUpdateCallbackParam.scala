package typings.workboxDashCore.typesWorkboxPluginMod

import typings.std.Event
import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDidUpdateCallbackParam extends js.Object {
  var cacheName: String
  var event: js.UndefOr[Event] = js.undefined
  var newResponse: Response
  var oldResponse: js.UndefOr[Response | Null] = js.undefined
  var request: Request
}

object CacheDidUpdateCallbackParam {
  @scala.inline
  def apply(
    cacheName: String,
    newResponse: Response,
    request: Request,
    event: Event = null,
    oldResponse: Response = null
  ): CacheDidUpdateCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, newResponse = newResponse, request = request)
    if (event != null) __obj.updateDynamic("event")(event)
    if (oldResponse != null) __obj.updateDynamic("oldResponse")(oldResponse)
    __obj.asInstanceOf[CacheDidUpdateCallbackParam]
  }
}

