package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextAlignRightMod.TextAlignRightProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextAlignRight", JSImport.Default)
  @js.native
  val default: FC[TextAlignRightProps] = js.native
  
  type _To = FC[TextAlignRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignRightMod.foo` */
  override def _to: FC[TextAlignRightProps] = default
}
