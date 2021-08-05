package typings.wixUiCore

import typings.wixUiCore.anon.Element
import typings.wixUiCore.anon.Focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputDriverMod {
  
  @JSImport("wix-ui-core/src/components/input/Input.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inputDriverFactory(hasElementEventTrigger: Element): Focus = ^.asInstanceOf[js.Dynamic].applyDynamic("inputDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[Focus]
}
