package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptiveMediaSourceAdvancedSettings extends StObject {
  
  var allSegmentsIndependent: js.Any
  
  /* unmapped type */
  var bitrateDowngradeTriggerRatio: js.Any
  
  /* unmapped type */
  var desiredBitrateHeadroomRatio: js.Any
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
  implicit class AdaptiveMediaSourceAdvancedSettingsMutableBuilder[Self <: AdaptiveMediaSourceAdvancedSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSegmentsIndependent(value: js.Any): Self = StObject.set(x, "allSegmentsIndependent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateDowngradeTriggerRatio(value: js.Any): Self = StObject.set(x, "bitrateDowngradeTriggerRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredBitrateHeadroomRatio(value: js.Any): Self = StObject.set(x, "desiredBitrateHeadroomRatio", value.asInstanceOf[js.Any])
  }
}
