package typings.wixStyleReact

import typings.wixStyleReact.loaderMod.LoaderColor
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderUniDriverMod {
  
  trait LoaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** @deprecated Should be private */
    def component(): js.Promise[js.Any]
    
    def getColor(): js.Promise[LoaderColor]
    
    def getStatusMessage(): js.Promise[String]
    
    def getText(): js.Promise[String]
    
    def hasText(): js.Promise[Boolean]
    
    def isError(): js.Promise[Boolean]
    
    def isLarge(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
    
    def isMedium(): js.Promise[Boolean]
    
    def isSmall(): js.Promise[Boolean]
    
    def isSuccess(): js.Promise[Boolean]
    
    def isTiny(): js.Promise[Boolean]
  }
  object LoaderUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      component: () => js.Promise[js.Any],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getColor: () => js.Promise[LoaderColor],
      getStatusMessage: () => js.Promise[String],
      getText: () => js.Promise[String],
      hasText: () => js.Promise[Boolean],
      isError: () => js.Promise[Boolean],
      isLarge: () => js.Promise[Boolean],
      isLoading: () => js.Promise[Boolean],
      isMedium: () => js.Promise[Boolean],
      isSmall: () => js.Promise[Boolean],
      isSuccess: () => js.Promise[Boolean],
      isTiny: () => js.Promise[Boolean]
    ): LoaderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), component = js.Any.fromFunction0(component), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getColor = js.Any.fromFunction0(getColor), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getText = js.Any.fromFunction0(getText), hasText = js.Any.fromFunction0(hasText), isError = js.Any.fromFunction0(isError), isLarge = js.Any.fromFunction0(isLarge), isLoading = js.Any.fromFunction0(isLoading), isMedium = js.Any.fromFunction0(isMedium), isSmall = js.Any.fromFunction0(isSmall), isSuccess = js.Any.fromFunction0(isSuccess), isTiny = js.Any.fromFunction0(isTiny))
      __obj.asInstanceOf[LoaderUniDriver]
    }
    
    extension [Self <: LoaderUniDriver](x: Self) {
      
      inline def setComponent(value: () => js.Promise[js.Any]): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
      
      inline def setGetColor(value: () => js.Promise[LoaderColor]): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setHasText(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasText", js.Any.fromFunction0(value))
      
      inline def setIsError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isError", js.Any.fromFunction0(value))
      
      inline def setIsLarge(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
      
      inline def setIsMedium(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
      
      inline def setIsSmall(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSmall", js.Any.fromFunction0(value))
      
      inline def setIsSuccess(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccess", js.Any.fromFunction0(value))
      
      inline def setIsTiny(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTiny", js.Any.fromFunction0(value))
    }
  }
}
