package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCaptchaMod.CaptchaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captchaMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Captcha", JSImport.Default)
  @js.native
  val default: FC[CaptchaProps] = js.native
  
  type _To = FC[CaptchaProps]
  
  /* This means you don't have to write `default`, but can instead just say `captchaMod.foo` */
  override def _to: FC[CaptchaProps] = default
}
