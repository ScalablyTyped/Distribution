package typings.unstatedNext

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unstated-next", "createContainer")
  @js.native
  def createContainer[Value, State](useHook: js.Function1[/* initialState */ js.UndefOr[State], Value]): Container[Value, State] = js.native
  
  @JSImport("unstated-next", "useContainer")
  @js.native
  def useContainer[Value, State](container: Container[Value, State]): Value = js.native
  
  @js.native
  trait Container[Value, State] extends StObject {
    
    var Provider: ComponentType[ContainerProviderProps[State]] = js.native
    
    def useContainer(): Value = js.native
  }
  object Container {
    
    @scala.inline
    def apply[Value, State](Provider: ComponentType[ContainerProviderProps[State]], useContainer: () => Value): Container[Value, State] = {
      val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useContainer = js.Any.fromFunction0(useContainer))
      __obj.asInstanceOf[Container[Value, State]]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container[_, _], Value, State] (val x: Self with (Container[Value, State])) extends AnyVal {
      
      @scala.inline
      def setProvider(value: ComponentType[ContainerProviderProps[State]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseContainer(value: () => Value): Self = StObject.set(x, "useContainer", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ContainerProviderProps[State] extends StObject {
    
    var children: ReactNode = js.native
    
    var initialState: js.UndefOr[State] = js.native
  }
  object ContainerProviderProps {
    
    @scala.inline
    def apply[State](): ContainerProviderProps[State] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProviderProps[State]]
    }
    
    @scala.inline
    implicit class ContainerProviderPropsMutableBuilder[Self <: ContainerProviderProps[_], State] (val x: Self with ContainerProviderProps[State]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    }
  }
}
