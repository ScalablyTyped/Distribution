package typings.wixStyleReact

import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSkin
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Button/Button.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonDriverFactory(base: BaseUniDriver): ButtonUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonUniDriver]
  
  trait ButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getButtonTextContent(): js.Promise[String]
    
    def hasSkin(skinName: ButtonSkin): js.Promise[Boolean]
    
    def isButtonDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isPrefixIconExists(): js.Promise[Boolean]
    
    def isSuffixIconExists(): js.Promise[Boolean]
  }
  object ButtonUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getButtonTextContent: () => js.Promise[String],
      hasSkin: ButtonSkin => js.Promise[Boolean],
      isButtonDisabled: () => js.Promise[Boolean],
      isFocused: () => js.Promise[Boolean],
      isPrefixIconExists: () => js.Promise[Boolean],
      isSuffixIconExists: () => js.Promise[Boolean]
    ): ButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getButtonTextContent = js.Any.fromFunction0(getButtonTextContent), hasSkin = js.Any.fromFunction1(hasSkin), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled), isFocused = js.Any.fromFunction0(isFocused), isPrefixIconExists = js.Any.fromFunction0(isPrefixIconExists), isSuffixIconExists = js.Any.fromFunction0(isSuffixIconExists))
      __obj.asInstanceOf[ButtonUniDriver]
    }
    
    extension [Self <: ButtonUniDriver](x: Self) {
      
      inline def setGetButtonTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getButtonTextContent", js.Any.fromFunction0(value))
      
      inline def setHasSkin(value: ButtonSkin => js.Promise[Boolean]): Self = StObject.set(x, "hasSkin", js.Any.fromFunction1(value))
      
      inline def setIsButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setIsPrefixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPrefixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsSuffixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuffixIconExists", js.Any.fromFunction0(value))
    }
  }
}
