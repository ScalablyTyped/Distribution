package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.helpMod.HelpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonHelpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Help", JSImport.Default)
  @js.native
  val default: SFC[HelpProps] = js.native
  
  type _To = SFC[HelpProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonHelpMod.foo` */
  override def _to: SFC[HelpProps] = default
}
