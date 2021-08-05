package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiTestUtilsDriverFactoryMod {
  
  @JSImport("wix-ui-test-utils/driver-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDriverFactory[TDriver /* <: BaseDriver */](driverFactory: DriverFactory[TDriver]): js.Function1[/* Component */ ReactElement, TDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDriverFactory")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ReactElement, TDriver]]
}
