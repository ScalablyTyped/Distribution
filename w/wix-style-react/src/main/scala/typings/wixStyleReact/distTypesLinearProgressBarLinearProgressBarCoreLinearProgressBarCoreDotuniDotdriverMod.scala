package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBarCore/LinearProgressBarCore.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linearProgressBarUniDriverFactory(base: UniDriver[Any]): LinearProgressBarCoreUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("linearProgressBarUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[LinearProgressBarCoreUniDriver]
  
  trait LinearProgressBarCoreUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Returns aria-label prop */
    def getAriaLabel(): js.Promise[String]
    
    /** Returns aria-valuemax prop */
    def getAriaValueMax(): js.Promise[Double]
    
    /** Returns aria-valuemin prop */
    def getAriaValueMin(): js.Promise[Double]
    
    /** Returns aria-valuenow prop */
    def getAriaValueNow(): js.Promise[Double]
    
    /** Returns aria-valuetext prop */
    def getAriaValueText(): js.Promise[String]
    
    /** Returns max value prop */
    def getMaxValue(): js.Promise[Double]
    
    /** Returns min value prop */
    def getMinValue(): js.Promise[Double]
    
    /** Get the progress numeric value */
    def getNumericValue(): js.Promise[Double]
    
    /** Returns role html attribute */
    def getRoleAttribute(): js.Promise[String]
    
    /** Get the suffix indication's text */
    def getSuffixIndicationText(): js.Promise[String]
    
    /** Get the progress percentages value */
    def getValue(): js.Promise[String | Null]
    
    /** Get the width of the foreground bar (the progress) */
    def getWidth(): js.Promise[String]
    
    /** Returns true if has error */
    def hasError(): js.Promise[Boolean]
    
    /** Get the prefix indication aria-hidden value */
    def hasPrefixAriaHidden(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the prefix indication exists */
    def hasPrefixIndication(): js.Promise[Boolean]
    
    /** Get the progress indication aria-hidden value */
    def hasProgressIndicatorAriaHidden(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the custom suffix indication exists */
    def hasSuffixIndication(): js.Promise[Boolean]
    
    /** Returns true if has progress completed (value is 100) */
    def isCompleted(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the error icon exists */
    def isErrorIconDisplayed(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the success icon exists */
    def isSuccessIconDisplayed(): js.Promise[Boolean]
  }
  object LinearProgressBarCoreUniDriver {
    
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
      getValue: () => js.Promise[String | Null],
      getWidth: () => js.Promise[String],
      hasError: () => js.Promise[Boolean],
      hasPrefixAriaHidden: () => js.Promise[Boolean],
      hasPrefixIndication: () => js.Promise[Boolean],
      hasProgressIndicatorAriaHidden: () => js.Promise[Boolean],
      hasSuffixIndication: () => js.Promise[Boolean],
      isCompleted: () => js.Promise[Boolean],
      isErrorIconDisplayed: () => js.Promise[Boolean],
      isPercentagesProgressDisplayed: () => js.Promise[Boolean],
      isSuccessIconDisplayed: () => js.Promise[Boolean]
    ): LinearProgressBarCoreUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAriaLabel = js.Any.fromFunction0(getAriaLabel), getAriaValueMax = js.Any.fromFunction0(getAriaValueMax), getAriaValueMin = js.Any.fromFunction0(getAriaValueMin), getAriaValueNow = js.Any.fromFunction0(getAriaValueNow), getAriaValueText = js.Any.fromFunction0(getAriaValueText), getMaxValue = js.Any.fromFunction0(getMaxValue), getMinValue = js.Any.fromFunction0(getMinValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoleAttribute = js.Any.fromFunction0(getRoleAttribute), getSuffixIndicationText = js.Any.fromFunction0(getSuffixIndicationText), getValue = js.Any.fromFunction0(getValue), getWidth = js.Any.fromFunction0(getWidth), hasError = js.Any.fromFunction0(hasError), hasPrefixAriaHidden = js.Any.fromFunction0(hasPrefixAriaHidden), hasPrefixIndication = js.Any.fromFunction0(hasPrefixIndication), hasProgressIndicatorAriaHidden = js.Any.fromFunction0(hasProgressIndicatorAriaHidden), hasSuffixIndication = js.Any.fromFunction0(hasSuffixIndication), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
      __obj.asInstanceOf[LinearProgressBarCoreUniDriver]
    }
    
    extension [Self <: LinearProgressBarCoreUniDriver](x: Self) {
      
      inline def setGetAriaLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueMax(value: () => js.Promise[Double]): Self = StObject.set(x, "getAriaValueMax", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueMin(value: () => js.Promise[Double]): Self = StObject.set(x, "getAriaValueMin", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueNow(value: () => js.Promise[Double]): Self = StObject.set(x, "getAriaValueNow", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueText(value: () => js.Promise[String]): Self = StObject.set(x, "getAriaValueText", js.Any.fromFunction0(value))
      
      inline def setGetMaxValue(value: () => js.Promise[Double]): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
      
      inline def setGetMinValue(value: () => js.Promise[Double]): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
      
      inline def setGetNumericValue(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumericValue", js.Any.fromFunction0(value))
      
      inline def setGetRoleAttribute(value: () => js.Promise[String]): Self = StObject.set(x, "getRoleAttribute", js.Any.fromFunction0(value))
      
      inline def setGetSuffixIndicationText(value: () => js.Promise[String]): Self = StObject.set(x, "getSuffixIndicationText", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => js.Promise[String]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setHasPrefixAriaHidden(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasPrefixAriaHidden", js.Any.fromFunction0(value))
      
      inline def setHasPrefixIndication(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasPrefixIndication", js.Any.fromFunction0(value))
      
      inline def setHasProgressIndicatorAriaHidden(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasProgressIndicatorAriaHidden", js.Any.fromFunction0(value))
      
      inline def setHasSuffixIndication(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasSuffixIndication", js.Any.fromFunction0(value))
      
      inline def setIsCompleted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsPercentagesProgressDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
    }
  }
}
