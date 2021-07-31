package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.emailClickMod.EmailClickProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonEmailClickMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/EmailClick", JSImport.Default)
  @js.native
  val default: SFC[EmailClickProps] = js.native
  
  type _To = SFC[EmailClickProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonEmailClickMod.foo` */
  override def _to: SFC[EmailClickProps] = default
}
