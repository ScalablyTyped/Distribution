package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoStabilizationEffectEnabledChangedReason extends StObject
/** Specifies the reason why the VideoStabilizationEffect::Enabled property changed. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason")
@js.native
object VideoStabilizationEffectEnabledChangedReason extends StObject {
  
  /** The pixel rate of the video stream was too high. */
  @js.native
  sealed trait pixelRateTooHigh
    extends StObject
       with VideoStabilizationEffectEnabledChangedReason
  
  /** The value was changed programmatically from app code. */
  @js.native
  sealed trait programmatic
    extends StObject
       with VideoStabilizationEffectEnabledChangedReason
  
  /** The video stabilization effect was running slowly. */
  @js.native
  sealed trait runningSlowly
    extends StObject
       with VideoStabilizationEffectEnabledChangedReason
}
