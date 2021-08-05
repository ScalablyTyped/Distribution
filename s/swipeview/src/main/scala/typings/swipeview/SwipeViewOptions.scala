package typings.swipeview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeViewOptions extends StObject {
  
  var hastyPageFlip: js.UndefOr[Boolean] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var numberOfPages: js.UndefOr[Double] = js.undefined
  
  var snapThreshold: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object SwipeViewOptions {
  
  inline def apply(): SwipeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeViewOptions]
  }
  
  extension [Self <: SwipeViewOptions](x: Self) {
    
    inline def setHastyPageFlip(value: Boolean): Self = StObject.set(x, "hastyPageFlip", value.asInstanceOf[js.Any])
    
    inline def setHastyPageFlipUndefined: Self = StObject.set(x, "hastyPageFlip", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setNumberOfPages(value: Double): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPagesUndefined: Self = StObject.set(x, "numberOfPages", js.undefined)
    
    inline def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
    
    inline def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
