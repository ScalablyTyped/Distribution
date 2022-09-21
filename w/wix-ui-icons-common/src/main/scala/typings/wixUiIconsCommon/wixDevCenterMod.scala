package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWixDevCenterMod.WixDevCenterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixDevCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WixDevCenter", JSImport.Default)
  @js.native
  val default: FC[WixDevCenterProps] = js.native
  
  type _To = FC[WixDevCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixDevCenterMod.foo` */
  override def _to: FC[WixDevCenterProps] = default
}
