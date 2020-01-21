package typings.workboxCore.workboxPluginMod

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxPlugin extends js.Object {
  var cacheDidUpdate: js.UndefOr[CacheDidUpdateCallback] = js.undefined
  var cacheKeyWillBeUsed: js.UndefOr[CacheKeyWillBeUsedCallback] = js.undefined
  var cacheWillUpdate: js.UndefOr[CacheWillUpdateCallback] = js.undefined
  var cachedResponseWillBeUsed: js.UndefOr[CachedResponseWillBeUsedCallback] = js.undefined
  var fetchDidFail: js.UndefOr[FetchDidFailCallback] = js.undefined
  var fetchDidSucceed: js.UndefOr[FetchDidSucceedCallback] = js.undefined
  var requestWillFetch: js.UndefOr[RequestWillFetchCallback] = js.undefined
}

object WorkboxPlugin {
  @scala.inline
  def apply(
    cacheDidUpdate: /* param */ CacheDidUpdateCallbackParam => js.Promise[Unit] = null,
    cacheKeyWillBeUsed: /* param */ CacheKeyWillBeUsedCallbackParam => js.Promise[Request | String] = null,
    cacheWillUpdate: /* param */ CacheWillUpdateCallbackParamParam => js.Promise[js.UndefOr[Response]] = null,
    cachedResponseWillBeUsed: /* param */ CachedResponseWillBeUsedCallbackParam => js.Promise[js.UndefOr[Response]] = null,
    fetchDidFail: /* param */ FetchDidFailCallbackParam => js.Promise[Unit] = null,
    fetchDidSucceed: /* param */ FetchDidSucceedCallbackParam => js.Promise[Response] = null,
    requestWillFetch: /* param */ RequestWillFetchCallbackParam => js.Promise[js.UndefOr[Request]] = null
  ): WorkboxPlugin = {
    val __obj = js.Dynamic.literal()
    if (cacheDidUpdate != null) __obj.updateDynamic("cacheDidUpdate")(js.Any.fromFunction1(cacheDidUpdate))
    if (cacheKeyWillBeUsed != null) __obj.updateDynamic("cacheKeyWillBeUsed")(js.Any.fromFunction1(cacheKeyWillBeUsed))
    if (cacheWillUpdate != null) __obj.updateDynamic("cacheWillUpdate")(js.Any.fromFunction1(cacheWillUpdate))
    if (cachedResponseWillBeUsed != null) __obj.updateDynamic("cachedResponseWillBeUsed")(js.Any.fromFunction1(cachedResponseWillBeUsed))
    if (fetchDidFail != null) __obj.updateDynamic("fetchDidFail")(js.Any.fromFunction1(fetchDidFail))
    if (fetchDidSucceed != null) __obj.updateDynamic("fetchDidSucceed")(js.Any.fromFunction1(fetchDidSucceed))
    if (requestWillFetch != null) __obj.updateDynamic("requestWillFetch")(js.Any.fromFunction1(requestWillFetch))
    __obj.asInstanceOf[WorkboxPlugin]
  }
}

