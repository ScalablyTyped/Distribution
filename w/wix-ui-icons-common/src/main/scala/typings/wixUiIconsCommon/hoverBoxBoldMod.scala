package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHoverBoxBoldMod.HoverBoxBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverBoxBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HoverBoxBold", JSImport.Default)
  @js.native
  val default: FC[HoverBoxBoldProps] = js.native
  
  type _To = FC[HoverBoxBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `hoverBoxBoldMod.foo` */
  override def _to: FC[HoverBoxBoldProps] = default
}
