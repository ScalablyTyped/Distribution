package typings.wixUiTestUtils

import typings.protractor.mod.ElementFinder
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.anon.DataHookString
import typings.wixUiTestUtils.anon.Wrapper
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protractorProtractorMod {
  
  @JSImport("wix-ui-test-utils/dist/src/protractor/protractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def protractorTestkitFactoryCreator[T](
    driverFactory: js.Function3[/* wrapper */ ElementFinder, /* body */ ElementFinder, /* options */ DataHookString, T]
  ): js.Function1[/* obj */ Wrapper, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Wrapper, T]]
  
  inline def protractorUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[
      /* base */ UniDriver[js.Any], 
      /* body */ UniDriver[js.Any], 
      /* options */ DataHookString, 
      T
    ]
  ): js.Function1[/* obj */ DataHookString, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ DataHookString, T]]
}
