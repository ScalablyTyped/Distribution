package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.captchaUniDriverMod.CaptchaDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captchaDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/captcha/Captcha.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captchaDriverFactory(base: UniDriver[js.Any]): CaptchaDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("captchaDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CaptchaDriver]
}
