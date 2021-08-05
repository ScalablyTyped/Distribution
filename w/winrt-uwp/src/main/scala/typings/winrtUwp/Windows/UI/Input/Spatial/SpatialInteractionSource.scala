package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSource extends StObject {
  
  var id: js.Any
  
  /* unmapped type */
  var kind: js.Any
}
object SpatialInteractionSource {
  
  inline def apply(id: js.Any, kind: js.Any): SpatialInteractionSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSource]
  }
  
  extension [Self <: SpatialInteractionSource](x: Self) {
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: js.Any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
