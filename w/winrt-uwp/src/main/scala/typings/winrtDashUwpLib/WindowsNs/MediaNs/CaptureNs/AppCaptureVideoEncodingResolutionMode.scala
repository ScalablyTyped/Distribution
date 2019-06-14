package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

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
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingResolutionMode
  
  /** High resolution. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingResolutionMode
  
  /** Standard resolution. */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingResolutionMode
  
  /* 0 */ val custom: custom with scala.Double = js.native
  /* 1 */ val high: high with scala.Double = js.native
  /* 2 */ val standard: standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingResolutionMode with scala.Double
  ] = js.native
}

