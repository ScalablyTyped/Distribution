package typings.twilioChat.mod

import typings.twilioNotifications.mod.Notifications
import typings.twilioSync.mod.SyncClient
import typings.twilsock.mod.InitRegistration
import typings.twilsock.mod.Transport
import typings.twilsock.mod.TwilsockClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Chat client options.
  */
trait ClientOptions extends StObject {
  
  var Chat: js.UndefOr[Any] = js.undefined
  
  var IPMessaging: js.UndefOr[Any] = js.undefined
  
  var Notification: js.UndefOr[Any] = js.undefined
  
  var Sync: js.UndefOr[Any] = js.undefined
  
  var Twilsock: js.UndefOr[Any] = js.undefined
  
  var backoffConfigOverride: js.UndefOr[Any] = js.undefined
  
  var clientMetadata: js.UndefOr[Any] = js.undefined
  
  var consumptionReportIntervalOverride: js.UndefOr[String] = js.undefined
  
  var disableDeepClone: js.UndefOr[Boolean] = js.undefined
  
  var httpCacheIntervalOverride: js.UndefOr[Double] = js.undefined
  
  var initRegistrations: js.UndefOr[js.Array[InitRegistration]] = js.undefined
  
  /**
    * The level of logging to enable.
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var notificationsClient: js.UndefOr[Notifications] = js.undefined
  
  var productId: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var retryWhenThrottledOverride: js.UndefOr[Boolean] = js.undefined
  
  var syncClient: js.UndefOr[SyncClient] = js.undefined
  
  var transport: js.UndefOr[Transport] = js.undefined
  
  var twilsockClient: js.UndefOr[TwilsockClient] = js.undefined
  
  var typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.undefined
  
  var userInfosToSubscribeOverride: js.UndefOr[Double] = js.undefined
}
object ClientOptions {
  
  inline def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    inline def setBackoffConfigOverride(value: Any): Self = StObject.set(x, "backoffConfigOverride", value.asInstanceOf[js.Any])
    
    inline def setBackoffConfigOverrideUndefined: Self = StObject.set(x, "backoffConfigOverride", js.undefined)
    
    inline def setChat(value: Any): Self = StObject.set(x, "Chat", value.asInstanceOf[js.Any])
    
    inline def setChatUndefined: Self = StObject.set(x, "Chat", js.undefined)
    
    inline def setClientMetadata(value: Any): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setConsumptionReportIntervalOverride(value: String): Self = StObject.set(x, "consumptionReportIntervalOverride", value.asInstanceOf[js.Any])
    
    inline def setConsumptionReportIntervalOverrideUndefined: Self = StObject.set(x, "consumptionReportIntervalOverride", js.undefined)
    
    inline def setDisableDeepClone(value: Boolean): Self = StObject.set(x, "disableDeepClone", value.asInstanceOf[js.Any])
    
    inline def setDisableDeepCloneUndefined: Self = StObject.set(x, "disableDeepClone", js.undefined)
    
    inline def setHttpCacheIntervalOverride(value: Double): Self = StObject.set(x, "httpCacheIntervalOverride", value.asInstanceOf[js.Any])
    
    inline def setHttpCacheIntervalOverrideUndefined: Self = StObject.set(x, "httpCacheIntervalOverride", js.undefined)
    
    inline def setIPMessaging(value: Any): Self = StObject.set(x, "IPMessaging", value.asInstanceOf[js.Any])
    
    inline def setIPMessagingUndefined: Self = StObject.set(x, "IPMessaging", js.undefined)
    
    inline def setInitRegistrations(value: js.Array[InitRegistration]): Self = StObject.set(x, "initRegistrations", value.asInstanceOf[js.Any])
    
    inline def setInitRegistrationsUndefined: Self = StObject.set(x, "initRegistrations", js.undefined)
    
    inline def setInitRegistrationsVarargs(value: InitRegistration*): Self = StObject.set(x, "initRegistrations", js.Array(value*))
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelNull: Self = StObject.set(x, "logLevel", null)
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setNotification(value: Any): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
    
    inline def setNotificationsClient(value: Notifications): Self = StObject.set(x, "notificationsClient", value.asInstanceOf[js.Any])
    
    inline def setNotificationsClientUndefined: Self = StObject.set(x, "notificationsClient", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRetryWhenThrottledOverride(value: Boolean): Self = StObject.set(x, "retryWhenThrottledOverride", value.asInstanceOf[js.Any])
    
    inline def setRetryWhenThrottledOverrideUndefined: Self = StObject.set(x, "retryWhenThrottledOverride", js.undefined)
    
    inline def setSync(value: Any): Self = StObject.set(x, "Sync", value.asInstanceOf[js.Any])
    
    inline def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
    
    inline def setSyncClientUndefined: Self = StObject.set(x, "syncClient", js.undefined)
    
    inline def setSyncUndefined: Self = StObject.set(x, "Sync", js.undefined)
    
    inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setTwilsock(value: Any): Self = StObject.set(x, "Twilsock", value.asInstanceOf[js.Any])
    
    inline def setTwilsockClient(value: TwilsockClient): Self = StObject.set(x, "twilsockClient", value.asInstanceOf[js.Any])
    
    inline def setTwilsockClientUndefined: Self = StObject.set(x, "twilsockClient", js.undefined)
    
    inline def setTwilsockUndefined: Self = StObject.set(x, "Twilsock", js.undefined)
    
    inline def setTypingIndicatorTimeoutOverride(value: Double): Self = StObject.set(x, "typingIndicatorTimeoutOverride", value.asInstanceOf[js.Any])
    
    inline def setTypingIndicatorTimeoutOverrideUndefined: Self = StObject.set(x, "typingIndicatorTimeoutOverride", js.undefined)
    
    inline def setUserInfosToSubscribeOverride(value: Double): Self = StObject.set(x, "userInfosToSubscribeOverride", value.asInstanceOf[js.Any])
    
    inline def setUserInfosToSubscribeOverrideUndefined: Self = StObject.set(x, "userInfosToSubscribeOverride", js.undefined)
  }
}
