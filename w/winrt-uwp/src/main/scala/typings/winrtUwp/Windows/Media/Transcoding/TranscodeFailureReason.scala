package typings.winrtUwp.Windows.Media.Transcoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TranscodeFailureReason extends js.Object

/** Specifies the reason the transcode operation failed. */
@JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
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
  
}

