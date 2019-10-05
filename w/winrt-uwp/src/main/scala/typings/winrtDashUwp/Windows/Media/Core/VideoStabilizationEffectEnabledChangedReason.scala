package typings.winrtDashUwp.Windows.Media.Core

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
  sealed trait pixelRateTooHigh extends VideoStabilizationEffectEnabledChangedReason
  
  /** The value was changed programmatically from app code. */
  @js.native
  sealed trait programmatic extends VideoStabilizationEffectEnabledChangedReason
  
  /** The video stabilization effect was running slowly. */
  @js.native
  sealed trait runningSlowly extends VideoStabilizationEffectEnabledChangedReason
  
  /* 1 */ val pixelRateTooHigh: typings.winrtDashUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.pixelRateTooHigh with Double = js.native
  /* 0 */ val programmatic: typings.winrtDashUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.programmatic with Double = js.native
  /* 2 */ val runningSlowly: typings.winrtDashUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.runningSlowly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoStabilizationEffectEnabledChangedReason with Double] = js.native
}

