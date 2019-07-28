package typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs

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
  
  /* 3 */ val codecNotFound: typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason.codecNotFound with Double = js.native
  /* 2 */ val invalidProfile: typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason.invalidProfile with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason.none with Double = js.native
  /* 1 */ val unknown: typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TranscodeFailureReason with Double] = js.native
}

