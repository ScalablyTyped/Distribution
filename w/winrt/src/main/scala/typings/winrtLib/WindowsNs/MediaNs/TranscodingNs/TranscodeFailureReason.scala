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
  
  val codecNotFound: codecNotFound with java.lang.String = js.native
  val invalidProfile: invalidProfile with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason with java.lang.String
  ] = js.native
}

