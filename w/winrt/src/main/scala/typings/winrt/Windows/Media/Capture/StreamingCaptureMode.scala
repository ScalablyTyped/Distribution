package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreamingCaptureMode extends js.Object
@JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
@js.native
object StreamingCaptureMode extends js.Object {
  
  @js.native
  sealed trait audio extends StreamingCaptureMode
  
  @js.native
  sealed trait audioAndVideo extends StreamingCaptureMode
  
  @js.native
  sealed trait video extends StreamingCaptureMode
}
