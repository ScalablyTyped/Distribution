package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIPhotoFormat extends StObject
/** Determines the format for storing captured photos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoFormat")
@js.native
object CameraCaptureUIPhotoFormat extends StObject {
  
  /** JPEG format. */
  @js.native
  sealed trait jpeg extends CameraCaptureUIPhotoFormat
  
  /** JPEG-XR format. */
  @js.native
  sealed trait jpegXR extends CameraCaptureUIPhotoFormat
  
  /** PNG format. */
  @js.native
  sealed trait png extends CameraCaptureUIPhotoFormat
}
