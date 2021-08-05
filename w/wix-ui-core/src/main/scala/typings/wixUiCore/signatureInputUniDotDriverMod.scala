package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureInputUniDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/signature-input/SignatureInput.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signatureInputUniDriverFactory(base: UniDriver[js.Any]): SignatureInputDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureInputUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[SignatureInputDriver]
  
  trait SignatureInputDriver
    extends StObject
       with BaseUniDriver {
    
    def getA11yInput(): UniDriver[js.Any]
    
    def getChildDriverByHook(dataHook: String): UniDriver[js.Any]
  }
  object SignatureInputDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getA11yInput: () => UniDriver[js.Any],
      getChildDriverByHook: String => UniDriver[js.Any]
    ): SignatureInputDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getA11yInput = js.Any.fromFunction0(getA11yInput), getChildDriverByHook = js.Any.fromFunction1(getChildDriverByHook))
      __obj.asInstanceOf[SignatureInputDriver]
    }
    
    extension [Self <: SignatureInputDriver](x: Self) {
      
      inline def setGetA11yInput(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getA11yInput", js.Any.fromFunction0(value))
      
      inline def setGetChildDriverByHook(value: String => UniDriver[js.Any]): Self = StObject.set(x, "getChildDriverByHook", js.Any.fromFunction1(value))
    }
  }
}
