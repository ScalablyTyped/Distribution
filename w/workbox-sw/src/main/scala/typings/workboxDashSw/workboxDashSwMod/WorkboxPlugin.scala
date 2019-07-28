package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== Workbox Plugin =====
  */
trait WorkboxPlugin extends Plugin {
  /**
  	 * Called when a new entry is added to a cache or it’s updated. Useful if you wish to perform an action after a cache update.
  	 * @param {CacheDidUpdatePluginContext} context
  	 * @returns {void}
  	 */
  val cacheDidUpdate: js.UndefOr[js.Function1[/* context */ CacheDidUpdatePluginContext, Unit]] = js.undefined
  /**
  	 * This allows developers to override the default cache key for reads or writes (or both).
  	 * @param {CacheKeyWillBeUsedPluginContext} context
  	 * @returns {Promise<string|Request>|string|Request}
  	 */
  val cacheKeyWillBeUsed: js.UndefOr[
    js.Function1[
      /* context */ CacheKeyWillBeUsedPluginContext, 
      (js.Promise[String | Request]) | String | Request
    ]
  ] = js.undefined
  /**
  	 * Called before a Response is used to update a cache. You can alter the Response before it’s added to the cache or return null to avoid updating the cache at all.
  	 * @param {CacheWillUpdatePluginContext} context
  	 * @returns {Promise<Response>|Response|null}
  	 */
  val cacheWillUpdate: js.UndefOr[
    js.Function1[/* context */ CacheWillUpdatePluginContext, js.Promise[Response] | Response | Null]
  ] = js.undefined
  /**
  	 * Before a cached Response is used to respond to a fetch event, this callback can be used to allow or block the Response from being used.
  	 * @param {CacheResponseWillBeUsedPluginContext} context
  	 * @returns {Promise<Response>|Response|null}
  	 */
  val cachedResponseWillBeUsed: js.UndefOr[
    js.Function1[
      /* context */ CacheResponseWillBeUsedPluginContext, 
      js.Promise[Response] | Response | Null
    ]
  ] = js.undefined
  /**
  	 * Called when a fetch event fails (note this is when the network request can’t be made at all and not when a request is a non-200 request).
  	 * @param {FetchDidFailPluginContext}
  	 * @returns {void}
  	 */
  val fetchDidFail: js.UndefOr[js.Function1[/* context */ FetchDidFailPluginContext, Unit]] = js.undefined
  /**
  	 * Called when a network request is successful, regardless of what the HTTP status is of the response.
  	 * @param {FetchDidSucceedPluginContext}
  	 * @returns {Promise<Response>|Response}
  	 */
  val fetchDidSucceed: js.UndefOr[
    js.Function1[/* context */ FetchDidSucceedPluginContext, js.Promise[Response] | Response]
  ] = js.undefined
  /**
  	 * This is called whenever a fetch event is about to be made. You can alter the Request in this callback.
  	 * @param {RequestWillFetchPluginContext} context
  	 * @returns {Request}
  	 */
  val requestWillFetch: js.UndefOr[js.Function1[/* context */ RequestWillFetchPluginContext, Request]] = js.undefined
}

object WorkboxPlugin {
  @scala.inline
  def apply(
    cacheDidUpdate: /* context */ CacheDidUpdatePluginContext => Unit = null,
    cacheKeyWillBeUsed: /* context */ CacheKeyWillBeUsedPluginContext => (js.Promise[String | Request]) | String | Request = null,
    cacheWillUpdate: /* context */ CacheWillUpdatePluginContext => js.Promise[Response] | Response | Null = null,
    cachedResponseWillBeUsed: /* context */ CacheResponseWillBeUsedPluginContext => js.Promise[Response] | Response | Null = null,
    fetchDidFail: /* context */ FetchDidFailPluginContext => Unit = null,
    fetchDidSucceed: /* context */ FetchDidSucceedPluginContext => js.Promise[Response] | Response = null,
    requestWillFetch: /* context */ RequestWillFetchPluginContext => Request = null
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

