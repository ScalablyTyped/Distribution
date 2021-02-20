package typings.wordpressData

import typings.redux.mod.AnyAction
import typings.wordpressData.mod.DataRegistry
import typings.wordpressData.mod.DispatcherMap
import typings.wordpressData.mod.GenericStoreConfig
import typings.wordpressData.mod.SelectorMap
import typings.wordpressData.mod.Store
import typings.wordpressData.mod.StoreConfig
import typings.wordpressData.mod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = js.native
  }
  
  /* Inlined std.Partial<@wordpress/data.@wordpress/data.DataRegistry> */
  @js.native
  trait PartialDataRegistry extends StObject {
    
    var dispatch: js.UndefOr[js.Function1[/* key */ String, DispatcherMap]] = js.native
    
    var registerGenericStore: js.UndefOr[js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]] = js.native
    
    var registerStore: js.UndefOr[FnCall] = js.native
    
    var select: js.UndefOr[js.Function1[/* key */ String, SelectorMap]] = js.native
    
    var subscribe: js.UndefOr[Subscriber] = js.native
  }
  object PartialDataRegistry {
    
    @scala.inline
    def apply(): PartialDataRegistry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDataRegistry]
    }
    
    @scala.inline
    implicit class PartialDataRegistryMutableBuilder[Self <: PartialDataRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: /* key */ String => DispatcherMap): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      @scala.inline
      def setRegisterGenericStore(value: (/* key */ String, /* config */ GenericStoreConfig) => Unit): Self = StObject.set(x, "registerGenericStore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterGenericStoreUndefined: Self = StObject.set(x, "registerGenericStore", js.undefined)
      
      @scala.inline
      def setRegisterStore(value: FnCall): Self = StObject.set(x, "registerStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterStoreUndefined: Self = StObject.set(x, "registerStore", js.undefined)
      
      @scala.inline
      def setSelect(value: /* key */ String => SelectorMap): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  /* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> & std.Partial<std.Storage> */
  @js.native
  trait PickStoragegetItemsetItem extends StObject {
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var getItem: (js.Function1[/* key */ String, String | Null]) with (js.UndefOr[js.Function1[/* key */ String, String | Null]]) = js.native
    
    var key: js.UndefOr[js.Function1[/* index */ Double, String | Null]] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var removeItem: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
    
    var setItem: (js.Function2[/* key */ String, /* value */ String, Unit]) with (js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]]) = js.native
  }
  object PickStoragegetItemsetItem {
    
    @scala.inline
    def apply(
      getItem: (js.Function1[/* key */ String, String | Null]) with (js.UndefOr[js.Function1[/* key */ String, String | Null]]),
      setItem: (js.Function2[/* key */ String, /* value */ String, Unit]) with (js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]])
    ): PickStoragegetItemsetItem = {
      val __obj = js.Dynamic.literal(getItem = getItem.asInstanceOf[js.Any], setItem = setItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickStoragegetItemsetItem]
    }
    
    @scala.inline
    implicit class PickStoragegetItemsetItemMutableBuilder[Self <: PickStoragegetItemsetItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setGetItem(
        value: (js.Function1[/* key */ String, String | Null]) with (js.UndefOr[js.Function1[/* key */ String, String | Null]])
      ): Self = StObject.set(x, "getItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: /* index */ Double => String | Null): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setRemoveItem(value: /* key */ String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveItemUndefined: Self = StObject.set(x, "removeItem", js.undefined)
      
      @scala.inline
      def setSetItem(
        value: (js.Function2[/* key */ String, /* value */ String, Unit]) with (js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]])
      ): Self = StObject.set(x, "setItem", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Registry extends StObject {
    
    var registry: DataRegistry = js.native
  }
  object Registry {
    
    @scala.inline
    def apply(registry: DataRegistry): Registry = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Registry]
    }
    
    @scala.inline
    implicit class RegistryMutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistry(value: DataRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Select extends StObject {
    
    var select: js.Function1[/* key */ String, SelectorMap] = js.native
  }
  object Select {
    
    @scala.inline
    def apply(select: /* key */ String => SelectorMap): Select = {
      val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[Select]
    }
    
    @scala.inline
    implicit class SelectMutableBuilder[Self <: Select] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelect(value: /* key */ String => SelectorMap): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Storage extends StObject {
    
    var storage: js.UndefOr[PickStoragegetItemsetItem] = js.native
    
    var storageKey: js.UndefOr[String] = js.native
  }
  object Storage {
    
    @scala.inline
    def apply(): Storage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Storage]
    }
    
    @scala.inline
    implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStorage(value: PickStoragegetItemsetItem): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
}
