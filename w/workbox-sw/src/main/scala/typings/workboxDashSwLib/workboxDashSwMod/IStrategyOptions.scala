package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== StrategiesNamespace =====
  */
trait IStrategyOptions extends js.Object {
  /**
  	 * Defining this object will add a cache expiration plugins to this strategy.
  	 */
  var cacheExpiration: stdLib.Partial[ICacheExpirationOptions]
  /**
  	 * Name of cache to use for caching (both lookup and updating).
  	 */
  var cacheName: java.lang.String
  /**
  	 * The Plugins to use along with the Strategy
  	 */
  var plugins: js.Array[workboxDashSwLib.Plugin]
}

object IStrategyOptions {
  @scala.inline
  def apply(
    cacheExpiration: stdLib.Partial[ICacheExpirationOptions],
    cacheName: java.lang.String,
    plugins: js.Array[workboxDashSwLib.Plugin]
  ): IStrategyOptions = {
    val __obj = js.Dynamic.literal(cacheExpiration = cacheExpiration, cacheName = cacheName, plugins = plugins)
  
    __obj.asInstanceOf[IStrategyOptions]
  }
}

