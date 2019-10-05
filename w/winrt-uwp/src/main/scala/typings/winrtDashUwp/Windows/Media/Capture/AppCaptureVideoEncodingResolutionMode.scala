package typings.winrtDashUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppCaptureVideoEncodingResolutionMode extends js.Object

/** Specifies the app capture video encoding resolution mode. */
@JSGlobal("Windows.Media.Capture.AppCaptureVideoEncodingResolutionMode")
@js.native
object AppCaptureVideoEncodingResolutionMode extends js.Object {
  /** Custom resolution. */
  @js.native
  sealed trait custom extends AppCaptureVideoEncodingResolutionMode
  
  /** High resolution. */
  @js.native
  sealed trait high extends AppCaptureVideoEncodingResolutionMode
  
  /** Standard resolution. */
  @js.native
  sealed trait standard extends AppCaptureVideoEncodingResolutionMode
  
  /* 0 */ val custom: typings.winrtDashUwp.Windows.Media.Capture.AppCaptureVideoEncodingResolutionMode.custom with Double = js.native
  /* 1 */ val high: typings.winrtDashUwp.Windows.Media.Capture.AppCaptureVideoEncodingResolutionMode.high with Double = js.native
  /* 2 */ val standard: typings.winrtDashUwp.Windows.Media.Capture.AppCaptureVideoEncodingResolutionMode.standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppCaptureVideoEncodingResolutionMode with Double] = js.native
}

