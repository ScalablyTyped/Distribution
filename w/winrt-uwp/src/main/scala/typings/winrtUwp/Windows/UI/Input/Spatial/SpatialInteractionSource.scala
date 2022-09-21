package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSource extends StObject {
  
  var id: Any
  
  /* unmapped type */
  var kind: Any
}
object SpatialInteractionSource {
  
  inline def apply(id: Any, kind: Any): SpatialInteractionSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSource]
  }
  
  extension [Self <: SpatialInteractionSource](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
