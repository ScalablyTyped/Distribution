package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxPhotoResolution extends js.Object

/** Determines the highest resolution the user can select for capturing photos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
@js.native
object CameraCaptureUIMaxPhotoResolution extends js.Object {
  /** The user can select any resolution. */
  @js.native
  sealed trait highestAvailable
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 1920 X 1080, or a similar 4:3 resolution. */
  @js.native
  sealed trait large3M
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 1024 X 768, or a similar 16:9 resolution. */
  @js.native
  sealed trait mediumXga
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 320 X 240, or a similar 16:9 resolution. */
  @js.native
  sealed trait smallVga
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 5MP. */
  @js.native
  sealed trait veryLarge5M
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 320 X 240, or a similar 16:9 resolution. */
  @js.native
  sealed trait verySmallQvga
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution
  
  val highestAvailable: highestAvailable with java.lang.String = js.native
  val large3M: large3M with java.lang.String = js.native
  val mediumXga: mediumXga with java.lang.String = js.native
  val smallVga: smallVga with java.lang.String = js.native
  val veryLarge5M: veryLarge5M with java.lang.String = js.native
  val verySmallQvga: verySmallQvga with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxPhotoResolution with java.lang.String
  ] = js.native
}

