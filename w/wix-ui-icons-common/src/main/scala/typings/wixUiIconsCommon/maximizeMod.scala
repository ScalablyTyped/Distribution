package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMaximizeMod.MaximizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maximizeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Maximize", JSImport.Default)
  @js.native
  val default: FC[MaximizeProps] = js.native
  
  type _To = FC[MaximizeProps]
  
  /* This means you don't have to write `default`, but can instead just say `maximizeMod.foo` */
  override def _to: FC[MaximizeProps] = default
}
