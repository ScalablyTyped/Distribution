package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdaptiveMediaSourceAdvancedSettings extends js.Object {
  var allSegmentsIndependent: js.Any = js.native
   /* unmapped type */ var bitrateDowngradeTriggerRatio: js.Any = js.native
   /* unmapped type */ var desiredBitrateHeadroomRatio: js.Any = js.native
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
  @scala.inline
  implicit class AdaptiveMediaSourceAdvancedSettingsOps[Self <: AdaptiveMediaSourceAdvancedSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllSegmentsIndependent(value: js.Any): Self = this.set("allSegmentsIndependent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitrateDowngradeTriggerRatio(value: js.Any): Self = this.set("bitrateDowngradeTriggerRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredBitrateHeadroomRatio(value: js.Any): Self = this.set("desiredBitrateHeadroomRatio", value.asInstanceOf[js.Any])
  }
  
}

