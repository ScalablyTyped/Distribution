package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus
import typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Web.Http.HttpClient
import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Streaming {
  
  /** Provides the ability to playback multimedia content that is delivered using various adaptive streaming protocols. You can playback Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content. */
  object Adaptive {
    
    /** Represents the source of adaptive streaming content. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource")
    @js.native
    open class AdaptiveMediaSource ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
    object AdaptiveMediaSource {
      
      @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
        * @param stream The input stream from which the AdaptiveMediaSource is created.
        * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
        * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      inline def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamAsync")(stream.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ]]
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
        * @param stream The input stream from which the AdaptiveMediaSource is created.
        * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
        * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      inline def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String, httpClient: HttpClient): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamAsync")(stream.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], httpClient.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ]]
      
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
        * @param uri The URI of the source.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      inline def createFromUriAsync(uri: Uri): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromUriAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ]]
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
        * @param uri The URI of the source.
        * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      inline def createFromUriAsync(uri: Uri, httpClient: HttpClient): IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromUriAsync")(uri.asInstanceOf[js.Any], httpClient.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ]]
      
      /**
        * Determines whether the content type of the source is supported.
        * @param contentType A string that identifies the content type of the source. Can be a Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @return Returns a value that indicates whether the content type of the source is supported. true if supported; otherwise, false.
        */
      /* static member */
      inline def isContentTypeSupported(contentType: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContentTypeSupported")(contentType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceAdvancedSettings")
    @js.native
    open class AdaptiveMediaSourceAdvancedSettings ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceAdvancedSettings {
      
      /* CompleteClass */
      var allSegmentsIndependent: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var bitrateDowngradeTriggerRatio: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var desiredBitrateHeadroomRatio: Any = js.native
    }
    
    /** Represents the result of the creation of a AdaptiveMediaSource object. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult")
    @js.native
    open class AdaptiveMediaSourceCreationResult ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult {
      
      /** Gets the HTTP response message, if any, returned from an attempt to create a AdaptiveMediaSource object. */
      /* CompleteClass */
      var httpResponseMessage: HttpResponseMessage = js.native
      
      /** Gets the AdaptiveMediaSource object that represents the source of adaptive streaming content. */
      /* CompleteClass */
      var mediaSource: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource = js.native
      
      /** Gets the status of an attempt to create a AdaptiveMediaSource object. */
      /* CompleteClass */
      var status: AdaptiveMediaSourceCreationStatus = js.native
    }
    
    /** Specifies the result of an attempt to create a AdaptiveMediaSource object. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus")
    @js.native
    object AdaptiveMediaSourceCreationStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus & Double
          ] = js.native
      
      /* 1 */ val manifestDownloadFailure: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.manifestDownloadFailure & Double = js.native
      
      /* 2 */ val manifestParseFailure: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.manifestParseFailure & Double = js.native
      
      /* 0 */ val success: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.success & Double = js.native
      
      /* 6 */ val unknownFailure: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unknownFailure & Double = js.native
      
      /* 3 */ val unsupportedManifestContentType: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestContentType & Double = js.native
      
      /* 5 */ val unsupportedManifestProfile: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestProfile & Double = js.native
      
      /* 4 */ val unsupportedManifestVersion: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestVersion & Double = js.native
    }
    
    /** Provides data for the DownloadBitrateChanged event. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedEventArgs")
    @js.native
    open class AdaptiveMediaSourceDownloadBitrateChangedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedEventArgs {
      
      /** Gets a value indicating the new download bitrate for the media source. */
      /* CompleteClass */
      var newValue: Double = js.native
      
      /** Gets a value indicating the previous download bitrate for the media source. */
      /* CompleteClass */
      var oldValue: Double = js.native
    }
    
    /** Provides data for the DownloadCompleted event. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadCompletedEventArgs")
    @js.native
    open class AdaptiveMediaSourceDownloadCompletedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadCompletedEventArgs {
      
      /** Gets the http response message, if any, returned from the completed media download request. */
      /* CompleteClass */
      var httpResponseMessage: HttpResponseMessage = js.native
      
      /** Gets the byte range length of the completed media download request. */
      /* CompleteClass */
      var resourceByteRangeLength: Double = js.native
      
      /** Gets the byte range offset of the completed media download request. */
      /* CompleteClass */
      var resourceByteRangeOffset: Double = js.native
      
      /** Gets the resource type of the completed media download request. */
      /* CompleteClass */
      var resourceType: AdaptiveMediaSourceResourceType = js.native
      
      /** Gets the resource URI of the completed media download request. */
      /* CompleteClass */
      var resourceUri: Uri = js.native
    }
    
    /** Provides data for the DownloadFailed event. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadFailedEventArgs")
    @js.native
    open class AdaptiveMediaSourceDownloadFailedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadFailedEventArgs {
      
      /** Gets the http response message, if any, returned from the failed media download request. */
      /* CompleteClass */
      var httpResponseMessage: HttpResponseMessage = js.native
      
      /** Gets the byte range length of the failed media download request. */
      /* CompleteClass */
      var resourceByteRangeLength: Double = js.native
      
      /** Gets the byte range offset of the failed media download request. */
      /* CompleteClass */
      var resourceByteRangeOffset: Double = js.native
      
      /** Gets the resource type of the failed media download request. */
      /* CompleteClass */
      var resourceType: AdaptiveMediaSourceResourceType = js.native
      
      /** Gets the resource URI of the failed media download request. */
      /* CompleteClass */
      var resourceUri: Uri = js.native
    }
    
    /** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral")
    @js.native
    open class AdaptiveMediaSourceDownloadRequestedDeferral ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral {
      
      /** Informs the system that an asynchronous operation associated with a DownloadRequested event has finished. */
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    /** Provides data for the DownloadRequested event. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedEventArgs")
    @js.native
    open class AdaptiveMediaSourceDownloadRequestedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedEventArgs {
      
      /**
        * Gets a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content.
        * @return A deferral that can be used to defer the completion of the DownloadRequested event.
        */
      /* CompleteClass */
      override def getDeferral(): typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral = js.native
      
      /** Gets the byte range length of the media download request. */
      /* CompleteClass */
      var resourceByteRangeLength: Double = js.native
      
      /** Gets the byte range offset of the media download request. */
      /* CompleteClass */
      var resourceByteRangeOffset: Double = js.native
      
      /** Gets the resource type of the media download request. */
      /* CompleteClass */
      var resourceType: AdaptiveMediaSourceResourceType = js.native
      
      /** Gets the resource URI of the media download request. */
      /* CompleteClass */
      var resourceUri: Uri = js.native
      
      /** Gets an AdaptiveMediaSourceDownloadResult object representing the result of the media download request. */
      /* CompleteClass */
      var result: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult = js.native
    }
    
    /** Represents the results of a resource download operation. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult")
    @js.native
    open class AdaptiveMediaSourceDownloadResult ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult {
      
      /** Gets or sets a buffer containing the downloaded resource. */
      /* CompleteClass */
      var buffer: IBuffer = js.native
      
      /** Gets or sets a string that identifies the MIME content type of the downloaded resource. */
      /* CompleteClass */
      var contentType: String = js.native
      
      /** Gets or sets an integer value that represents extended status information about the resource download operation. */
      /* CompleteClass */
      var extendedStatus: Double = js.native
      
      /** Gets or sets an input stream containing the downloaded resource. */
      /* CompleteClass */
      var inputStream: IInputStream = js.native
      
      /** Gets or sets the Uniform Resource Identifier (URI) of the downloaded resource. */
      /* CompleteClass */
      var resourceUri: Uri = js.native
    }
    
    /** Provides data for the PlaybackBitrateChanged event. */
    /* note: abstract class */ @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourcePlaybackBitrateChangedEventArgs")
    @js.native
    open class AdaptiveMediaSourcePlaybackBitrateChangedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
      
      /** Gets a value indicating whether the media source contains only audio data. */
      /* CompleteClass */
      var audioOnly: Boolean = js.native
      
      /** Gets the new playback bitrate. */
      /* CompleteClass */
      var newValue: Double = js.native
      
      /** Gets the old playback bitrate. */
      /* CompleteClass */
      var oldValue: Double = js.native
    }
    
    /** Specifies the type of an adaptive media resource. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType")
    @js.native
    object AdaptiveMediaSourceResourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType & Double
          ] = js.native
      
      /* 1 */ val initializationSegment: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.initializationSegment & Double = js.native
      
      /* 4 */ val initializationVector: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.initializationVector & Double = js.native
      
      /* 3 */ val key: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.key & Double = js.native
      
      /* 0 */ val manifest: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.manifest & Double = js.native
      
      /* 2 */ val mediaSegment: typings.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.mediaSegment & Double = js.native
    }
  }
}
