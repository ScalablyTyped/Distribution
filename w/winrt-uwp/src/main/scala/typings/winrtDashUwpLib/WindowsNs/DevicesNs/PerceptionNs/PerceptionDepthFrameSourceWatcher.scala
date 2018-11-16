package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Monitors changes to the list of depth frame sources, and provides notifications when the list changes. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher")
@js.native
abstract class PerceptionDepthFrameSourceWatcher () extends js.Object {
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known depth frame sources is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, _] = js.native
  /** Subscribes to the SourceAdded event. */
  @JSName("onsourceadded")
  var onsourceadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceAddedEventArgs] = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every depth frame source that is removed. */
  @JSName("onsourceremoved")
  var onsourceremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceRemovedEventArgs] = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listening for changes to the list of depth frame sources. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, _] = js.native
  /** Gets the operational status of the depth frame source watcher. */
  var status: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceAddedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceRemovedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, _]
  ): scala.Unit = js.native
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known depth frame sources is complete. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionDepthFrameSourceWatcher]): scala.Unit = js.native
  /** Subscribes to the SourceAdded event. */
  def onsourceadded(
    ev: PerceptionDepthFrameSourceAddedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionDepthFrameSourceWatcher]
  ): scala.Unit = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every depth frame source that is removed. */
  def onsourceremoved(
    ev: PerceptionDepthFrameSourceRemovedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionDepthFrameSourceWatcher]
  ): scala.Unit = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listening for changes to the list of depth frame sources. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionDepthFrameSourceWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceAddedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceRemovedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionDepthFrameSourceWatcher, _]
  ): scala.Unit = js.native
  /** When this method is called, the depth frame source watcher enumerates any existing depth frame sources it has not already enumerated by firing a SourceAdded event for each one. An EnumerationCompleted event is fired when this enumeration is complete. The depth frame source then starts watching for new depth frame sources. */
  def start(): scala.Unit = js.native
  /** When this method is called, the depth frame source watcher stops looking for changes to the depth frame source list. This operation is not immediate; the Stopped event will be triggered when the Stop operation is complete. */
  def stop(): scala.Unit = js.native
}

