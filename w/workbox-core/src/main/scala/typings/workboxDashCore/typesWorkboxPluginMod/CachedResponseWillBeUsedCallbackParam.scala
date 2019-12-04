package typings.workboxDashCore.typesWorkboxPluginMod

import typings.std.CacheQueryOptions
import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedResponseWillBeUsedCallbackParam extends js.Object {
  var cacheName: String
  var cachedResponse: js.UndefOr[Response] = js.undefined
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.undefined
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
  var request: Request
}

object CachedResponseWillBeUsedCallbackParam {
  @scala.inline
  def apply(
    cacheName: String,
    request: Request,
    cachedResponse: Response = null,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any = null,
    matchOptions: CacheQueryOptions = null
  ): CachedResponseWillBeUsedCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (cachedResponse != null) __obj.updateDynamic("cachedResponse")(cachedResponse.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedResponseWillBeUsedCallbackParam]
  }
}

