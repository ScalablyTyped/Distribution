package typings.workboxDashRouting.routerMod.Router

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleRequestOptions extends js.Object {
  var event: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
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

