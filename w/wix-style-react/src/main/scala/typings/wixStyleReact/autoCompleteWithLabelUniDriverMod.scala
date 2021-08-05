package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoCompleteWithLabelUniDriverMod {
  
  trait AutoCompleteWithLabelUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit]
    
    def clickAtOption(optionIndex: Double): js.Promise[Unit]
    
    def clickAtOptionWithValue(value: String): js.Promise[Unit]
    
    def clickMenuArrow(): js.Promise[Unit]
    
    def enterText(value: String): js.Promise[Unit]
    
    def getLabelText(): js.Promise[String]
    
    def getValue(): js.Promise[String]
    
    def hasError(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object AutoCompleteWithLabelUniDriver {
    
    inline def apply(
      blur: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      clickAtOption: Double => js.Promise[Unit],
      clickAtOptionWithValue: String => js.Promise[Unit],
      clickMenuArrow: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getLabelText: () => js.Promise[String],
      getValue: () => js.Promise[String],
      hasError: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): AutoCompleteWithLabelUniDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), clickAtOption = js.Any.fromFunction1(clickAtOption), clickAtOptionWithValue = js.Any.fromFunction1(clickAtOptionWithValue), clickMenuArrow = js.Any.fromFunction0(clickMenuArrow), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getLabelText = js.Any.fromFunction0(getLabelText), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[AutoCompleteWithLabelUniDriver]
    }
    
    extension [Self <: AutoCompleteWithLabelUniDriver](x: Self) {
      
      inline def setBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setClickAtOption(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
      
      inline def setClickAtOptionWithValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickAtOptionWithValue", js.Any.fromFunction1(value))
      
      inline def setClickMenuArrow(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickMenuArrow", js.Any.fromFunction0(value))
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
