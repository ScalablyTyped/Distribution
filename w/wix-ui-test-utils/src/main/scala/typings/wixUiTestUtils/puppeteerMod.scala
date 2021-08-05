package typings.wixUiTestUtils

import typings.puppeteer.mod.ElementHandle
import typings.puppeteer.mod.Page
import typings.std.Element
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.anon.DataHookPage
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.puppeteerPuppeteerMod.DriverFactoryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerMod {
  
  @JSImport("wix-ui-test-utils/dist/src/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def puppeteerTestkitFactoryCreator[T](
    driverFactory: js.Function3[
      /* e */ ElementHandle[Element] | Null, 
      /* page */ Page, 
      /* options */ DriverFactoryOptions, 
      T
    ]
  ): js.Function1[/* obj */ typings.wixUiTestUtils.anon.Page, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("puppeteerTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ typings.wixUiTestUtils.anon.Page, js.Promise[T]]]
  
  inline def puppeteerUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[
      /* base */ UniDriver[js.Any], 
      /* body */ UniDriver[js.Any], 
      /* options */ DriverFactoryOptions, 
      T
    ]
  ): js.Function1[/* obj */ DataHookPage, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("puppeteerUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ DataHookPage, js.Promise[T]]]
}
