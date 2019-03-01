package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== HandlerCallback =====
  */
trait IHandlerContext extends IMatchContext {
  /**
  	 * Parameters returned by the Route's match callback function. This will be undefined if nothing was returned.
  	 */
  var params: js.UndefOr[js.Object] = js.undefined
}

object IHandlerContext {
  @scala.inline
  def apply(
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any,
    url: stdLib.URL,
    params: js.Object = null
  ): IHandlerContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("url")(url)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[IHandlerContext]
  }
}

