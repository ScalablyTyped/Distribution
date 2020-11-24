package typings.winrt.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.Transcoding")
@js.native
object Transcoding extends js.Object {
  
  @js.native
  class MediaTranscoder ()
    extends typings.winrt.Windows.Media.Transcoding.MediaTranscoder
  
  @js.native
  class PrepareTranscodeResult ()
    extends typings.winrt.Windows.Media.Transcoding.PrepareTranscodeResult
  
  @js.native
  object TranscodeFailureReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason with Double] = js.native
    
    /* 3 */ val codecNotFound: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
    
    /* 2 */ val invalidProfile: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
    
    /* 1 */ val unknown: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
  }
}
