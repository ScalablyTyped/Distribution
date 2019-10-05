package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.Foundation.Collections.IObservableVector
import typings.winrtDashUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.openoperationcompleted
import typings.winrtDashUwp.winrtDashUwpStrings.statechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media source. Provides a common way to reference media from different sources and exposes a common model for accessing media data regardless of the underlying media format. */
@JSGlobal("Windows.Media.Core.MediaSource")
@js.native
abstract class MediaSource () extends js.Object {
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
  @JSName("onopenoperationcompleted")
  var onopenoperationcompleted_Original: TypedEventHandler[MediaSource, MediaSourceOpenOperationCompletedEventArgs] = js.native
  /** Occurs when the current state of the MediaSource changes. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[MediaSource, MediaSourceStateChangedEventArgs] = js.native
  /** Gets the current state of the MediaSource . */
  var state: MediaSourceState = js.native
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
  /** Occurs when a MediaSource open operation completes. */
  def onopenoperationcompleted(ev: MediaSourceOpenOperationCompletedEventArgs with WinRTEvent[MediaSource]): Unit = js.native
  /** Occurs when the current state of the MediaSource changes. */
  def onstatechanged(ev: MediaSourceStateChangedEventArgs with WinRTEvent[MediaSource]): Unit = js.native
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
}

/* static members */
@JSGlobal("Windows.Media.Core.MediaSource")
@js.native
object MediaSource extends js.Object {
  /**
    * Creates an instance of MediaSource from the provided AdaptiveMediaSource .
    * @param mediaSource The AdaptiveMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IMediaSource .
    * @param mediaSource The IMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromIMediaSource(mediaSource: IMediaSource): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MediaBinder .
    * @param binder The MediaBinder with which the MediaSource is associated.
    * @return The new media source.
    */
  def createFromMediaBinder(binder: MediaBinder): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MediaStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromMediaStreamSource(mediaSource: MediaStreamSource): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MseStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromMseStreamSource(mediaSource: MseStreamSource): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IStorageFile .
    * @param file The IStorageFile from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromStorageFile(file: IStorageFile): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStream .
    * @param stream The stream from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  def createFromStream(stream: IRandomAccessStream, contentType: String): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStreamReference .
    * @param stream The stream reference from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  def createFromStreamReference(stream: IRandomAccessStreamReference, contentType: String): MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided Uri .
    * @param uri The URI from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromUri(uri: Uri): MediaSource = js.native
}

