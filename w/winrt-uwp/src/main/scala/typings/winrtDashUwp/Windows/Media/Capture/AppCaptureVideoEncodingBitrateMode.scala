package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Capture.AppCaptureVideoEncodingBitrateMode.custom
import typings.winrtDashUwp.Windows.Media.Capture.AppCaptureVideoEncodingBitrateMode.high
import typings.winrtDashUwp.Windows.Media.Capture.AppCaptureVideoEncodingBitrateMode.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppCaptureVideoEncodingBitrateMode extends js.Object

/** Specifies the app capture video encoding bitrate mode. */
@JSGlobal("Windows.Media.Capture.AppCaptureVideoEncodingBitrateMode")
@js.native
object AppCaptureVideoEncodingBitrateMode extends js.Object {
  /** Custom bitrate. */
  @js.native
  sealed trait custom extends AppCaptureVideoEncodingBitrateMode
  
  /** High bitrate. */
  @js.native
  sealed trait high extends AppCaptureVideoEncodingBitrateMode
  
  /** Standard bitrate. */
  @js.native
  sealed trait standard extends AppCaptureVideoEncodingBitrateMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppCaptureVideoEncodingBitrateMode with Double] = js.native
  /* 0 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 1 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 2 */ @js.native
  object standard extends TopLevel[standard with Double]
  
}

