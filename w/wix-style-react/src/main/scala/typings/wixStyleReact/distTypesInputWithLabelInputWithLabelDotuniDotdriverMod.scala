package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithLabelInputWithLabelDotuniDotdriverMod {
  
  trait InputWithLabelUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickInput(): js.Promise[Unit]
    
    def enterText(value: String): js.Promise[Unit]
    
    def getErrorMessage(): js.Promise[String]
    
    def getLabelText(): js.Promise[String]
    
    def getMaxLength(): js.Promise[String | Null]
    
    def getSuffixesCount(): js.Promise[Double]
    
    def getValue(): js.Promise[String]
    
    def hasErrorMessage(): js.Promise[Boolean]
    
    def isCustomInput(): js.Promise[Boolean]
    
    def isFocusedStyle(): js.Promise[Boolean]
  }
  object InputWithLabelUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickInput: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getErrorMessage: () => js.Promise[String],
      getLabelText: () => js.Promise[String],
      getMaxLength: () => js.Promise[String | Null],
      getSuffixesCount: () => js.Promise[Double],
      getValue: () => js.Promise[String],
      hasErrorMessage: () => js.Promise[Boolean],
      isCustomInput: () => js.Promise[Boolean],
      isFocusedStyle: () => js.Promise[Boolean]
    ): InputWithLabelUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickInput = js.Any.fromFunction0(clickInput), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getLabelText = js.Any.fromFunction0(getLabelText), getMaxLength = js.Any.fromFunction0(getMaxLength), getSuffixesCount = js.Any.fromFunction0(getSuffixesCount), getValue = js.Any.fromFunction0(getValue), hasErrorMessage = js.Any.fromFunction0(hasErrorMessage), isCustomInput = js.Any.fromFunction0(isCustomInput), isFocusedStyle = js.Any.fromFunction0(isFocusedStyle))
      __obj.asInstanceOf[InputWithLabelUniDriver]
    }
    
    extension [Self <: InputWithLabelUniDriver](x: Self) {
      
      inline def setClickInput(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickInput", js.Any.fromFunction0(value))
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetErrorMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
      
      inline def setGetLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
      
      inline def setGetMaxLength(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getMaxLength", js.Any.fromFunction0(value))
      
      inline def setGetSuffixesCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getSuffixesCount", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasErrorMessage(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasErrorMessage", js.Any.fromFunction0(value))
      
      inline def setIsCustomInput(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCustomInput", js.Any.fromFunction0(value))
      
      inline def setIsFocusedStyle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocusedStyle", js.Any.fromFunction0(value))
    }
  }
}
