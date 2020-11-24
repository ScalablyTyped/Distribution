package typings.twilioChat.mod.Client

import typings.twilioChat.transportMod.Transport
import typings.twilioNotifications.mod.Notifications
import typings.twilioSync.mod.SyncClient
import typings.twilsock.mod.Twilsock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var Chat: js.UndefOr[js.Any] = js.native
  
  var Notification: js.UndefOr[js.Any] = js.native
  
  var Sync: js.UndefOr[js.Any] = js.native
  
  var Twilsock: js.UndefOr[js.Any] = js.native
  
  var backoffConfigOverride: js.UndefOr[js.Any] = js.native
  
  var clientMetadata: js.UndefOr[js.Any] = js.native
  
  var consumptionReportIntervalOverride: js.UndefOr[String] = js.native
  
  var httpCacheIntervalOverride: js.UndefOr[String] = js.native
  
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  var notificationsClient: js.UndefOr[Notifications] = js.native
  
  var productId: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var retryWhenThrottledOverride: js.UndefOr[Boolean] = js.native
  
  var syncClient: js.UndefOr[SyncClient] = js.native
  
  var transport: js.UndefOr[Transport] = js.native
  
  var twilsockClient: js.UndefOr[Twilsock] = js.native
  
  var typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.native
  
  var userInfosToSubscribeOverride: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setChat(value: js.Any): Self = this.set("Chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChat: Self = this.set("Chat", js.undefined)
    
    @scala.inline
    def setNotification(value: js.Any): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("Notification", js.undefined)
    
    @scala.inline
    def setSync(value: js.Any): Self = this.set("Sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("Sync", js.undefined)
    
    @scala.inline
    def setTwilsock(value: js.Any): Self = this.set("Twilsock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwilsock: Self = this.set("Twilsock", js.undefined)
    
    @scala.inline
    def setBackoffConfigOverride(value: js.Any): Self = this.set("backoffConfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoffConfigOverride: Self = this.set("backoffConfigOverride", js.undefined)
    
    @scala.inline
    def setClientMetadata(value: js.Any): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
    
    @scala.inline
    def setConsumptionReportIntervalOverride(value: String): Self = this.set("consumptionReportIntervalOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumptionReportIntervalOverride: Self = this.set("consumptionReportIntervalOverride", js.undefined)
    
    @scala.inline
    def setHttpCacheIntervalOverride(value: String): Self = this.set("httpCacheIntervalOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCacheIntervalOverride: Self = this.set("httpCacheIntervalOverride", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogLevelNull: Self = this.set("logLevel", null)
    
    @scala.inline
    def setNotificationsClient(value: Notifications): Self = this.set("notificationsClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationsClient: Self = this.set("notificationsClient", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRetryWhenThrottledOverride(value: Boolean): Self = this.set("retryWhenThrottledOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryWhenThrottledOverride: Self = this.set("retryWhenThrottledOverride", js.undefined)
    
    @scala.inline
    def setSyncClient(value: SyncClient): Self = this.set("syncClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncClient: Self = this.set("syncClient", js.undefined)
    
    @scala.inline
    def setTransport(value: Transport): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setTwilsockClient(value: Twilsock): Self = this.set("twilsockClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwilsockClient: Self = this.set("twilsockClient", js.undefined)
    
    @scala.inline
    def setTypingIndicatorTimeoutOverride(value: Double): Self = this.set("typingIndicatorTimeoutOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypingIndicatorTimeoutOverride: Self = this.set("typingIndicatorTimeoutOverride", js.undefined)
    
    @scala.inline
    def setUserInfosToSubscribeOverride(value: Double): Self = this.set("userInfosToSubscribeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInfosToSubscribeOverride: Self = this.set("userInfosToSubscribeOverride", js.undefined)
  }
}
