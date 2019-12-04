package typings.workboxDashCore.typesWorkboxPluginMod

import typings.std.Error
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchDidFailCallbackParam extends js.Object {
  var error: Error
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.undefined
  var originalRequest: Request
  var request: Request
}

object FetchDidFailCallbackParam {
  @scala.inline
  def apply(
    error: Error,
    originalRequest: Request,
    request: Request,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any = null
  ): FetchDidFailCallbackParam = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], originalRequest = originalRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchDidFailCallbackParam]
  }
}

