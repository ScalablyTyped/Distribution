package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.anon.DataHookPropName
import typings.wixUiTestUtils.anon.DataHookString
import typings.wixUiTestUtils.anon.DataHookWrapper
import typings.wixUiTestUtils.anon.Element
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaVanillaMod {
  
  @JSImport("wix-ui-test-utils/dist/src/vanilla/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isTestkitExists[T /* <: BaseDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ DataHookWrapper, T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ DataHookWrapper, T],
    options: DataHookPropName
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isUniTestkitExists[T /* <: BaseUniDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ DataHookWrapper, T]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def isUniTestkitExists[T /* <: BaseUniDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ DataHookWrapper, T],
    options: DataHookPropName
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def testkitFactoryCreator[T /* <: BaseDriver */](driverFactory: TestkitOutputRegular[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
  @scala.inline
  def uniTestkitFactoryCreator[T /* <: BaseUniDriver */](driverFactory: TestkitOutputUni[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
  trait TestkitArgs extends StObject {
    
    var dataHook: String
    
    var wrapper: HTMLElement
  }
  object TestkitArgs {
    
    @scala.inline
    def apply(dataHook: String, wrapper: HTMLElement): TestkitArgs = {
      val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestkitArgs]
    }
    
    @scala.inline
    implicit class TestkitArgsMutableBuilder[Self <: TestkitArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  type TestkitOutputRegular[T /* <: BaseDriver */] = js.Function1[/* data */ Element, T]
  
  type TestkitOutputUni[T /* <: BaseUniDriver */] = js.Function3[
    /* base */ UniDriver[js.Any], 
    /* body */ UniDriver[js.Any], 
    /* options */ DataHookString, 
    T
  ]
}
