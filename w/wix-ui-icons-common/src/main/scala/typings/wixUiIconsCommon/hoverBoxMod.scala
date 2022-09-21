package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHoverBoxMod.HoverBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverBoxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HoverBox", JSImport.Default)
  @js.native
  val default: FC[HoverBoxProps] = js.native
  
  type _To = FC[HoverBoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `hoverBoxMod.foo` */
  override def _to: FC[HoverBoxProps] = default
}
