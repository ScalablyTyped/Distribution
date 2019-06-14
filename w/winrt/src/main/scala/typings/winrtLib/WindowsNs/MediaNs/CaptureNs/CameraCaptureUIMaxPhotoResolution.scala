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
  
  /* 0 */ val highestAvailable: highestAvailable with scala.Double = js.native
  /* 4 */ val large3M: large3M with scala.Double = js.native
  /* 3 */ val mediumXga: mediumXga with scala.Double = js.native
  /* 2 */ val smallVga: smallVga with scala.Double = js.native
  /* 5 */ val veryLarge5M: veryLarge5M with scala.Double = js.native
  /* 1 */ val verySmallQvga: verySmallQvga with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution with scala.Double
  ] = js.native
}

