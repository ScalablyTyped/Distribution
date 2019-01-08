package typings
package workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod

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
  var urlPattern: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

