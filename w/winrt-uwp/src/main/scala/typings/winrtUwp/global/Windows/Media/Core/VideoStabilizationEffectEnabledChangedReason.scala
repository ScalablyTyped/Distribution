package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the reason why the VideoStabilizationEffect::Enabled property changed. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason")
@js.native
object VideoStabilizationEffectEnabledChangedReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason & Double
  ] = js.native
  
  /* 1 */ val pixelRateTooHigh: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.pixelRateTooHigh & Double = js.native
  
  /* 0 */ val programmatic: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.programmatic & Double = js.native
  
  /* 2 */ val runningSlowly: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason.runningSlowly & Double = js.native
}
