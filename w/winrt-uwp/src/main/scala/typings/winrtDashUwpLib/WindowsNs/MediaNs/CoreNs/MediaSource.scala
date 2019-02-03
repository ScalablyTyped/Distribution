package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media source. Provides a common way to reference media from different sources and exposes a common model for accessing media data regardless of the underlying media format. */
@JSGlobal("Windows.Media.Core.MediaSource")
@js.native
abstract class MediaSource () extends js.Object {
  /** Gets a set of properties that can be used to associate app-specific data with a MediaSource . */
  var customProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets the duration of the content in the MediaSource . */
  var duration: scala.Double = js.native
  /** A collection of external timed metadata tracks associated with the MediaSource . */
  var externalTimedMetadataTracks: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableVector[TimedMetadataTrack] = js.native
  /** A collection of external timed text sources associated with the MediaSource . */
  var externalTimedTextSources: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableVector[TimedTextSource] = js.native
  /** Gets a value indicating whether the media source is currently open. */
  var isOpen: scala.Boolean = js.native
  /** Occurs when a MediaSource open operation completes. */
  @JSName("onopenoperationcompleted")
  var onopenoperationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaSource, MediaSourceOpenOperationCompletedEventArgs] = js.native
  /** Occurs when the current state of the MediaSource changes. */
  @JSName("onstatechanged")
  var onstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaSource, MediaSourceStateChangedEventArgs] = js.native
  /** Gets the current state of the MediaSource . */
  var state: MediaSourceState = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openoperationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.openoperationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaSource, MediaSourceOpenOperationCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaSource, MediaSourceStateChangedEventArgs]
  ): scala.Unit = js.native
  /** Closes the MediaSource . */
  def close(): scala.Unit = js.native
  /** Occurs when a MediaSource open operation completes. */
  def onopenoperationcompleted(
    ev: MediaSourceOpenOperationCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaSource]
  ): scala.Unit = js.native
  /** Occurs when the current state of the MediaSource changes. */
  def onstatechanged(ev: MediaSourceStateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaSource]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_openoperationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.openoperationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaSource, MediaSourceOpenOperationCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaSource, MediaSourceStateChangedEventArgs]
  ): scala.Unit = js.native
  /** Resets the internal state of the MediaSource . */
  def reset(): scala.Unit = js.native
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
  def createFromAdaptiveMediaSource(mediaSource: winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSource): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IMediaSource .
    * @param mediaSource The IMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromIMediaSource(mediaSource: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.IMediaSource): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MediaBinder .
    * @param binder The MediaBinder with which the MediaSource is associated.
    * @return The new media source.
    */
  def createFromMediaBinder(binder: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaBinder): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MediaStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromMediaStreamSource(mediaSource: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSource): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MseStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromMseStreamSource(mediaSource: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MseStreamSource): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IStorageFile .
    * @param file The IStorageFile from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromStorageFile(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStream .
    * @param stream The stream from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  def createFromStream(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    contentType: java.lang.String
  ): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStreamReference .
    * @param stream The stream reference from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  def createFromStreamReference(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    contentType: java.lang.String
  ): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided Uri .
    * @param uri The URI from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromUri(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSource = js.native
}

