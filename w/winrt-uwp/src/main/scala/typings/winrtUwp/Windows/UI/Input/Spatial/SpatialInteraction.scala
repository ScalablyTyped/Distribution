package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteraction extends StObject {
  
  var sourceState: js.Any
}
object SpatialInteraction {
  
  inline def apply(sourceState: js.Any): SpatialInteraction = {
    val __obj = js.Dynamic.literal(sourceState = sourceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteraction]
  }
  
  extension [Self <: SpatialInteraction](x: Self) {
    
    inline def setSourceState(value: js.Any): Self = StObject.set(x, "sourceState", value.asInstanceOf[js.Any])
  }
}
