package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMenuUniDriverMod {
  
  trait PopoverMenuUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childrenCount(): js.Promise[Double]
    
    def clickAtChild(index: Double): js.Promise[Unit]
    
    def clickAtChildByDataHook(dataHook: String): js.Promise[Unit]
    
    def getTriggerElement(dataHook: String): UniDriver[js.Any]
    
    def isMenuOpen(): js.Promise[Boolean]
    
    def itemContentAt(id: Double): js.Promise[String]
  }
  object PopoverMenuUniDriver {
    
    inline def apply(
      childrenCount: () => js.Promise[Double],
      click: () => js.Promise[Unit],
      clickAtChild: Double => js.Promise[Unit],
      clickAtChildByDataHook: String => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getTriggerElement: String => UniDriver[js.Any],
      isMenuOpen: () => js.Promise[Boolean],
      itemContentAt: Double => js.Promise[String]
    ): PopoverMenuUniDriver = {
      val __obj = js.Dynamic.literal(childrenCount = js.Any.fromFunction0(childrenCount), click = js.Any.fromFunction0(click), clickAtChild = js.Any.fromFunction1(clickAtChild), clickAtChildByDataHook = js.Any.fromFunction1(clickAtChildByDataHook), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTriggerElement = js.Any.fromFunction1(getTriggerElement), isMenuOpen = js.Any.fromFunction0(isMenuOpen), itemContentAt = js.Any.fromFunction1(itemContentAt))
      __obj.asInstanceOf[PopoverMenuUniDriver]
    }
    
    extension [Self <: PopoverMenuUniDriver](x: Self) {
      
      inline def setChildrenCount(value: () => js.Promise[Double]): Self = StObject.set(x, "childrenCount", js.Any.fromFunction0(value))
      
      inline def setClickAtChild(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtChild", js.Any.fromFunction1(value))
      
      inline def setClickAtChildByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickAtChildByDataHook", js.Any.fromFunction1(value))
      
      inline def setGetTriggerElement(value: String => UniDriver[js.Any]): Self = StObject.set(x, "getTriggerElement", js.Any.fromFunction1(value))
      
      inline def setIsMenuOpen(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMenuOpen", js.Any.fromFunction0(value))
      
      inline def setItemContentAt(value: Double => js.Promise[String]): Self = StObject.set(x, "itemContentAt", js.Any.fromFunction1(value))
    }
  }
}
