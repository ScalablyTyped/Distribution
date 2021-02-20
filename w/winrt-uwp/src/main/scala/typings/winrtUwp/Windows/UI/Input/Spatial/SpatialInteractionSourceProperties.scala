package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteractionSourceProperties extends StObject {
  
  var sourceLossRisk: js.Any = js.native
  
  /* unmapped type */
  var tryGetLocation: js.Any = js.native
  
  /* unmapped type */
  var tryGetSourceLossMitigationDirection: js.Any = js.native
}
object SpatialInteractionSourceProperties {
  
  @scala.inline
  def apply(sourceLossRisk: js.Any, tryGetLocation: js.Any, tryGetSourceLossMitigationDirection: js.Any): SpatialInteractionSourceProperties = {
    val __obj = js.Dynamic.literal(sourceLossRisk = sourceLossRisk.asInstanceOf[js.Any], tryGetLocation = tryGetLocation.asInstanceOf[js.Any], tryGetSourceLossMitigationDirection = tryGetSourceLossMitigationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceProperties]
  }
  
  @scala.inline
  implicit class SpatialInteractionSourcePropertiesMutableBuilder[Self <: SpatialInteractionSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceLossRisk(value: js.Any): Self = StObject.set(x, "sourceLossRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetLocation(value: js.Any): Self = StObject.set(x, "tryGetLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetSourceLossMitigationDirection(value: js.Any): Self = StObject.set(x, "tryGetSourceLossMitigationDirection", value.asInstanceOf[js.Any])
  }
}
