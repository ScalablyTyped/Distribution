package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the VideoStabilizationEffect::EnabledChanged event. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffectEnabledChangedEventArgs")
@js.native
abstract class VideoStabilizationEffectEnabledChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedEventArgs {
  /** Gets a value indicating the reason why the VideoStabilizationEffect::Enabled property changed. */
  /* CompleteClass */
  override var reason: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason = js.native
}

