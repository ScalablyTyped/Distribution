package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextAlignJustifyMod.TextAlignJustifyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignJustifyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextAlignJustify", JSImport.Default)
  @js.native
  val default: FC[TextAlignJustifyProps] = js.native
  
  type _To = FC[TextAlignJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignJustifyMod.foo` */
  override def _to: FC[TextAlignJustifyProps] = default
}
