package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Watches for activity related to the discovery of remote systems and raises the appropriate events. */
@js.native
trait RemoteSystemWatcher extends StObject {
  
  /** This event is raised when the initial remote system discovery process completes. */
  def onenumerationcompleted(ev: RemoteSystemEnumerationCompletedEventArgs with WinRTEvent[RemoteSystemWatcher]): Unit = js.native
  /** This event is raised when the initial remote system discovery process completes. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemEnumerationCompletedEventArgs] = js.native
  
  /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
  def onerroroccured(ev: RemoteSystemWatcherErrorOccurredEventArgs with WinRTEvent[RemoteSystemWatcher]): Unit = js.native
  /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
  @JSName("onerroroccured")
  var onerroroccured_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemWatcherErrorOccurredEventArgs] = js.native
  
  /** The event that is raised when a new remote system (device) is discovered. */
  def onremotesystemadded(ev: RemoteSystemAddedEventArgs with WinRTEvent[RemoteSystemWatcher]): Unit = js.native
  /** The event that is raised when a new remote system (device) is discovered. */
  @JSName("onremotesystemadded")
  var onremotesystemadded_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemAddedEventArgs] = js.native
  
  /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
  def onremotesystemremoved(ev: RemoteSystemRemovedEventArgs with WinRTEvent[RemoteSystemWatcher]): Unit = js.native
  /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
  @JSName("onremotesystemremoved")
  var onremotesystemremoved_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemRemovedEventArgs] = js.native
  
  /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
  def onremotesystemupdated(ev: RemoteSystemUpdatedEventArgs with WinRTEvent[RemoteSystemWatcher]): Unit = js.native
  /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
  @JSName("onremotesystemupdated")
  var onremotesystemupdated_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemUpdatedEventArgs] = js.native
  
  /** Starts watching for discoverable remote systems. The discovery process runs until the Stop method is called or an error occurs. A RemoteSystemWatcher object can have its Start method called again at a later time. */
  def start(): Unit = js.native
  
  /** Stops watching for discoverable remote systems. */
  def stop(): Unit = js.native
}
