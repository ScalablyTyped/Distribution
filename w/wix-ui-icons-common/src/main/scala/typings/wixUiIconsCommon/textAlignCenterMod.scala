package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextAlignCenterMod.TextAlignCenterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextAlignCenter", JSImport.Default)
  @js.native
  val default: FC[TextAlignCenterProps] = js.native
  
  type _To = FC[TextAlignCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignCenterMod.foo` */
  override def _to: FC[TextAlignCenterProps] = default
}
