package typings.workboxDashWebpackDashPlugin.workboxDashWebpackDashPluginMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeCacheRule extends js.Object {
  /**
  	 * The `handler` values are strings, corresponding to names of the strategies supported by
  	 * [`workbox.strategies`](https://developers.google.com/web/tools/workbox/reference-docs/latest/workbox.strategies#methods).
  	 */
  var handler: js.UndefOr[ChacheStrategy] = js.undefined
  /**
  	 * The `options` properties can be used to configure instances of the cache expiration, cacheable response, and broadcast cache update plugins to apply to a given route.
  	 */
  var options: js.UndefOr[RuntimeCacheOptions] = js.undefined
  /**
  	 * Cache any same-origin request that matches the pattern.
  	 */
  var urlPattern: js.UndefOr[String | RegExp] = js.undefined
}

object RuntimeCacheRule {
  @scala.inline
  def apply(
    handler: ChacheStrategy = null,
    options: RuntimeCacheOptions = null,
    urlPattern: String | RegExp = null
  ): RuntimeCacheRule = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (urlPattern != null) __obj.updateDynamic("urlPattern")(urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCacheRule]
  }
}

