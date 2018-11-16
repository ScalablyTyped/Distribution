package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppCaptureHistoricalBufferLengthUnit extends js.Object

/** Specifies the units of the app capture historical buffer. */
@JSGlobal("Windows.Media.Capture.AppCaptureHistoricalBufferLengthUnit")
@js.native
object AppCaptureHistoricalBufferLengthUnit extends js.Object {
  /** Megabytes */
  @js.native
  sealed trait megabytes
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureHistoricalBufferLengthUnit
  
  /** Seconds */
  @js.native
  sealed trait seconds
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureHistoricalBufferLengthUnit
  
  val megabytes: megabytes with java.lang.String = js.native
  val seconds: seconds with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureHistoricalBufferLengthUnit with java.lang.String
  ] = js.native
}

