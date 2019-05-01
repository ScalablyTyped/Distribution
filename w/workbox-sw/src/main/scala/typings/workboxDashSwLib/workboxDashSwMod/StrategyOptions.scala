package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== StrategiesNamespace =====
  */
trait StrategyOptions extends js.Object {
  /**
  	 * Defining this object will add a cache expiration plugins to this strategy.
  	 */
  var cacheExpiration: stdLib.Partial[CacheExpirationOptions]
  /**
  	 * Name of cache to use for caching (both lookup and updating).
  	 */
  var cacheName: java.lang.String
  /**
  	 * The Plugins to use along with the Strategy
  	 */
  var plugins: js.Array[Plugin]
}

object StrategyOptions {
  @scala.inline
  def apply(
    cacheExpiration: stdLib.Partial[CacheExpirationOptions],
    cacheName: java.lang.String,
    plugins: js.Array[Plugin]
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(cacheExpiration = cacheExpiration, cacheName = cacheName, plugins = plugins)
  
    __obj.asInstanceOf[StrategyOptions]
  }
}

