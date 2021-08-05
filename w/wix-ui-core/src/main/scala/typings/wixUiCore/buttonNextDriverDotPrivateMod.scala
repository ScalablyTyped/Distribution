package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.buttonNextUniDotDriverMod.ButtonNextDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonNextDriverDotPrivateMod {
  
  @JSImport("wix-ui-core/src/components/button-next/button-next.driver.private", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonNextPrivateDriverFactory(base: UniDriver[js.Any]): ButtonNextPrivateDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextPrivateDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonNextPrivateDriver]
  
  trait ButtonNextPrivateDriver
    extends StObject
       with ButtonNextDriver {
    
    def hasPrefixClass(string: js.Any): js.Promise[Boolean]
    
    def hasSuffixClass(string: js.Any): js.Promise[Boolean]
    
    def prefixExists(): js.Promise[Boolean]
    
    def suffixExists(): js.Promise[Boolean]
  }
  object ButtonNextPrivateDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getButtonTextContent: () => js.Promise[String],
      hasPrefixClass: js.Any => js.Promise[Boolean],
      hasSuffixClass: js.Any => js.Promise[Boolean],
      isButtonDisabled: () => js.Promise[Boolean],
      isFocused: () => js.Promise[Boolean],
      prefixExists: () => js.Promise[Boolean],
      suffixExists: () => js.Promise[Boolean]
    ): ButtonNextPrivateDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getButtonTextContent = js.Any.fromFunction0(getButtonTextContent), hasPrefixClass = js.Any.fromFunction1(hasPrefixClass), hasSuffixClass = js.Any.fromFunction1(hasSuffixClass), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled), isFocused = js.Any.fromFunction0(isFocused), prefixExists = js.Any.fromFunction0(prefixExists), suffixExists = js.Any.fromFunction0(suffixExists))
      __obj.asInstanceOf[ButtonNextPrivateDriver]
    }
    
    extension [Self <: ButtonNextPrivateDriver](x: Self) {
      
      inline def setHasPrefixClass(value: js.Any => js.Promise[Boolean]): Self = StObject.set(x, "hasPrefixClass", js.Any.fromFunction1(value))
      
      inline def setHasSuffixClass(value: js.Any => js.Promise[Boolean]): Self = StObject.set(x, "hasSuffixClass", js.Any.fromFunction1(value))
      
      inline def setPrefixExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "prefixExists", js.Any.fromFunction0(value))
      
      inline def setSuffixExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "suffixExists", js.Any.fromFunction0(value))
    }
  }
}
