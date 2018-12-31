package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates objects that you use to retrieve push notification channels from the Windows Push Notification Services (WNS). These channels are bound to an app or secondary tile . */
@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
@js.native
abstract class PushNotificationChannelManager () extends js.Object

/** Creates objects that you use to retrieve push notification channels from the Windows Push Notification Services (WNS). These channels are bound to an app or secondary tile . */
@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
@js.native
object PushNotificationChannelManager extends js.Object {
  /**
    * Creates an object, bound to the calling app, through which you retrieve a push notification channel from Windows Push Notification Services (WNS).
    * @return The object, bound to the calling app, that is used to request a PushNotificationChannel from the WNS.
    */
  def createPushNotificationChannelForApplicationAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationChannel
  ] = js.native
  /**
    * Creates an object, bound to a specified app, through which you retrieve a push notification channel from Windows Push Notification Services (WNS). The specified app must be in the same package as the calling app.
    * @param applicationId The Package Relative Application ID (PRAID) of the app to bind to the push notification channel.
    * @return The object, bound to the app specified in applicationId, that is used to request a PushNotificationChannel from the WNS.
    */
  def createPushNotificationChannelForApplicationAsync(applicationId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationChannel
  ] = js.native
  /**
    * Creates an object, bound to a secondary tile , through which you retrieve a push notification channel from Windows Push Notification Services (WNS). The tile can be a secondary tile of the calling app or any other app in the same package.
    * @param tileId The ID of the secondary tile to bind to the push notification channel.
    * @return The object, bound to the secondary tile, that is used to request a PushNotificationChannel from the WNS.
    */
  def createPushNotificationChannelForSecondaryTileAsync(tileId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationChannel
  ] = js.native
}

