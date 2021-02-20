package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIMaxPhotoResolution extends StObject
/** Determines the highest resolution the user can select for capturing photos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
@js.native
object CameraCaptureUIMaxPhotoResolution extends StObject {
  
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
}
