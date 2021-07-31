package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.loaderMod.LoaderColor
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderDriverMod {
  
  trait LoaderDriver
    extends StObject
       with BaseDriver {
    
    def component(): HTMLElement
    
    def getColor(): LoaderColor
    
    def getStatusMessage(): js.Promise[String]
    
    def getText(): String
    
    def hasText(): Boolean
    
    def isError(): Boolean
    
    def isLarge(): Boolean
    
    def isLoading(): Boolean
    
    def isMedium(): Boolean
    
    def isSmall(): Boolean
    
    def isSuccess(): Boolean
    
    def isTiny(): Boolean
  }
  object LoaderDriver {
    
    @scala.inline
    def apply(
      component: () => HTMLElement,
      exists: () => Boolean,
      getColor: () => LoaderColor,
      getStatusMessage: () => js.Promise[String],
      getText: () => String,
      hasText: () => Boolean,
      isError: () => Boolean,
      isLarge: () => Boolean,
      isLoading: () => Boolean,
      isMedium: () => Boolean,
      isSmall: () => Boolean,
      isSuccess: () => Boolean,
      isTiny: () => Boolean
    ): LoaderDriver = {
      val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), exists = js.Any.fromFunction0(exists), getColor = js.Any.fromFunction0(getColor), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getText = js.Any.fromFunction0(getText), hasText = js.Any.fromFunction0(hasText), isError = js.Any.fromFunction0(isError), isLarge = js.Any.fromFunction0(isLarge), isLoading = js.Any.fromFunction0(isLoading), isMedium = js.Any.fromFunction0(isMedium), isSmall = js.Any.fromFunction0(isSmall), isSuccess = js.Any.fromFunction0(isSuccess), isTiny = js.Any.fromFunction0(isTiny))
      __obj.asInstanceOf[LoaderDriver]
    }
    
    @scala.inline
    implicit class LoaderDriverMutableBuilder[Self <: LoaderDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: () => HTMLElement): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColor(value: () => LoaderColor): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatusMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasText(value: () => Boolean): Self = StObject.set(x, "hasText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsError(value: () => Boolean): Self = StObject.set(x, "isError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLarge(value: () => Boolean): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMedium(value: () => Boolean): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSmall(value: () => Boolean): Self = StObject.set(x, "isSmall", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSuccess(value: () => Boolean): Self = StObject.set(x, "isSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTiny(value: () => Boolean): Self = StObject.set(x, "isTiny", js.Any.fromFunction0(value))
    }
  }
}
