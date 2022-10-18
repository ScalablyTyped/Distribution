package typings.wixUiTestUtils

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.anon.DataHookPage
import typings.wixUiTestUtils.anon.Page
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcPuppeteerPuppeteerMod.DriverFactoryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerMod {
  
  @JSImport("wix-ui-test-utils/puppeteer", JSImport.Namespace)
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
