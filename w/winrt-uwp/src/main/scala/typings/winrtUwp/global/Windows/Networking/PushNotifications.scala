package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes and interfaces that encapsulate push notifications. */
object PushNotifications {
  
  /** Represents a delivery vehicle and addressing mechanism for push notifications. The channel Uniform Resource Identifier (URI) represented by this interface is used by a third-party application server to communicate with the Windows Push Notification Services (WNS). The push notification channel is used by the client to intercept notifications. */
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannel")
  @js.native
  abstract class PushNotificationChannel ()
    extends typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationChannel
  
  /** Creates objects that you use to retrieve push notification channels from the Windows Push Notification Services (WNS). These channels are bound to an app or secondary tile . */
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
  @js.native
  abstract class PushNotificationChannelManager ()
    extends typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationChannelManager
  object PushNotificationChannelManager {
    
    /**
      * Creates an object, bound to the calling app, through which you retrieve a push notification channel from Windows Push Notification Services (WNS).
      * @return The object, bound to the calling app, that is used to request a PushNotificationChannel from the WNS.
      */
    /* static member */
    @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager.createPushNotificationChannelForApplicationAsync")
    @js.native
    def createPushNotificationChannelForApplicationAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
    /**
      * Creates an object, bound to a specified app, through which you retrieve a push notification channel from Windows Push Notification Services (WNS). The specified app must be in the same package as the calling app.
      * @param applicationId The Package Relative Application ID (PRAID) of the app to bind to the push notification channel.
      * @return The object, bound to the app specified in applicationId, that is used to request a PushNotificationChannel from the WNS.
      */
    /* static member */
    @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager.createPushNotificationChannelForApplicationAsync")
    @js.native
    def createPushNotificationChannelForApplicationAsync(applicationId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
    
    /**
      * Creates an object, bound to a secondary tile , through which you retrieve a push notification channel from Windows Push Notification Services (WNS). The tile can be a secondary tile of the calling app or any other app in the same package.
      * @param tileId The ID of the secondary tile to bind to the push notification channel.
      * @return The object, bound to the secondary tile, that is used to request a PushNotificationChannel from the WNS.
      */
    /* static member */
    @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager.createPushNotificationChannelForSecondaryTileAsync")
    @js.native
    def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
  }
  
  /** Encapsulates a push notification that has been received from the app server, identifying the type and supplying the content of the notification. Windows passes this information in the PushNotificationReceived event. */
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs")
  @js.native
  abstract class PushNotificationReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs
  
  /** The type of push notification that has been received from the app server. Used by the NotificationType property. */
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
  @js.native
  object PushNotificationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationType with Double
      ] = js.native
    
    /* 2 */ val badge: typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationType.badge with Double = js.native
    
    /* 3 */ val raw: typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationType.raw with Double = js.native
    
    /* 1 */ val tile: typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationType.tile with Double = js.native
    
    /* 4 */ val tileFlyout: typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationType.tileFlyout with Double = js.native
    
    /* 0 */ val toast: typings.winrtUwp.Windows.Networking.PushNotifications.PushNotificationType.toast with Double = js.native
  }
  
  /** Encapsulates the app-defined content of a raw notification (a push notification that does not involve UI). Its contents can be used in an app's background task, if the app has that capability, or otherwise consumed by the app and acted on as needed. */
  @JSGlobal("Windows.Networking.PushNotifications.RawNotification")
  @js.native
  abstract class RawNotification ()
    extends typings.winrtUwp.Windows.Networking.PushNotifications.RawNotification
}
