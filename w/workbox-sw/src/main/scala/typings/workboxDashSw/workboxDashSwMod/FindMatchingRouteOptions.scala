package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchingRouteOptions extends js.Object {
  /**
  	 * The corresponding event (unless N/A).
  	 */
  var event: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
  /**
  	 * The request to match.
  	 */
  var request: Request
  var url: URL
}

object FindMatchingRouteOptions {
  @scala.inline
  def apply(
    request: Request,
    url: URL,
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): FindMatchingRouteOptions = {
    val __obj = js.Dynamic.literal(request = request, url = url)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[FindMatchingRouteOptions]
  }
}

