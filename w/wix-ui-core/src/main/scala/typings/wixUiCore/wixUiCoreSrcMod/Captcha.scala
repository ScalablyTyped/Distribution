package typings.wixUiCore.wixUiCoreSrcMod

import typings.wixUiCore.srcComponentsCaptchaCaptchaMod.CaptchaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/src", "Captcha")
@js.native
class Captcha protected ()
  extends typings.wixUiCore.wixUiCoreCaptchaMod.Captcha {
  def this(props: CaptchaProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: CaptchaProps, context: js.Any) = this()
}
/* static members */
object Captcha {
  
  @JSImport("wix-ui-core/src", "Captcha")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/src", "Captcha.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
