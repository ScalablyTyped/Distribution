package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMinimizeAllMod.MinimizeAllProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minimizeAllMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/MinimizeAll", JSImport.Default)
  @js.native
  val default: FC[MinimizeAllProps] = js.native
  
  type _To = FC[MinimizeAllProps]
  
  /* This means you don't have to write `default`, but can instead just say `minimizeAllMod.foo` */
  override def _to: FC[MinimizeAllProps] = default
}
