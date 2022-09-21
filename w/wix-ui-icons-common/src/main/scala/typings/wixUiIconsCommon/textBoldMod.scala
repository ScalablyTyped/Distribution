package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextBoldMod.TextBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextBold", JSImport.Default)
  @js.native
  val default: FC[TextBoldProps] = js.native
  
  type _To = FC[TextBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `textBoldMod.foo` */
  override def _to: FC[TextBoldProps] = default
}
