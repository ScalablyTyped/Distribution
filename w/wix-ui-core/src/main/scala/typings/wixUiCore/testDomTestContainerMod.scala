package typings.wixUiCore

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.TypeofSimulate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testDomTestContainerMod {
  
  @JSImport("wix-ui-core/dist/test/dom-test-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/test/dom-test-container", "ReactDOMTestContainer")
  @js.native
  class ReactDOMTestContainer () extends StObject {
    
    def componentNode: HTMLElement | Null = js.native
    
    def create(): this.type = js.native
    
    def createLegacyRenderer[T](driverFactory: js.Function1[/* args */ LegacyDriverArgs, T]): js.Function1[/* element */ Element, T] = js.native
    
    /**
      * Adapter for react based uni driver
      * @deprecated use createUniRendererAsync instead
      */
    def createUniRenderer[T](
      driverFactory: js.Function2[/* base */ UniDriver[js.Any], /* body */ js.UndefOr[UniDriver[js.Any]], T]
    ): js.Function1[/* element */ Element, T] = js.native
    
    def createUniRendererAsync[T](
      driverFactory: js.Function2[/* base */ UniDriver[js.Any], /* body */ js.UndefOr[UniDriver[js.Any]], T]
    ): js.Function1[/* element */ Element, js.Promise[T]] = js.native
    
    def destroy(): this.type = js.native
    
    def destroyAfterEachTest(): this.type = js.native
    
    var node: HTMLElement = js.native
    
    def render[P](jsx: ReactElement): js.Promise[Unit] = js.native
    
    def renderSync[P](jsx: ReactElement): Unit | typings.std.Element | (Component[P, js.Any, js.Any]) = js.native
    
    def renderWithRef(jsx: Element): js.Promise[js.Any] = js.native
    
    def unmount(): this.type = js.native
    
    def unmountAfterEachTest(): this.type = js.native
  }
  
  inline def createDOMContainer(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createDOMContainer")().asInstanceOf[HTMLElement]
  
  trait LegacyDriverArgs extends StObject {
    
    var component: js.UndefOr[Element] = js.undefined
    
    var element: typings.std.Element | Null
    
    var eventTrigger: TypeofSimulate
    
    var wrapper: HTMLElement
  }
  object LegacyDriverArgs {
    
    inline def apply(eventTrigger: TypeofSimulate, wrapper: HTMLElement): LegacyDriverArgs = {
      val __obj = js.Dynamic.literal(eventTrigger = eventTrigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[LegacyDriverArgs]
    }
    
    extension [Self <: LegacyDriverArgs](x: Self) {
      
      inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setEventTrigger(value: TypeofSimulate): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
