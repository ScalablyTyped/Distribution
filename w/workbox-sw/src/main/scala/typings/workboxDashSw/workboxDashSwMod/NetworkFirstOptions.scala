package typings.workboxDashSw.workboxDashSwMod

import typings.std.CacheQueryOptions
import typings.std.RequestInit
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
  var networkTimeoutSeconds: Double
}

object NetworkFirstOptions {
  @scala.inline
  def apply(
    cacheName: String,
    fetchOptions: RequestInit,
    matchOptions: CacheQueryOptions,
    networkTimeoutSeconds: Double,
    plugins: js.Array[Plugin]
  ): NetworkFirstOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, fetchOptions = fetchOptions, matchOptions = matchOptions, networkTimeoutSeconds = networkTimeoutSeconds, plugins = plugins)
  
    __obj.asInstanceOf[NetworkFirstOptions]
  }
}

