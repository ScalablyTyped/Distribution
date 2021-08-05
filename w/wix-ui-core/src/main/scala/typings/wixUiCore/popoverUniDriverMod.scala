package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.GetArrowOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverUniDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover/Popover.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testkit(base: UniDriver[js.Any], body: UniDriver[js.Any]): GetArrowOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("testkit")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[GetArrowOffset]
}
