package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Watches for activity related to the discovery of remote systems and raises the appropriate events. */
trait RemoteSystemWatcher extends StObject {
  
  /** This event is raised when the initial remote system discovery process completes. */
  def onenumerationcompleted(ev: RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** This event is raised when the initial remote system discovery process completes. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemEnumerationCompletedEventArgs]
  
  /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
  def onerroroccured(ev: RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
  @JSName("onerroroccured")
  var onerroroccured_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemWatcherErrorOccurredEventArgs]
  
  /** The event that is raised when a new remote system (device) is discovered. */
  def onremotesystemadded(ev: RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** The event that is raised when a new remote system (device) is discovered. */
  @JSName("onremotesystemadded")
  var onremotesystemadded_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemAddedEventArgs]
  
  /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
  def onremotesystemremoved(ev: RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
  @JSName("onremotesystemremoved")
  var onremotesystemremoved_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemRemovedEventArgs]
  
  /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
  def onremotesystemupdated(ev: RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
  @JSName("onremotesystemupdated")
  var onremotesystemupdated_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemUpdatedEventArgs]
  
  /** Starts watching for discoverable remote systems. The discovery process runs until the Stop method is called or an error occurs. A RemoteSystemWatcher object can have its Start method called again at a later time. */
  def start(): Unit
  
  /** Stops watching for discoverable remote systems. */
  def stop(): Unit
}
object RemoteSystemWatcher {
  
  inline def apply(
    onenumerationcompleted: /* ev */ RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit,
    onerroroccured: /* ev */ RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit,
    onremotesystemadded: /* ev */ RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit,
    onremotesystemremoved: /* ev */ RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit,
    onremotesystemupdated: /* ev */ RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit,
    start: () => Unit,
    stop: () => Unit
  ): RemoteSystemWatcher = {
    val __obj = js.Dynamic.literal(onenumerationcompleted = js.Any.fromFunction1(onenumerationcompleted), onerroroccured = js.Any.fromFunction1(onerroroccured), onremotesystemadded = js.Any.fromFunction1(onremotesystemadded), onremotesystemremoved = js.Any.fromFunction1(onremotesystemremoved), onremotesystemupdated = js.Any.fromFunction1(onremotesystemupdated), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RemoteSystemWatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteSystemWatcher] (val x: Self) extends AnyVal {
    
    inline def setOnenumerationcompleted(
      value: /* ev */ RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit
    ): Self = StObject.set(x, "onenumerationcompleted", js.Any.fromFunction1(value))
    
    inline def setOnerroroccured(
      value: /* ev */ RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit
    ): Self = StObject.set(x, "onerroroccured", js.Any.fromFunction1(value))
    
    inline def setOnremotesystemadded(value: /* ev */ RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit): Self = StObject.set(x, "onremotesystemadded", js.Any.fromFunction1(value))
    
    inline def setOnremotesystemremoved(value: /* ev */ RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit): Self = StObject.set(x, "onremotesystemremoved", js.Any.fromFunction1(value))
    
    inline def setOnremotesystemupdated(value: /* ev */ RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher] => Unit): Self = StObject.set(x, "onremotesystemupdated", js.Any.fromFunction1(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
