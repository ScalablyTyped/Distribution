package typings.wixUiCore

import typings.wixUiCore.anon.Element
import typings.wixUiCore.anon.GetArrowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover/Popover.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def popoverDriverFactory(hasElementEventTrigger: Element): GetArrowElement = ^.asInstanceOf[js.Dynamic].applyDynamic("popoverDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetArrowElement]
}
