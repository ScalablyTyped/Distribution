package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover/Popover.protractor.driver", "popoverDriverFactory")
  @js.native
  val popoverDriverFactory: DriverFactory[PopoverDriver] = js.native
  
  trait PopoverDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def getContentElement(): ElementFinder
    
    def getTargetElement(): ElementFinder
    
    def isContentElementExists(): js.Promise[Boolean]
    
    def isTargetElementExists(): js.Promise[Boolean]
    
    def mouseEnter(): js.Promise[Unit]
    
    def mouseLeave(): js.Promise[Unit]
  }
  object PopoverDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => ElementFinder,
      getContentElement: () => ElementFinder,
      getTargetElement: () => ElementFinder,
      isContentElementExists: () => js.Promise[Boolean],
      isTargetElementExists: () => js.Promise[Boolean],
      mouseEnter: () => js.Promise[Unit],
      mouseLeave: () => js.Promise[Unit]
    ): PopoverDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), getContentElement = js.Any.fromFunction0(getContentElement), getTargetElement = js.Any.fromFunction0(getTargetElement), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
      __obj.asInstanceOf[PopoverDriver]
    }
    
    extension [Self <: PopoverDriver](x: Self) {
      
      inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setGetContentElement(value: () => ElementFinder): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
      
      inline def setGetTargetElement(value: () => ElementFinder): Self = StObject.set(x, "getTargetElement", js.Any.fromFunction0(value))
      
      inline def setIsContentElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isContentElementExists", js.Any.fromFunction0(value))
      
      inline def setIsTargetElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTargetElementExists", js.Any.fromFunction0(value))
      
      inline def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
      
      inline def setMouseLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    }
  }
}
