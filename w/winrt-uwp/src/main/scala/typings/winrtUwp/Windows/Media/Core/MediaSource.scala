package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IObservableVector
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.openoperationcompleted
import typings.winrtUwp.winrtUwpStrings.statechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media source. Provides a common way to reference media from different sources and exposes a common model for accessing media data regardless of the underlying media format. */
@js.native
trait MediaSource extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openoperationcompleted(
    `type`: openoperationcompleted,
    listener: TypedEventHandler[MediaSource, MediaSourceOpenOperationCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[MediaSource, MediaSourceStateChangedEventArgs]): Unit = js.native
  
  /** Closes the MediaSource . */
  def close(): Unit = js.native
  
  /** Gets a set of properties that can be used to associate app-specific data with a MediaSource . */
  var customProperties: ValueSet = js.native
  
  /** Gets the duration of the content in the MediaSource . */
  var duration: Double = js.native
  
  /** A collection of external timed metadata tracks associated with the MediaSource . */
  var externalTimedMetadataTracks: IObservableVector[TimedMetadataTrack] = js.native
  
  /** A collection of external timed text sources associated with the MediaSource . */
  var externalTimedTextSources: IObservableVector[TimedTextSource] = js.native
  
  /** Gets a value indicating whether the media source is currently open. */
  var isOpen: Boolean = js.native
  
  /** Occurs when a MediaSource open operation completes. */
  def onopenoperationcompleted(ev: MediaSourceOpenOperationCompletedEventArgs with WinRTEvent[MediaSource]): Unit = js.native
  /** Occurs when a MediaSource open operation completes. */
  @JSName("onopenoperationcompleted")
  var onopenoperationcompleted_Original: TypedEventHandler[MediaSource, MediaSourceOpenOperationCompletedEventArgs] = js.native
  
  /** Occurs when the current state of the MediaSource changes. */
  def onstatechanged(ev: MediaSourceStateChangedEventArgs with WinRTEvent[MediaSource]): Unit = js.native
  /** Occurs when the current state of the MediaSource changes. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[MediaSource, MediaSourceStateChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_openoperationcompleted(
    `type`: openoperationcompleted,
    listener: TypedEventHandler[MediaSource, MediaSourceOpenOperationCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[MediaSource, MediaSourceStateChangedEventArgs]): Unit = js.native
  
  /** Resets the internal state of the MediaSource . */
  def reset(): Unit = js.native
  
  /** Gets the current state of the MediaSource . */
  var state: MediaSourceState = js.native
}
