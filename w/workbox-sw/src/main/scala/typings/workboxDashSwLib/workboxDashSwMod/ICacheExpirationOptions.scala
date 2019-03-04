package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CacheExpiration =====
  */
trait ICacheExpirationOptions extends js.Object {
  /**
  	 * The maximum lifetime of a request to stay in the cache before it's removed.
  	 */
  var maxAgeSeconds: scala.Double
  /**
  	 * The maximum number of entries to store in a cache.
  	 */
  var maxEntries: scala.Double
}

object ICacheExpirationOptions {
  @scala.inline
  def apply(maxAgeSeconds: scala.Double, maxEntries: scala.Double): ICacheExpirationOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds, maxEntries = maxEntries)
  
    __obj.asInstanceOf[ICacheExpirationOptions]
  }
}

