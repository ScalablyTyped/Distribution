package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionUniDriverMod {
  
  trait AccordionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickItemAt(idx: Double): js.Promise[Unit]
    
    def clickToggleButtonAt(idx: Double): js.Promise[Unit]
    
    def getItemTitleAt(idx: Double): js.Promise[String]
    
    def getToggleButtonLabelAt(idx: Double): js.Promise[String]
    
    def isIconExistsAt(idx: Double): js.Promise[Boolean]
    
    def isItemExpandedAt(idx: Double): js.Promise[Boolean]
  }
  object AccordionUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickItemAt: Double => js.Promise[Unit],
      clickToggleButtonAt: Double => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getItemTitleAt: Double => js.Promise[String],
      getToggleButtonLabelAt: Double => js.Promise[String],
      isIconExistsAt: Double => js.Promise[Boolean],
      isItemExpandedAt: Double => js.Promise[Boolean]
    ): AccordionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickItemAt = js.Any.fromFunction1(clickItemAt), clickToggleButtonAt = js.Any.fromFunction1(clickToggleButtonAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getItemTitleAt = js.Any.fromFunction1(getItemTitleAt), getToggleButtonLabelAt = js.Any.fromFunction1(getToggleButtonLabelAt), isIconExistsAt = js.Any.fromFunction1(isIconExistsAt), isItemExpandedAt = js.Any.fromFunction1(isItemExpandedAt))
      __obj.asInstanceOf[AccordionUniDriver]
    }
    
    extension [Self <: AccordionUniDriver](x: Self) {
      
      inline def setClickItemAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickItemAt", js.Any.fromFunction1(value))
      
      inline def setClickToggleButtonAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickToggleButtonAt", js.Any.fromFunction1(value))
      
      inline def setGetItemTitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemTitleAt", js.Any.fromFunction1(value))
      
      inline def setGetToggleButtonLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getToggleButtonLabelAt", js.Any.fromFunction1(value))
      
      inline def setIsIconExistsAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isIconExistsAt", js.Any.fromFunction1(value))
      
      inline def setIsItemExpandedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isItemExpandedAt", js.Any.fromFunction1(value))
    }
  }
}
