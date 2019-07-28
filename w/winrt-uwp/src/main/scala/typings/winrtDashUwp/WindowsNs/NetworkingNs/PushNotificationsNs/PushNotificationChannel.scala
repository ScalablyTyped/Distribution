package typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.pushnotificationreceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a delivery vehicle and addressing mechanism for push notifications. The channel Uniform Resource Identifier (URI) represented by this interface is used by a third-party application server to communicate with the Windows Push Notification Services (WNS). The push notification channel is used by the client to intercept notifications. */
@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannel")
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

