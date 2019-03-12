package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== Workbox Plugin =====
  */
trait WorkboxPlugin extends js.Object {
  /**
  	 * Called when a new entry is added to a cache or it’s updated. Useful if you wish to perform an action after a cache update.
  	 * @param {CacheDidUpdatePluginContext} context
  	 * @returns {void}
  	 */
  val cacheDidUpdate: js.UndefOr[js.Function1[/* context */ CacheDidUpdatePluginContext, scala.Unit]] = js.undefined
  /**
  	 * Called before a Response is used to update a cache. You can alter the Response before it’s added to the cache or return null to avoid updating the cache at all.
  	 * @param {CacheWillUpdatePluginContext} context
  	 * @returns {Promise<Response>|Response|null}
  	 */
  val cacheWillUpdate: js.UndefOr[
    js.Function1[
      /* context */ CacheWillUpdatePluginContext, 
      js.Promise[stdLib.Response] | stdLib.Response | scala.Null
    ]
  ] = js.undefined
  /**
  	 * Before a cached Response is used to respond to a fetch event, this callback can be used to allow or block the Response from being used.
  	 * @param {CacheResponseWillBeUsedPluginContext} context
  	 * @returns {Promise<Response>|Response|null}
  	 */
  val cachedResponseWillBeUsed: js.UndefOr[
    js.Function1[
      /* context */ CacheResponseWillBeUsedPluginContext, 
      js.Promise[stdLib.Response] | stdLib.Response | scala.Null
    ]
  ] = js.undefined
  /**
  	 * Called when a fetch event fails (note this is when the network request can’t be made at all and not when a request is a non-200 request).
  	 * @param {FetchDidFailPluginContext}
  	 * @returns {void}
  	 */
  val fetchDidFail: js.UndefOr[js.Function1[/* context */ FetchDidFailPluginContext, scala.Unit]] = js.undefined
  /**
  	 * This is called whenever a fetch event is about to be made. You can alter the Request in this callback.
  	 * @param {RequestWillFetchPluginContext} context
  	 * @returns {Request}
  	 */
  val requestWillFetch: js.UndefOr[js.Function1[/* context */ RequestWillFetchPluginContext, stdLib.Request]] = js.undefined
}

object WorkboxPlugin {
  @scala.inline
  def apply(
    cacheDidUpdate: /* context */ CacheDidUpdatePluginContext => scala.Unit = null,
    cacheWillUpdate: /* context */ CacheWillUpdatePluginContext => js.Promise[stdLib.Response] | stdLib.Response | scala.Null = null,
    cachedResponseWillBeUsed: /* context */ CacheResponseWillBeUsedPluginContext => js.Promise[stdLib.Response] | stdLib.Response | scala.Null = null,
    fetchDidFail: /* context */ FetchDidFailPluginContext => scala.Unit = null,
    requestWillFetch: /* context */ RequestWillFetchPluginContext => stdLib.Request = null
  ): WorkboxPlugin = {
    val __obj = js.Dynamic.literal()
    if (cacheDidUpdate != null) __obj.updateDynamic("cacheDidUpdate")(js.Any.fromFunction1(cacheDidUpdate))
    if (cacheWillUpdate != null) __obj.updateDynamic("cacheWillUpdate")(js.Any.fromFunction1(cacheWillUpdate))
    if (cachedResponseWillBeUsed != null) __obj.updateDynamic("cachedResponseWillBeUsed")(js.Any.fromFunction1(cachedResponseWillBeUsed))
    if (fetchDidFail != null) __obj.updateDynamic("fetchDidFail")(js.Any.fromFunction1(fetchDidFail))
    if (requestWillFetch != null) __obj.updateDynamic("requestWillFetch")(js.Any.fromFunction1(requestWillFetch))
    __obj.asInstanceOf[WorkboxPlugin]
  }
}

