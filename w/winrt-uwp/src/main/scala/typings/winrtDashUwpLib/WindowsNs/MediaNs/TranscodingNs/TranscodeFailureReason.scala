package typings
package winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs

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
  sealed trait codecNotFound
    extends winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  /** Profile is invalid. */
  @js.native
  sealed trait invalidProfile
    extends winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  /** None. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  /** Reason unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  val codecNotFound: codecNotFound with java.lang.String = js.native
  val invalidProfile: invalidProfile with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason with java.lang.String
  ] = js.native
}

