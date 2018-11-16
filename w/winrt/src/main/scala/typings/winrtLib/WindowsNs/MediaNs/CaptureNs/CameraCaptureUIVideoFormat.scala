package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIVideoFormat extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
@js.native
object CameraCaptureUIVideoFormat extends js.Object {
  @js.native
  sealed trait mp4
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat
  
  @js.native
  sealed trait wmv
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat
  
  val mp4: mp4 with java.lang.String = js.native
  val wmv: wmv with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIVideoFormat with java.lang.String
  ] = js.native
}

