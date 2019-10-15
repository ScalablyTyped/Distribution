package typings.winrtDashUwp.Windows.Media.Streaming.Adaptive

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Storage.Streams.IInputStream
import typings.winrtDashUwp.Windows.Web.Http.HttpClient
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.downloadbitratechanged
import typings.winrtDashUwp.winrtDashUwpStrings.downloadcompleted
import typings.winrtDashUwp.winrtDashUwpStrings.downloadfailed
import typings.winrtDashUwp.winrtDashUwpStrings.downloadrequested
import typings.winrtDashUwp.winrtDashUwpStrings.playbackbitratechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the source of adaptive streaming content. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource")
@js.native
abstract class AdaptiveMediaSource () extends js.Object {
  var advancedSettings: js.Any = js.native
   /* unmapped type */ /** Gets a value indicating if the content streamed by the media source contains only audio. */
  var audioOnlyPlayback: Boolean = js.native
  /** Gets the available adaptive bit rates of the adaptive streaming manifest that is the source of the adaptive streaming object. */
  var availableBitrates: IVectorView[Double] = js.native
  /** Gets a value indicating the current download bitrate for the media source. */
  var currentDownloadBitrate: Double = js.native
  /** Gets a value indicating the current playback bitrate for the media source. */
  var currentPlaybackBitrate: Double = js.native
  /** Gets or sets the desired starting offset for the live playback of the media source. */
  var desiredLiveOffset: Double = js.native
  /** Gets or sets the desired maximum bitrate for the media source. */
  var desiredMaxBitrate: Double = js.native
  /** Gets or sets the desired minimum bitrate for the media source. */
  var desiredMinBitrate: Double = js.native
  /** Gets a value indicating the inbound bits per second statistic over the time window specified by the InboundBitsPerSecondWindow property. */
  var inboundBitsPerSecond: Double = js.native
  /** Gets or sets the time span over which the InboundBitsPerSecond property is calculated. */
  var inboundBitsPerSecondWindow: Double = js.native
  /** Gets and sets the initial bit rate to use for playback of the media source. */
  var initialBitrate: Double = js.native
  /** Gets a value that indicates whether the media source is live. */
  var isLive: Boolean = js.native
  /** Occurs when the CurrentDownloadBitrate changes. */
  @JSName("ondownloadbitratechanged")
  var ondownloadbitratechanged_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs] = js.native
  /** Occurs when a resource download operation completes */
  @JSName("ondownloadcompleted")
  var ondownloadcompleted_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs] = js.native
  /** Occurs when a resource download operation fails. */
  @JSName("ondownloadfailed")
  var ondownloadfailed_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs] = js.native
  /** Occurs when a resource download operation is requested. */
  @JSName("ondownloadrequested")
  var ondownloadrequested_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs] = js.native
  /** Occurs when the CurrentPlaybackBitrate changes. */
  @JSName("onplaybackbitratechanged")
  var onplaybackbitratechanged_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadbitratechanged(
    `type`: downloadbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadcompleted(
    `type`: downloadcompleted,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadfailed(
    `type`: downloadfailed,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadrequested(
    `type`: downloadrequested,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackbitratechanged(
    `type`: playbackbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  ): Unit = js.native
  /** Occurs when the CurrentDownloadBitrate changes. */
  def ondownloadbitratechanged(ev: AdaptiveMediaSourceDownloadBitrateChangedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when a resource download operation completes */
  def ondownloadcompleted(ev: AdaptiveMediaSourceDownloadCompletedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when a resource download operation fails. */
  def ondownloadfailed(ev: AdaptiveMediaSourceDownloadFailedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when a resource download operation is requested. */
  def ondownloadrequested(ev: AdaptiveMediaSourceDownloadRequestedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when the CurrentPlaybackBitrate changes. */
  def onplaybackbitratechanged(ev: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadbitratechanged(
    `type`: downloadbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadcompleted(
    `type`: downloadcompleted,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadfailed(
    `type`: downloadfailed,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadrequested(
    `type`: downloadrequested,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackbitratechanged(
    `type`: playbackbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource")
@js.native
object AdaptiveMediaSource extends js.Object {
  /**
    * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
    * @param stream The input stream from which the AdaptiveMediaSource is created.
    * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
    * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
    * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
    */
  def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String): IPromiseWithIAsyncOperation[AdaptiveMediaSourceCreationResult] = js.native
  /**
    * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
    * @param stream The input stream from which the AdaptiveMediaSource is created.
    * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
    * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
    * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
    * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
    */
  def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String, httpClient: HttpClient): IPromiseWithIAsyncOperation[AdaptiveMediaSourceCreationResult] = js.native
  /**
    * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
    * @param uri The URI of the source.
    * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
    */
  def createFromUriAsync(uri: Uri): IPromiseWithIAsyncOperation[AdaptiveMediaSourceCreationResult] = js.native
  /**
    * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
    * @param uri The URI of the source.
    * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
    * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
    */
  def createFromUriAsync(uri: Uri, httpClient: HttpClient): IPromiseWithIAsyncOperation[AdaptiveMediaSourceCreationResult] = js.native
  /**
    * Determines whether the content type of the source is supported.
    * @param contentType A string that identifies the content type of the source. Can be a Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content type.
    * @return Returns a value that indicates whether the content type of the source is supported. true if supported; otherwise, false.
    */
  def isContentTypeSupported(contentType: String): Boolean = js.native
}

