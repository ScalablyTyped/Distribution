package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.panToolMod.PanToolProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonPanToolMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/PanTool", JSImport.Default)
  @js.native
  val default: FC[PanToolProps] = js.native
  
  type _To = FC[PanToolProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonPanToolMod.foo` */
  override def _to: FC[PanToolProps] = default
}
