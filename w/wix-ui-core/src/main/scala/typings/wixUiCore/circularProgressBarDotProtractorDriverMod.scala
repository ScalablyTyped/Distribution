package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverDotprotractorMod.BaseDriver
import typings.wixUiCore.baseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarDotProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/circular-progress-bar/CircularProgressBar.protractor.driver", "circularProgressBarDriverFactory")
  @js.native
  val circularProgressBarDriverFactory: DriverFactory[CircularProgressBarDriver] = js.native
  
  trait CircularProgressBarDriver
    extends StObject
       with BaseDriver {
    
    /** Returns true if the root element is present */
    def exists(): js.Promise[Boolean]
    
    /** Get the foreground arc value (percentage) */
    def getValue(): js.Promise[Double]
    
    /** Get the progress indication element value */
    def progressIndicationValue(): js.Promise[String]
  }
  object CircularProgressBarDriver {
    
    @scala.inline
    def apply(
      element: () => ElementFinder,
      exists: () => js.Promise[Boolean],
      getValue: () => js.Promise[Double],
      progressIndicationValue: () => js.Promise[String]
    ): CircularProgressBarDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getValue = js.Any.fromFunction0(getValue), progressIndicationValue = js.Any.fromFunction0(progressIndicationValue))
      __obj.asInstanceOf[CircularProgressBarDriver]
    }
    
    @scala.inline
    implicit class CircularProgressBarDriverMutableBuilder[Self <: CircularProgressBarDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Promise[Double]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProgressIndicationValue(value: () => js.Promise[String]): Self = StObject.set(x, "progressIndicationValue", js.Any.fromFunction0(value))
    }
  }
}
