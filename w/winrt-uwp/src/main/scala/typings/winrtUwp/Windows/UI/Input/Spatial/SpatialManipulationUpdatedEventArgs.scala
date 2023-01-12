package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialManipulationUpdatedEventArgs extends StObject {
  
  var interactionSourceKind: Any
  
  /* unmapped type */
  var tryGetCumulativeDelta: Any
}
object SpatialManipulationUpdatedEventArgs {
  
  inline def apply(interactionSourceKind: Any, tryGetCumulativeDelta: Any): SpatialManipulationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationUpdatedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialManipulationUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTryGetCumulativeDelta(value: Any): Self = StObject.set(x, "tryGetCumulativeDelta", value.asInstanceOf[js.Any])
  }
}
