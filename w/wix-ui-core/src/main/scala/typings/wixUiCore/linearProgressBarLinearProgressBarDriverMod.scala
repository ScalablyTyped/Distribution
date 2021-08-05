package typings.wixUiCore

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressBarLinearProgressBarDriverMod {
  
  @JSImport("wix-ui-core/src/components/linear-progress-bar/LinearProgressBar.driver", "linearProgressBarDriverFactory")
  @js.native
  val linearProgressBarDriverFactory: DriverFactory[LinearProgressBarDriver] = js.native
  
  trait LinearProgressBarDriver
    extends StObject
       with BaseDriver {
    
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
    
    /** Get the progress percentages value */
    def getValue(): String
    
    /** Get the width of the foreground bar (the progress) */
    def getWidth(): String
    
    /** Returns true if has error */
    def hasError(): Boolean
    
    /** Returns true if has progress completed (value is 100) */
    def isCompleted(): Boolean
    
    /** Returns boolean that indicates if the error icon exists */
    def isErrorIconDisplayed(): Boolean
    
    /** Returns boolean that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): Boolean
    
    /** Returns boolean that indicates if the success icon exists */
    def isSuccessIconDisplayed(): Boolean
  }
  object LinearProgressBarDriver {
    
    inline def apply(
      exists: () => Boolean,
      getAriaValueMax: () => Double,
      getAriaValueMin: () => Double,
      getAriaValueNow: () => Double,
      getAriaValueText: () => String,
      getMaxValue: () => Double,
      getMinValue: () => Double,
      getNumericValue: () => Double,
      getRoleAttribute: () => String,
      getValue: () => String,
      getWidth: () => String,
      hasError: () => Boolean,
      isCompleted: () => Boolean,
      isErrorIconDisplayed: () => Boolean,
      isPercentagesProgressDisplayed: () => Boolean,
      isSuccessIconDisplayed: () => Boolean
    ): LinearProgressBarDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getAriaValueMax = js.Any.fromFunction0(getAriaValueMax), getAriaValueMin = js.Any.fromFunction0(getAriaValueMin), getAriaValueNow = js.Any.fromFunction0(getAriaValueNow), getAriaValueText = js.Any.fromFunction0(getAriaValueText), getMaxValue = js.Any.fromFunction0(getMaxValue), getMinValue = js.Any.fromFunction0(getMinValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoleAttribute = js.Any.fromFunction0(getRoleAttribute), getValue = js.Any.fromFunction0(getValue), getWidth = js.Any.fromFunction0(getWidth), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
      __obj.asInstanceOf[LinearProgressBarDriver]
    }
    
    extension [Self <: LinearProgressBarDriver](x: Self) {
      
      inline def setGetAriaValueMax(value: () => Double): Self = StObject.set(x, "getAriaValueMax", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueMin(value: () => Double): Self = StObject.set(x, "getAriaValueMin", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueNow(value: () => Double): Self = StObject.set(x, "getAriaValueNow", js.Any.fromFunction0(value))
      
      inline def setGetAriaValueText(value: () => String): Self = StObject.set(x, "getAriaValueText", js.Any.fromFunction0(value))
      
      inline def setGetMaxValue(value: () => Double): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
      
      inline def setGetMinValue(value: () => Double): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
      
      inline def setGetNumericValue(value: () => Double): Self = StObject.set(x, "getNumericValue", js.Any.fromFunction0(value))
      
      inline def setGetRoleAttribute(value: () => String): Self = StObject.set(x, "getRoleAttribute", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => String): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setIsCompleted(value: () => Boolean): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsPercentagesProgressDisplayed(value: () => Boolean): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
    }
  }
}
