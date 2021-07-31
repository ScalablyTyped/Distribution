package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captchaTestComponentDottestDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/captcha/test-assets/CaptchaTestComponent.testDriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def CaptchaTestInstanceDriverFactory(base: UniDriver[js.Any]): CaptchaTestComponentDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptchaTestInstanceDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CaptchaTestComponentDriver]
  
  trait CaptchaTestComponentDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnCaptcha(): js.Promise[js.Any]
    
    def isCaptchaRendered(): js.Promise[Boolean]
    
    def isCaptchaResetted(): js.Promise[Boolean]
    
    def isCaptchaVerified(): js.Promise[Boolean]
    
    def resetCaptcha(): js.Promise[js.Any]
  }
  object CaptchaTestComponentDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickOnCaptcha: () => js.Promise[js.Any],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      isCaptchaRendered: () => js.Promise[Boolean],
      isCaptchaResetted: () => js.Promise[Boolean],
      isCaptchaVerified: () => js.Promise[Boolean],
      resetCaptcha: () => js.Promise[js.Any]
    ): CaptchaTestComponentDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnCaptcha = js.Any.fromFunction0(clickOnCaptcha), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isCaptchaRendered = js.Any.fromFunction0(isCaptchaRendered), isCaptchaResetted = js.Any.fromFunction0(isCaptchaResetted), isCaptchaVerified = js.Any.fromFunction0(isCaptchaVerified), resetCaptcha = js.Any.fromFunction0(resetCaptcha))
      __obj.asInstanceOf[CaptchaTestComponentDriver]
    }
    
    @scala.inline
    implicit class CaptchaTestComponentDriverMutableBuilder[Self <: CaptchaTestComponentDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickOnCaptcha(value: () => js.Promise[js.Any]): Self = StObject.set(x, "clickOnCaptcha", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCaptchaRendered(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCaptchaRendered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCaptchaResetted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCaptchaResetted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCaptchaVerified(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCaptchaVerified", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetCaptcha(value: () => js.Promise[js.Any]): Self = StObject.set(x, "resetCaptcha", js.Any.fromFunction0(value))
    }
  }
}
