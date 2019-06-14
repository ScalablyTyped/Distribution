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
  
  /* 0 */ val megabytes: megabytes with scala.Double = js.native
  /* 1 */ val seconds: seconds with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureHistoricalBufferLengthUnit with scala.Double
  ] = js.native
}

