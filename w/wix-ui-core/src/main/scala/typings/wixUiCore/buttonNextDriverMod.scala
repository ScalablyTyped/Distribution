package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.buttonNextUniDriverMod.ButtonNextDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonNextDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/button-next/button-next.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonNextDriverFactory(base: UniDriver[js.Any]): ButtonNextDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonNextDriver]
}
