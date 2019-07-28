package typings.workboxDashSw.workboxDashSwMod

import typings.std.CacheQueryOptions
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
  var cacheName: String
  /**
  	 * [`CacheQueryOptions`](https://w3c.github.io/ServiceWorker/#dictdef-cachequeryoptions)
  	 */
  var matchOptions: CacheQueryOptions
  /**
  	 * [Plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}
  	 * to use in conjunction with this caching strategy.
  	 */
  var plugins: js.Array[Plugin]
}

object CacheOnlyOptions {
  @scala.inline
  def apply(cacheName: String, matchOptions: CacheQueryOptions, plugins: js.Array[Plugin]): CacheOnlyOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, matchOptions = matchOptions, plugins = plugins)
  
    __obj.asInstanceOf[CacheOnlyOptions]
  }
}

