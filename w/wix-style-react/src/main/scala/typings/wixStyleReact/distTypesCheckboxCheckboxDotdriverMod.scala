package typings.wixStyleReact

import typings.wixStyleReact.distTypesCheckboxMod.CheckboxLabelSize
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCheckboxCheckboxDotdriverMod {
  
  trait CheckboxDriver
    extends StObject
       with BaseDriver {
    
    def blur(): Unit
    
    def click(): Unit
    
    def focus(): Unit
    
    def getLabel(): String
    
    def getLabelSize(): CheckboxLabelSize
    
    def getTooltipContent(): js.Promise[String]
    
    def hasError(): Boolean
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
    
    def isFocused(): Boolean
    
    def isIndeterminate(): Boolean
    
    def isTooltipEnabled(): js.Promise[Boolean]
  }
  object CheckboxDriver {
    
    inline def apply(
      blur: () => Unit,
      click: () => Unit,
      exists: () => Boolean,
      focus: () => Unit,
      getLabel: () => String,
      getLabelSize: () => CheckboxLabelSize,
      getTooltipContent: () => js.Promise[String],
      hasError: () => Boolean,
      isChecked: () => Boolean,
      isDisabled: () => Boolean,
      isFocused: () => Boolean,
      isIndeterminate: () => Boolean,
      isTooltipEnabled: () => js.Promise[Boolean]
    ): CheckboxDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getLabel = js.Any.fromFunction0(getLabel), getLabelSize = js.Any.fromFunction0(getLabelSize), getTooltipContent = js.Any.fromFunction0(getTooltipContent), hasError = js.Any.fromFunction0(hasError), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isFocused = js.Any.fromFunction0(isFocused), isIndeterminate = js.Any.fromFunction0(isIndeterminate), isTooltipEnabled = js.Any.fromFunction0(isTooltipEnabled))
      __obj.asInstanceOf[CheckboxDriver]
    }
    
    extension [Self <: CheckboxDriver](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelSize(value: () => CheckboxLabelSize): Self = StObject.set(x, "getLabelSize", js.Any.fromFunction0(value))
      
      inline def setGetTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setIsIndeterminate(value: () => Boolean): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
      
      inline def setIsTooltipEnabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTooltipEnabled", js.Any.fromFunction0(value))
    }
  }
}
