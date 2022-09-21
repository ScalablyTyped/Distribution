package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextColorMod.TextColorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textColorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextColor", JSImport.Default)
  @js.native
  val default: FC[TextColorProps] = js.native
  
  type _To = FC[TextColorProps]
  
  /* This means you don't have to write `default`, but can instead just say `textColorMod.foo` */
  override def _to: FC[TextColorProps] = default
}
