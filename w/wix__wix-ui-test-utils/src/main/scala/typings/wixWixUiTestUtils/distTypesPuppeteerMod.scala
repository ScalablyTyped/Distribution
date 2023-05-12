package typings.wixWixUiTestUtils

import typings.unidriverCore.mod.UniDriver
import typings.wixWixUiTestUtils.anon.DataHookPage
import typings.wixWixUiTestUtils.anon.Page
import typings.wixWixUiTestUtils.distTypesBaseDriverMod.BaseUniDriver
import typings.wixWixUiTestUtils.distTypesPuppeteerPuppeteerMod.DriverFactoryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPuppeteerMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def puppeteerTestkitFactoryCreator[T](driverFactory: js.Function3[/* e */ Any, /* page */ Any, /* options */ DriverFactoryOptions, T]): js.Function1[/* obj */ Page, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("puppeteerTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Page, js.Promise[T]]]
  
  inline def puppeteerUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[
      /* base */ UniDriver[Any], 
      /* body */ UniDriver[Any], 
      /* options */ DriverFactoryOptions, 
      T
    ]
  ): js.Function1[/* obj */ DataHookPage, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("puppeteerUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ DataHookPage, js.Promise[T]]]
}
