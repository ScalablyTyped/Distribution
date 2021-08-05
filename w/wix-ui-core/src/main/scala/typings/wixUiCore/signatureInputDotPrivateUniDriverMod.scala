package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.signatureInputDotUniDriverMod.SignatureInputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureInputDotPrivateUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/signature-input/test/SignatureInput.private.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signatureInputPrivateUniDriverFactory(base: UniDriver[js.Any]): PrivateSignatureInputDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureInputPrivateUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[PrivateSignatureInputDriver]
  
  trait PrivateSignatureInputDriver
    extends StObject
       with SignatureInputDriver {
    
    def blurA11yInput(): js.Promise[Unit]
    
    def focusA11yInput(): js.Promise[Unit]
  }
  object PrivateSignatureInputDriver {
    
    inline def apply(
      blurA11yInput: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      focusA11yInput: () => js.Promise[Unit],
      getA11yInput: () => UniDriver[js.Any],
      getChildDriverByHook: String => UniDriver[js.Any]
    ): PrivateSignatureInputDriver = {
      val __obj = js.Dynamic.literal(blurA11yInput = js.Any.fromFunction0(blurA11yInput), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focusA11yInput = js.Any.fromFunction0(focusA11yInput), getA11yInput = js.Any.fromFunction0(getA11yInput), getChildDriverByHook = js.Any.fromFunction1(getChildDriverByHook))
      __obj.asInstanceOf[PrivateSignatureInputDriver]
    }
    
    extension [Self <: PrivateSignatureInputDriver](x: Self) {
      
      inline def setBlurA11yInput(value: () => js.Promise[Unit]): Self = StObject.set(x, "blurA11yInput", js.Any.fromFunction0(value))
      
      inline def setFocusA11yInput(value: () => js.Promise[Unit]): Self = StObject.set(x, "focusA11yInput", js.Any.fromFunction0(value))
    }
  }
}
