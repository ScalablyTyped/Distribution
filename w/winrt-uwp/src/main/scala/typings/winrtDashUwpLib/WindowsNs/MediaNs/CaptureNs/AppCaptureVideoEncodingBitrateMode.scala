package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

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
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingBitrateMode
  
  /** High bitrate. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingBitrateMode
  
  /** Standard bitrate. */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingBitrateMode
  
  val custom: custom with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  val standard: standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingBitrateMode with java.lang.String
  ] = js.native
}

