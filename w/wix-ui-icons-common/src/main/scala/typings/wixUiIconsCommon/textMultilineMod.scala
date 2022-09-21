package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextMultilineMod.TextMultilineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMultilineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextMultiline", JSImport.Default)
  @js.native
  val default: FC[TextMultilineProps] = js.native
  
  type _To = FC[TextMultilineProps]
  
  /* This means you don't have to write `default`, but can instead just say `textMultilineMod.foo` */
  override def _to: FC[TextMultilineProps] = default
}
