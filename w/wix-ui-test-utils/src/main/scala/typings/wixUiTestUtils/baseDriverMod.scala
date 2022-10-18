package typings.wixUiTestUtils

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDriverMod {
  
  @JSImport("wix-ui-test-utils/base-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseUniDriverFactory(base: UniDriver[Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
}
