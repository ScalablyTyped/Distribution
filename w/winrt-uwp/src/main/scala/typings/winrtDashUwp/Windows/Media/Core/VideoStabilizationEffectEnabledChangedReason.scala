package typings.winrtDashUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.pixelRateTooHigh
import typings.winrtDashUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.programmatic
import typings.winrtDashUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.runningSlowly
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoStabilizationEffectEnabledChangedReason with Double] = js.native
  /* 1 */ @js.native
  object pixelRateTooHigh extends TopLevel[pixelRateTooHigh with Double]
  
  /* 0 */ @js.native
  object programmatic extends TopLevel[programmatic with Double]
  
  /* 2 */ @js.native
  object runningSlowly extends TopLevel[runningSlowly with Double]
  
}

