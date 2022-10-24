package typings.wixStyleReact

import typings.wixStyleReact.distTypesCheckboxMod.CheckboxLabelSize
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCheckboxCheckboxDotuniDotdriverMod {
  
  trait CheckboxUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getLabel(): js.Promise[String]
    
    def getLabelSize(): js.Promise[CheckboxLabelSize]
    
    def getTooltipContent(): js.Promise[String]
    
    def hasError(): js.Promise[Boolean]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isIndeterminate(): js.Promise[Boolean]
    
    def isTooltipEnabled(): js.Promise[Boolean]
  }
  object CheckboxUniDriver {
    
    inline def apply(
      blur: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      focus: () => js.Promise[Unit],
      getLabel: () => js.Promise[String],
      getLabelSize: () => js.Promise[CheckboxLabelSize],
      getTooltipContent: () => js.Promise[String],
      hasError: () => js.Promise[Boolean],
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      isFocused: () => js.Promise[Boolean],
      isIndeterminate: () => js.Promise[Boolean],
      isTooltipEnabled: () => js.Promise[Boolean]
    ): CheckboxUniDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getLabel = js.Any.fromFunction0(getLabel), getLabelSize = js.Any.fromFunction0(getLabelSize), getTooltipContent = js.Any.fromFunction0(getTooltipContent), hasError = js.Any.fromFunction0(hasError), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isFocused = js.Any.fromFunction0(isFocused), isIndeterminate = js.Any.fromFunction0(isIndeterminate), isTooltipEnabled = js.Any.fromFunction0(isTooltipEnabled))
      __obj.asInstanceOf[CheckboxUniDriver]
    }
    
    extension [Self <: CheckboxUniDriver](x: Self) {
      
      inline def setBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelSize(value: () => js.Promise[CheckboxLabelSize]): Self = StObject.set(x, "getLabelSize", js.Any.fromFunction0(value))
      
      inline def setGetTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setIsIndeterminate(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
      
      inline def setIsTooltipEnabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTooltipEnabled", js.Any.fromFunction0(value))
    }
  }
}
