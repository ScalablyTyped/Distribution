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
  
  val photo: photo with java.lang.String = js.native
  val photoOrVideo: photoOrVideo with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode with java.lang.String] = js.native
}

