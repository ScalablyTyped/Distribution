package typings.wixUiCore

import typings.wixUiCore.anon.ClassName
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownOptionDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/dropdown-option/DropdownOption.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dropdownOptionDriverFactory(hasElementEventTrigger: Element): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdownOptionDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[ClassName]
}
