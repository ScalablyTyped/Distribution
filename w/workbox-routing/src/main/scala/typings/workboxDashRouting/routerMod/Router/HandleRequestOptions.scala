package typings.workboxDashRouting.routerMod.Router

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleRequestOptions extends js.Object {
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
  var request: Request
}

object HandleRequestOptions {
  @scala.inline
  def apply(
    request: Request,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): HandleRequestOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleRequestOptions]
  }
}

