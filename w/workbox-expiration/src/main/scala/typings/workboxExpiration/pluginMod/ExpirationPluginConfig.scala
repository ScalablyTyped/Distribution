package typings.workboxExpiration.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpirationPluginConfig extends js.Object {
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  var maxEntries: js.UndefOr[Double] = js.undefined
  var purgeOnQuotaError: js.UndefOr[Boolean] = js.undefined
}

object ExpirationPluginConfig {
  @scala.inline
  def apply(
    maxAgeSeconds: Int | Double = null,
    maxEntries: Int | Double = null,
    purgeOnQuotaError: js.UndefOr[Boolean] = js.undefined
  ): ExpirationPluginConfig = {
    val __obj = js.Dynamic.literal()
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(purgeOnQuotaError)) __obj.updateDynamic("purgeOnQuotaError")(purgeOnQuotaError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationPluginConfig]
  }
}

