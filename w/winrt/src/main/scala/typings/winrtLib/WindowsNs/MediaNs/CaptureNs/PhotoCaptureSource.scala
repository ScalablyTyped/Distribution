package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoCaptureSource extends js.Object

@JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
@js.native
object PhotoCaptureSource extends js.Object {
  @js.native
  sealed trait auto
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource
  
  @js.native
  sealed trait photo
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource
  
  @js.native
  sealed trait videoPreview
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 2 */ val photo: photo with scala.Double = js.native
  /* 1 */ val videoPreview: videoPreview with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource with scala.Double] = js.native
}

