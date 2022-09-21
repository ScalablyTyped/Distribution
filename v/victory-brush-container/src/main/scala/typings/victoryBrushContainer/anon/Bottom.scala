package typings.victoryBrushContainer.anon

import typings.victoryBrushContainer.victoryBrushContainerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: `false` | Y1
  
  var left: `false` | X2
  
  var right: `false` | X2
  
  var top: `false` | Y1
}
object Bottom {
  
  inline def apply(bottom: `false` | Y1, left: `false` | X2, right: `false` | X2, top: `false` | Y1): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: `false` | Y1): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: `false` | X2): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: `false` | X2): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: `false` | Y1): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
