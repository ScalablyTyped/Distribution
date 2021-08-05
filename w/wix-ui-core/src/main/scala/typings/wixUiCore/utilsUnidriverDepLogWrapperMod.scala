package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUnidriverDepLogWrapperMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/utils/unidriver-dep-log-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unidriverDepLogWrapper[T](originalDriverFactory: js.Function1[/* base */ UniDriver[js.Any], T], driverFactoryName: String): js.Function1[/* base */ UniDriver[js.Any], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unidriverDepLogWrapper")(originalDriverFactory.asInstanceOf[js.Any], driverFactoryName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* base */ UniDriver[js.Any], T]]
}
