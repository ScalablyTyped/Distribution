package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: Any
  
  var left: Any
  
  var right: Any
  
  var top: Any
}
object Bottom {
  
  inline def apply(bottom: Any, left: Any, right: Any, top: Any): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: Any): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
