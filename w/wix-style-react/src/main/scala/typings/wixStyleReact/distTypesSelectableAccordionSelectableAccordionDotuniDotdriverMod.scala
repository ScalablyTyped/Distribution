package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectableAccordionSelectableAccordionDotuniDotdriverMod {
  
  trait SelectableAccordionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickItemAt(idx: Double): js.Promise[Unit]
    
    def isItemDisabledAt(idx: Double): js.Promise[Boolean]
    
    def isItemExpandedAt(idx: Double): js.Promise[Boolean]
  }
  object SelectableAccordionUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickItemAt: Double => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      isItemDisabledAt: Double => js.Promise[Boolean],
      isItemExpandedAt: Double => js.Promise[Boolean]
    ): SelectableAccordionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickItemAt = js.Any.fromFunction1(clickItemAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isItemDisabledAt = js.Any.fromFunction1(isItemDisabledAt), isItemExpandedAt = js.Any.fromFunction1(isItemExpandedAt))
      __obj.asInstanceOf[SelectableAccordionUniDriver]
    }
    
    extension [Self <: SelectableAccordionUniDriver](x: Self) {
      
      inline def setClickItemAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickItemAt", js.Any.fromFunction1(value))
      
      inline def setIsItemDisabledAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isItemDisabledAt", js.Any.fromFunction1(value))
      
      inline def setIsItemExpandedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isItemExpandedAt", js.Any.fromFunction1(value))
    }
  }
}
