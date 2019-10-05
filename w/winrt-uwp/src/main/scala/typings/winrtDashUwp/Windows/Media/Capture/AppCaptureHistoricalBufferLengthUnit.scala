package typings.winrtDashUwp.Windows.Media.Capture

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
  sealed trait megabytes extends AppCaptureHistoricalBufferLengthUnit
  
  /** Seconds */
  @js.native
  sealed trait seconds extends AppCaptureHistoricalBufferLengthUnit
  
  /* 0 */ val megabytes: typings.winrtDashUwp.Windows.Media.Capture.AppCaptureHistoricalBufferLengthUnit.megabytes with Double = js.native
  /* 1 */ val seconds: typings.winrtDashUwp.Windows.Media.Capture.AppCaptureHistoricalBufferLengthUnit.seconds with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppCaptureHistoricalBufferLengthUnit with Double] = js.native
}

