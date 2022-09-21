package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSourceEventArgs extends StObject {
  
  var state: Any
}
object SpatialInteractionSourceEventArgs {
  
  inline def apply(state: Any): SpatialInteractionSourceEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceEventArgs]
  }
  
  extension [Self <: SpatialInteractionSourceEventArgs](x: Self) {
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
