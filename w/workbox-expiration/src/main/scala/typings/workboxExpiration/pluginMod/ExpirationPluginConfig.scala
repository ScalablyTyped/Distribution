package typings.workboxExpiration.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpirationPluginConfig extends js.Object {
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  var maxEntries: js.UndefOr[Double] = js.native
  var purgeOnQuotaError: js.UndefOr[Boolean] = js.native
}

object ExpirationPluginConfig {
  @scala.inline
  def apply(): ExpirationPluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpirationPluginConfig]
  }
  @scala.inline
  implicit class ExpirationPluginConfigOps[Self <: ExpirationPluginConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxAgeSeconds(value: Double): Self = this.set("maxAgeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("maxAgeSeconds", js.undefined)
    @scala.inline
    def setMaxEntries(value: Double): Self = this.set("maxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEntries: Self = this.set("maxEntries", js.undefined)
    @scala.inline
    def setPurgeOnQuotaError(value: Boolean): Self = this.set("purgeOnQuotaError", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurgeOnQuotaError: Self = this.set("purgeOnQuotaError", js.undefined)
  }
  
}

