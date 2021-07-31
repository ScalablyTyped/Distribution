package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverDotprotractorMod.BaseDriver
import typings.wixUiCore.baseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonDotProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/deprecated/button/Button.protractor.driver", "buttonDriverFactory")
  @js.native
  val buttonDriverFactory: DriverFactory[ButtonDriver] = js.native
  
  trait ButtonDriver
    extends StObject
       with BaseDriver {
    
    /** click the button */
    def click(): js.Promise[Unit]
    
    /** returns true if the root element is present */
    def exists(): js.Promise[Boolean]
    
    /** returns the Button's text content */
    def getButtonTextContent(): js.Promise[String]
    
    /** checks wether the button is disabled */
    def isButtonDisabled(): js.Promise[Boolean]
  }
  object ButtonDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => ElementFinder,
      exists: () => js.Promise[Boolean],
      getButtonTextContent: () => js.Promise[String],
      isButtonDisabled: () => js.Promise[Boolean]
    ): ButtonDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getButtonTextContent = js.Any.fromFunction0(getButtonTextContent), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled))
      __obj.asInstanceOf[ButtonDriver]
    }
    
    @scala.inline
    implicit class ButtonDriverMutableBuilder[Self <: ButtonDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetButtonTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getButtonTextContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
    }
  }
}
