package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialManipulationCanceledEventArgs extends StObject {
  
  var interactionSourceKind: Any
}
object SpatialManipulationCanceledEventArgs {
  
  inline def apply(interactionSourceKind: Any): SpatialManipulationCanceledEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationCanceledEventArgs]
  }
  
  extension [Self <: SpatialManipulationCanceledEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
  }
}
