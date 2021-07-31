package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressBarProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/linear-progress-bar/LinearProgressBar.protractor.driver", "linearProgressBarDriverFactory")
  @js.native
  val linearProgressBarDriverFactory: DriverFactory[LinearProgressBarDriver] = js.native
  
  trait LinearProgressBarDriver
    extends StObject
       with BaseDriver {
    
    /** Returns true if the root element is present */
    def exists(): js.Promise[Boolean]
    
    /** Get the background bar width */
    def getBackgroundBarWidth(): js.Promise[Double]
    
    /** Get the foreground bar width */
    def getForegroundBarWidth(): js.Promise[Double]
    
    /** Returns true if the progress indication element is displayed */
    def isProgressIndicationDisplayed(): js.Promise[Boolean]
    
    /** Get the progress indication element value */
    def progressIndicationValue(): js.Promise[String]
  }
  object LinearProgressBarDriver {
    
    @scala.inline
    def apply(
      element: () => ElementFinder,
      exists: () => js.Promise[Boolean],
      getBackgroundBarWidth: () => js.Promise[Double],
      getForegroundBarWidth: () => js.Promise[Double],
      isProgressIndicationDisplayed: () => js.Promise[Boolean],
      progressIndicationValue: () => js.Promise[String]
    ): LinearProgressBarDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getBackgroundBarWidth = js.Any.fromFunction0(getBackgroundBarWidth), getForegroundBarWidth = js.Any.fromFunction0(getForegroundBarWidth), isProgressIndicationDisplayed = js.Any.fromFunction0(isProgressIndicationDisplayed), progressIndicationValue = js.Any.fromFunction0(progressIndicationValue))
      __obj.asInstanceOf[LinearProgressBarDriver]
    }
    
    @scala.inline
    implicit class LinearProgressBarDriverMutableBuilder[Self <: LinearProgressBarDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBackgroundBarWidth(value: () => js.Promise[Double]): Self = StObject.set(x, "getBackgroundBarWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetForegroundBarWidth(value: () => js.Promise[Double]): Self = StObject.set(x, "getForegroundBarWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsProgressIndicationDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isProgressIndicationDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProgressIndicationValue(value: () => js.Promise[String]): Self = StObject.set(x, "progressIndicationValue", js.Any.fromFunction0(value))
    }
  }
}
