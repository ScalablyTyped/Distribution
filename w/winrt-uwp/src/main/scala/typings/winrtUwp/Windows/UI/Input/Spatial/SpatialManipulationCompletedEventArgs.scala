package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialManipulationCompletedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
  
  /* unmapped type */
  var tryGetCumulativeDelta: js.Any
}
object SpatialManipulationCompletedEventArgs {
  
  inline def apply(interactionSourceKind: js.Any, tryGetCumulativeDelta: js.Any): SpatialManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationCompletedEventArgs]
  }
  
  extension [Self <: SpatialManipulationCompletedEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTryGetCumulativeDelta(value: js.Any): Self = StObject.set(x, "tryGetCumulativeDelta", value.asInstanceOf[js.Any])
  }
}
