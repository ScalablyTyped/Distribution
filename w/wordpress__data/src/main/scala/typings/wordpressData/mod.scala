package typings.wordpressData

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Provider
import typings.redux.mod.Action
import typings.redux.mod.ActionFromReducersMapObject
import typings.redux.mod.AnyAction
import typings.redux.mod.CombinedState
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.redux.mod.StateFromReducersMapObject
import typings.std.Generator
import typings.std.Record
import typings.wordpressData.anon.FnCall
import typings.wordpressData.anon.PartialDataRegistry
import typings.wordpressData.anon.Registry
import typings.wordpressData.anon.Select
import typings.wordpressData.anon.Storage
import typings.wordpressData.wordpressDataBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/data", "RegistryConsumer")
  @js.native
  val RegistryConsumer: Consumer[DataRegistry] = js.native
  
  @JSImport("@wordpress/data", "RegistryProvider")
  @js.native
  val RegistryProvider: Provider[DataRegistry] = js.native
  
  @JSImport("@wordpress/data", "combineReducers")
  @js.native
  def combineReducers[M /* <: ReducersMapObject[_, _] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
  @JSImport("@wordpress/data", "combineReducers")
  @js.native
  def combineReducers[S](reducers: ReducersMapObject[S, _]): Reducer[CombinedState[S], AnyAction] = js.native
  @JSImport("@wordpress/data", "combineReducers")
  @js.native
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[CombinedState[S], A] = js.native
  
  @JSImport("@wordpress/data", "createRegistry")
  @js.native
  def createRegistry(): DataRegistry = js.native
  @JSImport("@wordpress/data", "createRegistry")
  @js.native
  def createRegistry(storeConfigs: js.UndefOr[scala.Nothing], parent: DataRegistry): DataRegistry = js.native
  @JSImport("@wordpress/data", "createRegistry")
  @js.native
  def createRegistry(storeConfigs: js.Object): DataRegistry = js.native
  @JSImport("@wordpress/data", "createRegistry")
  @js.native
  def createRegistry(storeConfigs: js.Object, parent: DataRegistry): DataRegistry = js.native
  
  @JSImport("@wordpress/data", "createRegistryControl")
  @js.native
  def createRegistryControl[R /* <: DataRegistry */, T](registryControl: js.Function1[/* registry */ R, js.Function1[/* args */ StringDictionary[_], T]]): R = js.native
  
  @JSImport("@wordpress/data", "createRegistrySelector")
  @js.native
  def createRegistrySelector[S /* <: js.Function1[/* key */ String, SelectorMap] */, T](registrySelector: js.Function1[/* select */ S, js.Function2[/* state */ _, /* repeated */ _, T]]): S = js.native
  
  @JSImport("@wordpress/data", "dispatch")
  @js.native
  def dispatch(key: String): DispatcherMap = js.native
  
  object plugins {
    
    @JSImport("@wordpress/data", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/data", "plugins.persistence")
    @js.native
    def persistence: Plugin[Storage] = js.native
    @scala.inline
    def persistence_=(x: Plugin[Storage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("persistence")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/data", "registerGenericStore")
  @js.native
  def registerGenericStore(key: String, config: GenericStoreConfig): Unit = js.native
  
  @JSImport("@wordpress/data", "registerStore")
  @js.native
  def registerStore[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = js.native
  
  @JSImport("@wordpress/data", "select")
  @js.native
  def select(key: String): SelectorMap = js.native
  
  @JSImport("@wordpress/data", "subscribe")
  @js.native
  val subscribe: Subscriber = js.native
  
  @JSImport("@wordpress/data", "use")
  @js.native
  def use[T](plugin: Plugin[T], options: T): DataRegistry = js.native
  
  @JSImport("@wordpress/data", "useDispatch")
  @js.native
  val useDispatch: (js.Function1[/* key */ String, DispatcherMap]) with (js.Function0[js.Function1[/* key */ String, DispatcherMap]]) = js.native
  
  @JSImport("@wordpress/data", "useRegistry")
  @js.native
  def useRegistry(): DataRegistry = js.native
  
  @JSImport("@wordpress/data", "useSelect")
  @js.native
  def useSelect[T](mapSelect: js.Function1[/* s */ js.Function1[/* key */ String, SelectorMap], T]): T = js.native
  @JSImport("@wordpress/data", "useSelect")
  @js.native
  def useSelect[T](mapSelect: js.Function1[/* s */ js.Function1[/* key */ String, SelectorMap], T], deps: js.Array[_]): T = js.native
  
  @JSImport("@wordpress/data", "withDispatch")
  @js.native
  def withDispatch[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* key */ String, DispatcherMap], 
      /* ownProps */ P with IP, 
      /* registry */ Select, 
      DP
    ]
  ): js.Function1[/* component */ ComponentType[P with IP with DP], ComponentType[P]] = js.native
  
  @JSImport("@wordpress/data", "withRegistry")
  @js.native
  def withRegistry[P](component: ComponentType[P]): ComponentType[P with Registry] = js.native
  
  @JSImport("@wordpress/data", "withSelect")
  @js.native
  def withSelect[SP, P, IP](
    mapSelectToProps: js.Function2[/* sel */ js.Function1[/* key */ String, SelectorMap], /* ownProps */ P with IP, SP]
  ): js.Function1[/* component */ ComponentType[P with IP with SP], ComponentType[P]] = js.native
  
  @js.native
  trait DataRegistry extends StObject {
    
    var dispatch: js.Function1[/* key */ String, DispatcherMap] = js.native
    
    var registerGenericStore: js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit] = js.native
    
    var registerStore: FnCall = js.native
    
    var select: js.Function1[/* key */ String, SelectorMap] = js.native
    
    var subscribe: Subscriber = js.native
  }
  object DataRegistry {
    
    @scala.inline
    def apply(
      dispatch: /* key */ String => DispatcherMap,
      registerGenericStore: (/* key */ String, /* config */ GenericStoreConfig) => Unit,
      registerStore: FnCall,
      select: /* key */ String => SelectorMap,
      subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
    ): DataRegistry = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), registerGenericStore = js.Any.fromFunction2(registerGenericStore), registerStore = registerStore.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[DataRegistry]
    }
    
    @scala.inline
    implicit class DataRegistryMutableBuilder[Self <: DataRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: /* key */ String => DispatcherMap): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterGenericStore(value: (/* key */ String, /* config */ GenericStoreConfig) => Unit): Self = StObject.set(x, "registerGenericStore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterStore(value: FnCall): Self = StObject.set(x, "registerStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelect(value: /* key */ String => SelectorMap): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type DispatcherMap = Record[String, js.Function1[/* repeated */ js.Any, Unit]]
  
  @js.native
  trait GenericStoreConfig extends StObject {
    
    def getActions(): DispatcherMap = js.native
    
    def getSelectors(): SelectorMap = js.native
    
    var subscribe: Subscriber = js.native
  }
  object GenericStoreConfig {
    
    @scala.inline
    def apply(
      getActions: () => DispatcherMap,
      getSelectors: () => SelectorMap,
      subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
    ): GenericStoreConfig = {
      val __obj = js.Dynamic.literal(getActions = js.Any.fromFunction0(getActions), getSelectors = js.Any.fromFunction0(getSelectors), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[GenericStoreConfig]
    }
    
    @scala.inline
    implicit class GenericStoreConfigMutableBuilder[Self <: GenericStoreConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetActions(value: () => DispatcherMap): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectors(value: () => SelectorMap): Self = StObject.set(x, "getSelectors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type Plugin[T /* <: Record[String, _] */] = js.Function2[/* registry */ DataRegistry, /* options */ T, PartialDataRegistry]
  
  type SelectorMap = Record[String, js.Function1[/* repeated */ js.Any, js.Any]]
  
  @js.native
  trait Store[S, A /* <: AnyAction */] extends StObject {
    
    def dispatch(action: A): A = js.native
    
    def getState(): S = js.native
    
    var subscribe: Subscriber = js.native
  }
  object Store {
    
    @scala.inline
    def apply[S, A /* <: AnyAction */](
      dispatch: A => A,
      getState: () => S,
      subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
    ): Store[S, A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Store[S, A]]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store[_, _], S, A /* <: AnyAction */] (val x: Self with (Store[S, A])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait StoreConfig[S] extends StObject {
    
    var actions: js.UndefOr[
        StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]]
      ] = js.native
    
    var controls: js.UndefOr[StringDictionary[js.Function1[/* action */ AnyAction, _]]] = js.native
    
    var initialState: js.UndefOr[S] = js.native
    
    /**
      * Use persist with the persistence plugin to persist state.
      *
      * The registry must use the `persistence` plugin.
      *
      * Set to `true` to persist all state, or pass an array of state keys to persist.
      *
      * @example
      *
      * import { plugins, registerStore, use } from '@wordpress/data';
      *
      * use( plugins.persistence, { storageKey: 'example' } );
      *
      * registerStore( 'my-plugin', {
      *   // …
      *   persist: [ 'state-key-to-persist' ],
      * } );
      */
    var persist: js.UndefOr[`true` | (js.Array[/* keyof S */ String])] = js.native
    
    var reducer: Reducer[S, AnyAction] = js.native
    
    var resolvers: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.native
    
    var selectors: js.UndefOr[StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]] = js.native
  }
  object StoreConfig {
    
    @scala.inline
    def apply[S](reducer: (/* state */ js.UndefOr[S], AnyAction) => S): StoreConfig[S] = {
      val __obj = js.Dynamic.literal(reducer = js.Any.fromFunction2(reducer))
      __obj.asInstanceOf[StoreConfig[S]]
    }
    
    @scala.inline
    implicit class StoreConfigMutableBuilder[Self <: StoreConfig[_], S] (val x: Self with StoreConfig[S]) extends AnyVal {
      
      @scala.inline
      def setActions(value: StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setControls(value: StringDictionary[js.Function1[/* action */ AnyAction, _]]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setInitialState(value: S): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setPersist(value: `true` | (js.Array[/* keyof S */ String])): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      @scala.inline
      def setPersistVarargs(value: (/* keyof S */ String)*): Self = StObject.set(x, "persist", js.Array(value :_*))
      
      @scala.inline
      def setReducer(value: (/* state */ js.UndefOr[S], AnyAction) => S): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolvers(value: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      @scala.inline
      def setSelectors(value: StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    }
  }
  
  type Subscriber = js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit]]
}
