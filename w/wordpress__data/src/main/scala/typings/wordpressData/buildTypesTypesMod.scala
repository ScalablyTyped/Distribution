package typings.wordpressData

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.ActionFromReducersMapObject
import typings.redux.mod.AnyAction
import typings.redux.mod.CombinedState
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.redux.mod.StateFromReducersMapObject
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesTypesMod {
  
  type ActionCreator = js.Function | (Generator[Any, Any, Any])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Config extends @wordpress/data.@wordpress/data/build-types/types.ReduxStoreConfig<any, infer ActionCreators, any> ? ActionCreators : never
    }}}
    */
  @js.native
  trait ActionCreatorsOf[Config /* <: AnyConfig */] extends StObject
  
  type AnyConfig = ReduxStoreConfig[Any, Any, Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends @wordpress/data.@wordpress/data/build-types/types.StoreDescriptor<infer C> ? C : never
    }}}
    */
  @js.native
  trait ConfigOf[S] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends @wordpress/data.@wordpress/data/build-types/types.StoreDescriptor<@wordpress/data.@wordpress/data/build-types/types.ReduxStoreConfig<any, any, infer Selectors>> ? {[ key in keyof Selectors ]: @wordpress/data.@wordpress/data/build-types/types.CurriedState<Selectors[key]>} : never
    }}}
    */
  @js.native
  trait CurriedSelectorsOf[S] extends StObject
  
  /**
    * Removes the first argument from a function.
    *
    * By default, it removes the `state` parameter from
    * registered selectors since that argument is supplied
    * by the editor when calling `select(…)`.
    *
    * For functions with no arguments, which some selectors
    * are free to define, returns the original function.
    *
    * It is possible to manually provide a custom curried signature
    * and avoid the automatic inference. When the
    * F generic argument passed to this helper extends the
    * SelectorWithCustomCurrySignature type, the F['CurriedSignature']
    * property is used verbatim.
    *
    * This is useful because TypeScript does not correctly remove
    * arguments from complex function signatures constrained by
    * interdependent generic parameters.
    * For more context, see https://github.com/WordPress/gutenberg/pull/41578
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    F extends @wordpress/data.@wordpress/data/build-types/types.SelectorWithCustomCurrySignature ? F['CurriedSignature'] : F extends (state : any, args : infer P): infer R ? (args : P): R : F
    }}}
    */
  type CurriedState[F] = F
  
  trait DataEmitter extends StObject {
    
    def emit(): Unit
    
    var isPaused: Boolean
    
    def pause(): Unit
    
    def resume(): Unit
    
    def subscribe(listener: js.Function0[Unit]): js.Function0[Unit]
  }
  object DataEmitter {
    
    inline def apply(
      emit: () => Unit,
      isPaused: Boolean,
      pause: () => Unit,
      resume: () => Unit,
      subscribe: js.Function0[Unit] => js.Function0[Unit]
    ): DataEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction0(emit), isPaused = isPaused.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[DataEmitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataEmitter] (val x: Self) extends AnyVal {
      
      inline def setEmit(value: () => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction0(value))
      
      inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait DataRegistry extends StObject {
    
    def register(store: StoreDescriptor[Any]): Unit
  }
  object DataRegistry {
    
    inline def apply(register: StoreDescriptor[Any] => Unit): DataRegistry = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[DataRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataRegistry] (val x: Self) extends AnyVal {
      
      inline def setRegister(value: StoreDescriptor[Any] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  type DispatchFunction = js.Function1[
    /* store */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @wordpress/data.@wordpress/data/build-types/types.StoreDescriptor<any> ? @wordpress/data.@wordpress/data/build-types/types.ActionCreatorsOf<@wordpress/data.@wordpress/data/build-types/types.ConfigOf<any>> : any */ js.Any
  ]
  
  type MapOf[T] = StringDictionary[T]
  
  type MapSelect = js.Function2[/* select */ SelectFunction, /* registry */ DataRegistry, Any]
  
  trait ReduxStoreConfig[State, ActionCreators /* <: MapOf[ActionCreator] */, Selectors] extends StObject {
    
    var actions: js.UndefOr[ActionCreators] = js.undefined
    
    var controls: js.UndefOr[MapOf[js.Function]] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    def reducer(state: Any, action: Any): Any
    
    var resolvers: js.UndefOr[MapOf[Resolver]] = js.undefined
    
    var selectors: js.UndefOr[Selectors] = js.undefined
  }
  object ReduxStoreConfig {
    
    inline def apply[State, ActionCreators /* <: MapOf[ActionCreator] */, Selectors](reducer: (Any, Any) => Any): ReduxStoreConfig[State, ActionCreators, Selectors] = {
      val __obj = js.Dynamic.literal(reducer = js.Any.fromFunction2(reducer))
      __obj.asInstanceOf[ReduxStoreConfig[State, ActionCreators, Selectors]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReduxStoreConfig[?, ?, ?], State, ActionCreators /* <: MapOf[ActionCreator] */, Selectors] (val x: Self & (ReduxStoreConfig[State, ActionCreators, Selectors])) extends AnyVal {
      
      inline def setActions(value: ActionCreators): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setControls(value: MapOf[js.Function]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setReducer(value: (Any, Any) => Any): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
      
      inline def setResolvers(value: MapOf[Resolver]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      inline def setSelectors(value: Selectors): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    }
  }
  
  type Resolver = js.Function | (Generator[Any, Any, Any])
  
  type SelectFunction = js.Function1[/* store */ Any, CurriedSelectorsOf[Any]]
  
  type Selector = js.Function
  
  trait SelectorWithCustomCurrySignature extends StObject {
    
    var CurriedSignature: js.Function
  }
  object SelectorWithCustomCurrySignature {
    
    inline def apply(CurriedSignature: js.Function): SelectorWithCustomCurrySignature = {
      val __obj = js.Dynamic.literal(CurriedSignature = CurriedSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorWithCustomCurrySignature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorWithCustomCurrySignature] (val x: Self) extends AnyVal {
      
      inline def setCurriedSignature(value: js.Function): Self = StObject.set(x, "CurriedSignature", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Config extends @wordpress/data.@wordpress/data/build-types/types.ReduxStoreConfig<any, any, infer Selectors> ? {[ name in keyof Selectors ]: std.Function} : never
    }}}
    */
  @js.native
  trait SelectorsOf[Config /* <: AnyConfig */] extends StObject
  
  trait StoreDescriptor[Config /* <: AnyConfig */] extends StObject {
    
    /**
      * Creates a store instance
      */
    def instantiate(registry: DataRegistry): StoreInstance[Config]
    
    /**
      * Store Name
      */
    var name: String
  }
  object StoreDescriptor {
    
    inline def apply[Config /* <: AnyConfig */](instantiate: DataRegistry => StoreInstance[Config], name: String): StoreDescriptor[Config] = {
      val __obj = js.Dynamic.literal(instantiate = js.Any.fromFunction1(instantiate), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreDescriptor[Config]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreDescriptor[?], Config /* <: AnyConfig */] (val x: Self & StoreDescriptor[Config]) extends AnyVal {
      
      inline def setInstantiate(value: DataRegistry => StoreInstance[Config]): Self = StObject.set(x, "instantiate", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoreInstance[Config /* <: AnyConfig */] extends StObject {
    
    def getActions(): ActionCreatorsOf[Config]
    
    def getSelectors(): SelectorsOf[Config]
    
    def subscribe(listener: js.Function0[Unit]): js.Function0[Unit]
  }
  object StoreInstance {
    
    inline def apply[Config /* <: AnyConfig */](
      getActions: () => ActionCreatorsOf[Config],
      getSelectors: () => SelectorsOf[Config],
      subscribe: js.Function0[Unit] => js.Function0[Unit]
    ): StoreInstance[Config] = {
      val __obj = js.Dynamic.literal(getActions = js.Any.fromFunction0(getActions), getSelectors = js.Any.fromFunction0(getSelectors), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[StoreInstance[Config]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreInstance[?], Config /* <: AnyConfig */] (val x: Self & StoreInstance[Config]) extends AnyVal {
      
      inline def setGetActions(value: () => ActionCreatorsOf[Config]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setGetSelectors(value: () => SelectorsOf[Config]): Self = StObject.set(x, "getSelectors", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    StoreNameOrDescriptor extends @wordpress/data.@wordpress/data/build-types/types.StoreDescriptor<any> ? @wordpress/data.@wordpress/data/build-types/types.ActionCreatorsOf<@wordpress/data.@wordpress/data/build-types/types.ConfigOf<StoreNameOrDescriptor>> : StoreNameOrDescriptor extends undefined ? @wordpress/data.@wordpress/data/build-types/types.DispatchFunction : any
    }}}
    */
  type UseDispatchReturn[StoreNameOrDescriptor] = DispatchFunction
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    F extends @wordpress/data.@wordpress/data/build-types/types.MapSelect ? std.ReturnType<F> : F extends @wordpress/data.@wordpress/data/build-types/types.StoreDescriptor<any> ? @wordpress/data.@wordpress/data/build-types/types.CurriedSelectorsOf<F> : never
    }}}
    */
  @js.native
  trait UseSelectReturn[F /* <: MapSelect | StoreDescriptor[Any] */] extends StObject
  
  @js.native
  trait combineReducers extends StObject {
    
    def apply[M /* <: ReducersMapObject[Any, Any] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
    def apply[S](reducers: ReducersMapObject[S, Any]): Reducer[CombinedState[S], AnyAction] = js.native
  }
}
