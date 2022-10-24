package typings.wixStyleReact

import typings.wixStyleReact.distTypesCircularProgressBarCircularProgressBarCoreCircularProgressBarCoreDotuniDotdriverMod.CircularProgressBarCoreUniDriver
import typings.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSize
import typings.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarCircularProgressBarDotuniDotdriverMod {
  
  trait CircularProgressBarUniDriver
    extends StObject
       with CircularProgressBarCoreUniDriver {
    
    def getSize(): js.Promise[CircularProgressBarSize]
    
    def getTooltipErrorMessage(): js.Promise[Any]
    
    def hasSkin(skinName: CircularProgressBarSkin): js.Promise[Boolean]
    
    def isErrorIconShown(): js.Promise[Boolean]
    
    def isSuccessIconShown(): js.Promise[Boolean]
  }
  object CircularProgressBarUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getAttribute: String => js.Promise[String | Null],
      getLabelTextContent: () => js.Promise[String],
      getSize: () => js.Promise[CircularProgressBarSize],
      getTooltipErrorMessage: () => js.Promise[Any],
      getValue: () => js.Promise[String | Null],
      hasError: () => js.Promise[Boolean],
      hasSkin: CircularProgressBarSkin => js.Promise[Boolean],
      isCompleted: () => js.Promise[Boolean],
      isErrorIconDisplayed: () => js.Promise[Boolean],
      isErrorIconShown: () => js.Promise[Boolean],
      isLabelDisplayed: () => js.Promise[Boolean],
      isPercentagesProgressDisplayed: () => js.Promise[Boolean],
      isSuccessIconDisplayed: () => js.Promise[Boolean],
      isSuccessIconShown: () => js.Promise[Boolean]
    ): CircularProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAttribute = js.Any.fromFunction1(getAttribute), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getSize = js.Any.fromFunction0(getSize), getTooltipErrorMessage = js.Any.fromFunction0(getTooltipErrorMessage), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), hasSkin = js.Any.fromFunction1(hasSkin), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isErrorIconShown = js.Any.fromFunction0(isErrorIconShown), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed), isSuccessIconShown = js.Any.fromFunction0(isSuccessIconShown))
      __obj.asInstanceOf[CircularProgressBarUniDriver]
    }
    
    extension [Self <: CircularProgressBarUniDriver](x: Self) {
      
      inline def setGetSize(value: () => js.Promise[CircularProgressBarSize]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetTooltipErrorMessage(value: () => js.Promise[Any]): Self = StObject.set(x, "getTooltipErrorMessage", js.Any.fromFunction0(value))
      
      inline def setHasSkin(value: CircularProgressBarSkin => js.Promise[Boolean]): Self = StObject.set(x, "hasSkin", js.Any.fromFunction1(value))
      
      inline def setIsErrorIconShown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorIconShown", js.Any.fromFunction0(value))
      
      inline def setIsSuccessIconShown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessIconShown", js.Any.fromFunction0(value))
    }
  }
}
