package typings.workboxDashSw.workboxDashSwMod

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
  var purgeOnQuotaError: Boolean
}

object CacheExpirationPluginOptions {
  @scala.inline
  def apply(maxAgeSeconds: Double, maxEntries: Double, purgeOnQuotaError: Boolean): CacheExpirationPluginOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds, maxEntries = maxEntries, purgeOnQuotaError = purgeOnQuotaError)
  
    __obj.asInstanceOf[CacheExpirationPluginOptions]
  }
}

