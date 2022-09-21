package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWixStoresMod.WixStoresProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixStoresMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WixStores", JSImport.Default)
  @js.native
  val default: FC[WixStoresProps] = js.native
  
  type _To = FC[WixStoresProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixStoresMod.foo` */
  override def _to: FC[WixStoresProps] = default
}
