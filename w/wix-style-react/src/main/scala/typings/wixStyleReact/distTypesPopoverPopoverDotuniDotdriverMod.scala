package typings.wixStyleReact

import typings.std.ReturnType
import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.anon.GetArrowOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPopoverDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Popover/Popover.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def popoverUniDriverFactory(base: UniDriver[Any], body: UniDriver[Any]): GetArrowOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("popoverUniDriverFactory")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[GetArrowOffset]
  
  type PopoverUniDriver = ReturnType[
    js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], GetArrowOffset]
  ]
}
