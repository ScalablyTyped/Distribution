package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides events that fire during enumeration of users, when the collection of users changes, or when a user's authentication status changes. */
@JSGlobal("Windows.System.UserWatcher")
@js.native
abstract class UserWatcher () extends js.Object {
  /** Fires when a user is added to the collection of users returned by User.FindAllAsync . */
  @JSName("onadded")
  var onadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Fires when a user's authentication status has changed. */
  @JSName("onauthenticationstatuschanged")
  var onauthenticationstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Fires when a user's authentication status is about to change. */
  @JSName("onauthenticationstatuschanging")
  var onauthenticationstatuschanging_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserAuthenticationStatusChangingEventArgs] = js.native
  /** Fires when the initial pass of watcher events has been processed and the collection of users is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, _] = js.native
  /** Fires when a user is removed from the collection of users returned by User.FindAllAsync . */
  @JSName("onremoved")
  var onremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Fires when the user watcher has stopped. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, _] = js.native
  /** Fires when the data associated with a user has changed. */
  @JSName("onupdated")
  var onupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Gets the status of a user watcher. */
  var status: UserWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_authenticationstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.authenticationstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_authenticationstatuschanging(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.authenticationstatuschanging,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserAuthenticationStatusChangingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  /** Fires when a user is added to the collection of users returned by User.FindAllAsync . */
  def onadded(ev: UserChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[UserWatcher]): scala.Unit = js.native
  /** Fires when a user's authentication status has changed. */
  def onauthenticationstatuschanged(ev: UserChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[UserWatcher]): scala.Unit = js.native
  /** Fires when a user's authentication status is about to change. */
  def onauthenticationstatuschanging(
    ev: UserAuthenticationStatusChangingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[UserWatcher]
  ): scala.Unit = js.native
  /** Fires when the initial pass of watcher events has been processed and the collection of users is complete. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[UserWatcher]): scala.Unit = js.native
  /** Fires when a user is removed from the collection of users returned by User.FindAllAsync . */
  def onremoved(ev: UserChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[UserWatcher]): scala.Unit = js.native
  /** Fires when the user watcher has stopped. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[UserWatcher]): scala.Unit = js.native
  /** Fires when the data associated with a user has changed. */
  def onupdated(ev: UserChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[UserWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_authenticationstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.authenticationstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_authenticationstatuschanging(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.authenticationstatuschanging,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserAuthenticationStatusChangingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): scala.Unit = js.native
  /** Starts the user watcher. */
  def start(): scala.Unit = js.native
  /** Stops the user watcher. */
  def stop(): scala.Unit = js.native
}

