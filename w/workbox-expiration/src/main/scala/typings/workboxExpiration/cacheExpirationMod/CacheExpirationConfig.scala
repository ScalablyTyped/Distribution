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
  def apply(maxAgeSeconds: js.UndefOr[Double] = js.undefined, maxEntries: js.UndefOr[Double] = js.undefined): CacheExpirationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAgeSeconds)) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEntries)) __obj.updateDynamic("maxEntries")(maxEntries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheExpirationConfig]
  }
}

