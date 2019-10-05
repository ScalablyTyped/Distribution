package typings.winrtDashUwp.Windows.Devices.Perception

import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherStatus
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.enumerationcompleted
import typings.winrtDashUwp.winrtDashUwpStrings.sourceadded
import typings.winrtDashUwp.winrtDashUwpStrings.sourceremoved
import typings.winrtDashUwp.winrtDashUwpStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Monitors changes to the list of infrared frame sources, and provides notifications when the list changes. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSourceWatcher")
@js.native
abstract class PerceptionInfraredFrameSourceWatcher () extends js.Object {
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known infrared frame sources is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _] = js.native
  /** Subscribes to the SourceAdded event. */
  @JSName("onsourceadded")
  var onsourceadded_Original: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, PerceptionInfraredFrameSourceAddedEventArgs] = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every infrared frame source that is removed. */
  @JSName("onsourceremoved")
  var onsourceremoved_Original: TypedEventHandler[
    PerceptionInfraredFrameSourceWatcher, 
    PerceptionInfraredFrameSourceRemovedEventArgs
  ] = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listeningfor changes to the list of infrared frame sources. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _] = js.native
  /** Gets the operational status of the infrared frame source watcher. */
  var status: DeviceWatcherStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceadded(
    `type`: sourceadded,
    listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, PerceptionInfraredFrameSourceAddedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceremoved(
    `type`: sourceremoved,
    listener: TypedEventHandler[
      PerceptionInfraredFrameSourceWatcher, 
      PerceptionInfraredFrameSourceRemovedEventArgs
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]): Unit = js.native
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known infrared frame sources is complete. */
  def onenumerationcompleted(ev: js.Any with WinRTEvent[PerceptionInfraredFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the SourceAdded event. */
  def onsourceadded(
    ev: PerceptionInfraredFrameSourceAddedEventArgs with WinRTEvent[PerceptionInfraredFrameSourceWatcher]
  ): Unit = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every infrared frame source that is removed. */
  def onsourceremoved(
    ev: PerceptionInfraredFrameSourceRemovedEventArgs with WinRTEvent[PerceptionInfraredFrameSourceWatcher]
  ): Unit = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listeningfor changes to the list of infrared frame sources. */
  def onstopped(ev: js.Any with WinRTEvent[PerceptionInfraredFrameSourceWatcher]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceadded(
    `type`: sourceadded,
    listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, PerceptionInfraredFrameSourceAddedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceremoved(
    `type`: sourceremoved,
    listener: TypedEventHandler[
      PerceptionInfraredFrameSourceWatcher, 
      PerceptionInfraredFrameSourceRemovedEventArgs
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, _]): Unit = js.native
  /** When this method is called, the infrared frame source watcher enumerates any existing infrared frame sources it has not already enumerated by firing a SourceAdded event for each one. An EnumerationCompleted event is fired when this enumeration is complete. The infrared frame source then starts watching for new infrared frame sources. */
  def start(): Unit = js.native
  /** When this method is called, the infrared frame source watcher stops looking for changes to the infrared frame source list. This operation is not immediate; the Stopped event will be triggered when the Stop operation is complete. */
  def stop(): Unit = js.native
}

