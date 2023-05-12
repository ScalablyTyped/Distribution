package typings.wordpressData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesRegistryMod {
  
  @JSImport("@wordpress/data/build-types/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRegistry(): WPDataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")().asInstanceOf[WPDataRegistry]
  inline def createRegistry(storeConfigs: js.Object): WPDataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any]).asInstanceOf[WPDataRegistry]
  inline def createRegistry(storeConfigs: js.Object, parent: js.Object): WPDataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[WPDataRegistry]
  inline def createRegistry(storeConfigs: Unit, parent: js.Object): WPDataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[WPDataRegistry]
  
  type StoreDescriptor = typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any]
  
  trait WPDataPlugin extends StObject {
    
    /**
      * registers store.
      */
    var registerStore: js.Function
  }
  object WPDataPlugin {
    
    inline def apply(registerStore: js.Function): WPDataPlugin = {
      val __obj = js.Dynamic.literal(registerStore = registerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[WPDataPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WPDataPlugin] (val x: Self) extends AnyVal {
      
      inline def setRegisterStore(value: js.Function): Self = StObject.set(x, "registerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait WPDataRegistry extends StObject {
    
    /**
      * Given a namespace key, returns an
      * object of the store's registered
      * action dispatchers.
      */
    var dispatch: js.Function
    
    /**
      * Given a namespace key and settings
      * object, registers a new generic
      * store.
      */
    var registerGenericStore: js.Function
    
    /**
      * Given a namespace key and settings
      * object, registers a new namespace
      * store.
      */
    var registerStore: js.Function
    
    /**
      * Given a namespace key, returns an
      * object of the  store's registered
      * selectors.
      */
    var select: js.Function
    
    /**
      * Given a function callback, invokes
      * the callback on any change to state
      * within any registered store.
      */
    var subscribe: js.Function
  }
  object WPDataRegistry {
    
    inline def apply(
      dispatch: js.Function,
      registerGenericStore: js.Function,
      registerStore: js.Function,
      select: js.Function,
      subscribe: js.Function
    ): WPDataRegistry = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], registerGenericStore = registerGenericStore.asInstanceOf[js.Any], registerStore = registerStore.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[WPDataRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WPDataRegistry] (val x: Self) extends AnyVal {
      
      inline def setDispatch(value: js.Function): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setRegisterGenericStore(value: js.Function): Self = StObject.set(x, "registerGenericStore", value.asInstanceOf[js.Any])
      
      inline def setRegisterStore(value: js.Function): Self = StObject.set(x, "registerStore", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: js.Function): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
}
