package typings.wixStyleReact

import typings.wixStyleReact.closablePopoverUniDriverMod.ClosablePopoverUniDriver
import typings.wixStyleReact.floatingHelperContentUniDriverMod.FloatingHelperContentUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingHelperUniDriverMod {
  
  trait FloatingHelperUniDriver
    extends StObject
       with ClosablePopoverUniDriver {
    
    def clickCloseButton(): js.Promise[Unit]
    
    def getHelperContentDriver(): js.Promise[FloatingHelperContentUniDriver]
    
    def getWidth(): js.Promise[String]
    
    def hasCloseButton(): js.Promise[Boolean]
  }
  object FloatingHelperUniDriver {
    
    @scala.inline
    def apply(
      clickCloseButton: () => js.Promise[Unit],
      getHelperContentDriver: () => js.Promise[FloatingHelperContentUniDriver],
      getWidth: () => js.Promise[String],
      hasCloseButton: () => js.Promise[Boolean],
      isOpened: () => js.Promise[Boolean]
    ): FloatingHelperUniDriver = {
      val __obj = js.Dynamic.literal(clickCloseButton = js.Any.fromFunction0(clickCloseButton), getHelperContentDriver = js.Any.fromFunction0(getHelperContentDriver), getWidth = js.Any.fromFunction0(getWidth), hasCloseButton = js.Any.fromFunction0(hasCloseButton), isOpened = js.Any.fromFunction0(isOpened))
      __obj.asInstanceOf[FloatingHelperUniDriver]
    }
    
    @scala.inline
    implicit class FloatingHelperUniDriverMutableBuilder[Self <: FloatingHelperUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCloseButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHelperContentDriver(value: () => js.Promise[FloatingHelperContentUniDriver]): Self = StObject.set(x, "getHelperContentDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => js.Promise[String]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasCloseButton(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasCloseButton", js.Any.fromFunction0(value))
    }
  }
}
