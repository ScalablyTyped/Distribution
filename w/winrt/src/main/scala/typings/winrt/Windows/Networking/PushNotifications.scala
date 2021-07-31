package typings.winrt.Windows.Networking

import typings.std.Date
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.UI.Notifications.BadgeNotification
import typings.winrt.Windows.UI.Notifications.TileNotification
import typings.winrt.Windows.UI.Notifications.ToastNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PushNotifications {
  
  @js.native
  sealed trait PushNotificationType extends StObject
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
  @js.native
  object PushNotificationType extends StObject {
    
    @js.native
    sealed trait badge
      extends StObject
         with PushNotificationType
    
    @js.native
    sealed trait raw
      extends StObject
         with PushNotificationType
    
    @js.native
    sealed trait tile
      extends StObject
         with PushNotificationType
    
    @js.native
    sealed trait toast
      extends StObject
         with PushNotificationType
  }
  
  trait IPushNotificationChannel extends StObject {
    
    def close(): Unit
    
    var expirationTime: Date
    
    var onpushnotificationreceived: js.Any
    
    var uri: String
  }
  object IPushNotificationChannel {
    
    @scala.inline
    def apply(close: () => Unit, expirationTime: Date, onpushnotificationreceived: js.Any, uri: String): IPushNotificationChannel = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), expirationTime = expirationTime.asInstanceOf[js.Any], onpushnotificationreceived = onpushnotificationreceived.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPushNotificationChannel]
    }
    
    @scala.inline
    implicit class IPushNotificationChannelMutableBuilder[Self <: IPushNotificationChannel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpirationTime(value: Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpushnotificationreceived(value: js.Any): Self = StObject.set(x, "onpushnotificationreceived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPushNotificationChannelManagerStatics extends StObject {
    
    def createPushNotificationChannelForApplicationAsync(): IAsyncOperation[PushNotificationChannel] = js.native
    def createPushNotificationChannelForApplicationAsync(applicationId: String): IAsyncOperation[PushNotificationChannel] = js.native
    
    def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IAsyncOperation[PushNotificationChannel] = js.native
  }
  
  trait IPushNotificationReceivedEventArgs extends StObject {
    
    var badgeNotification: BadgeNotification
    
    var cancel: Boolean
    
    var notificationType: PushNotificationType
    
    var rawNotification: RawNotification
    
    var tileNotification: TileNotification
    
    var toastNotification: ToastNotification
  }
  object IPushNotificationReceivedEventArgs {
    
    @scala.inline
    def apply(
      badgeNotification: BadgeNotification,
      cancel: Boolean,
      notificationType: PushNotificationType,
      rawNotification: RawNotification,
      tileNotification: TileNotification,
      toastNotification: ToastNotification
    ): IPushNotificationReceivedEventArgs = {
      val __obj = js.Dynamic.literal(badgeNotification = badgeNotification.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], rawNotification = rawNotification.asInstanceOf[js.Any], tileNotification = tileNotification.asInstanceOf[js.Any], toastNotification = toastNotification.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPushNotificationReceivedEventArgs]
    }
    
    @scala.inline
    implicit class IPushNotificationReceivedEventArgsMutableBuilder[Self <: IPushNotificationReceivedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadgeNotification(value: BadgeNotification): Self = StObject.set(x, "badgeNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationType(value: PushNotificationType): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawNotification(value: RawNotification): Self = StObject.set(x, "rawNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileNotification(value: TileNotification): Self = StObject.set(x, "tileNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastNotification(value: ToastNotification): Self = StObject.set(x, "toastNotification", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRawNotification extends StObject {
    
    var content: String
  }
  object IRawNotification {
    
    @scala.inline
    def apply(content: String): IRawNotification = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawNotification]
    }
    
    @scala.inline
    implicit class IRawNotificationMutableBuilder[Self <: IRawNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait PushNotificationChannel
    extends StObject
       with IPushNotificationChannel
  object PushNotificationChannel {
    
    @scala.inline
    def apply(close: () => Unit, expirationTime: Date, onpushnotificationreceived: js.Any, uri: String): PushNotificationChannel = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), expirationTime = expirationTime.asInstanceOf[js.Any], onpushnotificationreceived = onpushnotificationreceived.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushNotificationChannel]
    }
  }
  
  trait PushNotificationChannelManager extends StObject
  
  trait PushNotificationReceivedEventArgs
    extends StObject
       with IPushNotificationReceivedEventArgs
  object PushNotificationReceivedEventArgs {
    
    @scala.inline
    def apply(
      badgeNotification: BadgeNotification,
      cancel: Boolean,
      notificationType: PushNotificationType,
      rawNotification: RawNotification,
      tileNotification: TileNotification,
      toastNotification: ToastNotification
    ): PushNotificationReceivedEventArgs = {
      val __obj = js.Dynamic.literal(badgeNotification = badgeNotification.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], rawNotification = rawNotification.asInstanceOf[js.Any], tileNotification = tileNotification.asInstanceOf[js.Any], toastNotification = toastNotification.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushNotificationReceivedEventArgs]
    }
  }
  
  trait RawNotification
    extends StObject
       with IRawNotification
  object RawNotification {
    
    @scala.inline
    def apply(content: String): RawNotification = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawNotification]
    }
  }
}
