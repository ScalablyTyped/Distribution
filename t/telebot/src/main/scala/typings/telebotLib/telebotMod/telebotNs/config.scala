package typings
package telebotLib.telebotMod.telebotNs

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

