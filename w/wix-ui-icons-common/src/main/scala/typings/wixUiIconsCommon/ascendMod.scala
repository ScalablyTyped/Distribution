package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAscendMod.AscendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ascendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Ascend", JSImport.Default)
  @js.native
  val default: FC[AscendProps] = js.native
  
  type _To = FC[AscendProps]
  
  /* This means you don't have to write `default`, but can instead just say `ascendMod.foo` */
  override def _to: FC[AscendProps] = default
}
