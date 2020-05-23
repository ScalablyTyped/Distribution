package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdaptiveMediaSourceAdvancedSettings extends js.Object {
  var allSegmentsIndependent: js.Any
   /* unmapped type */ var bitrateDowngradeTriggerRatio: js.Any
   /* unmapped type */ var desiredBitrateHeadroomRatio: js.Any
}

object AdaptiveMediaSourceAdvancedSettings {
  @scala.inline
  def apply(
    allSegmentsIndependent: js.Any,
    bitrateDowngradeTriggerRatio: js.Any,
    desiredBitrateHeadroomRatio: js.Any
  ): AdaptiveMediaSourceAdvancedSettings = {
    val __obj = js.Dynamic.literal(allSegmentsIndependent = allSegmentsIndependent.asInstanceOf[js.Any], bitrateDowngradeTriggerRatio = bitrateDowngradeTriggerRatio.asInstanceOf[js.Any], desiredBitrateHeadroomRatio = desiredBitrateHeadroomRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceAdvancedSettings]
  }
}

