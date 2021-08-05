package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.std.Element
import typings.unidriverCore.mod.UniDriver
import typings.unidriverJsdomReact.mod.ElementOrElementFinder
import typings.wixUiTestUtils.anon.DataHookPropName
import typings.wixUiTestUtils.anon.DataHookWrapper
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.vanillaVanillaMod.TestkitArgs
import typings.wixUiTestUtils.vanillaVanillaMod.TestkitOutputRegular
import typings.wixUiTestUtils.vanillaVanillaMod.TestkitOutputUni
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaMod {
  
  @JSImport("wix-ui-test-utils/dist/src/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTestkitExists[T /* <: BaseDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ DataHookWrapper, T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ DataHookWrapper, T],
    options: DataHookPropName
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ DataHookWrapper, T]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ DataHookWrapper, T],
    options: DataHookPropName
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def jsdomReactUniDriver(containerOrFn: ElementOrElementFinder): UniDriver[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsdomReactUniDriver")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriver[Element]]
  
  inline def reactUniDriver(containerOrFn: ElementOrElementFinder): UniDriver[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactUniDriver")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriver[Element]]
  
  inline def testkitFactoryCreator[T /* <: BaseDriver */](driverFactory: TestkitOutputRegular[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
  inline def uniTestkitFactoryCreator[T /* <: BaseUniDriver */](driverFactory: TestkitOutputUni[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
}
