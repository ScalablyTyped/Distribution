package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppCaptureHistoricalBufferLengthUnit with Double] = js.native
  /* 0 */ @js.native
  object megabytes extends TopLevel[megabytes with Double]
  
  /* 1 */ @js.native
  object seconds extends TopLevel[seconds with Double]
  
}

