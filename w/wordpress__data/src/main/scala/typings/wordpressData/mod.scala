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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/data", "RegistryConsumer")
  @js.native
  val RegistryConsumer: Consumer[DataRegistry] = js.native
  
  @JSImport("@wordpress/data", "RegistryProvider")
  @js.native
  val RegistryProvider: Provider[DataRegistry] = js.native
  
  @scala.inline
  def combineReducers[M /* <: ReducersMapObject[js.Any, js.Any] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]]]
  @scala.inline
  def combineReducers[S](reducers: ReducersMapObject[S, js.Any]): Reducer[CombinedState[S], AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[S], AnyAction]]
  
  @scala.inline
  def combineReducers_SA_ActionAny[S, A /* <: Action[js.Any] */](reducers: ReducersMapObject[S, A]): Reducer[CombinedState[S], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[S], A]]
  
  @scala.inline
  def createRegistry(): DataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")().asInstanceOf[DataRegistry]
  @scala.inline
  def createRegistry(storeConfigs: js.Object): DataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any]).asInstanceOf[DataRegistry]
  @scala.inline
  def createRegistry(storeConfigs: js.Object, parent: DataRegistry): DataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[DataRegistry]
  @scala.inline
  def createRegistry(storeConfigs: Unit, parent: DataRegistry): DataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[DataRegistry]
  
  @scala.inline
  def createRegistryControl[R /* <: DataRegistry */, T](
    registryControl: js.Function1[/* registry */ R, js.Function1[/* args */ StringDictionary[js.Any], T]]
  ): R = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryControl")(registryControl.asInstanceOf[js.Any]).asInstanceOf[R]
  
  @scala.inline
  def createRegistrySelector[S /* <: js.Function1[/* key */ String, SelectorMap] */, T](
    registrySelector: js.Function1[/* select */ S, js.Function2[/* state */ js.Any, /* repeated */ js.Any, T]]
  ): S = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistrySelector")(registrySelector.asInstanceOf[js.Any]).asInstanceOf[S]
  
  @scala.inline
  def dispatch(key: String): DispatcherMap = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[DispatcherMap]
  
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
  
  @scala.inline
  def registerGenericStore(key: String, config: GenericStoreConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGenericStore")(key.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerStore[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStore")(key.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Store[T, AnyAction]]
  
  @scala.inline
  def select(key: String): SelectorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[SelectorMap]
  
  @JSImport("@wordpress/data", "subscribe")
  @js.native
  val subscribe: Subscriber = js.native
  
  @scala.inline
  def use[T](plugin: Plugin[T], options: T): DataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DataRegistry]
  
  @JSImport("@wordpress/data", "useDispatch")
  @js.native
  val useDispatch: (js.Function1[/* key */ String, DispatcherMap]) & (js.Function0[js.Function1[/* key */ String, DispatcherMap]]) = js.native
  
  @scala.inline
  def useRegistry(): DataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("useRegistry")().asInstanceOf[DataRegistry]
  
  @scala.inline
  def useSelect[T](mapSelect: js.Function1[/* s */ js.Function1[/* key */ String, SelectorMap], T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(mapSelect.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useSelect[T](
    mapSelect: js.Function1[/* s */ js.Function1[/* key */ String, SelectorMap], T],
    deps: js.Array[js.Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(mapSelect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def withDispatch[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* key */ String, DispatcherMap], 
      /* ownProps */ P & IP, 
      /* registry */ Select, 
      DP
    ]
  ): js.Function1[/* component */ ComponentType[P & IP & DP], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDispatch")(mapDispatchToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P & IP & DP], ComponentType[P]]]
  
  @scala.inline
  def withRegistry[P](component: ComponentType[P]): ComponentType[P & Registry] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRegistry")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P & Registry]]
  
  @scala.inline
  def withSelect[SP, P, IP](
    mapSelectToProps: js.Function2[/* sel */ js.Function1[/* key */ String, SelectorMap], /* ownProps */ P & IP, SP]
  ): js.Function1[/* component */ ComponentType[P & IP & SP], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSelect")(mapSelectToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P & IP & SP], ComponentType[P]]]
  
  trait DataRegistry extends StObject {
    
    var dispatch: js.Function1[/* key */ String, DispatcherMap]
    
    var registerGenericStore: js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]
    
    var registerStore: FnCall
    
    var select: js.Function1[/* key */ String, SelectorMap]
    
    var subscribe: Subscriber
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
  
  trait GenericStoreConfig extends StObject {
    
    def getActions(): DispatcherMap
    
    def getSelectors(): SelectorMap
    
    var subscribe: Subscriber
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
  
  type Plugin[T /* <: Record[String, js.Any] */] = js.Function2[/* registry */ DataRegistry, /* options */ T, PartialDataRegistry]
  
  type SelectorMap = Record[String, js.Function1[/* repeated */ js.Any, js.Any]]
  
  trait Store[S, A /* <: AnyAction */] extends StObject {
    
    def dispatch(action: A): A
    
    def getState(): S
    
    var subscribe: Subscriber
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
    implicit class StoreMutableBuilder[Self <: Store[?, ?], S, A /* <: AnyAction */] (val x: Self & (Store[S, A])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait StoreConfig[S] extends StObject {
    
    var actions: js.UndefOr[
        StringDictionary[
          js.Function1[/* repeated */ js.Any, AnyAction | (Generator[js.Any, js.Any, js.Any])]
        ]
      ] = js.undefined
    
    var controls: js.UndefOr[StringDictionary[js.Function1[/* action */ AnyAction, js.Any]]] = js.undefined
    
    var initialState: js.UndefOr[S] = js.undefined
    
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
    var persist: js.UndefOr[`true` | (js.Array[/* keyof S */ String])] = js.undefined
    
    var reducer: Reducer[S, AnyAction]
    
    var resolvers: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]] = js.undefined
    
    var selectors: js.UndefOr[StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, js.Any]]] = js.undefined
  }
  object StoreConfig {
    
    @scala.inline
    def apply[S](reducer: (/* state */ js.UndefOr[S], AnyAction) => S): StoreConfig[S] = {
      val __obj = js.Dynamic.literal(reducer = js.Any.fromFunction2(reducer))
      __obj.asInstanceOf[StoreConfig[S]]
    }
    
    @scala.inline
    implicit class StoreConfigMutableBuilder[Self <: StoreConfig[?], S] (val x: Self & StoreConfig[S]) extends AnyVal {
      
      @scala.inline
      def setActions(
        value: StringDictionary[
              js.Function1[/* repeated */ js.Any, AnyAction | (Generator[js.Any, js.Any, js.Any])]
            ]
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setControls(value: StringDictionary[js.Function1[/* action */ AnyAction, js.Any]]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
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
      def setResolvers(value: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      @scala.inline
      def setSelectors(value: StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    }
  }
  
  type Subscriber = js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit]]
}
