package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== NetworkFirst strategy =====
  */
trait NetworkFirstOptions extends CacheFirstOptions {
  /**
  	 * If set, any network requests
  	 * that fail to respond within the timeout will fallback to the cache.
  	 */
  var networkTimeoutSeconds: scala.Double
}

object NetworkFirstOptions {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    fetchOptions: stdLib.RequestInit,
    matchOptions: stdLib.CacheQueryOptions,
    networkTimeoutSeconds: scala.Double,
    plugins: js.Array[Plugin]
  ): NetworkFirstOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, fetchOptions = fetchOptions, matchOptions = matchOptions, networkTimeoutSeconds = networkTimeoutSeconds, plugins = plugins)
  
    __obj.asInstanceOf[NetworkFirstOptions]
  }
}

