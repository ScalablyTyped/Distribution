package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIMaxPhotoResolution extends StObject
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
@js.native
object CameraCaptureUIMaxPhotoResolution extends StObject {
  
  @js.native
  sealed trait highestAvailable
    extends StObject
       with CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait large3M
    extends StObject
       with CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait mediumXga
    extends StObject
       with CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait smallVga
    extends StObject
       with CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait veryLarge5M
    extends StObject
       with CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait verySmallQvga
    extends StObject
       with CameraCaptureUIMaxPhotoResolution
}
