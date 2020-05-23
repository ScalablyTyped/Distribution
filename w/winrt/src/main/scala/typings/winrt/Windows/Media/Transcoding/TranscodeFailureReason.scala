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
  
}

