package typings.wixUiCore

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarCircularProgressBarDriverMod {
  
  @JSImport("wix-ui-core/src/components/circular-progress-bar/CircularProgressBar.driver", "circularProgressBarDriverFactory")
  @js.native
  val circularProgressBarDriverFactory: DriverFactory[CircularProgressBarDriver] = js.native
  
  trait CircularProgressBarDriver
    extends StObject
       with BaseDriver {
    
    /** Get the text content displayed */
    def getLabelTextContent(): String
    
    /** Get the progress percentages value */
    def getValue(): String
    
    /** Returms true if has error */
    def hasError(): Boolean
    
    /** Returms true if has progress completed (value is 100) */
    def isCompleted(): Boolean
    
    /** Returns boolean that indicates if the error icon exists */
    def isErrorIconDisplayed(): Boolean
    
    /** Returns boolean that indicates if the label text exists */
    def isLabelDisplayed(): Boolean
    
    /** Returns boolean that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): Boolean
    
    /** Returns boolean that indicates if the success icon exists */
    def isSuccessIconDisplayed(): Boolean
  }
  object CircularProgressBarDriver {
    
    @scala.inline
    def apply(
      exists: () => Boolean,
      getLabelTextContent: () => String,
      getValue: () => String,
      hasError: () => Boolean,
      isCompleted: () => Boolean,
      isErrorIconDisplayed: () => Boolean,
      isLabelDisplayed: () => Boolean,
      isPercentagesProgressDisplayed: () => Boolean,
      isSuccessIconDisplayed: () => Boolean
    ): CircularProgressBarDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
      __obj.asInstanceOf[CircularProgressBarDriver]
    }
    
    @scala.inline
    implicit class CircularProgressBarDriverMutableBuilder[Self <: CircularProgressBarDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLabelTextContent(value: () => String): Self = StObject.set(x, "getLabelTextContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCompleted(value: () => Boolean): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsErrorIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLabelDisplayed(value: () => Boolean): Self = StObject.set(x, "isLabelDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPercentagesProgressDisplayed(value: () => Boolean): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSuccessIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
    }
  }
}
