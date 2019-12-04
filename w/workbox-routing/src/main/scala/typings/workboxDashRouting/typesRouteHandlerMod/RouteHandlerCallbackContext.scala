package typings.workboxDashRouting.typesRouteHandlerMod

import typings.std.Record
import typings.std.Request
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteHandlerCallbackContext extends js.Object {
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
  var params: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var url: URL
}

object RouteHandlerCallbackContext {
  @scala.inline
  def apply(
    url: URL,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null,
    params: js.Array[String] | (Record[String, String]) = null,
    request: Request = null
  ): RouteHandlerCallbackContext = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteHandlerCallbackContext]
  }
}

