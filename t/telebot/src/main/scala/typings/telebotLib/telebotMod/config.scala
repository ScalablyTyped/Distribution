package typings
package telebotLib.telebotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  var allowedUpdates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Optional. Plugin folder location relative to telebot package.
  var pluginConfig: js.UndefOr[js.Any] = js.undefined
   // Optional. Use build-in plugins from pluginFolder.
  var pluginFolder: js.UndefOr[java.lang.String] = js.undefined
   // Required. Telegram Bot API token.
  var polling: js.UndefOr[telebotLib.Anon_Interval] = js.undefined
  var token: java.lang.String
   // Optional. List the types of updates you want your bot to receive. Specify an empty list to receive all updates.
  var usePlugins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var webhook: js.UndefOr[telebotLib.Anon_Cert] = js.undefined
}

object config {
  @scala.inline
  def apply(
    token: java.lang.String,
    allowedUpdates: js.Array[java.lang.String] = null,
    pluginConfig: js.Any = null,
    pluginFolder: java.lang.String = null,
    polling: telebotLib.Anon_Interval = null,
    usePlugins: js.Array[java.lang.String] = null,
    webhook: telebotLib.Anon_Cert = null
  ): config = {
    val __obj = js.Dynamic.literal(token = token)
    if (allowedUpdates != null) __obj.updateDynamic("allowedUpdates")(allowedUpdates)
    if (pluginConfig != null) __obj.updateDynamic("pluginConfig")(pluginConfig)
    if (pluginFolder != null) __obj.updateDynamic("pluginFolder")(pluginFolder)
    if (polling != null) __obj.updateDynamic("polling")(polling)
    if (usePlugins != null) __obj.updateDynamic("usePlugins")(usePlugins)
    if (webhook != null) __obj.updateDynamic("webhook")(webhook)
    __obj.asInstanceOf[config]
  }
}

