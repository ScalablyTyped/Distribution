package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.added
import typings.winrtUwp.winrtUwpStrings.enumerationcompleted
import typings.winrtUwp.winrtUwpStrings.removed
import typings.winrtUwp.winrtUwpStrings.stopped
import typings.winrtUwp.winrtUwpStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Dynamically discovers peer apps within wireless range. */
@js.native
trait PeerWatcher extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(`type`: added, listener: TypedEventHandler[PeerWatcher, PeerInformation]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PeerWatcher, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(`type`: removed, listener: TypedEventHandler[PeerWatcher, PeerInformation]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PeerWatcher, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(`type`: updated, listener: TypedEventHandler[PeerWatcher, PeerInformation]): Unit = js.native
  
  /** Occurs when a peer app is found within wireless range. */
  def onadded(ev: PeerInformation & WinRTEvent[PeerWatcher]): Unit = js.native
  /** Occurs when a peer app is found within wireless range. */
  @JSName("onadded")
  var onadded_Original: TypedEventHandler[PeerWatcher, PeerInformation] = js.native
  
  /** Occurs after a scan operation is complete and all peer apps within wireless range have been found. */
  def onenumerationcompleted(ev: Any & WinRTEvent[PeerWatcher]): Unit = js.native
  /** Occurs after a scan operation is complete and all peer apps within wireless range have been found. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[PeerWatcher, Any] = js.native
  
  /** Occurs when a peer app is no longer within wireless range. */
  def onremoved(ev: PeerInformation & WinRTEvent[PeerWatcher]): Unit = js.native
  /** Occurs when a peer app is no longer within wireless range. */
  @JSName("onremoved")
  var onremoved_Original: TypedEventHandler[PeerWatcher, PeerInformation] = js.native
  
  /** Occurs when the PeerWatcher object has been stopped. */
  def onstopped(ev: Any & WinRTEvent[PeerWatcher]): Unit = js.native
  /** Occurs when the PeerWatcher object has been stopped. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[PeerWatcher, Any] = js.native
  
  /** Occurs when the DisplayName or DiscoveryData for a peer app within wireless range has changed. */
  def onupdated(ev: PeerInformation & WinRTEvent[PeerWatcher]): Unit = js.native
  /** Occurs when the DisplayName or DiscoveryData for a peer app within wireless range has changed. */
  @JSName("onupdated")
  var onupdated_Original: TypedEventHandler[PeerWatcher, PeerInformation] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(`type`: added, listener: TypedEventHandler[PeerWatcher, PeerInformation]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PeerWatcher, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(`type`: removed, listener: TypedEventHandler[PeerWatcher, PeerInformation]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PeerWatcher, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(`type`: updated, listener: TypedEventHandler[PeerWatcher, PeerInformation]): Unit = js.native
  
  /** Begin dynamically searching for peer apps within wireless range. */
  def start(): Unit = js.native
  
  /** Gets the current state of the PeerWatcher object. */
  var status: PeerWatcherStatus = js.native
  
  /** Stop dynamically searching for peer apps within wireless range. */
  def stop(): Unit = js.native
}
