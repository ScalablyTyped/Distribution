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
  
  val custom: custom with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  val standard: standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureVideoEncodingResolutionMode with java.lang.String
  ] = js.native
}

