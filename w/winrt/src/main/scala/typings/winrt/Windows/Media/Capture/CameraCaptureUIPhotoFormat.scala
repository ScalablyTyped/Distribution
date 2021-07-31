package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIPhotoFormat extends StObject
@JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoFormat")
@js.native
object CameraCaptureUIPhotoFormat extends StObject {
  
  @js.native
  sealed trait jpeg
    extends StObject
       with CameraCaptureUIPhotoFormat
  
  @js.native
  sealed trait jpegXR
    extends StObject
       with CameraCaptureUIPhotoFormat
  
  @js.native
  sealed trait png
    extends StObject
       with CameraCaptureUIPhotoFormat
}
