package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIVideoFormat extends StObject
/** Determines the format for saving captured videos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
@js.native
object CameraCaptureUIVideoFormat extends StObject {
  
  /** MP4/H.264/AAC format. */
  @js.native
  sealed trait mp4
    extends StObject
       with CameraCaptureUIVideoFormat
  
  /** WMV format. */
  @js.native
  sealed trait wmv
    extends StObject
       with CameraCaptureUIVideoFormat
}
