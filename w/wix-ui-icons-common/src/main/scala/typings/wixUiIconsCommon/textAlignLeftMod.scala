package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextAlignLeftMod.TextAlignLeftProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextAlignLeft", JSImport.Default)
  @js.native
  val default: FC[TextAlignLeftProps] = js.native
  
  type _To = FC[TextAlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignLeftMod.foo` */
  override def _to: FC[TextAlignLeftProps] = default
}
