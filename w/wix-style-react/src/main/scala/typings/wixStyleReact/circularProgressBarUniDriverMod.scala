package typings.wixStyleReact

import typings.wixStyleReact.circularProgressBarMod.CircularProgressBarSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarUniDriverMod {
  
  trait CircularProgressBarUniDriver
    extends StObject
       with typings.wixUiCore.circularProgressBarUniDriverMod.CircularProgressBarUniDriver {
    
    def getSize(): js.Promise[CircularProgressBarSize]
    
    def getTooltipErrorMessage(): js.Promise[js.Any]
    
    def isErrorIconShown(): js.Promise[Boolean]
    
    def isSuccessIconShown(): js.Promise[Boolean]
  }
  object CircularProgressBarUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getLabelTextContent: () => js.Promise[String],
      getSize: () => js.Promise[CircularProgressBarSize],
      getTooltipErrorMessage: () => js.Promise[js.Any],
      getValue: () => js.Promise[String],
      hasError: () => js.Promise[Boolean],
      isCompleted: () => js.Promise[Boolean],
      isErrorIconDisplayed: () => js.Promise[Boolean],
      isErrorIconShown: () => js.Promise[Boolean],
      isLabelDisplayed: () => js.Promise[Boolean],
      isPercentagesProgressDisplayed: () => js.Promise[Boolean],
      isSuccessIconDisplayed: () => js.Promise[Boolean],
      isSuccessIconShown: () => js.Promise[Boolean]
    ): CircularProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getSize = js.Any.fromFunction0(getSize), getTooltipErrorMessage = js.Any.fromFunction0(getTooltipErrorMessage), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isErrorIconShown = js.Any.fromFunction0(isErrorIconShown), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed), isSuccessIconShown = js.Any.fromFunction0(isSuccessIconShown))
      __obj.asInstanceOf[CircularProgressBarUniDriver]
    }
    
    @scala.inline
    implicit class CircularProgressBarUniDriverMutableBuilder[Self <: CircularProgressBarUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSize(value: () => js.Promise[CircularProgressBarSize]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTooltipErrorMessage(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getTooltipErrorMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsErrorIconShown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorIconShown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSuccessIconShown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessIconShown", js.Any.fromFunction0(value))
    }
  }
}
