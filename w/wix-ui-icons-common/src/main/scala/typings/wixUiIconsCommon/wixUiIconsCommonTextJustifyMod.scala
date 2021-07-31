package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.textJustifyMod.TextJustifyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonTextJustifyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/TextJustify", JSImport.Default)
  @js.native
  val default: SFC[TextJustifyProps] = js.native
  
  type _To = SFC[TextJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonTextJustifyMod.foo` */
  override def _to: SFC[TextJustifyProps] = default
}
