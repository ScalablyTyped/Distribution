package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoRotation extends js.Object

@JSGlobal("Windows.Media.Capture.VideoRotation")
@js.native
object VideoRotation extends js.Object {
  @js.native
  sealed trait clockwise180Degrees
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  @js.native
  sealed trait clockwise270Degrees
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  @js.native
  sealed trait clockwise90Degrees
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  /* 2 */ val clockwise180Degrees: clockwise180Degrees with scala.Double = js.native
  /* 3 */ val clockwise270Degrees: clockwise270Degrees with scala.Double = js.native
  /* 1 */ val clockwise90Degrees: clockwise90Degrees with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.VideoRotation with scala.Double] = js.native
}

