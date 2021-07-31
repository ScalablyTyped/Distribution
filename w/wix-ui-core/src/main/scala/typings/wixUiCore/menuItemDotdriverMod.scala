package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.menuItemDotUniDriverMod.MenuItemDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/menu-item/menu-item.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def menuItemDriverFactory(base: UniDriver[js.Any]): MenuItemDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("menuItemDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MenuItemDriver]
}
