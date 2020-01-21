package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the VideoStabilizationEffect::EnabledChanged event. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffectEnabledChangedEventArgs")
@js.native
abstract class VideoStabilizationEffectEnabledChangedEventArgs () extends js.Object {
  /** Gets a value indicating the reason why the VideoStabilizationEffect::Enabled property changed. */
  var reason: VideoStabilizationEffectEnabledChangedReason = js.native
}

