package typings.useGlobalHook

import org.scalablytyped.runtime.Instantiable0
import typings.immer.mod.AnyFunc
import typings.immer.mod.Draft
import typings.immer.mod.Immutable
import typings.immer.mod.InferCurriedFromInitialStateAndRecipe
import typings.immer.mod.InferCurriedFromRecipe
import typings.immer.mod.InferInitialStateFromCurried
import typings.immer.mod.InferRecipeFromCurried
import typings.immer.mod.Objectish
import typings.immer.mod.Patch
import typings.immer.mod.PatchListener
import typings.immer.mod.PatchesTuple
import typings.immer.mod.ValidRecipeReturnType
import typings.useGlobalHook.useGlobalHookBooleans.`false`
import typings.useGlobalHook.useGlobalHookBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-global-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  inline def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object, options: InitializerFunction[S, A]): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  inline def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object, options: Options[S, A]): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  
  @js.native
  trait IProduce extends StObject {
    
    var Immer: Instantiable0[typings.immer.mod.Immer] = js.native
    
    /**
      * Apply an array of Immer patches to the first argument.
      *
      * This function is a producer, which means copy-on-write is in effect.
      */
    def applyPatches[T /* <: Objectish */](base: T, patches: js.Array[Patch]): T = js.native
    
    /**
      * This function is actually a no-op, but can be used to cast an immutable type
      * to an draft type and make TypeScript happy
      *
      * @param value
      */
    def castDraft[T](value: T): Draft[T] = js.native
    
    /**
      * This function is actually a no-op, but can be used to cast a mutable type
      * to an immutable type and make TypeScript happy
      * @param value
      */
    def castImmutable[T](value: T): Immutable[T] = js.native
    
    /**
      * Create an Immer draft from the given base state, which may be a draft itself.
      * The draft can be modified until you finalize it with the `finishDraft` function.
      */
    def createDraft[T /* <: Objectish */](base: T): Draft[T] = js.native
    
    /** Takes a snapshot of the current state of a draft and finalizes it (but without freezing). This is a great utility to print the current state during debugging (no Proxies in the way). The output of current can also be safely leaked outside the producer. */
    def current[T](value: T): T = js.native
    
    def enableMapSet(): Unit = js.native
    
    def enablePatches(): Unit = js.native
    
    /**
      * Finalize an Immer draft from a `createDraft` call, returning the base state
      * (if no changes were made) or a modified copy. The draft must *not* be
      * mutated afterwards.
      *
      * Pass a function as the 2nd argument to generate Immer patches based on the
      * changes that were made.
      */
    def finishDraft[D /* <: Any */](draft: D): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any = js.native
    def finishDraft[D /* <: Any */](draft: D, patchListener: PatchListener): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any = js.native
    
    /**
      * Freezes draftable objects. Returns the original object.
      * By default freezes shallowly, but if the second argument is `true` it will freeze recursively.
      *
      * @param obj
      * @param deep
      */
    def freeze[T](obj: T): T = js.native
    def freeze[T](obj: T, deep: Boolean): T = js.native
    
    /**
      * To let Immer treat your class instances as plain immutable objects
      * (albeit with a custom prototype), you must define either an instance property
      * or a static property on each of your custom classes.
      *
      * Otherwise, your class instance will never be drafted, which means it won't be
      * safe to mutate in a produce callback.
      */
    val immerable: js.Symbol = js.native
    
    /** Returns true if the given value is an Immer draft */
    def isDraft(value: Any): Boolean = js.native
    
    /** Returns true if the given value can be drafted by Immer */
    def isDraftable(value: Any): Boolean = js.native
    
    val nothing: js.Symbol = js.native
    
    /** Get the underlying object that is represented by the given draft */
    def original[T](value: T): js.UndefOr[T] = js.native
    
    /** Curried producer that infers curried from the recipe  */
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `false`] = js.native
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[State](recipe: js.Function1[/* state */ Draft[State], ValidRecipeReturnType[State]]): js.Function1[/* state */ State, State] = js.native
    /** Curried producer that infers curried from the State generic, which is explicitly passed in.  */
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[State](
      recipe: js.Function2[/* state */ Draft[State], /* initialState */ State, ValidRecipeReturnType[State]]
    ): js.Function1[/* state */ js.UndefOr[State], State] = js.native
    /** Curried producer that infers the recipe from the curried output function (e.g. when passing to setState) */
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[Curried](recipe: InferRecipeFromCurried[Curried]): Curried = js.native
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[Curried](recipe: InferRecipeFromCurried[Curried], initialState: InferInitialStateFromCurried[Curried]): Curried = js.native
    /** Normal producer */
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]
    ): Base = js.native
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]],
      listener: PatchListener
    ): Base = js.native
    /** Curried producer with initial state, infers recipe from initial state */
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `false`] = js.native
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[State, Args /* <: js.Array[Any] */](
      recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]],
      initialState: State
    ): js.Function2[/* state */ js.UndefOr[State], /* args */ Args, State] = js.native
    
    /**
      * Like `produce`, but `produceWithPatches` always returns a tuple
      * [nextState, patches, inversePatches] (instead of just the next state)
      */
    def produceWithPatches[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `true`] = js.native
    /**
      * Like `produce`, but `produceWithPatches` always returns a tuple
      * [nextState, patches, inversePatches] (instead of just the next state)
      */
    def produceWithPatches[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]): PatchesTuple[Base] = js.native
    /**
      * Like `produce`, but `produceWithPatches` always returns a tuple
      * [nextState, patches, inversePatches] (instead of just the next state)
      */
    def produceWithPatches[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]], listener: PatchListener): PatchesTuple[Base] = js.native
    /**
      * Like `produce`, but `produceWithPatches` always returns a tuple
      * [nextState, patches, inversePatches] (instead of just the next state)
      */
    def produceWithPatches[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `true`] = js.native
    
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    @JSName("produce")
    def produce_StateArgs_Function2[State, Args /* <: js.Array[Any] */](recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]]): js.Function2[/* state */ State, /* args */ Args, State] = js.native
    
    /**
      * Pass true to automatically freeze all copies created by Immer.
      *
      * Always freeze by default, even in production mode
      */
    def setAutoFreeze(value: Boolean): Unit = js.native
    
    /**
      * Pass true to enable strict shallow copy.
      *
      * By default, immer does not copy the object descriptors such as getter, setter and non-enumrable properties.
      */
    def setUseStrictShallowCopy(value: Boolean): Unit = js.native
  }
  
  type InitializerFunction[S, A] = js.Function1[/* store */ Store[S, A], Unit]
  
  trait Options[S, A] extends StObject {
    
    var Immer: js.UndefOr[IProduce] = js.undefined
    
    var initializer: js.UndefOr[InitializerFunction[S, A]] = js.undefined
  }
  object Options {
    
    inline def apply[S, A](): Options[S, A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[S, A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?], S, A] (val x: Self & (Options[S, A])) extends AnyVal {
      
      inline def setImmer(value: IProduce): Self = StObject.set(x, "Immer", value.asInstanceOf[js.Any])
      
      inline def setImmerUndefined: Self = StObject.set(x, "Immer", js.undefined)
      
      inline def setInitializer(value: /* store */ Store[S, A] => Unit): Self = StObject.set(x, "initializer", js.Any.fromFunction1(value))
      
      inline def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    }
  }
  
  // Use an interface so that different versions of React can be used
  trait ReactInterface extends StObject {
    
    def useEffect(args: Any*): Any
    
    def useMemo(args: Any*): Any
    
    def useState(args: Any*): Any
  }
  object ReactInterface {
    
    inline def apply(
      useEffect: /* repeated */ Any => Any,
      useMemo: /* repeated */ Any => Any,
      useState: /* repeated */ Any => Any
    ): ReactInterface = {
      val __obj = js.Dynamic.literal(useEffect = js.Any.fromFunction1(useEffect), useMemo = js.Any.fromFunction1(useMemo), useState = js.Any.fromFunction1(useState))
      __obj.asInstanceOf[ReactInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactInterface] (val x: Self) extends AnyVal {
      
      inline def setUseEffect(value: /* repeated */ Any => Any): Self = StObject.set(x, "useEffect", js.Any.fromFunction1(value))
      
      inline def setUseMemo(value: /* repeated */ Any => Any): Self = StObject.set(x, "useMemo", js.Any.fromFunction1(value))
      
      inline def setUseState(value: /* repeated */ Any => Any): Self = StObject.set(x, "useState", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Store[S, A] extends StObject {
    
    var actions: A = js.native
    
    def setState(state: S): Unit = js.native
    def setState(state: S, afterUpdateCallback: js.Function0[Unit]): Unit = js.native
    
    var state: S = js.native
  }
  
  type UseGlobal[S, A] = (js.Function0[js.Tuple2[S, A]]) & (js.Function1[/* stateFunc */ js.Function1[/* state */ S, Any], js.Tuple2[Any, A]]) & (js.Function2[
    /* stateFunc */ js.Function1[/* state */ S, Any], 
    /* actionsFunc */ js.Function1[/* state */ A, Any], 
    js.Tuple2[Any, Any]
  ]) & (js.Function2[
    /* stateFunc */ Unit, 
    /* actionsFunc */ js.Function1[/* state */ A, Any], 
    js.Tuple2[S, Any]
  ])
}
