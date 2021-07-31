package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectableAccordionUniDriverMod {
  
  trait SelectableAccordionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickItemAt(idx: Double): js.Promise[Unit]
    
    def isItemExpandedAt(idx: Double): js.Promise[Boolean]
  }
  object SelectableAccordionUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickItemAt: Double => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      isItemExpandedAt: Double => js.Promise[Boolean]
    ): SelectableAccordionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickItemAt = js.Any.fromFunction1(clickItemAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isItemExpandedAt = js.Any.fromFunction1(isItemExpandedAt))
      __obj.asInstanceOf[SelectableAccordionUniDriver]
    }
    
    @scala.inline
    implicit class SelectableAccordionUniDriverMutableBuilder[Self <: SelectableAccordionUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickItemAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickItemAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsItemExpandedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isItemExpandedAt", js.Any.fromFunction1(value))
    }
  }
}
