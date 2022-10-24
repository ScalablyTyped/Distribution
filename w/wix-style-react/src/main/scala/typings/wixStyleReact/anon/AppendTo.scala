package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendTo extends StObject {
  
  var appendTo: Requireable[String]
  
  var dynamicWidth: Requireable[Boolean]
  
  var fixed: Requireable[Boolean]
  
  var flip: Requireable[Boolean]
  
  var maxWidth: Requireable[String | Double]
  
  var minWidth: Requireable[String | Double]
  
  var placement: Requireable[String]
}
object AppendTo {
  
  inline def apply(
    appendTo: Requireable[String],
    dynamicWidth: Requireable[Boolean],
    fixed: Requireable[Boolean],
    flip: Requireable[Boolean],
    maxWidth: Requireable[String | Double],
    minWidth: Requireable[String | Double],
    placement: Requireable[String]
  ): AppendTo = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], dynamicWidth = dynamicWidth.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendTo]
  }
  
  extension [Self <: AppendTo](x: Self) {
    
    inline def setAppendTo(value: Requireable[String]): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setDynamicWidth(value: Requireable[Boolean]): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: Requireable[Boolean]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: Requireable[Boolean]): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Requireable[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Requireable[String | Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Requireable[String]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
