package typings
package winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the source of adaptive streaming content. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource")
@js.native
abstract class AdaptiveMediaSource () extends js.Object {
  var advancedSettings: js.Any = js.native
   /* unmapped type *//** Gets a value indicating if the content streamed by the media source contains only audio. */
  var audioOnlyPlayback: scala.Boolean = js.native
  /** Gets the available adaptive bit rates of the adaptive streaming manifest that is the source of the adaptive streaming object. */
  var availableBitrates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
  /** Gets a value indicating the current download bitrate for the media source. */
  var currentDownloadBitrate: scala.Double = js.native
  /** Gets a value indicating the current playback bitrate for the media source. */
  var currentPlaybackBitrate: scala.Double = js.native
  /** Gets or sets the desired starting offset for the live playback of the media source. */
  var desiredLiveOffset: scala.Double = js.native
  /** Gets or sets the desired maximum bitrate for the media source. */
  var desiredMaxBitrate: scala.Double = js.native
  /** Gets or sets the desired minimum bitrate for the media source. */
  var desiredMinBitrate: scala.Double = js.native
  /** Gets a value indicating the inbound bits per second statistic over the time window specified by the InboundBitsPerSecondWindow property. */
  var inboundBitsPerSecond: scala.Double = js.native
  /** Gets or sets the time span over which the InboundBitsPerSecond property is calculated. */
  var inboundBitsPerSecondWindow: scala.Double = js.native
  /** Gets and sets the initial bit rate to use for playback of the media source. */
  var initialBitrate: scala.Double = js.native
  /** Gets a value that indicates whether the media source is live. */
  var isLive: scala.Boolean = js.native
  /** Occurs when the CurrentDownloadBitrate changes. */
  @JSName("ondownloadbitratechanged")
  var ondownloadbitratechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs] = js.native
  /** Occurs when a resource download operation completes */
  @JSName("ondownloadcompleted")
  var ondownloadcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs] = js.native
  /** Occurs when a resource download operation fails. */
  @JSName("ondownloadfailed")
  var ondownloadfailed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs] = js.native
  /** Occurs when a resource download operation is requested. */
  @JSName("ondownloadrequested")
  var ondownloadrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs] = js.native
  /** Occurs when the CurrentPlaybackBitrate changes. */
  @JSName("onplaybackbitratechanged")
  var onplaybackbitratechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadbitratechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadbitratechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadfailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackbitratechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackbitratechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the CurrentDownloadBitrate changes. */
  def ondownloadbitratechanged(
    ev: AdaptiveMediaSourceDownloadBitrateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AdaptiveMediaSource]
  ): scala.Unit = js.native
  /** Occurs when a resource download operation completes */
  def ondownloadcompleted(
    ev: AdaptiveMediaSourceDownloadCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AdaptiveMediaSource]
  ): scala.Unit = js.native
  /** Occurs when a resource download operation fails. */
  def ondownloadfailed(
    ev: AdaptiveMediaSourceDownloadFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AdaptiveMediaSource]
  ): scala.Unit = js.native
  /** Occurs when a resource download operation is requested. */
  def ondownloadrequested(
    ev: AdaptiveMediaSourceDownloadRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AdaptiveMediaSource]
  ): scala.Unit = js.native
  /** Occurs when the CurrentPlaybackBitrate changes. */
  def onplaybackbitratechanged(
    ev: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AdaptiveMediaSource]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadbitratechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadbitratechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadfailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.downloadrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackbitratechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackbitratechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents the source of adaptive streaming content. */
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
  def createFromStreamAsync(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    contentType: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationResult
  ] = js.native
  /**
                       * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
                       * @param stream The input stream from which the AdaptiveMediaSource is created.
                       * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
                       * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
                       * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
                       * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
                       */
  def createFromStreamAsync(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    contentType: java.lang.String,
    httpClient: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpClient
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationResult
  ] = js.native
  /**
                       * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
                       * @param uri T he URI of the source.
                       * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
                       */
  def createFromUriAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationResult
  ] = js.native
  /**
                       * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
                       * @param uri T he URI of the source.
                       * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
                       * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
                       */
  def createFromUriAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    httpClient: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpClient
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationResult
  ] = js.native
  /**
                       * Determines whether the content type of the source is supported.
                       * @param contentType A string that identifies the content type of the source. Can be a Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content type.
                       * @return Returns a value that indicates whether the content type of the source is supported. true if supported; otherwise, false.
                       */
  def isContentTypeSupported(contentType: java.lang.String): scala.Boolean = js.native
}

