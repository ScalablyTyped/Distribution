package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreamingCaptureMode extends StObject
@JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
@js.native
object StreamingCaptureMode extends StObject {
  
  @js.native
  sealed trait audio
    extends StObject
       with StreamingCaptureMode
  
  @js.native
  sealed trait audioAndVideo
    extends StObject
       with StreamingCaptureMode
  
  @js.native
  sealed trait video
    extends StObject
       with StreamingCaptureMode
}
