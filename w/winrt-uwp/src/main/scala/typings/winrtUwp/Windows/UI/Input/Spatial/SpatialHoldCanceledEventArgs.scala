package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialHoldCanceledEventArgs extends StObject {
  
  var interactionSourceKind: Any
}
object SpatialHoldCanceledEventArgs {
  
  inline def apply(interactionSourceKind: Any): SpatialHoldCanceledEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldCanceledEventArgs]
  }
  
  extension [Self <: SpatialHoldCanceledEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
  }
}
