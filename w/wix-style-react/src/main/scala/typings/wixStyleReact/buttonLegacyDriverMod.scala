package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonLegacyDriverMod {
  
  trait buttonDriverFactory
    extends StObject
       with BaseDriver {
    
    def blur(): Unit
    
    def click(): Unit
    
    def focus(): Unit
    
    def getButtonTextContent(): String
    
    def isButtonDisabled(): Boolean
    
    def isPrefixIconExists(): Boolean
    
    def isSuffixIconExists(): Boolean
    
    def mouseEnter(): Unit
    
    def mouseLeave(): Unit
  }
  object buttonDriverFactory {
    
    inline def apply(
      blur: () => Unit,
      click: () => Unit,
      exists: () => Boolean,
      focus: () => Unit,
      getButtonTextContent: () => String,
      isButtonDisabled: () => Boolean,
      isPrefixIconExists: () => Boolean,
      isSuffixIconExists: () => Boolean,
      mouseEnter: () => Unit,
      mouseLeave: () => Unit
    ): buttonDriverFactory = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getButtonTextContent = js.Any.fromFunction0(getButtonTextContent), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled), isPrefixIconExists = js.Any.fromFunction0(isPrefixIconExists), isSuffixIconExists = js.Any.fromFunction0(isSuffixIconExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
      __obj.asInstanceOf[buttonDriverFactory]
    }
    
    extension [Self <: buttonDriverFactory](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetButtonTextContent(value: () => String): Self = StObject.set(x, "getButtonTextContent", js.Any.fromFunction0(value))
      
      inline def setIsButtonDisabled(value: () => Boolean): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
      
      inline def setIsPrefixIconExists(value: () => Boolean): Self = StObject.set(x, "isPrefixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsSuffixIconExists(value: () => Boolean): Self = StObject.set(x, "isSuffixIconExists", js.Any.fromFunction0(value))
      
      inline def setMouseEnter(value: () => Unit): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
      
      inline def setMouseLeave(value: () => Unit): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    }
  }
}
