package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.whatsappMod.WhatsappProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonWhatsappMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Whatsapp", JSImport.Default)
  @js.native
  val default: FC[WhatsappProps] = js.native
  
  type _To = FC[WhatsappProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonWhatsappMod.foo` */
  override def _to: FC[WhatsappProps] = default
}
