package typings.wixUiCore

import typings.wixUiCore.anon.ClickOnContent
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverDotPrivateDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/Popover.private.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def popoverPrivateDriverFactory(hasElementEventTrigger: Element): ClickOnContent = ^.asInstanceOf[js.Dynamic].applyDynamic("popoverPrivateDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[ClickOnContent]
}
