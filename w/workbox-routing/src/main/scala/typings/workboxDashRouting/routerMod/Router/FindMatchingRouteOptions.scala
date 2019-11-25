package typings.workboxDashRouting.routerMod.Router

import typings.std.Request
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchingRouteOptions extends HandleRequestOptions {
  var url: URL
}

object FindMatchingRouteOptions {
  @scala.inline
  def apply(
    request: Request,
    url: URL,
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): FindMatchingRouteOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchingRouteOptions]
  }
}

