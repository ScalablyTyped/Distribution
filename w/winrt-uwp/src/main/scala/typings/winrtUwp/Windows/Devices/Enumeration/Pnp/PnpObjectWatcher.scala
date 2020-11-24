package typings.winrtUwp.Windows.Devices.Enumeration.Pnp

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherStatus
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.added
import typings.winrtUwp.winrtUwpStrings.enumerationcompleted
import typings.winrtUwp.winrtUwpStrings.removed
import typings.winrtUwp.winrtUwpStrings.stopped
import typings.winrtUwp.winrtUwpStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Raises events to notify the client that a PnpObject has been added, updated, or removed from an enumerated collection of Pnp device objects in an incremental and asynchronous way. */
@js.native
trait PnpObjectWatcher extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(`type`: added, listener: TypedEventHandler[PnpObjectWatcher, PnpObject]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(`type`: removed, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(`type`: updated, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
  
  /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
  def onadded(ev: PnpObject with WinRTEvent[PnpObjectWatcher]): Unit = js.native
  /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
  @JSName("onadded")
  var onadded_Original: TypedEventHandler[PnpObjectWatcher, PnpObject] = js.native
  
  /** Occurs when the enumeration of Pnp device objects has been completed. */
  def onenumerationcompleted(ev: js.Any with WinRTEvent[PnpObjectWatcher]): Unit = js.native
  /** Occurs when the enumeration of Pnp device objects has been completed. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[PnpObjectWatcher, _] = js.native
  
  /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
  def onremoved(ev: PnpObjectUpdate with WinRTEvent[PnpObjectWatcher]): Unit = js.native
  /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
  @JSName("onremoved")
  var onremoved_Original: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
  
  /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
  def onstopped(ev: js.Any with WinRTEvent[PnpObjectWatcher]): Unit = js.native
  /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[PnpObjectWatcher, _] = js.native
  
  /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
  def onupdated(ev: PnpObjectUpdate with WinRTEvent[PnpObjectWatcher]): Unit = js.native
  /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
  @JSName("onupdated")
  var onupdated_Original: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(`type`: added, listener: TypedEventHandler[PnpObjectWatcher, PnpObject]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(`type`: removed, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(`type`: updated, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
  
  /** Starts raising the events to inform the client that a PnpObject has been added, updated, or removed. */
  def start(): Unit = js.native
  
  /** The status associated with the asynchronous operation. */
  var status: DeviceWatcherStatus = js.native
  
  /** Stops raising the events to inform the client that a PnpObject has been added, updated, or removed. */
  def stop(): Unit = js.native
}
