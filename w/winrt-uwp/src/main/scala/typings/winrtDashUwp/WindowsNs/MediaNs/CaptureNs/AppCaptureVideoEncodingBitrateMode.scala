package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

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
  
  /* 0 */ val custom: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingBitrateMode.custom with Double = js.native
  /* 1 */ val high: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingBitrateMode.high with Double = js.native
  /* 2 */ val standard: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingBitrateMode.standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppCaptureVideoEncodingBitrateMode with Double] = js.native
}

