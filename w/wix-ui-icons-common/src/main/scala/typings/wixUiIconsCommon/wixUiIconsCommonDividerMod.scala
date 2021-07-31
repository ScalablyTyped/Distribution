package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.dividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonDividerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Divider", JSImport.Default)
  @js.native
  val default: SFC[DividerProps] = js.native
  
  type _To = SFC[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonDividerMod.foo` */
  override def _to: SFC[DividerProps] = default
}
