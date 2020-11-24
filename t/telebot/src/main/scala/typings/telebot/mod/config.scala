package typings.telebot.mod

import typings.telebot.anon.Cert
import typings.telebot.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait config extends js.Object {
  
  var allowedUpdates: js.UndefOr[js.Array[String]] = js.native
  
   // Optional. Plugin folder location relative to telebot package.
  var pluginConfig: js.UndefOr[js.Any] = js.native
  
   // Optional. Use build-in plugins from pluginFolder.
  var pluginFolder: js.UndefOr[String] = js.native
  
   // Required. Telegram Bot API token.
  var polling: js.UndefOr[Interval] = js.native
  
  var token: String = js.native
  
   // Optional. List the types of updates you want your bot to receive. Specify an empty list to receive all updates.
  var usePlugins: js.UndefOr[js.Array[String]] = js.native
  
  var webhook: js.UndefOr[Cert] = js.native
}
object config {
  
  @scala.inline
  def apply(token: String): config = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  
  @scala.inline
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUpdatesVarargs(value: String*): Self = this.set("allowedUpdates", js.Array(value :_*))
    
    @scala.inline
    def setAllowedUpdates(value: js.Array[String]): Self = this.set("allowedUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedUpdates: Self = this.set("allowedUpdates", js.undefined)
    
    @scala.inline
    def setPluginConfig(value: js.Any): Self = this.set("pluginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginConfig: Self = this.set("pluginConfig", js.undefined)
    
    @scala.inline
    def setPluginFolder(value: String): Self = this.set("pluginFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginFolder: Self = this.set("pluginFolder", js.undefined)
    
    @scala.inline
    def setPolling(value: Interval): Self = this.set("polling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolling: Self = this.set("polling", js.undefined)
    
    @scala.inline
    def setUsePluginsVarargs(value: String*): Self = this.set("usePlugins", js.Array(value :_*))
    
    @scala.inline
    def setUsePlugins(value: js.Array[String]): Self = this.set("usePlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePlugins: Self = this.set("usePlugins", js.undefined)
    
    @scala.inline
    def setWebhook(value: Cert): Self = this.set("webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhook: Self = this.set("webhook", js.undefined)
  }
}
