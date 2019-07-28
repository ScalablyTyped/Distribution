package typings.workboxDashSw.workboxDashSwMod

import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== HandlerCallback =====
  */
trait HandlerContext extends MatchContext {
  /**
  	 * Parameters returned by the Route's match callback function. This will be undefined if nothing was returned.
  	 */
  var params: js.UndefOr[js.Object] = js.undefined
}

object HandlerContext {
  @scala.inline
  def apply(
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any,
    url: URL,
    params: js.Object = null
  ): HandlerContext = {
    val __obj = js.Dynamic.literal(event = event, url = url)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[HandlerContext]
  }
}

