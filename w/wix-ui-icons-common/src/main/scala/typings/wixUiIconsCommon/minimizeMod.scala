package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMinimizeMod.MinimizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minimizeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Minimize", JSImport.Default)
  @js.native
  val default: FC[MinimizeProps] = js.native
  
  type _To = FC[MinimizeProps]
  
  /* This means you don't have to write `default`, but can instead just say `minimizeMod.foo` */
  override def _to: FC[MinimizeProps] = default
}
