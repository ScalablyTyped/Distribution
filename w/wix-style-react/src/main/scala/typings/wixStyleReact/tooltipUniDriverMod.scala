package typings.wixStyleReact

import typings.wixStyleReact.tooltipMod.TooltipSize
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipUniDriverMod {
  
  trait TooltipUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOutside(): js.Promise[Unit]
    
    def getTooltipText(): js.Promise[String]
    
    def hasSize(sizeName: TooltipSize): js.Promise[Boolean]
    
    def mouseEnter(): js.Promise[Unit]
    
    def mouseLeave(): js.Promise[Unit]
    
    def tooltipExists(): js.Promise[Boolean]
  }
  object TooltipUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOutside: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getTooltipText: () => js.Promise[String],
      hasSize: TooltipSize => js.Promise[Boolean],
      mouseEnter: () => js.Promise[Unit],
      mouseLeave: () => js.Promise[Unit],
      tooltipExists: () => js.Promise[Boolean]
    ): TooltipUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOutside = js.Any.fromFunction0(clickOutside), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTooltipText = js.Any.fromFunction0(getTooltipText), hasSize = js.Any.fromFunction1(hasSize), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave), tooltipExists = js.Any.fromFunction0(tooltipExists))
      __obj.asInstanceOf[TooltipUniDriver]
    }
    
    extension [Self <: TooltipUniDriver](x: Self) {
      
      inline def setClickOutside(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
      
      inline def setGetTooltipText(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipText", js.Any.fromFunction0(value))
      
      inline def setHasSize(value: TooltipSize => js.Promise[Boolean]): Self = StObject.set(x, "hasSize", js.Any.fromFunction1(value))
      
      inline def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
      
      inline def setMouseLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
      
      inline def setTooltipExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "tooltipExists", js.Any.fromFunction0(value))
    }
  }
}
