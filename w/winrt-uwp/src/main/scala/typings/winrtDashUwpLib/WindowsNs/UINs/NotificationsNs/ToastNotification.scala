package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the content, associated metadata and events, and expiration time of a toast notification. */
@JSGlobal("Windows.UI.Notifications.ToastNotification")
@js.native
class ToastNotification protected () extends js.Object {
  /**
                   * Creates and initializes a new instance of the ToastNotification .
                   * @param content The XML content that defines the toast notification.
                   */
  def this(content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument) = this()
  /** Gets the XML that defines the current toast notification. */
  var content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /** Gets or sets the time after which a toast notification should not be displayed. */
  var expirationTime: stdLib.Date = js.native
  /** Gets or sets the group identifier for the notification. */
  var group: java.lang.String = js.native
  /** Occurs when user activates a toast notification through a click or touch. Apps that are running subscribe to this event. */
  @JSName("onactivated")
  var onactivated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, _] = js.native
  /** Occurs when a toast notification leaves the screen, either by expiring or being explicitly dismissed by the user. Apps that are running subscribe to this event. */
  @JSName("ondismissed")
  var ondismissed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, ToastDismissedEventArgs] = js.native
  /** Occurs when an error is caused when Windows attempts to raise a toast notification. Apps that are running subscribe to this event. */
  @JSName("onfailed")
  var onfailed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, ToastFailedEventArgs] = js.native
  /** Gets or sets whether a toast's pop-up UI is displayed on the Windows Phone 8.1 screen. */
  var suppressPopup: scala.Boolean = js.native
  /** Gets or sets the unique identifier of this notification within the notification Group . */
  var tag: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, ToastDismissedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_failed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.failed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, ToastFailedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when user activates a toast notification through a click or touch. Apps that are running subscribe to this event. */
  def onactivated(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[ToastNotification]): scala.Unit = js.native
  /** Occurs when a toast notification leaves the screen, either by expiring or being explicitly dismissed by the user. Apps that are running subscribe to this event. */
  def ondismissed(ev: ToastDismissedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ToastNotification]): scala.Unit = js.native
  /** Occurs when an error is caused when Windows attempts to raise a toast notification. Apps that are running subscribe to this event. */
  def onfailed(ev: ToastFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ToastNotification]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, ToastDismissedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_failed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.failed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ToastNotification, ToastFailedEventArgs]
  ): scala.Unit = js.native
}

