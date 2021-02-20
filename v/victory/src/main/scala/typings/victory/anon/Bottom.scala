package typings.victory.anon

import typings.victory.mod.CallbackArgs
import typings.victory.mod.NumberOrCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bottom extends StObject {
  
  var bottom: js.UndefOr[NumberOrCallback] = js.native
  
  var bottomLeft: js.UndefOr[NumberOrCallback] = js.native
  
  var bottomRight: js.UndefOr[NumberOrCallback] = js.native
  
  var top: js.UndefOr[NumberOrCallback] = js.native
  
  var topLeft: js.UndefOr[NumberOrCallback] = js.native
  
  var topRight: js.UndefOr[NumberOrCallback] = js.native
}
object Bottom {
  
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: NumberOrCallback): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "bottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBottomLeft(value: NumberOrCallback): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomLeftFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "bottomLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
    
    @scala.inline
    def setBottomRight(value: NumberOrCallback): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomRightFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "bottomRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setTop(value: NumberOrCallback): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "top", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTopLeft(value: NumberOrCallback): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLeftFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "topLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
    
    @scala.inline
    def setTopRight(value: NumberOrCallback): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRightFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "topRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
