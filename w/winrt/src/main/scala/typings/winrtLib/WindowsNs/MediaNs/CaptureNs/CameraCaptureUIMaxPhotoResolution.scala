package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxPhotoResolution extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
@js.native
object CameraCaptureUIMaxPhotoResolution extends js.Object {
  @js.native
  sealed trait highestAvailable
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait large3M
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait mediumXga
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait smallVga
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait veryLarge5M
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait verySmallQvga
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  val highestAvailable: highestAvailable with java.lang.String = js.native
  val large3M: large3M with java.lang.String = js.native
  val mediumXga: mediumXga with java.lang.String = js.native
  val smallVga: smallVga with java.lang.String = js.native
  val veryLarge5M: veryLarge5M with java.lang.String = js.native
  val verySmallQvga: verySmallQvga with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution with java.lang.String
  ] = js.native
}

