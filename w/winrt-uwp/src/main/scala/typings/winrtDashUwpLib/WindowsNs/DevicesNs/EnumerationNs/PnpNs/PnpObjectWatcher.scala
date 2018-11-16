package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Raises events to notify the client that a PnpObject has been added, updated, or removed from an enumerated collection of Pnp device objects in an incremental and asynchronous way. */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectWatcher")
@js.native
abstract class PnpObjectWatcher () extends js.Object {
  /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
  @JSName("onadded")
  var onadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObject] = js.native
  /** Occurs when the enumeration of Pnp device objects has been completed. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, _] = js.native
  /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
  @JSName("onremoved")
  var onremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
  /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, _] = js.native
  /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
  @JSName("onupdated")
  var onupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
  /** The status associated with the asynchronous operation. */
  var status: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObject]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]
  ): scala.Unit = js.native
  /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
  def onadded(ev: PnpObject with winrtDashUwpLib.WindowsNs.WinRTEvent[PnpObjectWatcher]): scala.Unit = js.native
  /** Occurs when the enumeration of Pnp device objects has been completed. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PnpObjectWatcher]): scala.Unit = js.native
  /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
  def onremoved(ev: PnpObjectUpdate with winrtDashUwpLib.WindowsNs.WinRTEvent[PnpObjectWatcher]): scala.Unit = js.native
  /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PnpObjectWatcher]): scala.Unit = js.native
  /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
  def onupdated(ev: PnpObjectUpdate with winrtDashUwpLib.WindowsNs.WinRTEvent[PnpObjectWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObject]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]
  ): scala.Unit = js.native
  /** Starts raising the events to inform the client that a PnpObject has been added, updated, or removed. */
  def start(): scala.Unit = js.native
  /** Stops raising the events to inform the client that a PnpObject has been added, updated, or removed. */
  def stop(): scala.Unit = js.native
}

