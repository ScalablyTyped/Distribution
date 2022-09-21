package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for transcoding audio and video files. */
object Transcoding {
  
  /** Transcodes audio and video files. */
  @JSGlobal("Windows.Media.Transcoding.MediaTranscoder")
  @js.native
  /** Creates a new instance of the MediaTranscoder class. */
  open class MediaTranscoder ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Transcoding.MediaTranscoder
  
  /** Defines the available algorithms used by the Transcode Video Processor (XVP). */
  @JSGlobal("Windows.Media.Transcoding.MediaVideoProcessingAlgorithm")
  @js.native
  object MediaVideoProcessingAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm & Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.default & Double = js.native
    
    /* 1 */ val mrfCrf444: typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.mrfCrf444 & Double = js.native
  }
  
  /** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
  @JSGlobal("Windows.Media.Transcoding.PrepareTranscodeResult")
  @js.native
  abstract class PrepareTranscodeResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Transcoding.PrepareTranscodeResult {
    
    /** Indicates whether the trancode operation can be performed successfully. */
    /* CompleteClass */
    var canTranscode: Boolean = js.native
    
    /** Specifies the reason for the transcode failure. */
    /* CompleteClass */
    var failureReason: TranscodeFailureReason = js.native
    
    /**
      * Creates an object to perform an asynchronous media transcode operation on media data.
      * @return An object that is used to control the asynchronous operation.
      */
    /* CompleteClass */
    override def transcodeAsync(): IPromiseWithIAsyncActionWithProgress[Double] = js.native
  }
  
  /** Specifies the reason the transcode operation failed. */
  @JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
  @js.native
  object TranscodeFailureReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason & Double] = js.native
    
    /* 3 */ val codecNotFound: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound & Double = js.native
    
    /* 2 */ val invalidProfile: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.none & Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.unknown & Double = js.native
  }
}
