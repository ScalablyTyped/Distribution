package typings.wixUiCore

import typings.wixUiCore.anon.Element
import typings.wixUiCore.anon.GetOptionsCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownContentDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/dropdown-content/DropdownContent.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dropdownContentDriverFactory(hasElementEventTrigger: Element): GetOptionsCount = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdownContentDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetOptionsCount]
}
