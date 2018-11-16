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
  
  val clockwise180Degrees: clockwise180Degrees with java.lang.String = js.native
  val clockwise270Degrees: clockwise270Degrees with java.lang.String = js.native
  val clockwise90Degrees: clockwise90Degrees with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.VideoRotation with java.lang.String] = js.native
}

