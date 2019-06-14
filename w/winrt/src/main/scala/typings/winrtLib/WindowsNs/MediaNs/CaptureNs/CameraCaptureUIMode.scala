package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMode extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends js.Object {
  @js.native
  sealed trait photo
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode
  
  @js.native
  sealed trait photoOrVideo
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode
  
  @js.native
  sealed trait video
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode
  
  /* 1 */ val photo: photo with scala.Double = js.native
  /* 0 */ val photoOrVideo: photoOrVideo with scala.Double = js.native
  /* 2 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode with scala.Double] = js.native
}

