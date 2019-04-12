package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CacheExpiration =====
  */
trait CacheExpirationOptions extends js.Object {
  /**
  	 * The maximum age of an entry before it's treated as stale and removed.
  	 */
  var maxAgeSeconds: scala.Double
  /**
  	 * The maximum number of entries to cache.
  	 * Entries used the least will be removed as the maximum is reached.
  	 */
  var maxEntries: scala.Double
}

object CacheExpirationOptions {
  @scala.inline
  def apply(maxAgeSeconds: scala.Double, maxEntries: scala.Double): CacheExpirationOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds, maxEntries = maxEntries)
  
    __obj.asInstanceOf[CacheExpirationOptions]
  }
}

