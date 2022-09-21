package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSourceProperties extends StObject {
  
  var sourceLossRisk: Any
  
  /* unmapped type */
  var tryGetLocation: Any
  
  /* unmapped type */
  var tryGetSourceLossMitigationDirection: Any
}
object SpatialInteractionSourceProperties {
  
  inline def apply(sourceLossRisk: Any, tryGetLocation: Any, tryGetSourceLossMitigationDirection: Any): SpatialInteractionSourceProperties = {
    val __obj = js.Dynamic.literal(sourceLossRisk = sourceLossRisk.asInstanceOf[js.Any], tryGetLocation = tryGetLocation.asInstanceOf[js.Any], tryGetSourceLossMitigationDirection = tryGetSourceLossMitigationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceProperties]
  }
  
  extension [Self <: SpatialInteractionSourceProperties](x: Self) {
    
    inline def setSourceLossRisk(value: Any): Self = StObject.set(x, "sourceLossRisk", value.asInstanceOf[js.Any])
    
    inline def setTryGetLocation(value: Any): Self = StObject.set(x, "tryGetLocation", value.asInstanceOf[js.Any])
    
    inline def setTryGetSourceLossMitigationDirection(value: Any): Self = StObject.set(x, "tryGetSourceLossMitigationDirection", value.asInstanceOf[js.Any])
  }
}
