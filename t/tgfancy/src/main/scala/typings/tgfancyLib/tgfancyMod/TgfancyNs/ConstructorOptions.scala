package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions
  extends nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ConstructorOptions {
  var tgfancy: js.UndefOr[TgfancyOptions] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    baseApiUrl: java.lang.String = null,
    filepath: js.UndefOr[scala.Boolean] = js.undefined,
    onlyFirstMatch: js.UndefOr[scala.Boolean] = js.undefined,
    polling: scala.Boolean | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.PollingOptions = null,
    request: requestLib.requestMod.requestNs.Options = null,
    tgfancy: TgfancyOptions = null,
    webHook: scala.Boolean | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.WebHookOptions = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (baseApiUrl != null) __obj.updateDynamic("baseApiUrl")(baseApiUrl)
    if (!js.isUndefined(filepath)) __obj.updateDynamic("filepath")(filepath)
    if (!js.isUndefined(onlyFirstMatch)) __obj.updateDynamic("onlyFirstMatch")(onlyFirstMatch)
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (tgfancy != null) __obj.updateDynamic("tgfancy")(tgfancy)
    if (webHook != null) __obj.updateDynamic("webHook")(webHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

