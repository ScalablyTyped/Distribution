package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIVideoFormat.mp4
import typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIVideoFormat.wmv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIVideoFormat extends js.Object

/** Determines the format for saving captured videos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
@js.native
object CameraCaptureUIVideoFormat extends js.Object {
  /** MP4/H.264/AAC format. */
  @js.native
  sealed trait mp4 extends CameraCaptureUIVideoFormat
  
  /** WMV format. */
  @js.native
  sealed trait wmv extends CameraCaptureUIVideoFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIVideoFormat with Double] = js.native
  /* 0 */ @js.native
  object mp4 extends TopLevel[mp4 with Double]
  
  /* 1 */ @js.native
  object wmv extends TopLevel[wmv with Double]
  
}

