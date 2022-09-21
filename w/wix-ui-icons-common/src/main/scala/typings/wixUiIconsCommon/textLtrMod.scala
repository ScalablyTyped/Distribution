package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextLtrMod.TextLtrProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textLtrMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextLtr", JSImport.Default)
  @js.native
  val default: FC[TextLtrProps] = js.native
  
  type _To = FC[TextLtrProps]
  
  /* This means you don't have to write `default`, but can instead just say `textLtrMod.foo` */
  override def _to: FC[TextLtrProps] = default
}
