package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheStrategyMakeRequestOptions extends js.Object {
  /**
  	 * If provided, `event.waitUntil()` will
  	 * be called automatically to extend the service worker's lifetime.
  	 */
  var event: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.undefined
  /**
  	 * Either a [`Request`]{@link https://developer.mozilla.org/en-US/docs/Web/API/Request} object,
  	 * or a string URL, corresponding to the request to be made.
  	 */
  var request: stdLib.Request | java.lang.String
}

object CacheStrategyMakeRequestOptions {
  @scala.inline
  def apply(
    request: stdLib.Request | java.lang.String,
    event: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): CacheStrategyMakeRequestOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CacheStrategyMakeRequestOptions]
  }
}

