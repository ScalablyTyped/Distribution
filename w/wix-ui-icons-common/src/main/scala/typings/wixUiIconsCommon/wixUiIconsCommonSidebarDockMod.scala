package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.sidebarDockMod.SidebarDockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSidebarDockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/SidebarDock", JSImport.Default)
  @js.native
  val default: FC[SidebarDockProps] = js.native
  
  type _To = FC[SidebarDockProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSidebarDockMod.foo` */
  override def _to: FC[SidebarDockProps] = default
}
