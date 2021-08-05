package typings.wixUiCore

import typings.react.mod.Component
import typings.wixUiCore.anon.Expired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testAssetsCaptchaTestComponentMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/captcha/test-assets/CaptchaTestComponent", "CaptchaTestComponent")
  @js.native
  class CaptchaTestComponent protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
    
    /* private */ var captchaRef: js.Any = js.native
    
    def getVerifiedToken(): js.Any = js.native
    
    def isCaptchaVerified(): js.Any = js.native
    
    def resetCaptcha(): Unit = js.native
    
    @JSName("state")
    var state_CaptchaTestComponent: Expired = js.native
  }
}
