package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Media.Core.IMediaSource
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for transcoding audio and video files. */
object Transcoding {
  
  @js.native
  sealed trait MediaVideoProcessingAlgorithm extends StObject
  /** Defines the available algorithms used by the Transcode Video Processor (XVP). */
  @JSGlobal("Windows.Media.Transcoding.MediaVideoProcessingAlgorithm")
  @js.native
  object MediaVideoProcessingAlgorithm extends StObject {
    
    /** Default video processing algorithm. This algorithm prefers performance, speed, and space over quality. This algorithm will makes use of hardware. */
    @js.native
    sealed trait default
      extends StObject
         with MediaVideoProcessingAlgorithm
    
    /** Prefers quality over performance. This mode always runs in software and insures that hardware implementations, which may differ from the XVP are not used. */
    @js.native
    sealed trait mrfCrf444
      extends StObject
         with MediaVideoProcessingAlgorithm
  }
  
  @js.native
  sealed trait TranscodeFailureReason extends StObject
  /** Specifies the reason the transcode operation failed. */
  @JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
  @js.native
  object TranscodeFailureReason extends StObject {
    
    /** The codec was not found. */
    @js.native
    sealed trait codecNotFound
      extends StObject
         with TranscodeFailureReason
    
    /** Profile is invalid. */
    @js.native
    sealed trait invalidProfile
      extends StObject
         with TranscodeFailureReason
    
    /** None. */
    @js.native
    sealed trait none
      extends StObject
         with TranscodeFailureReason
    
    /** Reason unknown. */
    @js.native
    sealed trait unknown
      extends StObject
         with TranscodeFailureReason
  }
  
  /** Transcodes audio and video files. */
  @js.native
  trait MediaTranscoder extends StObject {
    
    /**
      * Adds the specified audio effect.
      * @param activatableClassId The identifier of the audio effect.
      */
    def addAudioEffect(activatableClassId: String): Unit = js.native
    /**
      * Adds the specified audio effect with configuration properties, and indicates whether the effect is required.
      * @param activatableClassId The identifier of the audio effect.
      * @param effectRequired Indicates whether the audio effect is required.
      * @param configuration Configuration properties for the audio effect.
      */
    def addAudioEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    /**
      * Adds the specified video effect.
      * @param activatableClassId The identifier of the video effect.
      */
    def addVideoEffect(activatableClassId: String): Unit = js.native
    /**
      * Adds the specified video effect with configuration properties and indicates whether the effect is required.
      * @param activatableClassId The identifier of the video effect.
      * @param effectRequired Indicates whether the video effect is required.
      * @param configuration Configuration properties for the video effect.
      */
    def addVideoEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    /** Specifies whether the media transcoder always re-encodes the source. */
    var alwaysReencode: Boolean = js.native
    
    /** Removes all audio and video effects from the transcode session. */
    def clearEffects(): Unit = js.native
    
    /** Specifies whether hardware acceleration is enabled. */
    var hardwareAccelerationEnabled: Boolean = js.native
    
    /**
      * Asynchronously initializes the trancode operation on the specified file and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
      * @param source The source file.
      * @param destination The destination file.
      * @param profile The profile to use for the operation.
      * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
      */
    def prepareFileTranscodeAsync(source: IStorageFile, destination: IStorageFile, profile: MediaEncodingProfile): IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
    
    /**
      * Asynchronously initializes the trancode operation on the specified media source and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
      * @param source The media source to perform the transcode operation on.
      * @param destination The destination stream for the transcoded media data.
      * @param profile The profile to use for the operation.
      * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
      */
    def prepareMediaStreamSourceTranscodeAsync(source: IMediaSource, destination: IRandomAccessStream, profile: MediaEncodingProfile): IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
    
    /**
      * Asynchronously initializes the trancode operation on the specified stream and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
      * @param source The source stream.
      * @param destination The destination stream.
      * @param profile The profile to use for the operation.
      * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
      */
    def prepareStreamTranscodeAsync(source: IRandomAccessStream, destination: IRandomAccessStream, profile: MediaEncodingProfile): IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
    
    /** Gets or sets the time interval to trim from the start of the output. */
    var trimStartTime: Double = js.native
    
    /** Gets or sets the time interval to trim from the end of the output. */
    var trimStopTime: Double = js.native
    
    /** Gets or sets the video processing algorithm which will be used for transcoding. */
    var videoProcessingAlgorithm: MediaVideoProcessingAlgorithm = js.native
  }
  
  /** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
  trait PrepareTranscodeResult extends StObject {
    
    /** Indicates whether the trancode operation can be performed successfully. */
    var canTranscode: Boolean
    
    /** Specifies the reason for the transcode failure. */
    var failureReason: TranscodeFailureReason
    
    /**
      * Creates an object to perform an asynchronous media transcode operation on media data.
      * @return An object that is used to control the asynchronous operation.
      */
    def transcodeAsync(): IPromiseWithIAsyncActionWithProgress[Double]
  }
  object PrepareTranscodeResult {
    
    @scala.inline
    def apply(
      canTranscode: Boolean,
      failureReason: TranscodeFailureReason,
      transcodeAsync: () => IPromiseWithIAsyncActionWithProgress[Double]
    ): PrepareTranscodeResult = {
      val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
      __obj.asInstanceOf[PrepareTranscodeResult]
    }
    
    @scala.inline
    implicit class PrepareTranscodeResultMutableBuilder[Self <: PrepareTranscodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanTranscode(value: Boolean): Self = StObject.set(x, "canTranscode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureReason(value: TranscodeFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeAsync(value: () => IPromiseWithIAsyncActionWithProgress[Double]): Self = StObject.set(x, "transcodeAsync", js.Any.fromFunction0(value))
    }
  }
}
