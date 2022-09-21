package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUngroupMod.UngroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ungroupMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Ungroup", JSImport.Default)
  @js.native
  val default: FC[UngroupProps] = js.native
  
  type _To = FC[UngroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `ungroupMod.foo` */
  override def _to: FC[UngroupProps] = default
}
