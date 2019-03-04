package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CacheOnly strategy =====
  */
trait ICacheOnlyOptions extends js.Object {
  /**
  	 * Cache name to store and retrieve requests. Defaults to cache names provided by workbox-core.
  	 */
  var cacheName: java.lang.String
  /**
  	 * Plugins to use in conjunction with this caching strategy.
  	 */
  var plugins: js.Array[workboxDashSwLib.Plugin]
}

object ICacheOnlyOptions {
  @scala.inline
  def apply(cacheName: java.lang.String, plugins: js.Array[workboxDashSwLib.Plugin]): ICacheOnlyOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, plugins = plugins)
  
    __obj.asInstanceOf[ICacheOnlyOptions]
  }
}

