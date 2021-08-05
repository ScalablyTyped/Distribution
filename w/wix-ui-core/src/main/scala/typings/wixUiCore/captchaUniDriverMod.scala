package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captchaUniDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/captcha/Captcha.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captchaDriverFactory(base: UniDriver[js.Any]): CaptchaDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("captchaDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CaptchaDriver]
  
  trait CaptchaDriver
    extends StObject
       with BaseUniDriver {
    
    def getCaptchaType(): js.Promise[String]
    
    def getLang(): js.Promise[String]
    
    def getSize(): js.Promise[String]
    
    def getTheme(): js.Promise[String]
    
    def isRequired(): js.Promise[Boolean]
  }
  object CaptchaDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getCaptchaType: () => js.Promise[String],
      getLang: () => js.Promise[String],
      getSize: () => js.Promise[String],
      getTheme: () => js.Promise[String],
      isRequired: () => js.Promise[Boolean]
    ): CaptchaDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCaptchaType = js.Any.fromFunction0(getCaptchaType), getLang = js.Any.fromFunction0(getLang), getSize = js.Any.fromFunction0(getSize), getTheme = js.Any.fromFunction0(getTheme), isRequired = js.Any.fromFunction0(isRequired))
      __obj.asInstanceOf[CaptchaDriver]
    }
    
    extension [Self <: CaptchaDriver](x: Self) {
      
      inline def setGetCaptchaType(value: () => js.Promise[String]): Self = StObject.set(x, "getCaptchaType", js.Any.fromFunction0(value))
      
      inline def setGetLang(value: () => js.Promise[String]): Self = StObject.set(x, "getLang", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => js.Promise[String]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetTheme(value: () => js.Promise[String]): Self = StObject.set(x, "getTheme", js.Any.fromFunction0(value))
      
      inline def setIsRequired(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    }
  }
}
