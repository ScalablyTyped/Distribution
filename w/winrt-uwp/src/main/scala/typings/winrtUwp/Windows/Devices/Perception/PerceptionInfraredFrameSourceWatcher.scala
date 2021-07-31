package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherStatus
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.enumerationcompleted
import typings.winrtUwp.winrtUwpStrings.sourceadded
import typings.winrtUwp.winrtUwpStrings.sourceremoved
import typings.winrtUwp.winrtUwpStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Monitors changes to the list of infrared frame sources, and provides notifications when the list changes. */
@js.native
trait PerceptionInfraredFrameSourceWatcher extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: enumerationcompleted,
    listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, js.Any]
  ): Unit = js.native
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
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, js.Any]): Unit = js.native
  
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known infrared frame sources is complete. */
  def onenumerationcompleted(ev: js.Any & WinRTEvent[PerceptionInfraredFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known infrared frame sources is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, js.Any] = js.native
  
  /** Subscribes to the SourceAdded event. */
  def onsourceadded(ev: PerceptionInfraredFrameSourceAddedEventArgs & WinRTEvent[PerceptionInfraredFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the SourceAdded event. */
  @JSName("onsourceadded")
  var onsourceadded_Original: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, PerceptionInfraredFrameSourceAddedEventArgs] = js.native
  
  /** Subscribes to the SourceRemoved event. This event is fired once for every infrared frame source that is removed. */
  def onsourceremoved(
    ev: PerceptionInfraredFrameSourceRemovedEventArgs & WinRTEvent[PerceptionInfraredFrameSourceWatcher]
  ): Unit = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every infrared frame source that is removed. */
  @JSName("onsourceremoved")
  var onsourceremoved_Original: TypedEventHandler[
    PerceptionInfraredFrameSourceWatcher, 
    PerceptionInfraredFrameSourceRemovedEventArgs
  ] = js.native
  
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listeningfor changes to the list of infrared frame sources. */
  def onstopped(ev: js.Any & WinRTEvent[PerceptionInfraredFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listeningfor changes to the list of infrared frame sources. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, js.Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: enumerationcompleted,
    listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, js.Any]
  ): Unit = js.native
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
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionInfraredFrameSourceWatcher, js.Any]): Unit = js.native
  
  /** When this method is called, the infrared frame source watcher enumerates any existing infrared frame sources it has not already enumerated by firing a SourceAdded event for each one. An EnumerationCompleted event is fired when this enumeration is complete. The infrared frame source then starts watching for new infrared frame sources. */
  def start(): Unit = js.native
  
  /** Gets the operational status of the infrared frame source watcher. */
  var status: DeviceWatcherStatus = js.native
  
  /** When this method is called, the infrared frame source watcher stops looking for changes to the infrared frame source list. This operation is not immediate; the Stopped event will be triggered when the Stop operation is complete. */
  def stop(): Unit = js.native
}
