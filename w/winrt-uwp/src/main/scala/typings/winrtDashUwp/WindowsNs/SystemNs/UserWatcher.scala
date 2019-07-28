package typings.winrtDashUwp.WindowsNs.SystemNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.added
import typings.winrtDashUwp.winrtDashUwpStrings.authenticationstatuschanged
import typings.winrtDashUwp.winrtDashUwpStrings.authenticationstatuschanging
import typings.winrtDashUwp.winrtDashUwpStrings.enumerationcompleted
import typings.winrtDashUwp.winrtDashUwpStrings.removed
import typings.winrtDashUwp.winrtDashUwpStrings.stopped
import typings.winrtDashUwp.winrtDashUwpStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides events that fire during enumeration of users, when the collection of users changes, or when a user's authentication status changes. */
@JSGlobal("Windows.System.UserWatcher")
@js.native
abstract class UserWatcher () extends js.Object {
  /** Fires when a user is added to the collection of users returned by User.FindAllAsync . */
  @JSName("onadded")
  var onadded_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Fires when a user's authentication status has changed. */
  @JSName("onauthenticationstatuschanged")
  var onauthenticationstatuschanged_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Fires when a user's authentication status is about to change. */
  @JSName("onauthenticationstatuschanging")
  var onauthenticationstatuschanging_Original: TypedEventHandler[UserWatcher, UserAuthenticationStatusChangingEventArgs] = js.native
  /** Fires when the initial pass of watcher events has been processed and the collection of users is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[UserWatcher, _] = js.native
  /** Fires when a user is removed from the collection of users returned by User.FindAllAsync . */
  @JSName("onremoved")
  var onremoved_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Fires when the user watcher has stopped. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[UserWatcher, _] = js.native
  /** Fires when the data associated with a user has changed. */
  @JSName("onupdated")
  var onupdated_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  /** Gets the status of a user watcher. */
  var status: UserWatcherStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(`type`: added, listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_authenticationstatuschanged(
    `type`: authenticationstatuschanged,
    listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_authenticationstatuschanging(
    `type`: authenticationstatuschanging,
    listener: TypedEventHandler[UserWatcher, UserAuthenticationStatusChangingEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[UserWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(`type`: removed, listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[UserWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(`type`: updated, listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]): Unit = js.native
  /** Fires when a user is added to the collection of users returned by User.FindAllAsync . */
  def onadded(ev: UserChangedEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when a user's authentication status has changed. */
  def onauthenticationstatuschanged(ev: UserChangedEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when a user's authentication status is about to change. */
  def onauthenticationstatuschanging(ev: UserAuthenticationStatusChangingEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when the initial pass of watcher events has been processed and the collection of users is complete. */
  def onenumerationcompleted(ev: js.Any with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when a user is removed from the collection of users returned by User.FindAllAsync . */
  def onremoved(ev: UserChangedEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when the user watcher has stopped. */
  def onstopped(ev: js.Any with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when the data associated with a user has changed. */
  def onupdated(ev: UserChangedEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(`type`: added, listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_authenticationstatuschanged(
    `type`: authenticationstatuschanged,
    listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_authenticationstatuschanging(
    `type`: authenticationstatuschanging,
    listener: TypedEventHandler[UserWatcher, UserAuthenticationStatusChangingEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[UserWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(`type`: removed, listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[UserWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(`type`: updated, listener: TypedEventHandler[UserWatcher, UserChangedEventArgs]): Unit = js.native
  /** Starts the user watcher. */
  def start(): Unit = js.native
  /** Stops the user watcher. */
  def stop(): Unit = js.native
}

