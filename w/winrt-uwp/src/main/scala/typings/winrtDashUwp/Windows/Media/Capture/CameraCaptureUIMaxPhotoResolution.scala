package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.highestAvailable
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.large3M
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.mediumXga
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.smallVga
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.veryLarge5M
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.verySmallQvga
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMaxPhotoResolution with Double] = js.native
  /* 0 */ @js.native
  object highestAvailable extends TopLevel[highestAvailable with Double]
  
  /* 4 */ @js.native
  object large3M extends TopLevel[large3M with Double]
  
  /* 3 */ @js.native
  object mediumXga extends TopLevel[mediumXga with Double]
  
  /* 2 */ @js.native
  object smallVga extends TopLevel[smallVga with Double]
  
  /* 5 */ @js.native
  object veryLarge5M extends TopLevel[veryLarge5M with Double]
  
  /* 1 */ @js.native
  object verySmallQvga extends TopLevel[verySmallQvga with Double]
  
}

