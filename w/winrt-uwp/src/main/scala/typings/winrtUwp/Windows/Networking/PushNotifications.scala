package typings.winrtUwp.Windows.Networking

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.UI.Notifications.BadgeNotification
import typings.winrtUwp.Windows.UI.Notifications.TileNotification
import typings.winrtUwp.Windows.UI.Notifications.ToastNotification
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.pushnotificationreceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes and interfaces that encapsulate push notifications. */
@JSGlobal("Windows.Networking.PushNotifications")
@js.native
object PushNotifications extends js.Object {
  /** Represents a delivery vehicle and addressing mechanism for push notifications. The channel Uniform Resource Identifier (URI) represented by this interface is used by a third-party application server to communicate with the Windows Push Notification Services (WNS). The push notification channel is used by the client to intercept notifications. */
  @js.native
  abstract class PushNotificationChannel () extends js.Object {
    /** Gets the time at which the channel expires. Notifications sent to this channel after this time are rejected. */
    var expirationTime: Date = js.native
    /** Fires when a push notification has arrived on this channel. */
    @JSName("onpushnotificationreceived")
    var onpushnotificationreceived_Original: TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs] = js.native
    /** Gets the Uniform Resource Identifier (URI) to which an app server sends a push notification intended for an application or secondary tile bound to this channel. This URI is transmitted to and stored by the third-party app server. */
    var uri: String = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pushnotificationreceived(
      `type`: pushnotificationreceived,
      listener: TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs]
    ): Unit = js.native
    /** Explicitly invalidates this channel. Any notifications pushed to this channel after this method is called are not delivered. */
    def close(): Unit = js.native
    /** Fires when a push notification has arrived on this channel. */
    def onpushnotificationreceived(ev: PushNotificationReceivedEventArgs with WinRTEvent[PushNotificationChannel]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pushnotificationreceived(
      `type`: pushnotificationreceived,
      listener: TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs]
    ): Unit = js.native
  }
  
  /** Creates objects that you use to retrieve push notification channels from the Windows Push Notification Services (WNS). These channels are bound to an app or secondary tile . */
  @js.native
  abstract class PushNotificationChannelManager () extends js.Object
  
  /** Encapsulates a push notification that has been received from the app server, identifying the type and supplying the content of the notification. Windows passes this information in the PushNotificationReceived event. */
  @js.native
  abstract class PushNotificationReceivedEventArgs () extends js.Object {
    /** Gets the content of a badge update to perform in response to this push notification. */
    var badgeNotification: BadgeNotification = js.native
    /** Gets or sets whether Windows should perform its default handling of the notification. */
    var cancel: Boolean = js.native
    /** Gets the type of push notification that has been received from the app server. */
    var notificationType: PushNotificationType = js.native
    var rawNotification: js.Any = js.native
     /* unmapped type */ /** Gets the content of a tile update to perform in response to this push notification. */
    var tileNotification: TileNotification = js.native
    /** Gets the content of a toast to display in response to this push notification. */
    var toastNotification: ToastNotification = js.native
  }
  
  @js.native
  sealed trait PushNotificationType extends js.Object
  
  /** Encapsulates the app-defined content of a raw notification (a push notification that does not involve UI). Its contents can be used in an app's background task, if the app has that capability, or otherwise consumed by the app and acted on as needed. */
  @js.native
  abstract class RawNotification () extends js.Object {
    /** Gets the content of the raw notification as a string. This string specifies a background task associated with the app. */
    var content: String = js.native
  }
  
  /* static members */
  @js.native
  object PushNotificationChannelManager extends js.Object {
    /**
      * Creates an object, bound to the calling app, through which you retrieve a push notification channel from Windows Push Notification Services (WNS).
      * @return The object, bound to the calling app, that is used to request a PushNotificationChannel from the WNS.
      */
    def createPushNotificationChannelForApplicationAsync(): IPromiseWithIAsyncOperation[PushNotificationChannel] = js.native
    /**
      * Creates an object, bound to a specified app, through which you retrieve a push notification channel from Windows Push Notification Services (WNS). The specified app must be in the same package as the calling app.
      * @param applicationId The Package Relative Application ID (PRAID) of the app to bind to the push notification channel.
      * @return The object, bound to the app specified in applicationId, that is used to request a PushNotificationChannel from the WNS.
      */
    def createPushNotificationChannelForApplicationAsync(applicationId: String): IPromiseWithIAsyncOperation[PushNotificationChannel] = js.native
    /**
      * Creates an object, bound to a secondary tile , through which you retrieve a push notification channel from Windows Push Notification Services (WNS). The tile can be a secondary tile of the calling app or any other app in the same package.
      * @param tileId The ID of the secondary tile to bind to the push notification channel.
      * @return The object, bound to the secondary tile, that is used to request a PushNotificationChannel from the WNS.
      */
    def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IPromiseWithIAsyncOperation[PushNotificationChannel] = js.native
  }
  
  /** The type of push notification that has been received from the app server. Used by the NotificationType property. */
  @js.native
  object PushNotificationType extends js.Object {
    /** A push notification to update a tile's badge overlay. */
    @js.native
    sealed trait badge extends PushNotificationType
    
    /** A push notification to perform an update to a tile that does not involve UI. */
    @js.native
    sealed trait raw extends PushNotificationType
    
    /** A push notification to update one or more elements of a tile. */
    @js.native
    sealed trait tile extends PushNotificationType
    
    /** A push notification to update an app's tile flyout. */
    @js.native
    sealed trait tileFlyout extends PushNotificationType
    
    /** A push notification to display as toast. */
    @js.native
    sealed trait toast extends PushNotificationType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PushNotificationType with Double] = js.native
    /* 2 */ @js.native
    object badge extends TopLevel[badge with Double]
    
    /* 3 */ @js.native
    object raw extends TopLevel[raw with Double]
    
    /* 1 */ @js.native
    object tile extends TopLevel[tile with Double]
    
    /* 4 */ @js.native
    object tileFlyout extends TopLevel[tileFlyout with Double]
    
    /* 0 */ @js.native
    object toast extends TopLevel[toast with Double]
    
  }
  
}

