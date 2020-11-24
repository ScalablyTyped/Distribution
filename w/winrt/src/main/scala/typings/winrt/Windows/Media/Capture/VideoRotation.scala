package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoRotation extends js.Object
@JSGlobal("Windows.Media.Capture.VideoRotation")
@js.native
object VideoRotation extends js.Object {
  
  @js.native
  sealed trait clockwise180Degrees extends VideoRotation
  
  @js.native
  sealed trait clockwise270Degrees extends VideoRotation
  
  @js.native
  sealed trait clockwise90Degrees extends VideoRotation
  
  @js.native
  sealed trait none extends VideoRotation
}
