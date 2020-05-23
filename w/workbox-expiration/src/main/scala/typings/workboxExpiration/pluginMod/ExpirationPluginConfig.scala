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
    maxAgeSeconds: js.UndefOr[Double] = js.undefined,
    maxEntries: js.UndefOr[Double] = js.undefined,
    purgeOnQuotaError: js.UndefOr[Boolean] = js.undefined
  ): ExpirationPluginConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAgeSeconds)) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEntries)) __obj.updateDynamic("maxEntries")(maxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(purgeOnQuotaError)) __obj.updateDynamic("purgeOnQuotaError")(purgeOnQuotaError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationPluginConfig]
  }
}

