package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enumerates devices dynamically, so that the app receives notifications if devices are added, removed, or changed after the initial enumeration is complete. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcher")
@js.native
abstract class DeviceWatcher () extends js.Object {
  /** Event that is raised when a device is added to the collection enumerated by the DeviceWatcher . */
  @JSName("onadded")
  var onadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformation] = js.native
  /** Event that is raised when the enumeration of devices completes. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, _] = js.native
  /** Event that is raised when a device is removed from the collection of enumerated devices. */
  @JSName("onremoved")
  var onremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformationUpdate] = js.native
  /** Event that is raised when the enumeration operation has been stopped. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, _] = js.native
  /** Event that is raised when a device is updated in the collection of enumerated devices. */
  @JSName("onupdated")
  var onupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformationUpdate] = js.native
  /** The status of the DeviceWatcher . */
  var status: DeviceWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformation]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]
  ): scala.Unit = js.native
  /**
    * Gets a DeviceWatcherTrigger object monitoring for changes to the list of devices.
    * @param requestedEventKinds A list of the specific updates you want to monitor.
    * @return The watcher trigger to monitor for the specified changes.
    */
  def getBackgroundTrigger(
    requestedEventKinds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[DeviceWatcherEventKind]
  ): winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceWatcherTrigger = js.native
  /** Event that is raised when a device is added to the collection enumerated by the DeviceWatcher . */
  def onadded(ev: DeviceInformation with winrtDashUwpLib.WindowsNs.WinRTEvent[DeviceWatcher]): scala.Unit = js.native
  /** Event that is raised when the enumeration of devices completes. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DeviceWatcher]): scala.Unit = js.native
  /** Event that is raised when a device is removed from the collection of enumerated devices. */
  def onremoved(ev: DeviceInformationUpdate with winrtDashUwpLib.WindowsNs.WinRTEvent[DeviceWatcher]): scala.Unit = js.native
  /** Event that is raised when the enumeration operation has been stopped. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DeviceWatcher]): scala.Unit = js.native
  /** Event that is raised when a device is updated in the collection of enumerated devices. */
  def onupdated(ev: DeviceInformationUpdate with winrtDashUwpLib.WindowsNs.WinRTEvent[DeviceWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformation]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]
  ): scala.Unit = js.native
  /** Starts a search for devices, and subscribes to device enumeration events. */
  def start(): scala.Unit = js.native
  /** Stop raising the events that add, update and remove enumeration results. */
  def stop(): scala.Unit = js.native
}

