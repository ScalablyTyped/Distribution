package typings.wixStyleReact

import typings.std.ReturnType
import typings.wixStyleReact.anon.Element
import typings.wixStyleReact.anon.ElementEventTrigger
import typings.wixStyleReact.anon.GetArrowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPopoverDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Popover/Popover.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def popoverLegacyDriverFactory(param0: Element): GetArrowElement = ^.asInstanceOf[js.Dynamic].applyDynamic("popoverLegacyDriverFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[GetArrowElement]
  
  type PopoverDriver = ReturnType[js.Function1[/* param0 */ ElementEventTrigger, GetArrowElement]]
}
