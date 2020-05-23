package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the VideoStabilizationEffect::EnabledChanged event. */
trait VideoStabilizationEffectEnabledChangedEventArgs extends js.Object {
  /** Gets a value indicating the reason why the VideoStabilizationEffect::Enabled property changed. */
  var reason: VideoStabilizationEffectEnabledChangedReason
}

object VideoStabilizationEffectEnabledChangedEventArgs {
  @scala.inline
  def apply(reason: VideoStabilizationEffectEnabledChangedReason): VideoStabilizationEffectEnabledChangedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStabilizationEffectEnabledChangedEventArgs]
  }
}

