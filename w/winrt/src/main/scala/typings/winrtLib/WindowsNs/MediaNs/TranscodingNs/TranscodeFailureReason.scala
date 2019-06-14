package typings
package winrtLib.WindowsNs.MediaNs.TranscodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TranscodeFailureReason extends js.Object

@JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
@js.native
object TranscodeFailureReason extends js.Object {
  @js.native
  sealed trait codecNotFound
    extends winrtLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  @js.native
  sealed trait invalidProfile
    extends winrtLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
  
  /* 3 */ val codecNotFound: codecNotFound with scala.Double = js.native
  /* 2 */ val invalidProfile: invalidProfile with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason with scala.Double
  ] = js.native
}

