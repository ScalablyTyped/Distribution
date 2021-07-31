package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressBarDriverMod {
  
  trait LinearProgressBarDriver
    extends StObject
       with typings.wixUiCore.linearProgressBarDriverMod.LinearProgressBarDriver {
    
    def getTooltipErrorMessage(): String
    
    def isErrorIconShown(): Boolean
    
    def isSuccessIconShown(): Boolean
  }
  object LinearProgressBarDriver {
    
    @scala.inline
    def apply(
      exists: () => Boolean,
      getAriaValueMax: () => Double,
      getAriaValueMin: () => Double,
      getAriaValueNow: () => Double,
      getAriaValueText: () => String,
      getMaxValue: () => Double,
      getMinValue: () => Double,
      getNumericValue: () => Double,
      getRoleAttribute: () => String,
      getTooltipErrorMessage: () => String,
      getValue: () => String,
      getWidth: () => String,
      hasError: () => Boolean,
      isCompleted: () => Boolean,
      isErrorIconDisplayed: () => Boolean,
      isErrorIconShown: () => Boolean,
      isPercentagesProgressDisplayed: () => Boolean,
      isSuccessIconDisplayed: () => Boolean,
      isSuccessIconShown: () => Boolean
    ): LinearProgressBarDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getAriaValueMax = js.Any.fromFunction0(getAriaValueMax), getAriaValueMin = js.Any.fromFunction0(getAriaValueMin), getAriaValueNow = js.Any.fromFunction0(getAriaValueNow), getAriaValueText = js.Any.fromFunction0(getAriaValueText), getMaxValue = js.Any.fromFunction0(getMaxValue), getMinValue = js.Any.fromFunction0(getMinValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoleAttribute = js.Any.fromFunction0(getRoleAttribute), getTooltipErrorMessage = js.Any.fromFunction0(getTooltipErrorMessage), getValue = js.Any.fromFunction0(getValue), getWidth = js.Any.fromFunction0(getWidth), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isErrorIconShown = js.Any.fromFunction0(isErrorIconShown), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed), isSuccessIconShown = js.Any.fromFunction0(isSuccessIconShown))
      __obj.asInstanceOf[LinearProgressBarDriver]
    }
    
    @scala.inline
    implicit class LinearProgressBarDriverMutableBuilder[Self <: LinearProgressBarDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTooltipErrorMessage(value: () => String): Self = StObject.set(x, "getTooltipErrorMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsErrorIconShown(value: () => Boolean): Self = StObject.set(x, "isErrorIconShown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSuccessIconShown(value: () => Boolean): Self = StObject.set(x, "isSuccessIconShown", js.Any.fromFunction0(value))
    }
  }
}
