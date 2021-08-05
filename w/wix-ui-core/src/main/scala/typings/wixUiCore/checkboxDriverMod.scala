package typings.wixUiCore

import typings.wixUiCore.anon.Element
import typings.wixUiCore.anon.Exists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/checkbox/Checkbox.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkboxDriverFactory(hasElementEventTrigger: Element): Exists = ^.asInstanceOf[js.Dynamic].applyDynamic("checkboxDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Exists]
}
