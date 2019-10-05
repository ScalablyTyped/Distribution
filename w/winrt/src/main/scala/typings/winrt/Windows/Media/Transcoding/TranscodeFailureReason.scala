package typings.winrt.Windows.Media.Transcoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TranscodeFailureReason extends js.Object

@JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
@js.native
object TranscodeFailureReason extends js.Object {
  @js.native
  sealed trait codecNotFound extends TranscodeFailureReason
  
  @js.native
  sealed trait invalidProfile extends TranscodeFailureReason
  
  @js.native
  sealed trait none extends TranscodeFailureReason
  
  @js.native
  sealed trait unknown extends TranscodeFailureReason
  
  /* 3 */ val codecNotFound: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
  /* 2 */ val invalidProfile: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
  /* 1 */ val unknown: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TranscodeFailureReason with Double] = js.native
}

