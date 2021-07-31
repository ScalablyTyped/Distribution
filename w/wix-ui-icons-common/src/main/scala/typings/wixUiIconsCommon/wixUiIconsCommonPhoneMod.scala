package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.phoneMod.PhoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonPhoneMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Phone", JSImport.Default)
  @js.native
  val default: SFC[PhoneProps] = js.native
  
  type _To = SFC[PhoneProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonPhoneMod.foo` */
  override def _to: SFC[PhoneProps] = default
}
