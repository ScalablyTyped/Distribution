package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBarCore/LinearProgressBarCore.driver", "linearProgressBarDriverFactory")
  @js.native
  val linearProgressBarDriverFactory: DriverFactory[LinearProgressBarCoreDriver] = js.native
  
  trait LinearProgressBarCoreDriver
    extends StObject
       with BaseDriver {
    
    /** Clicks the component */
    def click(): Unit
    
    /** Returns aria-label prop */
    def getAriaLabel(): String
    
    /** Returns aria-valuemax prop */
    def getAriaValueMax(): Double
    
    /** Returns aria-valuemin prop */
    def getAriaValueMin(): Double
    
    /** Returns aria-valuenow prop */
    def getAriaValueNow(): Double
    
    /** Returns aria-valuetext prop */
    def getAriaValueText(): String
    
    /** Returns max value prop */
    def getMaxValue(): Double
    
    /** Returns min value prop */
    def getMinValue(): Double
    
    /** Get the progress numeric value */
    def getNumericValue(): Double
    
    /** Returns role html attribute */
    def getRoleAttribute(): String
    
    /** Get the suffix indication's text */
    def getSuffixIndicationText(): String
    
    /** Get the progress percentages value */
    def getValue(): String
    
    /** Get the width of the foreground bar (the progress) */
    def getWidth(): String
    
    /** Returns true if has error */
    def hasError(): Boolean
    
    /** Get the prefix indication aria-hidden value */
    def hasPrefixAriaHidden(): Boolean
    
    /** Returns boolean that indicates if the prefix indication exists */
    def hasPrefixIndication(): Boolean
    
    /** Get the progress indication aria-hidden value */
    def hasProgressIndicatorAriaHidden(): Boolean
    
    /** Returns boolean that indicates if the custom suffix indication exists */
    def hasSuffixIndication(): Boolean
    
    /** Returns true if has progress completed (value is 100) */
    def isCompleted(): Boolean
    
    /** Returns boolean that indicates if the error icon exists */
    def isErrorIconDisplayed(): Boolean
    
    /** Returns boolean that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): Boolean
    
    /** Returns boolean that indicates if the success icon exists */
    def isSuccessIconDisplayed(): Boolean
  }
  object LinearProgressBarCoreDriver {
    
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
      getValue: () => String,
      getWidth: () => String,
      hasError: () => Boolean,
      hasPrefixAriaHidden: () => Boolean,
      hasPrefixIndication: () => Boolean,
      hasProgressIndicatorAriaHidden: () => Boolean,
      hasSuffixIndication: () => Boolean,
      isCompleted: () => Boolean,
      isErrorIconDisplayed: () => Boolean,
      isPercentagesProgressDisplayed: () => Boolean,
      isSuccessIconDisplayed: () => Boolean
    ): LinearProgressBarCoreDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getAriaLabel = js.Any.fromFunction0(getAriaLabel), getAriaValueMax = js.Any.fromFunction0(getAriaValueMax), getAriaValueMin = js.Any.fromFunction0(getAriaValueMin), getAriaValueNow = js.Any.fromFunction0(getAriaValueNow), getAriaValueText = js.Any.fromFunction0(getAriaValueText), getMaxValue = js.Any.fromFunction0(getMaxValue), getMinValue = js.Any.fromFunction0(getMinValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoleAttribute = js.Any.fromFunction0(getRoleAttribute), getSuffixIndicationText = js.Any.fromFunction0(getSuffixIndicationText), getValue = js.Any.fromFunction0(getValue), getWidth = js.Any.fromFunction0(getWidth), hasError = js.Any.fromFunction0(hasError), hasPrefixAriaHidden = js.Any.fromFunction0(hasPrefixAriaHidden), hasPrefixIndication = js.Any.fromFunction0(hasPrefixIndication), hasProgressIndicatorAriaHidden = js.Any.fromFunction0(hasProgressIndicatorAriaHidden), hasSuffixIndication = js.Any.fromFunction0(hasSuffixIndication), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
      __obj.asInstanceOf[LinearProgressBarCoreDriver]
    }
    
    extension [Self <: LinearProgressBarCoreDriver](x: Self) {
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setGetAriaLabel(value: () => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueMax(value: () => Double): Self = StObject.set(x, "getAriaValueMax", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueMin(value: () => Double): Self = StObject.set(x, "getAriaValueMin", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueNow(value: () => Double): Self = StObject.set(x, "getAriaValueNow", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueText(value: () => String): Self = StObject.set(x, "getAriaValueText", js.Any.fromFunction0(value))
      
      inline def setGetMaxValue(value: () => Double): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
      
      inline def setGetMinValue(value: () => Double): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
      
      inline def setGetNumericValue(value: () => Double): Self = StObject.set(x, "getNumericValue", js.Any.fromFunction0(value))
      
      inline def setGetRoleAttribute(value: () => String): Self = StObject.set(x, "getRoleAttribute", js.Any.fromFunction0(value))
      
      inline def setGetSuffixIndicationText(value: () => String): Self = StObject.set(x, "getSuffixIndicationText", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => String): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setHasPrefixAriaHidden(value: () => Boolean): Self = StObject.set(x, "hasPrefixAriaHidden", js.Any.fromFunction0(value))
      
      inline def setHasPrefixIndication(value: () => Boolean): Self = StObject.set(x, "hasPrefixIndication", js.Any.fromFunction0(value))
      
      inline def setHasProgressIndicatorAriaHidden(value: () => Boolean): Self = StObject.set(x, "hasProgressIndicatorAriaHidden", js.Any.fromFunction0(value))
      
      inline def setHasSuffixIndication(value: () => Boolean): Self = StObject.set(x, "hasSuffixIndication", js.Any.fromFunction0(value))
      
      inline def setIsCompleted(value: () => Boolean): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsPercentagesProgressDisplayed(value: () => Boolean): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
    }
  }
}
