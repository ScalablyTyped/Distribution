package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxPhotoResolution extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
@js.native
object CameraCaptureUIMaxPhotoResolution extends js.Object {
  @js.native
  sealed trait highestAvailable extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait large3M extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait mediumXga extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait smallVga extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait veryLarge5M extends CameraCaptureUIMaxPhotoResolution
  
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

