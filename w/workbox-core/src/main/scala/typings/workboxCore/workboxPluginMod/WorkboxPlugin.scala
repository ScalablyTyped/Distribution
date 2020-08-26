package typings.workboxCore.workboxPluginMod

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkboxPlugin extends js.Object {
  var cacheDidUpdate: js.UndefOr[CacheDidUpdateCallback] = js.native
  var cacheKeyWillBeUsed: js.UndefOr[CacheKeyWillBeUsedCallback] = js.native
  var cacheWillUpdate: js.UndefOr[CacheWillUpdateCallback] = js.native
  var cachedResponseWillBeUsed: js.UndefOr[CachedResponseWillBeUsedCallback] = js.native
  var fetchDidFail: js.UndefOr[FetchDidFailCallback] = js.native
  var fetchDidSucceed: js.UndefOr[FetchDidSucceedCallback] = js.native
  var requestWillFetch: js.UndefOr[RequestWillFetchCallback] = js.native
}

object WorkboxPlugin {
  @scala.inline
  def apply(): WorkboxPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkboxPlugin]
  }
  @scala.inline
  implicit class WorkboxPluginOps[Self <: WorkboxPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheDidUpdate(value: /* param */ CacheDidUpdateCallbackParam => js.Promise[Unit]): Self = this.set("cacheDidUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCacheDidUpdate: Self = this.set("cacheDidUpdate", js.undefined)
    @scala.inline
    def setCacheKeyWillBeUsed(value: /* param */ CacheKeyWillBeUsedCallbackParam => js.Promise[Request | String]): Self = this.set("cacheKeyWillBeUsed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCacheKeyWillBeUsed: Self = this.set("cacheKeyWillBeUsed", js.undefined)
    @scala.inline
    def setCacheWillUpdate(value: /* param */ CacheWillUpdateCallbackParamParam => js.Promise[js.UndefOr[Response]]): Self = this.set("cacheWillUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCacheWillUpdate: Self = this.set("cacheWillUpdate", js.undefined)
    @scala.inline
    def setCachedResponseWillBeUsed(value: /* param */ CachedResponseWillBeUsedCallbackParam => js.Promise[js.UndefOr[Response]]): Self = this.set("cachedResponseWillBeUsed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCachedResponseWillBeUsed: Self = this.set("cachedResponseWillBeUsed", js.undefined)
    @scala.inline
    def setFetchDidFail(value: /* param */ FetchDidFailCallbackParam => js.Promise[Unit]): Self = this.set("fetchDidFail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFetchDidFail: Self = this.set("fetchDidFail", js.undefined)
    @scala.inline
    def setFetchDidSucceed(value: /* param */ FetchDidSucceedCallbackParam => js.Promise[Response]): Self = this.set("fetchDidSucceed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFetchDidSucceed: Self = this.set("fetchDidSucceed", js.undefined)
    @scala.inline
    def setRequestWillFetch(value: /* param */ RequestWillFetchCallbackParam => js.Promise[js.UndefOr[Request]]): Self = this.set("requestWillFetch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestWillFetch: Self = this.set("requestWillFetch", js.undefined)
  }
  
}

