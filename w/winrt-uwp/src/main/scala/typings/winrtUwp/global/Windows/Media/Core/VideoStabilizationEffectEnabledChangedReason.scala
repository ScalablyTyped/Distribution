package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the reason why the VideoStabilizationEffect::Enabled property changed. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason")
@js.native
object VideoStabilizationEffectEnabledChangedReason extends js.Object {
  /* 1 */ val pixelRateTooHigh: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.pixelRateTooHigh with Double = js.native
  /* 0 */ val programmatic: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.programmatic with Double = js.native
  /* 2 */ val runningSlowly: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.runningSlowly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason with Double
  ] = js.native
}

