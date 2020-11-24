package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.added
import typings.winrtUwp.winrtUwpStrings.authenticationstatuschanged
import typings.winrtUwp.winrtUwpStrings.authenticationstatuschanging
import typings.winrtUwp.winrtUwpStrings.enumerationcompleted
import typings.winrtUwp.winrtUwpStrings.removed
import typings.winrtUwp.winrtUwpStrings.stopped
import typings.winrtUwp.winrtUwpStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides events that fire during enumeration of users, when the collection of users changes, or when a user's authentication status changes. */
@js.native
trait UserWatcher extends js.Object {
  
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
  /** Fires when a user is added to the collection of users returned by User.FindAllAsync . */
  @JSName("onadded")
  var onadded_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  
  /** Fires when a user's authentication status has changed. */
  def onauthenticationstatuschanged(ev: UserChangedEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when a user's authentication status has changed. */
  @JSName("onauthenticationstatuschanged")
  var onauthenticationstatuschanged_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  
  /** Fires when a user's authentication status is about to change. */
  def onauthenticationstatuschanging(ev: UserAuthenticationStatusChangingEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when a user's authentication status is about to change. */
  @JSName("onauthenticationstatuschanging")
  var onauthenticationstatuschanging_Original: TypedEventHandler[UserWatcher, UserAuthenticationStatusChangingEventArgs] = js.native
  
  /** Fires when the initial pass of watcher events has been processed and the collection of users is complete. */
  def onenumerationcompleted(ev: js.Any with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when the initial pass of watcher events has been processed and the collection of users is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[UserWatcher, _] = js.native
  
  /** Fires when a user is removed from the collection of users returned by User.FindAllAsync . */
  def onremoved(ev: UserChangedEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when a user is removed from the collection of users returned by User.FindAllAsync . */
  @JSName("onremoved")
  var onremoved_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  
  /** Fires when the user watcher has stopped. */
  def onstopped(ev: js.Any with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when the user watcher has stopped. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[UserWatcher, _] = js.native
  
  /** Fires when the data associated with a user has changed. */
  def onupdated(ev: UserChangedEventArgs with WinRTEvent[UserWatcher]): Unit = js.native
  /** Fires when the data associated with a user has changed. */
  @JSName("onupdated")
  var onupdated_Original: TypedEventHandler[UserWatcher, UserChangedEventArgs] = js.native
  
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
  
  /** Gets the status of a user watcher. */
  var status: UserWatcherStatus = js.native
  
  /** Stops the user watcher. */
  def stop(): Unit = js.native
}
