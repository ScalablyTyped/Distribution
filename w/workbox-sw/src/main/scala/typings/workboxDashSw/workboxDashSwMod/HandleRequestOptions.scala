package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== Router =====
  */
trait HandleRequestOptions extends js.Object {
  /**
  	 * The event that triggered the request, if applicable.
  	 */
  var event: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
  /**
  	 * The request to handle (this is usually from a fetch event, but it does not have to be).
  	 */
  var request: Request
}

object HandleRequestOptions {
  @scala.inline
  def apply(
    request: Request,
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): HandleRequestOptions = {
    val __obj = js.Dynamic.literal(request = request)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[HandleRequestOptions]
  }
}

