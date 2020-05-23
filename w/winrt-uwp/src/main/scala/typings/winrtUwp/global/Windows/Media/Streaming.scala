package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus
import typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Web.Http.HttpClient
import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Streaming")
@js.native
object Streaming extends js.Object {
  /** Provides the ability to playback multimedia content that is delivered using various adaptive streaming protocols. You can playback Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content. */
  @js.native
  object Adaptive extends js.Object {
    /** Represents the source of adaptive streaming content. */
    @js.native
    abstract class AdaptiveMediaSource ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
    
    @js.native
    abstract class AdaptiveMediaSourceAdvancedSettings ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceAdvancedSettings {
      /* CompleteClass */
      override var allSegmentsIndependent: js.Any = js.native
       /* unmapped type */ /* CompleteClass */
      override var bitrateDowngradeTriggerRatio: js.Any = js.native
       /* unmapped type */ /* CompleteClass */
      override var desiredBitrateHeadroomRatio: js.Any = js.native
    }
    
    /** Represents the result of the creation of a AdaptiveMediaSource object. */
    @js.native
    abstract class AdaptiveMediaSourceCreationResult ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult {
      /** Gets the HTTP response message, if any, returned from an attempt to create a AdaptiveMediaSource object. */
      /* CompleteClass */
      override var httpResponseMessage: HttpResponseMessage = js.native
      /** Gets the AdaptiveMediaSource object that represents the source of adaptive streaming content. */
      /* CompleteClass */
      override var mediaSource: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource = js.native
      /** Gets the status of an attempt to create a AdaptiveMediaSource object. */
      /* CompleteClass */
      override var status: AdaptiveMediaSourceCreationStatus = js.native
    }
    
    /** Provides data for the DownloadBitrateChanged event. */
    @js.native
    abstract class AdaptiveMediaSourceDownloadBitrateChangedEventArgs ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedEventArgs {
      /** Gets a value indicating the new download bitrate for the media source. */
      /* CompleteClass */
      override var newValue: Double = js.native
      /** Gets a value indicating the previous download bitrate for the media source. */
      /* CompleteClass */
      override var oldValue: Double = js.native
    }
    
    /** Provides data for the DownloadCompleted event. */
    @js.native
    abstract class AdaptiveMediaSourceDownloadCompletedEventArgs ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadCompletedEventArgs {
      /** Gets the http response message, if any, returned from the completed media download request. */
      /* CompleteClass */
      override var httpResponseMessage: HttpResponseMessage = js.native
      /** Gets the byte range length of the completed media download request. */
      /* CompleteClass */
      override var resourceByteRangeLength: Double = js.native
      /** Gets the byte range offset of the completed media download request. */
      /* CompleteClass */
      override var resourceByteRangeOffset: Double = js.native
      /** Gets the resource type of the completed media download request. */
      /* CompleteClass */
      override var resourceType: AdaptiveMediaSourceResourceType = js.native
      /** Gets the resource URI of the completed media download request. */
      /* CompleteClass */
      override var resourceUri: Uri = js.native
    }
    
    /** Provides data for the DownloadFailed event. */
    @js.native
    abstract class AdaptiveMediaSourceDownloadFailedEventArgs ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadFailedEventArgs {
      /** Gets the http response message, if any, returned from the failed media download request. */
      /* CompleteClass */
      override var httpResponseMessage: HttpResponseMessage = js.native
      /** Gets the byte range length of the failed media download request. */
      /* CompleteClass */
      override var resourceByteRangeLength: Double = js.native
      /** Gets the byte range offset of the failed media download request. */
      /* CompleteClass */
      override var resourceByteRangeOffset: Double = js.native
      /** Gets the resource type of the failed media download request. */
      /* CompleteClass */
      override var resourceType: AdaptiveMediaSourceResourceType = js.native
      /** Gets the resource URI of the failed media download request. */
      /* CompleteClass */
      override var resourceUri: Uri = js.native
    }
    
    /** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
    @js.native
    abstract class AdaptiveMediaSourceDownloadRequestedDeferral ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral {
      /** Informs the system that an asynchronous operation associated with a DownloadRequested event has finished. */
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    /** Provides data for the DownloadRequested event. */
    @js.native
    abstract class AdaptiveMediaSourceDownloadRequestedEventArgs ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedEventArgs {
      /** Gets the byte range length of the media download request. */
      /* CompleteClass */
      override var resourceByteRangeLength: Double = js.native
      /** Gets the byte range offset of the media download request. */
      /* CompleteClass */
      override var resourceByteRangeOffset: Double = js.native
      /** Gets the resource type of the media download request. */
      /* CompleteClass */
      override var resourceType: AdaptiveMediaSourceResourceType = js.native
      /** Gets the resource URI of the media download request. */
      /* CompleteClass */
      override var resourceUri: Uri = js.native
      /** Gets an AdaptiveMediaSourceDownloadResult object representing the result of the media download request. */
      /* CompleteClass */
      override var result: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult = js.native
      /**
        * Gets a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content.
        * @return A deferral that can be used to defer the completion of the DownloadRequested event.
        */
      /* CompleteClass */
      override def getDeferral(): typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral = js.native
    }
    
    /** Represents the results of a resource download operation. */
    @js.native
    abstract class AdaptiveMediaSourceDownloadResult ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult {
      /** Gets or sets a buffer containing the downloaded resource. */
      /* CompleteClass */
      override var buffer: IBuffer = js.native
      /** Gets or sets a string that identifies the MIME content type of the downloaded resource. */
      /* CompleteClass */
      override var contentType: String = js.native
      /** Gets or sets an integer value that represents extended status information about the resource download operation. */
      /* CompleteClass */
      override var extendedStatus: Double = js.native
      /** Gets or sets an input stream containing the downloaded resource. */
      /* CompleteClass */
      override var inputStream: IInputStream = js.native
      /** Gets or sets the Uniform Resource Identifier (URI) of the downloaded resource. */
      /* CompleteClass */
      override var resourceUri: Uri = js.native
    }
    
    /** Provides data for the PlaybackBitrateChanged event. */
    @js.native
    abstract class AdaptiveMediaSourcePlaybackBitrateChangedEventArgs ()
      extends typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
      /** Gets a value indicating whether the media source contains only audio data. */
      /* CompleteClass */
      override var audioOnly: Boolean = js.native
      /** Gets the new playback bitrate. */
      /* CompleteClass */
      override var newValue: Double = js.native
      /** Gets the old playback bitrate. */
      /* CompleteClass */
      override var oldValue: Double = js.native
    }
    
    /* static members */
    @js.native
    object AdaptiveMediaSource extends js.Object {
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
        * @param stream The input stream from which the AdaptiveMediaSource is created.
        * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
        * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
        * @param stream The input stream from which the AdaptiveMediaSource is created.
        * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
        * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String, httpClient: HttpClient): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
        * @param uri The URI of the source.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      def createFromUriAsync(uri: Uri): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
        * @param uri The URI of the source.
        * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      def createFromUriAsync(uri: Uri, httpClient: HttpClient): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      /**
        * Determines whether the content type of the source is supported.
        * @param contentType A string that identifies the content type of the source. Can be a Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @return Returns a value that indicates whether the content type of the source is supported. true if supported; otherwise, false.
        */
      def isContentTypeSupported(contentType: String): Boolean = js.native
    }
    
    /** Specifies the result of an attempt to create a AdaptiveMediaSource object. */
    @js.native
    object AdaptiveMediaSourceCreationStatus extends js.Object {
      /* 1 */ val manifestDownloadFailure: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.manifestDownloadFailure with Double = js.native
      /* 2 */ val manifestParseFailure: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.manifestParseFailure with Double = js.native
      /* 0 */ val success: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.success with Double = js.native
      /* 6 */ val unknownFailure: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unknownFailure with Double = js.native
      /* 3 */ val unsupportedManifestContentType: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestContentType with Double = js.native
      /* 5 */ val unsupportedManifestProfile: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestProfile with Double = js.native
      /* 4 */ val unsupportedManifestVersion: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestVersion with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus with Double
          ] = js.native
    }
    
    /** Specifies the type of an adaptive media resource. */
    @js.native
    object AdaptiveMediaSourceResourceType extends js.Object {
      /* 1 */ val initializationSegment: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.initializationSegment with Double = js.native
      /* 4 */ val initializationVector: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.initializationVector with Double = js.native
      /* 3 */ val key: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.key with Double = js.native
      /* 0 */ val manifest: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.manifest with Double = js.native
      /* 2 */ val mediaSegment: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.mediaSegment with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType with Double
          ] = js.native
    }
    
  }
  
}

