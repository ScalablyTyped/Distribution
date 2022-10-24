package typings.wixStyleReact

import typings.react.mod.ReactElement
import typings.wixUiTestUtils.anon.DataHookPropName
import typings.wixUiTestUtils.anon.Wrapper
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.distSrcEnzymeEnzymeMod.MountFunctionType
import typings.wixUiTestUtils.distSrcEnzymeEnzymeMod.Options
import typings.wixUiTestUtils.distSrcEnzymeEnzymeMod.WrapperData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsTestkitSanityMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/testkit-sanity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def isTestkitExists[T /* <: BaseDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ Wrapper, T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ Wrapper, T],
    options: DataHookPropName
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    param3: Options
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ Wrapper, T]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ Wrapper, T],
    options: DataHookPropName
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
