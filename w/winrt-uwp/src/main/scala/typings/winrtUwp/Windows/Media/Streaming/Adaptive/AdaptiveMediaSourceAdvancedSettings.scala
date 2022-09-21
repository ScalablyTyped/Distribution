package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptiveMediaSourceAdvancedSettings extends StObject {
  
  var allSegmentsIndependent: Any
  
  /* unmapped type */
  var bitrateDowngradeTriggerRatio: Any
  
  /* unmapped type */
  var desiredBitrateHeadroomRatio: Any
}
object AdaptiveMediaSourceAdvancedSettings {
  
  inline def apply(allSegmentsIndependent: Any, bitrateDowngradeTriggerRatio: Any, desiredBitrateHeadroomRatio: Any): AdaptiveMediaSourceAdvancedSettings = {
    val __obj = js.Dynamic.literal(allSegmentsIndependent = allSegmentsIndependent.asInstanceOf[js.Any], bitrateDowngradeTriggerRatio = bitrateDowngradeTriggerRatio.asInstanceOf[js.Any], desiredBitrateHeadroomRatio = desiredBitrateHeadroomRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceAdvancedSettings]
  }
  
  extension [Self <: AdaptiveMediaSourceAdvancedSettings](x: Self) {
    
    inline def setAllSegmentsIndependent(value: Any): Self = StObject.set(x, "allSegmentsIndependent", value.asInstanceOf[js.Any])
    
    inline def setBitrateDowngradeTriggerRatio(value: Any): Self = StObject.set(x, "bitrateDowngradeTriggerRatio", value.asInstanceOf[js.Any])
    
    inline def setDesiredBitrateHeadroomRatio(value: Any): Self = StObject.set(x, "desiredBitrateHeadroomRatio", value.asInstanceOf[js.Any])
  }
}
