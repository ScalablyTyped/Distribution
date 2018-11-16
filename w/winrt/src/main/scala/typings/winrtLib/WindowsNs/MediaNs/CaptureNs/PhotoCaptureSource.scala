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
  
  val auto: auto with java.lang.String = js.native
  val photo: photo with java.lang.String = js.native
  val videoPreview: videoPreview with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource with java.lang.String] = js.native
}

