package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixed extends StObject {
  
  var appendTo: String
  
  var fixed: Boolean
  
  var flip: Boolean
  
  var placement: String
}
object Fixed {
  
  inline def apply(appendTo: String, fixed: Boolean, flip: Boolean, placement: String): Fixed = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fixed]
  }
  
  extension [Self <: Fixed](x: Self) {
    
    inline def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
