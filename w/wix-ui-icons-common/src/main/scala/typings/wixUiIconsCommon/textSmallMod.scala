package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTextSmallMod.TextSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/TextSmall", JSImport.Default)
  @js.native
  val default: FC[TextSmallProps] = js.native
  
  type _To = FC[TextSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `textSmallMod.foo` */
  override def _to: FC[TextSmallProps] = default
}
