package typings.workboxDashCore.typesWorkboxPluginMod

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheWillUpdateCallbackParamParam extends js.Object {
  var event: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.undefined
  var request: Request
  var response: Response
}

object CacheWillUpdateCallbackParamParam {
  @scala.inline
  def apply(
    request: Request,
    response: Response,
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any = null
  ): CacheWillUpdateCallbackParamParam = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheWillUpdateCallbackParamParam]
  }
}

