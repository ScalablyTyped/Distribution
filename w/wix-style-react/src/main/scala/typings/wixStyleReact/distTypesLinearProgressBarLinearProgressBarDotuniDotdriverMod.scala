package typings.wixStyleReact

import typings.wixStyleReact.distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreDotuniDotdriverMod.LinearProgressBarCoreUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarDotuniDotdriverMod {
  
  trait LinearProgressBarUniDriver
    extends StObject
       with LinearProgressBarCoreUniDriver {
    
    def getTooltipErrorMessage(): js.Promise[String]
    
    def isErrorIconShown(): js.Promise[Boolean]
    
    def isSuccessIconShown(): js.Promise[Boolean]
  }
  object LinearProgressBarUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getAriaLabel: () => js.Promise[String],
      getAriaValueMax: () => js.Promise[Double],
      getAriaValueMin: () => js.Promise[Double],
      getAriaValueNow: () => js.Promise[Double],
      getAriaValueText: () => js.Promise[String],
      getMaxValue: () => js.Promise[Double],
      getMinValue: () => js.Promise[Double],
      getNumericValue: () => js.Promise[Double],
      getRoleAttribute: () => js.Promise[String],
      getSuffixIndicationText: () => js.Promise[String],
      getTooltipErrorMessage: () => js.Promise[String],
      getValue: () => js.Promise[String | Null],
      getWidth: () => js.Promise[String],
      hasError: () => js.Promise[Boolean],
      hasPrefixAriaHidden: () => js.Promise[Boolean],
      hasPrefixIndication: () => js.Promise[Boolean],
      hasProgressIndicatorAriaHidden: () => js.Promise[Boolean],
      hasSuffixIndication: () => js.Promise[Boolean],
      isCompleted: () => js.Promise[Boolean],
      isErrorIconDisplayed: () => js.Promise[Boolean],
      isErrorIconShown: () => js.Promise[Boolean],
      isPercentagesProgressDisplayed: () => js.Promise[Boolean],
      isSuccessIconDisplayed: () => js.Promise[Boolean],
      isSuccessIconShown: () => js.Promise[Boolean]
    ): LinearProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAriaLabel = js.Any.fromFunction0(getAriaLabel), getAriaValueMax = js.Any.fromFunction0(getAriaValueMax), getAriaValueMin = js.Any.fromFunction0(getAriaValueMin), getAriaValueNow = js.Any.fromFunction0(getAriaValueNow), getAriaValueText = js.Any.fromFunction0(getAriaValueText), getMaxValue = js.Any.fromFunction0(getMaxValue), getMinValue = js.Any.fromFunction0(getMinValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoleAttribute = js.Any.fromFunction0(getRoleAttribute), getSuffixIndicationText = js.Any.fromFunction0(getSuffixIndicationText), getTooltipErrorMessage = js.Any.fromFunction0(getTooltipErrorMessage), getValue = js.Any.fromFunction0(getValue), getWidth = js.Any.fromFunction0(getWidth), hasError = js.Any.fromFunction0(hasError), hasPrefixAriaHidden = js.Any.fromFunction0(hasPrefixAriaHidden), hasPrefixIndication = js.Any.fromFunction0(hasPrefixIndication), hasProgressIndicatorAriaHidden = js.Any.fromFunction0(hasProgressIndicatorAriaHidden), hasSuffixIndication = js.Any.fromFunction0(hasSuffixIndication), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isErrorIconShown = js.Any.fromFunction0(isErrorIconShown), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed), isSuccessIconShown = js.Any.fromFunction0(isSuccessIconShown))
      __obj.asInstanceOf[LinearProgressBarUniDriver]
    }
    
    extension [Self <: LinearProgressBarUniDriver](x: Self) {
      
      inline def setGetTooltipErrorMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipErrorMessage", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconShown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorIconShown", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconShown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessIconShown", js.Any.fromFunction0(value))
    }
  }
}
