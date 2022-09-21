package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Networking.PushNotifications.PushNotificationType
import typings.winrt.Windows.UI.Notifications.BadgeNotification
import typings.winrt.Windows.UI.Notifications.TileNotification
import typings.winrt.Windows.UI.Notifications.ToastNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PushNotifications {
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannel")
  @js.native
  open class PushNotificationChannel ()
    extends StObject
       with typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannel {
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var expirationTime: js.Date = js.native
    
    /* CompleteClass */
    var onpushnotificationreceived: Any = js.native
    
    /* CompleteClass */
    var uri: String = js.native
  }
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
  @js.native
  open class PushNotificationChannelManager ()
    extends StObject
       with typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannelManager
  /* static members */
  object PushNotificationChannelManager {
    
    @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createPushNotificationChannelForApplicationAsync(): IAsyncOperation[typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPushNotificationChannelForApplicationAsync")().asInstanceOf[IAsyncOperation[typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannel]]
    inline def createPushNotificationChannelForApplicationAsync(applicationId: String): IAsyncOperation[typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPushNotificationChannelForApplicationAsync")(applicationId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannel]]
    
    inline def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IAsyncOperation[typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPushNotificationChannelForSecondaryTileAsync")(tileId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Networking.PushNotifications.PushNotificationChannel]]
  }
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs")
  @js.native
  open class PushNotificationReceivedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs {
    
    /* CompleteClass */
    var badgeNotification: BadgeNotification = js.native
    
    /* CompleteClass */
    var cancel: Boolean = js.native
    
    /* CompleteClass */
    var notificationType: PushNotificationType = js.native
    
    /* CompleteClass */
    var rawNotification: typings.winrt.Windows.Networking.PushNotifications.RawNotification = js.native
    
    /* CompleteClass */
    var tileNotification: TileNotification = js.native
    
    /* CompleteClass */
    var toastNotification: ToastNotification = js.native
  }
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
  @js.native
  object PushNotificationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.PushNotifications.PushNotificationType & Double] = js.native
    
    /* 2 */ val badge: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.badge & Double = js.native
    
    /* 3 */ val raw: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.raw & Double = js.native
    
    /* 1 */ val tile: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.tile & Double = js.native
    
    /* 0 */ val toast: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.toast & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.PushNotifications.RawNotification")
  @js.native
  open class RawNotification ()
    extends StObject
       with typings.winrt.Windows.Networking.PushNotifications.RawNotification {
    
    /* CompleteClass */
    var content: String = js.native
  }
}
