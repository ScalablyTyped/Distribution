package typings.wixUiCore

import typings.react.mod.ReactElement
import typings.wixUiCore.anon.DataHook_
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.enzymeEnzymeMod.WrapperData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTestkitTestsMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/common/testkitTests", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runTestkitExistsSuite[T /* <: BaseDriver */](params: TestkitSuiteParams[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runTestkitExistsSuite")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait TestkitSuiteParams[T /* <: BaseDriver */] extends StObject {
    
    var Element: ReactElement
    
    def enzymeTestkitFactory(obj: WrapperData): T
    
    def testkitFactory(obj: DataHook_): T
  }
  object TestkitSuiteParams {
    
    inline def apply[T /* <: BaseDriver */](Element: ReactElement, enzymeTestkitFactory: WrapperData => T, testkitFactory: DataHook_ => T): TestkitSuiteParams[T] = {
      val __obj = js.Dynamic.literal(Element = Element.asInstanceOf[js.Any], enzymeTestkitFactory = js.Any.fromFunction1(enzymeTestkitFactory), testkitFactory = js.Any.fromFunction1(testkitFactory))
      __obj.asInstanceOf[TestkitSuiteParams[T]]
    }
    
    extension [Self <: TestkitSuiteParams[?], T /* <: BaseDriver */](x: Self & TestkitSuiteParams[T]) {
      
      inline def setElement(value: ReactElement): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
      
      inline def setEnzymeTestkitFactory(value: WrapperData => T): Self = StObject.set(x, "enzymeTestkitFactory", js.Any.fromFunction1(value))
      
      inline def setTestkitFactory(value: DataHook_ => T): Self = StObject.set(x, "testkitFactory", js.Any.fromFunction1(value))
    }
  }
}
