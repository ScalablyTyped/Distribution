package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppCaptureVideoEncodingResolutionMode with Double] = js.native
  /* 0 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 1 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 2 */ @js.native
  object standard extends TopLevel[standard with Double]
  
}

