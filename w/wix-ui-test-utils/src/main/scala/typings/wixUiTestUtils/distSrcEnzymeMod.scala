package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.anon.DataHookString
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.distSrcEnzymeEnzymeMod.EnzymeDriverFactory
import typings.wixUiTestUtils.distSrcEnzymeEnzymeMod.MountFunctionType
import typings.wixUiTestUtils.distSrcEnzymeEnzymeMod.Options
import typings.wixUiTestUtils.distSrcEnzymeEnzymeMod.WrapperData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnzymeMod {
  
  @JSImport("wix-ui-test-utils/dist/src/enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enzymeTestkitFactoryCreator[T /* <: BaseDriver */](driverFactory: EnzymeDriverFactory[T]): js.Function1[/* obj */ WrapperData, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enzymeTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ WrapperData, T]]
  
  inline def enzymeUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[/* base */ UniDriver[Any], /* body */ UniDriver[Any], /* data */ DataHookString, T]
  ): js.Function1[/* obj */ WrapperData, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enzymeUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ WrapperData, T]]
  
  inline def isEnzymeTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isEnzymeTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    options: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    hasWithoutDataHookDataHookPropName: Options
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], hasWithoutDataHookDataHookPropName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
