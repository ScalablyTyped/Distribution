package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIMaxVideoResolution extends StObject
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
@js.native
object CameraCaptureUIMaxVideoResolution extends StObject {
  
  @js.native
  sealed trait highDefinition
    extends StObject
       with CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait highestAvailable
    extends StObject
       with CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait lowDefinition
    extends StObject
       with CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait standardDefinition
    extends StObject
       with CameraCaptureUIMaxVideoResolution
}
