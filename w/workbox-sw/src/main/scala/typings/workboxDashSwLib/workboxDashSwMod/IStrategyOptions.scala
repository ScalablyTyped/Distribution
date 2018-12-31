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

