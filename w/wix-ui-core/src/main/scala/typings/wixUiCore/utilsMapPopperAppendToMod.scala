package typings.wixUiCore

import typings.std.Element
import typings.wixUiCore.componentsPopoverPopoverMod.AppendTo
import typings.wixUiCore.wixUiCoreStrings.scrollParent
import typings.wixUiCore.wixUiCoreStrings.viewport
import typings.wixUiCore.wixUiCoreStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMapPopperAppendToMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/utils/mapPopperAppendTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mapPopperAppendTo(appendTo: AppendTo): window | Element | scrollParent | viewport = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPopperAppendTo")(appendTo.asInstanceOf[js.Any]).asInstanceOf[window | Element | scrollParent | viewport]
}
