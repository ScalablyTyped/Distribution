package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsPrivateDriversMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/private-drivers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/private-drivers", "INTERNAL_DRIVER_SYMBOL")
  @js.native
  val INTERNAL_DRIVER_SYMBOL: js.Symbol = js.native
  
  inline def flattenInternalDriver(driver: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenInternalDriver")(driver.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mergeDrivers(target: Any, source: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDrivers")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
}
