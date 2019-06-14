package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoStabilizationEffectEnabledChangedReason extends js.Object

/** Specifies the reason why the VideoStabilizationEffect::Enabled property changed. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason")
@js.native
object VideoStabilizationEffectEnabledChangedReason extends js.Object {
  /** The pixel rate of the video stream was too high. */
  @js.native
  sealed trait pixelRateTooHigh
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoStabilizationEffectEnabledChangedReason
  
  /** The value was changed programmatically from app code. */
  @js.native
  sealed trait programmatic
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoStabilizationEffectEnabledChangedReason
  
  /** The video stabilization effect was running slowly. */
  @js.native
  sealed trait runningSlowly
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoStabilizationEffectEnabledChangedReason
  
  /* 1 */ val pixelRateTooHigh: pixelRateTooHigh with scala.Double = js.native
  /* 0 */ val programmatic: programmatic with scala.Double = js.native
  /* 2 */ val runningSlowly: runningSlowly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoStabilizationEffectEnabledChangedReason with scala.Double
  ] = js.native
}

