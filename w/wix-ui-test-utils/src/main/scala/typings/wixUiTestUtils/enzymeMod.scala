package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.anon.DataHookString
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.enzymeEnzymeMod.EnzymeDriverFactory
import typings.wixUiTestUtils.enzymeEnzymeMod.MountFunctionType
import typings.wixUiTestUtils.enzymeEnzymeMod.Options
import typings.wixUiTestUtils.enzymeEnzymeMod.WrapperData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enzymeMod {
  
  @JSImport("wix-ui-test-utils/dist/src/enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def enzymeTestkitFactoryCreator[T /* <: BaseDriver */](driverFactory: EnzymeDriverFactory[T]): js.Function1[/* obj */ WrapperData, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enzymeTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ WrapperData, T]]
  
  @scala.inline
  def enzymeUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[
      /* base */ UniDriver[js.Any], 
      /* body */ UniDriver[js.Any], 
      /* data */ DataHookString, 
      T
    ]
  ): js.Function1[/* obj */ WrapperData, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enzymeUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ WrapperData, T]]
  
  @scala.inline
  def isEnzymeTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isEnzymeTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    options: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    hasWithoutDataHookDataHookPropName: Options
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], hasWithoutDataHookDataHookPropName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
