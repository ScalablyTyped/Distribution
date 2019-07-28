package typings.workboxDashSw.workboxDashSwMod

import typings.std.Partial
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
  var cacheExpiration: Partial[CacheExpirationOptions]
  /**
  	 * Name of cache to use for caching (both lookup and updating).
  	 */
  var cacheName: String
  /**
  	 * The Plugins to use along with the Strategy
  	 */
  var plugins: js.Array[Plugin]
}

object StrategyOptions {
  @scala.inline
  def apply(cacheExpiration: Partial[CacheExpirationOptions], cacheName: String, plugins: js.Array[Plugin]): StrategyOptions = {
    val __obj = js.Dynamic.literal(cacheExpiration = cacheExpiration, cacheName = cacheName, plugins = plugins)
  
    __obj.asInstanceOf[StrategyOptions]
  }
}

