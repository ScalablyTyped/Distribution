package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for transcoding audio and video files. */
object Transcoding {
  
  /** Transcodes audio and video files. */
  @JSGlobal("Windows.Media.Transcoding.MediaTranscoder")
  @js.native
  /** Creates a new instance of the MediaTranscoder class. */
  class MediaTranscoder ()
    extends typings.winrtUwp.Windows.Media.Transcoding.MediaTranscoder
  
  /** Defines the available algorithms used by the Transcode Video Processor (XVP). */
  @JSGlobal("Windows.Media.Transcoding.MediaVideoProcessingAlgorithm")
  @js.native
  object MediaVideoProcessingAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm with Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.default with Double = js.native
    
    /* 1 */ val mrfCrf444: typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.mrfCrf444 with Double = js.native
  }
  
  /** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
  @JSGlobal("Windows.Media.Transcoding.PrepareTranscodeResult")
  @js.native
  abstract class PrepareTranscodeResult ()
    extends typings.winrtUwp.Windows.Media.Transcoding.PrepareTranscodeResult
  
  /** Specifies the reason the transcode operation failed. */
  @JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
  @js.native
  object TranscodeFailureReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason with Double] = js.native
    
    /* 3 */ val codecNotFound: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
    
    /* 2 */ val invalidProfile: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
  }
}
