package typings.wixUiTestUtils

import typings.react.mod.ReactElement
import typings.std.Element
import typings.wixUiTestUtils.anon.TypeofSimulate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDriverFactoryCreateDriverFactoryMod {
  
  @JSImport("wix-ui-test-utils/dist/src/driver-factory/createDriverFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDriverFactory[TDriver /* <: BaseDriver */](driverFactory: DriverFactory[TDriver]): js.Function1[/* Component */ ReactElement, TDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDriverFactory")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ReactElement, TDriver]]
  
  trait BaseDriver extends StObject {
    
    def exists(): Boolean
  }
  object BaseDriver {
    
    inline def apply(exists: () => Boolean): BaseDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[BaseDriver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseDriver] (val x: Self) extends AnyVal {
      
      inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    }
  }
  
  trait ComponentFactory extends StObject {
    
    var component: js.UndefOr[ReactElement] = js.undefined
    
    var element: js.UndefOr[Element] = js.undefined
    
    var eventTrigger: TypeofSimulate
    
    var wrapper: Any
  }
  object ComponentFactory {
    
    inline def apply(eventTrigger: TypeofSimulate, wrapper: Any): ComponentFactory = {
      val __obj = js.Dynamic.literal(eventTrigger = eventTrigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentFactory] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEventTrigger(value: TypeofSimulate): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  type DriverFactory[TDriver /* <: BaseDriver */] = js.Function1[/* compFactory */ ComponentFactory, TDriver]
}
