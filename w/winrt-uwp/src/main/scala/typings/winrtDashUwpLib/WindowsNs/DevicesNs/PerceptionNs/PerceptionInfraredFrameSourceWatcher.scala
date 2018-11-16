package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Monitors changes to the list of infrared frame sources, and provides notifications when the list changes. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSourceWatcher")
@js.native
abstract class PerceptionInfraredFrameSourceWatcher () extends js.Object {
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known infrared frame sources is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _] = js.native
  /** Subscribes to the SourceAdded event. */
  @JSName("onsourceadded")
  var onsourceadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, PerceptionInfraredFrameSourceAddedEventArgs] = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every infrared frame source that is removed. */
  @JSName("onsourceremoved")
  var onsourceremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    PerceptionInfraredFrameSourceWatcher, 
    PerceptionInfraredFrameSourceRemovedEventArgs
  ] = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listeningfor changes to the list of infrared frame sources. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _] = js.native
  /** Gets the operational status of the infrared frame source watcher. */
  var status: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, PerceptionInfraredFrameSourceAddedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      PerceptionInfraredFrameSourceWatcher, 
      PerceptionInfraredFrameSourceRemovedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]
  ): scala.Unit = js.native
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known infrared frame sources is complete. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSourceWatcher]): scala.Unit = js.native
  /** Subscribes to the SourceAdded event. */
  def onsourceadded(
    ev: PerceptionInfraredFrameSourceAddedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSourceWatcher]
  ): scala.Unit = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every infrared frame source that is removed. */
  def onsourceremoved(
    ev: PerceptionInfraredFrameSourceRemovedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSourceWatcher]
  ): scala.Unit = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listeningfor changes to the list of infrared frame sources. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSourceWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, PerceptionInfraredFrameSourceAddedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      PerceptionInfraredFrameSourceWatcher, 
      PerceptionInfraredFrameSourceRemovedEventArgs
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]
  ): scala.Unit = js.native
  /** When this method is called, the infrared frame source watcher enumerates any existing infrared frame sources it has not already enumerated by firing a SourceAdded event for each one. An EnumerationCompleted event is fired when this enumeration is complete. The infrared frame source then starts watching for new infrared frame sources. */
  def start(): scala.Unit = js.native
  /** When this method is called, the infrared frame source watcher stops looking for changes to the infrared frame source list. This operation is not immediate; the Stopped event will be triggered when the Stop operation is complete. */
  def stop(): scala.Unit = js.native
}

