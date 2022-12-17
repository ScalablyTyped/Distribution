package typings.wordpressData

import typings.redux.mod.AnyAction
import typings.wordpressData.mod.DataRegistry
import typings.wordpressData.mod.DispatcherMap
import typings.wordpressData.mod.GenericStoreConfig
import typings.wordpressData.mod.SelectorMap
import typings.wordpressData.mod.Store
import typings.wordpressData.mod.StoreConfig
import typings.wordpressData.mod.StoreDescriptor
import typings.wordpressData.mod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = js.native
  }
  
  /* Inlined std.Partial<@wordpress/data.@wordpress/data.DataRegistry> */
  trait PartialDataRegistry extends StObject {
    
    var dispatch: js.UndefOr[
        js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, DispatcherMap]
      ] = js.undefined
    
    var registerGenericStore: js.UndefOr[js.Function2[/* name */ String, /* config */ GenericStoreConfig, Unit]] = js.undefined
    
    var registerStore: js.UndefOr[FnCall] = js.undefined
    
    var select: js.UndefOr[js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, SelectorMap]] = js.undefined
    
    var subscribe: js.UndefOr[Subscriber] = js.undefined
  }
  object PartialDataRegistry {
    
    inline def apply(): PartialDataRegistry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDataRegistry]
    }
    
    extension [Self <: PartialDataRegistry](x: Self) {
      
      inline def setDispatch(value: /* storeNameOrDescriptor */ String | StoreDescriptor => DispatcherMap): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setRegisterGenericStore(value: (/* name */ String, /* config */ GenericStoreConfig) => Unit): Self = StObject.set(x, "registerGenericStore", js.Any.fromFunction2(value))
      
      inline def setRegisterGenericStoreUndefined: Self = StObject.set(x, "registerGenericStore", js.undefined)
      
      inline def setRegisterStore(value: FnCall): Self = StObject.set(x, "registerStore", value.asInstanceOf[js.Any])
      
      inline def setRegisterStoreUndefined: Self = StObject.set(x, "registerStore", js.undefined)
      
      inline def setSelect(value: /* storeNameOrDescriptor */ String | StoreDescriptor => SelectorMap): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  /* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> & std.Partial<std.Storage> */
  trait PickStoragegetItemsetItem extends StObject {
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getItem: js.Function1[/* key */ String, String | Null]
    
    var key: js.UndefOr[js.Function1[/* index */ Double, String | Null]] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var removeItem: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var setItem: js.Function2[/* key */ String, /* value */ String, Unit]
  }
  object PickStoragegetItemsetItem {
    
    inline def apply(
      getItem: /* key */ String => String | Null,
      setItem: (/* key */ String, /* value */ String) => Unit
    ): PickStoragegetItemsetItem = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[PickStoragegetItemsetItem]
    }
    
    extension [Self <: PickStoragegetItemsetItem](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setGetItem(value: /* key */ String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setKey(value: /* index */ Double => String | Null): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setRemoveItem(value: /* key */ String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItemUndefined: Self = StObject.set(x, "removeItem", js.undefined)
      
      inline def setSetItem(value: (/* key */ String, /* value */ String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  trait Registry extends StObject {
    
    var registry: DataRegistry
  }
  object Registry {
    
    inline def apply(registry: DataRegistry): Registry = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Registry]
    }
    
    extension [Self <: Registry](x: Self) {
      
      inline def setRegistry(value: DataRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    }
  }
  
  trait Select extends StObject {
    
    var select: js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, SelectorMap]
  }
  object Select {
    
    inline def apply(select: /* storeNameOrDescriptor */ String | StoreDescriptor => SelectorMap): Select = {
      val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[Select]
    }
    
    extension [Self <: Select](x: Self) {
      
      inline def setSelect(value: /* storeNameOrDescriptor */ String | StoreDescriptor => SelectorMap): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    }
  }
  
  trait Storage extends StObject {
    
    var storage: js.UndefOr[PickStoragegetItemsetItem] = js.undefined
    
    var storageKey: js.UndefOr[String] = js.undefined
  }
  object Storage {
    
    inline def apply(): Storage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Storage]
    }
    
    extension [Self <: Storage](x: Self) {
      
      inline def setStorage(value: PickStoragegetItemsetItem): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
}
