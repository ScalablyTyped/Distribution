package typings.wixWixUiTestUtils

import typings.react.mod.ReactElement
import typings.wixWixUiTestUtils.distTypesBaseDriverMod.BaseUniDriver
import typings.wixWixUiTestUtils.distTypesUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUniDriverFactoryMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/uni-driver-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUniDriverFactory[TDriver /* <: BaseUniDriver */](driverFactory: UniDriverFactory[TDriver]): js.Function1[/* Component */ ReactElement, TDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUniDriverFactory")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ReactElement, TDriver]]
}
