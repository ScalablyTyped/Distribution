package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialManipulationCompletedEventArgs extends StObject {
  
  var interactionSourceKind: Any
  
  /* unmapped type */
  var tryGetCumulativeDelta: Any
}
object SpatialManipulationCompletedEventArgs {
  
  inline def apply(interactionSourceKind: Any, tryGetCumulativeDelta: Any): SpatialManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationCompletedEventArgs]
  }
  
  extension [Self <: SpatialManipulationCompletedEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTryGetCumulativeDelta(value: Any): Self = StObject.set(x, "tryGetCumulativeDelta", value.asInstanceOf[js.Any])
  }
}
