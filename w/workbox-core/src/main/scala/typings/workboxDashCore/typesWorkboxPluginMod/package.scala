package typings.workboxDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesWorkboxPluginMod {
  import typings.std.Request
  import typings.std.Response

  type CacheDidUpdateCallback = js.Function1[/* param */ CacheDidUpdateCallbackParam, js.Promise[Unit]]
  type CacheKeyWillBeUsedCallback = js.Function1[/* param */ CacheKeyWillBeUsedCallbackParam, js.Promise[Request | String]]
  type CacheWillUpdateCallback = js.Function1[/* param */ CacheWillUpdateCallbackParamParam, js.Promise[js.UndefOr[Response]]]
  type CachedResponseWillBeUsedCallback = js.Function1[
    /* param */ CachedResponseWillBeUsedCallbackParam, 
    js.Promise[js.UndefOr[Response]]
  ]
  type FetchDidFailCallback = js.Function1[/* param */ FetchDidFailCallbackParam, js.Promise[Unit]]
  type FetchDidSucceedCallback = js.Function1[/* param */ FetchDidSucceedCallbackParam, js.Promise[Response]]
  type RequestWillFetchCallback = js.Function1[/* param */ RequestWillFetchCallbackParam, js.Promise[js.UndefOr[Request]]]
}
