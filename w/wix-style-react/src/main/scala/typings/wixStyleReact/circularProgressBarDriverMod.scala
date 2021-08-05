package typings.wixStyleReact

import typings.wixStyleReact.circularProgressBarMod.CircularProgressBarSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarDriverMod {
  
  trait CircularProgressBarDriver
    extends StObject
       with typings.wixUiCore.circularProgressBarDriverMod.CircularProgressBarDriver {
    
    def getSize(): CircularProgressBarSize
    
    def getTooltipErrorMessage(): String
    
    def isErrorIconShown(): Boolean
    
    def isSuccessIconShown(): Boolean
  }
  object CircularProgressBarDriver {
    
    inline def apply(
      exists: () => Boolean,
      getLabelTextContent: () => String,
      getSize: () => CircularProgressBarSize,
      getTooltipErrorMessage: () => String,
      getValue: () => String,
      hasError: () => Boolean,
      isCompleted: () => Boolean,
      isErrorIconDisplayed: () => Boolean,
      isErrorIconShown: () => Boolean,
      isLabelDisplayed: () => Boolean,
      isPercentagesProgressDisplayed: () => Boolean,
      isSuccessIconDisplayed: () => Boolean,
      isSuccessIconShown: () => Boolean
    ): CircularProgressBarDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getSize = js.Any.fromFunction0(getSize), getTooltipErrorMessage = js.Any.fromFunction0(getTooltipErrorMessage), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isErrorIconShown = js.Any.fromFunction0(isErrorIconShown), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed), isSuccessIconShown = js.Any.fromFunction0(isSuccessIconShown))
      __obj.asInstanceOf[CircularProgressBarDriver]
    }
    
    extension [Self <: CircularProgressBarDriver](x: Self) {
      
      inline def setGetSize(value: () => CircularProgressBarSize): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetTooltipErrorMessage(value: () => String): Self = StObject.set(x, "getTooltipErrorMessage", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconShown(value: () => Boolean): Self = StObject.set(x, "isErrorIconShown", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconShown(value: () => Boolean): Self = StObject.set(x, "isSuccessIconShown", js.Any.fromFunction0(value))
    }
  }
}
