package typings.wixStyleReact

import typings.wixStyleReact.checkboxMod.CheckboxLabelSize
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxDriverMod {
  
  trait CheckboxDriver
    extends StObject
       with BaseDriver {
    
    def blur(): Unit
    
    def click(): Unit
    
    def focus(): Unit
    
    def getErrorMessage(): js.Promise[String]
    
    def getLabel(): String
    
    def getLabelSize(): CheckboxLabelSize
    
    def hasError(): Boolean
    
    /**
      * Focus related testing is done in e2e tests only.
      * @deprecated
      */
    def hasFocusState(): String | Null
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
    
    def isIndeterminate(): Boolean
  }
  object CheckboxDriver {
    
    inline def apply(
      blur: () => Unit,
      click: () => Unit,
      exists: () => Boolean,
      focus: () => Unit,
      getErrorMessage: () => js.Promise[String],
      getLabel: () => String,
      getLabelSize: () => CheckboxLabelSize,
      hasError: () => Boolean,
      hasFocusState: () => String | Null,
      isChecked: () => Boolean,
      isDisabled: () => Boolean,
      isIndeterminate: () => Boolean
    ): CheckboxDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getLabel = js.Any.fromFunction0(getLabel), getLabelSize = js.Any.fromFunction0(getLabelSize), hasError = js.Any.fromFunction0(hasError), hasFocusState = js.Any.fromFunction0(hasFocusState), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isIndeterminate = js.Any.fromFunction0(isIndeterminate))
      __obj.asInstanceOf[CheckboxDriver]
    }
    
    extension [Self <: CheckboxDriver](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetErrorMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelSize(value: () => CheckboxLabelSize): Self = StObject.set(x, "getLabelSize", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setHasFocusState(value: () => String | Null): Self = StObject.set(x, "hasFocusState", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsIndeterminate(value: () => Boolean): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
    }
  }
}
