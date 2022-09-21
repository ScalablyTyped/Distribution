package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsArrowUpDownMod.ArrowUpDownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowUpDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ArrowUpDown", JSImport.Default)
  @js.native
  val default: FC[ArrowUpDownProps] = js.native
  
  type _To = FC[ArrowUpDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowUpDownMod.foo` */
  override def _to: FC[ArrowUpDownProps] = default
}
