package typings.workboxCore.workboxPluginMod

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
    oldResponse: js.UndefOr[Null | Response] = js.undefined
  ): CacheDidUpdateCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(oldResponse)) __obj.updateDynamic("oldResponse")(oldResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDidUpdateCallbackParam]
  }
}

