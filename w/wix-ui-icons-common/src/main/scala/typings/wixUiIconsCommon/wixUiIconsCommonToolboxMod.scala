package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.toolboxMod.ToolboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonToolboxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Toolbox", JSImport.Default)
  @js.native
  val default: FC[ToolboxProps] = js.native
  
  type _To = FC[ToolboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonToolboxMod.foo` */
  override def _to: FC[ToolboxProps] = default
}
