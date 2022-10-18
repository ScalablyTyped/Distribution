package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.std.Element
import typings.unidriverCore.mod.DriverContext
import typings.unidriverCore.mod.UniDriver
import typings.unidriverJsdomReact.mod.ElementOrElementFinder
import typings.wixUiTestUtils.anon.DataHookPropName
import typings.wixUiTestUtils.anon.Wrapper
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.distSrcVanillaVanillaMod.TestkitArgs
import typings.wixUiTestUtils.distSrcVanillaVanillaMod.TestkitOutputRegular
import typings.wixUiTestUtils.distSrcVanillaVanillaMod.TestkitOutputUni
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaMod {
  
  @JSImport("wix-ui-test-utils/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTestkitExists[T /* <: BaseDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ Wrapper, T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ Wrapper, T],
    options: DataHookPropName
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ Wrapper, T]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ Wrapper, T],
    options: DataHookPropName
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def jsdomReactUniDriver(containerOrFn: ElementOrElementFinder): UniDriver[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsdomReactUniDriver")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriver[Element]]
  inline def jsdomReactUniDriver(containerOrFn: ElementOrElementFinder, context: DriverContext): UniDriver[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsdomReactUniDriver")(containerOrFn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriver[Element]]
  
  inline def reactUniDriver(containerOrFn: ElementOrElementFinder): UniDriver[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactUniDriver")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriver[Element]]
  inline def reactUniDriver(containerOrFn: ElementOrElementFinder, context: DriverContext): UniDriver[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("reactUniDriver")(containerOrFn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriver[Element]]
  
  inline def testkitFactoryCreator[T /* <: BaseDriver */](driverFactory: TestkitOutputRegular[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
  inline def uniTestkitFactoryCreator[T /* <: BaseUniDriver */](driverFactory: TestkitOutputUni[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
}
