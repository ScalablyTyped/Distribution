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
  
  inline def combineReducers[M /* <: ReducersMapObject[Any, Any] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]]]
  inline def combineReducers[S](reducers: ReducersMapObject[S, Any]): Reducer[CombinedState[S], AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[S], AnyAction]]
  
  inline def combineReducers_SA[S, A /* <: Action[Any] */](reducers: ReducersMapObject[S, A]): Reducer[CombinedState[S], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[S], A]]
  
  inline def createReduxStore[T](key: String, options: StoreConfig[T]): StoreDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createReduxStore")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoreDescriptor]
  
  inline def createRegistry(): DataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")().asInstanceOf[DataRegistry]
  inline def createRegistry(storeConfigs: js.Object): DataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any]).asInstanceOf[DataRegistry]
  inline def createRegistry(storeConfigs: js.Object, parent: DataRegistry): DataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[DataRegistry]
  inline def createRegistry(storeConfigs: Unit, parent: DataRegistry): DataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[DataRegistry]
  
  inline def createRegistryControl[R /* <: DataRegistry */, T](registryControl: js.Function1[/* registry */ R, js.Function1[/* args */ StringDictionary[Any], T]]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryControl")(registryControl.asInstanceOf[js.Any]).asInstanceOf[R]
  
  inline def createRegistrySelector[S /* <: js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, SelectorMap] */, T](
    registrySelector: js.Function1[/* select */ S, js.Function2[/* state */ Any, /* repeated */ Any, T]]
  ): S = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistrySelector")(registrySelector.asInstanceOf[js.Any]).asInstanceOf[S]
  
  inline def dispatch(storeNameOrDescriptor: String): DispatcherMap = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[DispatcherMap]
  inline def dispatch(storeNameOrDescriptor: StoreDescriptor): DispatcherMap = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[DispatcherMap]
  
  object plugins {
    
    @JSImport("@wordpress/data", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/data", "plugins.persistence")
    @js.native
    def persistence: Plugin[Storage] = js.native
    inline def persistence_=(x: Plugin[Storage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("persistence")(x.asInstanceOf[js.Any])
  }
  
  inline def register(store: StoreDescriptor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerGenericStore(name: String, config: GenericStoreConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGenericStore")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerStore[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStore")(key.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Store[T, AnyAction]]
  
  inline def resolveSelect(storeNameOrDescriptor: String): ResolveSelectorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSelect")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[ResolveSelectorMap]
  inline def resolveSelect(storeNameOrDescriptor: StoreDescriptor): ResolveSelectorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSelect")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[ResolveSelectorMap]
  
  inline def select(storeNameOrDescriptor: String): SelectorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[SelectorMap]
  inline def select(storeNameOrDescriptor: StoreDescriptor): SelectorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[SelectorMap]
  
  @JSImport("@wordpress/data", "subscribe")
  @js.native
  val subscribe: Subscriber = js.native
  
  inline def use[T /* <: Record[String, Any] */](plugin: Plugin[T], options: T): DataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DataRegistry]
  
  @JSImport("@wordpress/data", "useDispatch")
  @js.native
  val useDispatch: (js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, DispatcherMap]) & (js.Function0[
    js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, DispatcherMap]
  ]) = js.native
  
  inline def useRegistry(): DataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("useRegistry")().asInstanceOf[DataRegistry]
  
  inline def useSelect[T](
    mapSelect: js.Function1[
      /* s */ js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, SelectorMap], 
      T
    ]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(mapSelect.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useSelect[T](
    mapSelect: js.Function1[
      /* s */ js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, SelectorMap], 
      T
    ],
    deps: js.Array[Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(mapSelect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def withDispatch[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, DispatcherMap], 
      /* ownProps */ P & IP, 
      /* registry */ Select, 
      DP
    ]
  ): js.Function1[/* component */ ComponentType[P & IP & DP], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDispatch")(mapDispatchToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P & IP & DP], ComponentType[P]]]
  
  inline def withRegistry[P](component: ComponentType[P]): ComponentType[P & Registry] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRegistry")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P & Registry]]
  
  inline def withSelect[SP, P, IP](
    mapSelectToProps: js.Function2[
      /* sel */ js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, SelectorMap], 
      /* ownProps */ P & IP, 
      SP
    ]
  ): js.Function1[/* component */ ComponentType[P & IP & SP], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSelect")(mapSelectToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P & IP & SP], ComponentType[P]]]
  
  trait DataRegistry extends StObject {
    
    var dispatch: js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, DispatcherMap]
    
    var registerGenericStore: js.Function2[/* name */ String, /* config */ GenericStoreConfig, Unit]
    
    var registerStore: FnCall
    
    var select: js.Function1[/* storeNameOrDescriptor */ String | StoreDescriptor, SelectorMap]
    
    var subscribe: Subscriber
  }
  object DataRegistry {
    
    inline def apply(
      dispatch: /* storeNameOrDescriptor */ String | StoreDescriptor => DispatcherMap,
      registerGenericStore: (/* name */ String, /* config */ GenericStoreConfig) => Unit,
      registerStore: FnCall,
      select: /* storeNameOrDescriptor */ String | StoreDescriptor => SelectorMap,
      subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
    ): DataRegistry = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), registerGenericStore = js.Any.fromFunction2(registerGenericStore), registerStore = registerStore.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[DataRegistry]
    }
    
    extension [Self <: DataRegistry](x: Self) {
      
      inline def setDispatch(value: /* storeNameOrDescriptor */ String | StoreDescriptor => DispatcherMap): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setRegisterGenericStore(value: (/* name */ String, /* config */ GenericStoreConfig) => Unit): Self = StObject.set(x, "registerGenericStore", js.Any.fromFunction2(value))
      
      inline def setRegisterStore(value: FnCall): Self = StObject.set(x, "registerStore", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: /* storeNameOrDescriptor */ String | StoreDescriptor => SelectorMap): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type DispatcherMap = Record[
    String, 
    js.Function1[
      /* repeated */ Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: true extends true ? @wordpress/data.@wordpress/data.EnsurePromise<void> : void */ js.Any
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Promise<any> ? T : std.Promise<T>
    }}}
    */
  @js.native
  trait EnsurePromise[T] extends StObject
  
  trait GenericStoreConfig extends StObject {
    
    def getActions(): DispatcherMap
    
    def getSelectors(): SelectorMap
    
    var subscribe: Subscriber
  }
  object GenericStoreConfig {
    
    inline def apply(
      getActions: () => DispatcherMap,
      getSelectors: () => SelectorMap,
      subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
    ): GenericStoreConfig = {
      val __obj = js.Dynamic.literal(getActions = js.Any.fromFunction0(getActions), getSelectors = js.Any.fromFunction0(getSelectors), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[GenericStoreConfig]
    }
    
    extension [Self <: GenericStoreConfig](x: Self) {
      
      inline def setGetActions(value: () => DispatcherMap): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setGetSelectors(value: () => SelectorMap): Self = StObject.set(x, "getSelectors", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type Plugin[T /* <: Record[String, Any] */] = js.Function2[/* registry */ DataRegistry, /* options */ T, PartialDataRegistry]
  
  type ResolveSelectorMap = Record[String, js.Function1[/* repeated */ Any, js.Promise[Any]]]
  
  type SelectorMap = Record[String, js.Function1[/* repeated */ Any, Any]]
  
  trait Store[S, A /* <: AnyAction */] extends StObject {
    
    def dispatch(action: A): A
    
    def getState(): S
    
    var subscribe: Subscriber
  }
  object Store {
    
    inline def apply[S, A /* <: AnyAction */](
      dispatch: A => A,
      getState: () => S,
      subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
    ): Store[S, A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Store[S, A]]
    }
    
    extension [Self <: Store[?, ?], S, A /* <: AnyAction */](x: Self & (Store[S, A])) {
      
      inline def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait StoreConfig[S] extends StObject {
    
    var actions: js.UndefOr[
        StringDictionary[js.Function1[/* repeated */ Any, AnyAction | (Generator[Any, Any, Any])]]
      ] = js.undefined
    
    var controls: js.UndefOr[StringDictionary[js.Function1[/* action */ AnyAction, Any]]] = js.undefined
    
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
    
    var resolvers: js.UndefOr[StringDictionary[js.Function1[/* repeated */ Any, Any]]] = js.undefined
    
    var selectors: js.UndefOr[StringDictionary[js.Function2[/* state */ S, /* repeated */ Any, Any]]] = js.undefined
  }
  object StoreConfig {
    
    inline def apply[S](reducer: (/* state */ js.UndefOr[S], AnyAction) => S): StoreConfig[S] = {
      val __obj = js.Dynamic.literal(reducer = js.Any.fromFunction2(reducer))
      __obj.asInstanceOf[StoreConfig[S]]
    }
    
    extension [Self <: StoreConfig[?], S](x: Self & StoreConfig[S]) {
      
      inline def setActions(value: StringDictionary[js.Function1[/* repeated */ Any, AnyAction | (Generator[Any, Any, Any])]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setControls(value: StringDictionary[js.Function1[/* action */ AnyAction, Any]]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setInitialState(value: S): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setPersist(value: `true` | (js.Array[/* keyof S */ String])): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setPersistVarargs(value: (/* keyof S */ String)*): Self = StObject.set(x, "persist", js.Array(value*))
      
      inline def setReducer(value: (/* state */ js.UndefOr[S], AnyAction) => S): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
      
      inline def setResolvers(value: StringDictionary[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      inline def setSelectors(value: StringDictionary[js.Function2[/* state */ S, /* repeated */ Any, Any]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    }
  }
  
  trait StoreDescriptor extends StObject {
    
    def instantiate(registry: DataRegistry): GenericStoreConfig
    
    var name: String
  }
  object StoreDescriptor {
    
    inline def apply(instantiate: DataRegistry => GenericStoreConfig, name: String): StoreDescriptor = {
      val __obj = js.Dynamic.literal(instantiate = js.Any.fromFunction1(instantiate), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreDescriptor]
    }
    
    extension [Self <: StoreDescriptor](x: Self) {
      
      inline def setInstantiate(value: DataRegistry => GenericStoreConfig): Self = StObject.set(x, "instantiate", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscriber = js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit]]
}
