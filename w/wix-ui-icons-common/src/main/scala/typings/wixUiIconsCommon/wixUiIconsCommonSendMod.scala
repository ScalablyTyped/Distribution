package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.sendMod.SendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Send", JSImport.Default)
  @js.native
  val default: SFC[SendProps] = js.native
  
  type _To = SFC[SendProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSendMod.foo` */
  override def _to: SFC[SendProps] = default
}
