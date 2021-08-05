package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonNextUniDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/button-next/button-next.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonNextDriverFactory(base: UniDriver[js.Any]): ButtonNextDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonNextDriver]
  
  trait ButtonNextDriver
    extends StObject
       with BaseUniDriver {
    
    /** returns button text */
    def getButtonTextContent(): js.Promise[String]
    
    /** returns true if button disabled */
    def isButtonDisabled(): js.Promise[Boolean]
    
    /** returns true if button focused */
    def isFocused(): js.Promise[Boolean]
  }
  object ButtonNextDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getButtonTextContent: () => js.Promise[String],
      isButtonDisabled: () => js.Promise[Boolean],
      isFocused: () => js.Promise[Boolean]
    ): ButtonNextDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getButtonTextContent = js.Any.fromFunction0(getButtonTextContent), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled), isFocused = js.Any.fromFunction0(isFocused))
      __obj.asInstanceOf[ButtonNextDriver]
    }
    
    extension [Self <: ButtonNextDriver](x: Self) {
      
      inline def setGetButtonTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getButtonTextContent", js.Any.fromFunction0(value))
      
      inline def setIsButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
    }
  }
}
