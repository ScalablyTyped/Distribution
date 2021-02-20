package typings.swipeview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeViewOptions extends StObject {
  
  var hastyPageFlip: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var numberOfPages: js.UndefOr[Double] = js.native
  
  var snapThreshold: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object SwipeViewOptions {
  
  @scala.inline
  def apply(): SwipeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeViewOptions]
  }
  
  @scala.inline
  implicit class SwipeViewOptionsMutableBuilder[Self <: SwipeViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHastyPageFlip(value: Boolean): Self = StObject.set(x, "hastyPageFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHastyPageFlipUndefined: Self = StObject.set(x, "hastyPageFlip", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setNumberOfPages(value: Double): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPagesUndefined: Self = StObject.set(x, "numberOfPages", js.undefined)
    
    @scala.inline
    def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
