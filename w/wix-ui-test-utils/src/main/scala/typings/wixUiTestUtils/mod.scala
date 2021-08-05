package typings.wixUiTestUtils

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wix-ui-test-utils/base-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseUniDriverFactory(base: UniDriver[js.Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
}
