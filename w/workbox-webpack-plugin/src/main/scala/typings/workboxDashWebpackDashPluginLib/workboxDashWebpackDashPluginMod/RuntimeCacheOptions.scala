package typings
package workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeCacheOptions extends js.Object {
  /**
  	 * Configure background sync.
  	 */
  var backgroundSync: js.UndefOr[workboxDashWebpackDashPluginLib.Anon_Options] = js.undefined
  /**
  	 * Configure the broadcast cache update plugin.
  	 */
  var broadcastUpdate: js.UndefOr[workboxDashWebpackDashPluginLib.Anon_ChannelName] = js.undefined
  /**
  	 * A custom cache name for this route.
  	 */
  var cacheName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Configure which responses are considered cacheable.
  	 */
  var cacheableResponse: js.UndefOr[workboxDashWebpackDashPluginLib.Anon_Statuses] = js.undefined
  /**
  	 * Custom cache expiration.
  	 */
  var expiration: js.UndefOr[workboxDashWebpackDashPluginLib.Anon_MaxEntries] = js.undefined
  /**
  	 * Used to configure the handler.
  	 */
  var fetchOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to configure the handler.
  	 */
  var matchOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fall back to the cache after X seconds.
  	 */
  var networkTimeoutSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Add in any additional plugin logic you need.
  	 */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
}

