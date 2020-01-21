package typings.workboxWebpackPlugin.mod

import typings.workboxWebpackPlugin.AnonChannelName
import typings.workboxWebpackPlugin.AnonHeader
import typings.workboxWebpackPlugin.AnonMaxAgeSeconds
import typings.workboxWebpackPlugin.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeCacheOptions extends js.Object {
  /**
  	 * Configure background sync.
  	 */
  var backgroundSync: js.UndefOr[AnonName] = js.undefined
  /**
  	 * Configure the broadcast cache update plugin.
  	 */
  var broadcastUpdate: js.UndefOr[AnonChannelName] = js.undefined
  /**
  	 * A custom cache name for this route.
  	 */
  var cacheName: js.UndefOr[String] = js.undefined
  /**
  	 * Configure which responses are considered cacheable.
  	 */
  var cacheableResponse: js.UndefOr[AnonHeader] = js.undefined
  /**
  	 * Custom cache expiration.
  	 */
  var expiration: js.UndefOr[AnonMaxAgeSeconds] = js.undefined
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
  var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
  /**
  	 * Add in any additional plugin logic you need.
  	 */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
}

object RuntimeCacheOptions {
  @scala.inline
  def apply(
    backgroundSync: AnonName = null,
    broadcastUpdate: AnonChannelName = null,
    cacheName: String = null,
    cacheableResponse: AnonHeader = null,
    expiration: AnonMaxAgeSeconds = null,
    fetchOptions: js.Any = null,
    matchOptions: js.Any = null,
    networkTimeoutSeconds: Int | Double = null,
    plugins: js.Array[_] = null
  ): RuntimeCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundSync != null) __obj.updateDynamic("backgroundSync")(backgroundSync.asInstanceOf[js.Any])
    if (broadcastUpdate != null) __obj.updateDynamic("broadcastUpdate")(broadcastUpdate.asInstanceOf[js.Any])
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (cacheableResponse != null) __obj.updateDynamic("cacheableResponse")(cacheableResponse.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions.asInstanceOf[js.Any])
    if (networkTimeoutSeconds != null) __obj.updateDynamic("networkTimeoutSeconds")(networkTimeoutSeconds.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCacheOptions]
  }
}

