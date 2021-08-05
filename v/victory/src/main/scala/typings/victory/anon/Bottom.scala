package typings.victory.anon

import typings.victory.mod.CallbackArgs
import typings.victory.mod.NumberOrCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: js.UndefOr[NumberOrCallback] = js.undefined
  
  var bottomLeft: js.UndefOr[NumberOrCallback] = js.undefined
  
  var bottomRight: js.UndefOr[NumberOrCallback] = js.undefined
  
  var top: js.UndefOr[NumberOrCallback] = js.undefined
  
  var topLeft: js.UndefOr[NumberOrCallback] = js.undefined
  
  var topRight: js.UndefOr[NumberOrCallback] = js.undefined
}
object Bottom {
  
  inline def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: NumberOrCallback): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "bottom", js.Any.fromFunction1(value))
    
    inline def setBottomLeft(value: NumberOrCallback): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
    
    inline def setBottomLeftFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "bottomLeft", js.Any.fromFunction1(value))
    
    inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
    
    inline def setBottomRight(value: NumberOrCallback): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
    
    inline def setBottomRightFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "bottomRight", js.Any.fromFunction1(value))
    
    inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setTop(value: NumberOrCallback): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "top", js.Any.fromFunction1(value))
    
    inline def setTopLeft(value: NumberOrCallback): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    inline def setTopLeftFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "topLeft", js.Any.fromFunction1(value))
    
    inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
    
    inline def setTopRight(value: NumberOrCallback): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    
    inline def setTopRightFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "topRight", js.Any.fromFunction1(value))
    
    inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
