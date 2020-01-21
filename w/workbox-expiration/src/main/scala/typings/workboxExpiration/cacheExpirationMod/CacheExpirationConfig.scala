package typings.workboxExpiration.cacheExpirationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheExpirationConfig extends js.Object {
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  var maxEntries: js.UndefOr[Double] = js.undefined
}

object CacheExpirationConfig {
  @scala.inline
  def apply(maxAgeSeconds: Int | Double = null, maxEntries: Int | Double = null): CacheExpirationConfig = {
    val __obj = js.Dynamic.literal()
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheExpirationConfig]
  }
}

