package typings.wixStyleReact

import typings.wixStyleReact.checkboxMod.CheckboxLabelSize
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxUniDriverMod {
  
  trait CheckboxUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getErrorMessage(): js.Promise[String]
    
    def getLabel(): js.Promise[String]
    
    def getLabelSize(): js.Promise[CheckboxLabelSize]
    
    def hasError(): js.Promise[Boolean]
    
    /**
      * @deprecated
      */
    def hasFocusState(): js.Promise[String | Null]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isIndeterminate(): js.Promise[Boolean]
  }
  object CheckboxUniDriver {
    
    @scala.inline
    def apply(
      blur: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      focus: () => js.Promise[Unit],
      getErrorMessage: () => js.Promise[String],
      getLabel: () => js.Promise[String],
      getLabelSize: () => js.Promise[CheckboxLabelSize],
      hasError: () => js.Promise[Boolean],
      hasFocusState: () => js.Promise[String | Null],
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      isIndeterminate: () => js.Promise[Boolean]
    ): CheckboxUniDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getLabel = js.Any.fromFunction0(getLabel), getLabelSize = js.Any.fromFunction0(getLabelSize), hasError = js.Any.fromFunction0(hasError), hasFocusState = js.Any.fromFunction0(hasFocusState), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isIndeterminate = js.Any.fromFunction0(isIndeterminate))
      __obj.asInstanceOf[CheckboxUniDriver]
    }
    
    @scala.inline
    implicit class CheckboxUniDriverMutableBuilder[Self <: CheckboxUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetErrorMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelSize(value: () => js.Promise[CheckboxLabelSize]): Self = StObject.set(x, "getLabelSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasFocusState(value: () => js.Promise[String | Null]): Self = StObject.set(x, "hasFocusState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsIndeterminate(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
    }
  }
}
