package typings.wixWixUiTestUtils

import typings.react.mod.ReactElement
import typings.wixWixUiTestUtils.distTypesDriverFactoryCreateDriverFactoryMod.BaseDriver
import typings.wixWixUiTestUtils.distTypesDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDriverFactoryMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/driver-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDriverFactory[TDriver /* <: BaseDriver */](driverFactory: DriverFactory[TDriver]): js.Function1[/* Component */ ReactElement, TDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDriverFactory")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ReactElement, TDriver]]
}
