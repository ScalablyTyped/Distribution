package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a delivery vehicle and addressing mechanism for push notifications. The channel Uniform Resource Identifier (URI) represented by this interface is used by a third-party application server to communicate with the Windows Push Notification Services (WNS). The push notification channel is used by the client to intercept notifications. */
@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannel")
@js.native
abstract class PushNotificationChannel () extends js.Object {
  /** Gets the time at which the channel expires. Notifications sent to this channel after this time are rejected. */
  var expirationTime: stdLib.Date = js.native
  /** Fires when a push notification has arrived on this channel. */
  @JSName("onpushnotificationreceived")
  var onpushnotificationreceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs] = js.native
  /** Gets the Uniform Resource Identifier (URI) to which an app server sends a push notification intended for an application or secondary tile bound to this channel. This URI is transmitted to and stored by the third-party app server. */
  var uri: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pushnotificationreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pushnotificationreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs]
  ): scala.Unit = js.native
  /** Explicitly invalidates this channel. Any notifications pushed to this channel after this method is called are not delivered. */
  def close(): scala.Unit = js.native
  /** Fires when a push notification has arrived on this channel. */
  def onpushnotificationreceived(
    ev: PushNotificationReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PushNotificationChannel]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pushnotificationreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pushnotificationreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs]
  ): scala.Unit = js.native
}

