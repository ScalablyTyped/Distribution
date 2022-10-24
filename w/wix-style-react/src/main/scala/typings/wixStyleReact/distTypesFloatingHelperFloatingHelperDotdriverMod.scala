package typings.wixStyleReact

import typings.wixStyleReact.distTypesFloatingHelperClosablePopoverClosablePopoverDotdriverMod.ClosablePopoverDriver
import typings.wixStyleReact.distTypesFloatingHelperFloatingHelperContentFloatingHelperContentDotdriverMod.FloatingHelperContentDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperDotdriverMod {
  
  trait FloatingHelperDriver
    extends StObject
       with ClosablePopoverDriver {
    
    def clickCloseButton(): Unit
    
    def getHelperContentDriver(): FloatingHelperContentDriver
    
    def getWidth(): String
    
    def hasCloseButton(): Boolean
  }
  object FloatingHelperDriver {
    
    inline def apply(
      clickCloseButton: () => Unit,
      getHelperContentDriver: () => FloatingHelperContentDriver,
      getWidth: () => String,
      hasCloseButton: () => Boolean,
      isOpened: () => Boolean
    ): FloatingHelperDriver = {
      val __obj = js.Dynamic.literal(clickCloseButton = js.Any.fromFunction0(clickCloseButton), getHelperContentDriver = js.Any.fromFunction0(getHelperContentDriver), getWidth = js.Any.fromFunction0(getWidth), hasCloseButton = js.Any.fromFunction0(hasCloseButton), isOpened = js.Any.fromFunction0(isOpened))
      __obj.asInstanceOf[FloatingHelperDriver]
    }
    
    extension [Self <: FloatingHelperDriver](x: Self) {
      
      inline def setClickCloseButton(value: () => Unit): Self = StObject.set(x, "clickCloseButton", js.Any.fromFunction0(value))
      
      inline def setGetHelperContentDriver(value: () => FloatingHelperContentDriver): Self = StObject.set(x, "getHelperContentDriver", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => String): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHasCloseButton(value: () => Boolean): Self = StObject.set(x, "hasCloseButton", js.Any.fromFunction0(value))
    }
  }
}
