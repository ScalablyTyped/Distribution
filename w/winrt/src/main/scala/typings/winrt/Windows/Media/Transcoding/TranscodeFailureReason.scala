package typings.winrt.Windows.Media.Transcoding

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound
import typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile
import typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.none
import typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TranscodeFailureReason with Double] = js.native
  /* 3 */ @js.native
  object codecNotFound extends TopLevel[codecNotFound with Double]
  
  /* 2 */ @js.native
  object invalidProfile extends TopLevel[invalidProfile with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

