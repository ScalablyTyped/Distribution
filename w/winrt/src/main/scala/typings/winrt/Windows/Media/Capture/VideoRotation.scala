package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val clockwise180Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise180Degrees with Double = js.native
  /* 3 */ val clockwise270Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise270Degrees with Double = js.native
  /* 1 */ val clockwise90Degrees: typings.winrt.Windows.Media.Capture.VideoRotation.clockwise90Degrees with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Media.Capture.VideoRotation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoRotation with Double] = js.native
}

