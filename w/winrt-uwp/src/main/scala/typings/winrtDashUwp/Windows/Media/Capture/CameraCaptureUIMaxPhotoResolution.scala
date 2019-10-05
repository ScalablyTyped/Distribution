package typings.winrtDashUwp.Windows.Media.Capture

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
  sealed trait highestAvailable extends CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 1920 X 1080, or a similar 4:3 resolution. */
  @js.native
  sealed trait large3M extends CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 1024 X 768, or a similar 16:9 resolution. */
  @js.native
  sealed trait mediumXga extends CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 320 X 240, or a similar 16:9 resolution. */
  @js.native
  sealed trait smallVga extends CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 5MP. */
  @js.native
  sealed trait veryLarge5M extends CameraCaptureUIMaxPhotoResolution
  
  /** The user can select resolutions up to 320 X 240, or a similar 16:9 resolution. */
  @js.native
  sealed trait verySmallQvga extends CameraCaptureUIMaxPhotoResolution
  
  /* 0 */ val highestAvailable: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.highestAvailable with Double = js.native
  /* 4 */ val large3M: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.large3M with Double = js.native
  /* 3 */ val mediumXga: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.mediumXga with Double = js.native
  /* 2 */ val smallVga: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.smallVga with Double = js.native
  /* 5 */ val veryLarge5M: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.veryLarge5M with Double = js.native
  /* 1 */ val verySmallQvga: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.verySmallQvga with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMaxPhotoResolution with Double] = js.native
}

