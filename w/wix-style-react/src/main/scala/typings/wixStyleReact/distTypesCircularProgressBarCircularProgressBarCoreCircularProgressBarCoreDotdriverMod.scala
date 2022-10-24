package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarCircularProgressBarCoreCircularProgressBarCoreDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBarCore/CircularProgressBarCore.driver", "circularProgressBarCoreDriverFactory")
  @js.native
  val circularProgressBarCoreDriverFactory: DriverFactory[CircularProgressBarCoreDriver] = js.native
  
  trait CircularProgressBarCoreDriver
    extends StObject
       with BaseDriver {
    
    /** Get the text content displayed */
    def getLabelTextContent(): js.UndefOr[String | Null]
    
    /** Get the progress percentages value */
    def getValue(): js.UndefOr[String | Null]
    
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
  object CircularProgressBarCoreDriver {
    
    inline def apply(
      exists: () => Boolean,
      getLabelTextContent: () => js.UndefOr[String | Null],
      getValue: () => js.UndefOr[String | Null],
      hasError: () => Boolean,
      isCompleted: () => Boolean,
      isErrorIconDisplayed: () => Boolean,
      isLabelDisplayed: () => Boolean,
      isPercentagesProgressDisplayed: () => Boolean,
      isSuccessIconDisplayed: () => Boolean
    ): CircularProgressBarCoreDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
      __obj.asInstanceOf[CircularProgressBarCoreDriver]
    }
    
    extension [Self <: CircularProgressBarCoreDriver](x: Self) {
      
      inline def setGetLabelTextContent(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getLabelTextContent", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setIsCompleted(value: () => Boolean): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsLabelDisplayed(value: () => Boolean): Self = StObject.set(x, "isLabelDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsPercentagesProgressDisplayed(value: () => Boolean): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconDisplayed(value: () => Boolean): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
    }
  }
}
