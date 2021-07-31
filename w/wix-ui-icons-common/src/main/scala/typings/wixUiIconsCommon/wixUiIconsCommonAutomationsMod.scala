package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.automationsMod.AutomationsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonAutomationsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Automations", JSImport.Default)
  @js.native
  val default: SFC[AutomationsProps] = js.native
  
  type _To = SFC[AutomationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonAutomationsMod.foo` */
  override def _to: SFC[AutomationsProps] = default
}
