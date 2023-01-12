package typings.unstatedNext

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unstated-next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContainer[Value, State](useHook: js.Function1[/* initialState */ js.UndefOr[State], Value]): Container[Value, State] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")(useHook.asInstanceOf[js.Any]).asInstanceOf[Container[Value, State]]
  
  inline def useContainer[Value, State](container: Container[Value, State]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("useContainer")(container.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  trait Container[Value, State] extends StObject {
    
    var Provider: ComponentType[ContainerProviderProps[State]]
    
    def useContainer(): Value
  }
  object Container {
    
    inline def apply[Value, State](Provider: ComponentType[ContainerProviderProps[State]], useContainer: () => Value): Container[Value, State] = {
      val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useContainer = js.Any.fromFunction0(useContainer))
      __obj.asInstanceOf[Container[Value, State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container[?, ?], Value, State] (val x: Self & (Container[Value, State])) extends AnyVal {
      
      inline def setProvider(value: ComponentType[ContainerProviderProps[State]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      
      inline def setUseContainer(value: () => Value): Self = StObject.set(x, "useContainer", js.Any.fromFunction0(value))
    }
  }
  
  trait ContainerProviderProps[State] extends StObject {
    
    var children: ReactNode
    
    var initialState: js.UndefOr[State] = js.undefined
  }
  object ContainerProviderProps {
    
    inline def apply[State](): ContainerProviderProps[State] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProviderProps[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerProviderProps[?], State] (val x: Self & ContainerProviderProps[State]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    }
  }
}
