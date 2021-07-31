package typings.wixUiCore

import typings.wixUiCore.anon.Click
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteAutocompleteDriverMod {
  
  @JSImport("wix-ui-core/src/components/autocomplete/Autocomplete.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def autocompleteDriverFactory(hasElementEventTrigger: Element): Click = ^.asInstanceOf[js.Dynamic].applyDynamic("autocompleteDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Click]
}
