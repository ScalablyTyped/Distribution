package typings.wixStyleReact

import typings.wixStyleReact.distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreDotdriverMod.LinearProgressBarCoreDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarDotdriverMod {
  
  trait LinearProgressBarDriver
    extends StObject
       with LinearProgressBarCoreDriver {
    
    def getTooltipErrorMessage(): String
    
    def isErrorIconShown(): Boolean
    
    def isSuccessIconShown(): Boolean
  }
  object LinearProgressBarDriver {
    
    inline def apply(
      click: () => Unit,
      exists: () => Boolean,
      getAriaLabel: () => String,
      getAriaValueMax: () => Double,
      getAriaValueMin: () => Double,
      getAriaValueNow: () => Double,
      getAriaValueText: () => String,
      getMaxValue: () => Double,
      getMinValue: () => Double,
      getNumericValue: () => Double,
      getRoleAttribute: () => String,
      getSuffixIndicationText: () => String,
      getTooltipErrorMessage: () => String,
      getValue: () => String,
      getWidth: () => String,
      hasError: () => Boolean,
      hasPrefixAriaHidden: () => Boolean,
      hasPrefixIndication: () => Boolean,
      hasProgressIndicatorAriaHidden: () => Boolean,
      hasSuffixIndication: () => Boolean,
      isCompleted: () => Boolean,
      isErrorIconDisplayed: () => Boolean,
      isErrorIconShown: () => Boolean,
      isPercentagesProgressDisplayed: () => Boolean,
      isSuccessIconDisplayed: () => Boolean,
      isSuccessIconShown: () => Boolean
    ): LinearProgressBarDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getAriaLabel = js.Any.fromFunction0(getAriaLabel), getAriaValueMax = js.Any.fromFunction0(getAriaValueMax), getAriaValueMin = js.Any.fromFunction0(getAriaValueMin), getAriaValueNow = js.Any.fromFunction0(getAriaValueNow), getAriaValueText = js.Any.fromFunction0(getAriaValueText), getMaxValue = js.Any.fromFunction0(getMaxValue), getMinValue = js.Any.fromFunction0(getMinValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoleAttribute = js.Any.fromFunction0(getRoleAttribute), getSuffixIndicationText = js.Any.fromFunction0(getSuffixIndicationText), getTooltipErrorMessage = js.Any.fromFunction0(getTooltipErrorMessage), getValue = js.Any.fromFunction0(getValue), getWidth = js.Any.fromFunction0(getWidth), hasError = js.Any.fromFunction0(hasError), hasPrefixAriaHidden = js.Any.fromFunction0(hasPrefixAriaHidden), hasPrefixIndication = js.Any.fromFunction0(hasPrefixIndication), hasProgressIndicatorAriaHidden = js.Any.fromFunction0(hasProgressIndicatorAriaHidden), hasSuffixIndication = js.Any.fromFunction0(hasSuffixIndication), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isErrorIconShown = js.Any.fromFunction0(isErrorIconShown), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed), isSuccessIconShown = js.Any.fromFunction0(isSuccessIconShown))
      __obj.asInstanceOf[LinearProgressBarDriver]
    }
    
    extension [Self <: LinearProgressBarDriver](x: Self) {
      
      inline def setGetTooltipErrorMessage(value: () => String): Self = StObject.set(x, "getTooltipErrorMessage", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconShown(value: () => Boolean): Self = StObject.set(x, "isErrorIconShown", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconShown(value: () => Boolean): Self = StObject.set(x, "isSuccessIconShown", js.Any.fromFunction0(value))
    }
  }
}
