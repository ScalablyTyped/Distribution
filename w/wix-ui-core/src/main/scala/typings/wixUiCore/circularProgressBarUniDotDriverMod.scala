package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarUniDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/circular-progress-bar/CircularProgressBar.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def circularProgressBarUniDriverFactory(base: UniDriver[js.Any]): CircularProgressBarUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("circularProgressBarUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CircularProgressBarUniDriver]
  
  trait CircularProgressBarUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Get the text content displayed */
    def getLabelTextContent(): js.Promise[String]
    
    /** Get the progress percentages value */
    def getValue(): js.Promise[String]
    
    /** Returns true if has error */
    def hasError(): js.Promise[Boolean]
    
    /** Returns true if has progress completed (value is 100) */
    def isCompleted(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the error icon exists */
    def isErrorIconDisplayed(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the label text exists */
    def isLabelDisplayed(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the success icon exists */
    def isSuccessIconDisplayed(): js.Promise[Boolean]
  }
  object CircularProgressBarUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getLabelTextContent: () => js.Promise[String],
      getValue: () => js.Promise[String],
      hasError: () => js.Promise[Boolean],
      isCompleted: () => js.Promise[Boolean],
      isErrorIconDisplayed: () => js.Promise[Boolean],
      isLabelDisplayed: () => js.Promise[Boolean],
      isPercentagesProgressDisplayed: () => js.Promise[Boolean],
      isSuccessIconDisplayed: () => js.Promise[Boolean]
    ): CircularProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
      __obj.asInstanceOf[CircularProgressBarUniDriver]
    }
    
    @scala.inline
    implicit class CircularProgressBarUniDriverMutableBuilder[Self <: CircularProgressBarUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLabelTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelTextContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCompleted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsErrorIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLabelDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLabelDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPercentagesProgressDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSuccessIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
    }
  }
}
