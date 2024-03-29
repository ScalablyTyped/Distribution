package typings.wixUiCore

import typings.wixUiCore.anon.Blur
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressInputDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInput.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addressInputDriverFactory(hasElementEventTrigger: Element): Blur = ^.asInstanceOf[js.Dynamic].applyDynamic("addressInputDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Blur]
}
