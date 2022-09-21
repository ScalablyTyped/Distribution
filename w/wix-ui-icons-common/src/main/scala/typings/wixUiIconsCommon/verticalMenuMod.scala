package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsVerticalMenuMod.VerticalMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalMenuMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/VerticalMenu", JSImport.Default)
  @js.native
  val default: FC[VerticalMenuProps] = js.native
  
  type _To = FC[VerticalMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalMenuMod.foo` */
  override def _to: FC[VerticalMenuProps] = default
}
