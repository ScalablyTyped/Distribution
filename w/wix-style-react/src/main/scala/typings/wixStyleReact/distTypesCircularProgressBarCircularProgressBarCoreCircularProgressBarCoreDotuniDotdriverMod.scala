package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarCircularProgressBarCoreCircularProgressBarCoreDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBarCore/CircularProgressBarCore.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circularProgressBarCoreUniDriverFactory(base: UniDriver[Any]): CircularProgressBarCoreUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("circularProgressBarCoreUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CircularProgressBarCoreUniDriver]
  
  trait CircularProgressBarCoreUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAttribute(name: String): js.Promise[String | Null]
    
    /** Get the text content displayed */
    def getLabelTextContent(): js.Promise[String]
    
    /** Get the progress percentages value */
    def getValue(): js.Promise[String | Null]
    
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
  object CircularProgressBarCoreUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getAttribute: String => js.Promise[String | Null],
      getLabelTextContent: () => js.Promise[String],
      getValue: () => js.Promise[String | Null],
      hasError: () => js.Promise[Boolean],
      isCompleted: () => js.Promise[Boolean],
      isErrorIconDisplayed: () => js.Promise[Boolean],
      isLabelDisplayed: () => js.Promise[Boolean],
      isPercentagesProgressDisplayed: () => js.Promise[Boolean],
      isSuccessIconDisplayed: () => js.Promise[Boolean]
    ): CircularProgressBarCoreUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAttribute = js.Any.fromFunction1(getAttribute), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
      __obj.asInstanceOf[CircularProgressBarCoreUniDriver]
    }
    
    extension [Self <: CircularProgressBarCoreUniDriver](x: Self) {
      
      inline def setGetAttribute(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetLabelTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelTextContent", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setIsCompleted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      inline def setIsErrorIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsLabelDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLabelDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsPercentagesProgressDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
    }
  }
}
