package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialManipulationDelta extends StObject {
  
  var translation: Any
}
object SpatialManipulationDelta {
  
  inline def apply(translation: Any): SpatialManipulationDelta = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationDelta]
  }
  
  extension [Self <: SpatialManipulationDelta](x: Self) {
    
    inline def setTranslation(value: Any): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
  }
}
