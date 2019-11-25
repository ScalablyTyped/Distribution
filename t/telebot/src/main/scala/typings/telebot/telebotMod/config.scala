package typings.telebot.telebotMod

import typings.telebot.Anon_Cert
import typings.telebot.Anon_Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  var allowedUpdates: js.UndefOr[js.Array[String]] = js.undefined
   // Optional. Plugin folder location relative to telebot package.
  var pluginConfig: js.UndefOr[js.Any] = js.undefined
   // Optional. Use build-in plugins from pluginFolder.
  var pluginFolder: js.UndefOr[String] = js.undefined
   // Required. Telegram Bot API token.
  var polling: js.UndefOr[Anon_Interval] = js.undefined
  var token: String
   // Optional. List the types of updates you want your bot to receive. Specify an empty list to receive all updates.
  var usePlugins: js.UndefOr[js.Array[String]] = js.undefined
  var webhook: js.UndefOr[Anon_Cert] = js.undefined
}

object config {
  @scala.inline
  def apply(
    token: String,
    allowedUpdates: js.Array[String] = null,
    pluginConfig: js.Any = null,
    pluginFolder: String = null,
    polling: Anon_Interval = null,
    usePlugins: js.Array[String] = null,
    webhook: Anon_Cert = null
  ): config = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (allowedUpdates != null) __obj.updateDynamic("allowedUpdates")(allowedUpdates.asInstanceOf[js.Any])
    if (pluginConfig != null) __obj.updateDynamic("pluginConfig")(pluginConfig.asInstanceOf[js.Any])
    if (pluginFolder != null) __obj.updateDynamic("pluginFolder")(pluginFolder.asInstanceOf[js.Any])
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (usePlugins != null) __obj.updateDynamic("usePlugins")(usePlugins.asInstanceOf[js.Any])
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
}

