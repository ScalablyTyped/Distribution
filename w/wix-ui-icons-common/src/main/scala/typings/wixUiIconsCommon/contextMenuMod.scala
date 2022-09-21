package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsContextMenuMod.ContextMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ContextMenu", JSImport.Default)
  @js.native
  val default: FC[ContextMenuProps] = js.native
  
  type _To = FC[ContextMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `contextMenuMod.foo` */
  override def _to: FC[ContextMenuProps] = default
}
