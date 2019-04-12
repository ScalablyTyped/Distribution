package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CacheOnly strategy =====
  */
trait CacheOnlyOptions extends js.Object {
  /**
  	 * Cache name to store and retrieve requests. Defaults to cache names provided by workbox-core.
  	 */
  var cacheName: java.lang.String
  /**
  	 * [`CacheQueryOptions`](https://w3c.github.io/ServiceWorker/#dictdef-cachequeryoptions)
  	 */
  var matchOptions: stdLib.CacheQueryOptions
  /**
  	 * [Plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}
  	 * to use in conjunction with this caching strategy.
  	 */
  var plugins: js.Array[workboxDashSwLib.Plugin]
}

object CacheOnlyOptions {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    matchOptions: stdLib.CacheQueryOptions,
    plugins: js.Array[workboxDashSwLib.Plugin]
  ): CacheOnlyOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, matchOptions = matchOptions, plugins = plugins)
  
    __obj.asInstanceOf[CacheOnlyOptions]
  }
}

