package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIMode extends StObject
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends StObject {
  
  @js.native
  sealed trait photo
    extends StObject
       with CameraCaptureUIMode
  
  @js.native
  sealed trait photoOrVideo
    extends StObject
       with CameraCaptureUIMode
  
  @js.native
  sealed trait video
    extends StObject
       with CameraCaptureUIMode
}
