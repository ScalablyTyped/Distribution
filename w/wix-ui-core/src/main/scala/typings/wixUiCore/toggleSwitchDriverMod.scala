package typings.wixUiCore

import typings.wixUiCore.anon.Element
import typings.wixUiCore.anon.GetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSwitchDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/toggle-switch/ToggleSwitch.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toggleSwitchDriverFactory(hasElementEventTrigger: Element): GetId = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSwitchDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetId]
}
