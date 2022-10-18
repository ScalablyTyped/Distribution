package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUniDriverFactoryCreateUniDriverFactoryMod {
  
  @JSImport("wix-ui-test-utils/dist/src/uni-driver-factory/createUniDriverFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUniDriverFactory[TDriver /* <: BaseUniDriver */](driverFactory: UniDriverFactory[TDriver]): js.Function1[/* Component */ ReactElement, TDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUniDriverFactory")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ReactElement, TDriver]]
  
  type UniDriverFactory[TDriver /* <: BaseUniDriver */] = js.Function2[/* base */ UniDriver[Any], /* body */ js.UndefOr[UniDriver[Any]], TDriver]
}
