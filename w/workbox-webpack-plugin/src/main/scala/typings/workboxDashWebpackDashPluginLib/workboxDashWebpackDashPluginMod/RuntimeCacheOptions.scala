package typings
package workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeCacheOptions extends js.Object {
  /**
  	 * Configure background sync.
  	 */
  var backgroundSync: js.UndefOr[workboxDashWebpackDashPluginLib.Anon_Name] = js.undefined
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
  var cacheableResponse: js.UndefOr[workboxDashWebpackDashPluginLib.Anon_Header] = js.undefined
  /**
  	 * Custom cache expiration.
  	 */
  var expiration: js.UndefOr[workboxDashWebpackDashPluginLib.Anon_MaxAgeSeconds] = js.undefined
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

object RuntimeCacheOptions {
  @scala.inline
  def apply(
    backgroundSync: workboxDashWebpackDashPluginLib.Anon_Name = null,
    broadcastUpdate: workboxDashWebpackDashPluginLib.Anon_ChannelName = null,
    cacheName: java.lang.String = null,
    cacheableResponse: workboxDashWebpackDashPluginLib.Anon_Header = null,
    expiration: workboxDashWebpackDashPluginLib.Anon_MaxAgeSeconds = null,
    fetchOptions: js.Any = null,
    matchOptions: js.Any = null,
    networkTimeoutSeconds: scala.Int | scala.Double = null,
    plugins: js.Array[_] = null
  ): RuntimeCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundSync != null) __obj.updateDynamic("backgroundSync")(backgroundSync)
    if (broadcastUpdate != null) __obj.updateDynamic("broadcastUpdate")(broadcastUpdate)
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName)
    if (cacheableResponse != null) __obj.updateDynamic("cacheableResponse")(cacheableResponse)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions)
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions)
    if (networkTimeoutSeconds != null) __obj.updateDynamic("networkTimeoutSeconds")(networkTimeoutSeconds.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[RuntimeCacheOptions]
  }
}

