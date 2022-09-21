package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWixMarketplaceMod.WixMarketplaceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixMarketplaceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WixMarketplace", JSImport.Default)
  @js.native
  val default: FC[WixMarketplaceProps] = js.native
  
  type _To = FC[WixMarketplaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixMarketplaceMod.foo` */
  override def _to: FC[WixMarketplaceProps] = default
}
