package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.loyaltyMod.LoyaltyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonLoyaltyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Loyalty", JSImport.Default)
  @js.native
  val default: FC[LoyaltyProps] = js.native
  
  type _To = FC[LoyaltyProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonLoyaltyMod.foo` */
  override def _to: FC[LoyaltyProps] = default
}
