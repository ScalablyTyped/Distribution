package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== ExpirationPlugin =====
  */
trait CacheExpirationPluginOptions extends CacheExpirationOptions {
  /**
  	 * Whether to opt this cache in to automatic deletion
  	 * if the available storage quota has been exceeded.
  	 */
  var purgeOnQuotaError: scala.Boolean
}

object CacheExpirationPluginOptions {
  @scala.inline
  def apply(maxAgeSeconds: scala.Double, maxEntries: scala.Double, purgeOnQuotaError: scala.Boolean): CacheExpirationPluginOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds, maxEntries = maxEntries, purgeOnQuotaError = purgeOnQuotaError)
  
    __obj.asInstanceOf[CacheExpirationPluginOptions]
  }
}

