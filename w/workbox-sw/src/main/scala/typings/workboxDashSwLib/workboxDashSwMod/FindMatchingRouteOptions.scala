package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchingRouteOptions extends js.Object {
  /**
  	 * The corresponding event (unless N/A).
  	 */
  var event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
  /**
  	 * The request to match.
  	 */
  var request: stdLib.Request
  var url: stdLib.URL
}

object FindMatchingRouteOptions {
  @scala.inline
  def apply(
    request: stdLib.Request,
    url: stdLib.URL,
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): FindMatchingRouteOptions = {
    val __obj = js.Dynamic.literal(request = request, url = url)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[FindMatchingRouteOptions]
  }
}

