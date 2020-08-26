package typings.winrtUwp.global.Windows.Media

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
  class MediaTranscoder ()
    extends typings.winrtUwp.Windows.Media.Transcoding.MediaTranscoder
  
  /** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
  @js.native
  abstract class PrepareTranscodeResult ()
    extends typings.winrtUwp.Windows.Media.Transcoding.PrepareTranscodeResult
  
  /** Defines the available algorithms used by the Transcode Video Processor (XVP). */
  @js.native
  object MediaVideoProcessingAlgorithm extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.default with Double = js.native
    /* 1 */ val mrfCrf444: typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm.mrfCrf444 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm with Double
      ] = js.native
  }
  
  /** Specifies the reason the transcode operation failed. */
  @js.native
  object TranscodeFailureReason extends js.Object {
    /* 3 */ val codecNotFound: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
    /* 2 */ val invalidProfile: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
    /* 1 */ val unknown: typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason with Double] = js.native
  }
  
}

