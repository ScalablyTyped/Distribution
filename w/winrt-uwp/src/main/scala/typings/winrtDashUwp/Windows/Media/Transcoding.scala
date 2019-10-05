package typings.winrtDashUwp.Windows.Media

import typings.winrtDashUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Media.Core.IMediaSource
import typings.winrtDashUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtDashUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm
import typings.winrtDashUwp.Windows.Media.Transcoding.PrepareTranscodeResult
import typings.winrtDashUwp.Windows.Media.Transcoding.TranscodeFailureReason
import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes for transcoding audio and video files. */
@JSGlobal("Windows.Media.Transcoding")
@js.native
object Transcoding extends js.Object {
  /** Transcodes audio and video files. */
  @js.native
  /** Creates a new instance of the MediaTranscoder class. */
  class MediaTranscoder () extends js.Object {
    /** Specifies whether the media transcoder always re-encodes the source. */
    var alwaysReencode: Boolean = js.native
    /** Specifies whether hardware acceleration is enabled. */
    var hardwareAccelerationEnabled: Boolean = js.native
    /** Gets or sets the time interval to trim from the start of the output. */
    var trimStartTime: Double = js.native
    /** Gets or sets the time interval to trim from the end of the output. */
    var trimStopTime: Double = js.native
    /** Gets or sets the video processing algorithm which will be used for transcoding. */
    var videoProcessingAlgorithm: MediaVideoProcessingAlgorithm = js.native
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
    /** Removes all audio and video effects from the transcode session. */
    def clearEffects(): Unit = js.native
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
  }
  
  @js.native
  sealed trait MediaVideoProcessingAlgorithm extends js.Object
  
  /** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
  @js.native
  abstract class PrepareTranscodeResult () extends js.Object {
    /** Indicates whether the trancode operation can be performed successfully. */
    var canTranscode: Boolean = js.native
    /** Specifies the reason for the transcode failure. */
    var failureReason: TranscodeFailureReason = js.native
    /**
      * Creates an object to perform an asynchronous media transcode operation on media data.
      * @return An object that is used to control the asynchronous operation.
      */
    def transcodeAsync(): IPromiseWithIAsyncActionWithProgress[Double] = js.native
  }
  
  @js.native
  sealed trait TranscodeFailureReason extends js.Object
  
  /** Defines the available algorithms used by the Transcode Video Processor (XVP). */
  @js.native
  object MediaVideoProcessingAlgorithm extends js.Object {
    /** Default video processing algorithm. This algorithm prefers performance, speed, and space over quality. This algorithm will makes use of hardware. */
    @js.native
    sealed trait default extends MediaVideoProcessingAlgorithm
    
    /** Prefers quality over performance. This mode always runs in software and insures that hardware implementations, which may differ from the XVP are not used. */
    @js.native
    sealed trait mrfCrf444 extends MediaVideoProcessingAlgorithm
    
    /* 0 */ val default: typings.winrtDashUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.default with Double = js.native
    /* 1 */ val mrfCrf444: typings.winrtDashUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.mrfCrf444 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaVideoProcessingAlgorithm with Double] = js.native
  }
  
  /** Specifies the reason the transcode operation failed. */
  @js.native
  object TranscodeFailureReason extends js.Object {
    /** The codec was not found. */
    @js.native
    sealed trait codecNotFound extends TranscodeFailureReason
    
    /** Profile is invalid. */
    @js.native
    sealed trait invalidProfile extends TranscodeFailureReason
    
    /** None. */
    @js.native
    sealed trait none extends TranscodeFailureReason
    
    /** Reason unknown. */
    @js.native
    sealed trait unknown extends TranscodeFailureReason
    
    /* 3 */ val codecNotFound: typings.winrtDashUwp.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
    /* 2 */ val invalidProfile: typings.winrtDashUwp.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
    /* 0 */ val none: typings.winrtDashUwp.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
    /* 1 */ val unknown: typings.winrtDashUwp.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TranscodeFailureReason with Double] = js.native
  }
  
}

