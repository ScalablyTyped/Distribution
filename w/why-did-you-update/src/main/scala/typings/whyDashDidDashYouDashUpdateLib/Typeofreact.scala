package typings
package whyDashDidDashYouDashUpdateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofreact extends js.Object {
  val Children: reactLib.reactMod.ReactChildren = js.native
  // Base component for plain JS classes
  // tslint:disable-next-line:no-empty-interface
  var Component: TypeofClassComponent = js.native
  val Fragment: reactLib.reactMod.ExoticComponent[reactLib.Anon_Children] = js.native
  var PureComponent: org.scalablytyped.runtime.Instantiable0[reactLib.reactMod.PureComponent[js.Object, js.Object, js.Object]] = js.native
  val StrictMode: reactLib.reactMod.ExoticComponent[reactLib.Anon_Children] = js.native
  /**
    * This feature is not yet available for server-side rendering.
    * Suspense support will be added in a later release.
    */
  val Suspense: reactLib.reactMod.ExoticComponent[reactLib.reactMod.SuspenseProps] = js.native
  val unstable_Profiler: reactLib.reactMod.ExoticComponent[reactLib.reactMod.ProfilerProps] = js.native
  val version: java.lang.String = js.native
  // Custom components
  def cloneElement[P](element: reactLib.reactMod.FunctionComponentElement[P]): reactLib.reactMod.FunctionComponentElement[P] = js.native
  def cloneElement[P](
    element: reactLib.reactMod.FunctionComponentElement[P],
    props: stdLib.Partial[P] with reactLib.reactMod.Attributes,
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.FunctionComponentElement[P] = js.native
  def cloneElement[P](element: reactLib.reactMod.ReactElement[P]): reactLib.reactMod.ReactElement[P] = js.native
  def cloneElement[P](
    element: reactLib.reactMod.ReactElement[P],
    props: stdLib.Partial[P] with reactLib.reactMod.Attributes,
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactElement[P] = js.native
  def cloneElement[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](element: reactLib.reactMod.CElement[P, T]): reactLib.reactMod.CElement[P, T] = js.native
  def cloneElement[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    element: reactLib.reactMod.CElement[P, T],
    props: stdLib.Partial[P] with reactLib.reactMod.ClassAttributes[T],
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def cloneElement[P /* <: reactLib.reactMod.DOMAttributes[T] */, T /* <: reactLib.Element */](element: reactLib.reactMod.DOMElement[P, T]): reactLib.reactMod.DOMElement[P, T] = js.native
  def cloneElement[P /* <: reactLib.reactMod.DOMAttributes[T] */, T /* <: reactLib.Element */](
    element: reactLib.reactMod.DOMElement[P, T],
    props: reactLib.reactMod.DOMAttributes[T] with P,
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DOMElement[P, T] = js.native
  // DOM Elements
  // ReactHTMLElement
  def cloneElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](element: reactLib.reactMod.DetailedReactHTMLElement[P, T]): reactLib.reactMod.DetailedReactHTMLElement[P, T] = js.native
  def cloneElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](
    element: reactLib.reactMod.DetailedReactHTMLElement[P, T],
    props: P,
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  def cloneElement[P /* <: reactLib.reactMod.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](element: reactLib.reactMod.ReactSVGElement): reactLib.reactMod.ReactSVGElement = js.native
  def cloneElement[P /* <: reactLib.reactMod.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](element: reactLib.reactMod.ReactSVGElement, props: P, children: reactLib.reactMod.ReactNode*): reactLib.reactMod.ReactSVGElement = js.native
  // ReactHTMLElement, less specific
  @JSName("cloneElement")
  def cloneElement_PHTMLAttributesTHTMLElementReactHTMLElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](element: reactLib.reactMod.ReactHTMLElement[T]): reactLib.reactMod.ReactHTMLElement[T] = js.native
  @JSName("cloneElement")
  def cloneElement_PHTMLAttributesTHTMLElementReactHTMLElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](element: reactLib.reactMod.ReactHTMLElement[T], props: P, children: reactLib.reactMod.ReactNode*): reactLib.reactMod.ReactHTMLElement[T] = js.native
  def createContext[T](defaultValue: T): reactLib.reactMod.Context[T] = js.native
  def createContext[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, scala.Double]): reactLib.reactMod.Context[T] = js.native
  def createElement[P /* <: js.Object */](`type`: java.lang.String): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ClassType[
      P, 
      reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState], 
      reactLib.reactMod.ClassicComponentClass[P]
    ]
  ): reactLib.reactMod.CElement[P, reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState]] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ClassType[
      P, 
      reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState], 
      reactLib.reactMod.ClassicComponentClass[P]
    ],
    props: (reactLib.reactMod.ClassAttributes[reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState]]) with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.CElement[P, reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState]] = js.native
  def createElement[P /* <: js.Object */](`type`: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState],
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](`type`: reactLib.reactMod.FunctionComponent[P]): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.FunctionComponent[P],
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: reactLib.reactMod.DOMAttributes[T] */, T /* <: reactLib.Element */](
    `type`: java.lang.String,
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DOMElement[P, T] = js.native
  def createElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 115 */ js.Any): reactLib.reactMod.DetailedReactHTMLElement[P, T] = js.native
  def createElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 115 */ js.Any,
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DetailedReactHTMLElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PDOMAttributesTElementDOMElement[P /* <: reactLib.reactMod.DOMAttributes[T] */, T /* <: reactLib.Element */](`type`: java.lang.String): reactLib.reactMod.DOMElement[P, T] = js.native
  // Custom components
  @JSName("createElement")
  def createElement_PObjectFunctionComponentElement[P /* <: js.Object */](`type`: reactLib.reactMod.FunctionComponent[P]): reactLib.reactMod.FunctionComponentElement[P] = js.native
  @JSName("createElement")
  def createElement_PObjectFunctionComponentElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.FunctionComponent[P],
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.FunctionComponentElement[P] = js.native
  @JSName("createElement")
  def createElement_PObjectTComponentCComponentClass[P /* <: js.Object */, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */, C /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](`type`: reactLib.reactMod.ClassType[P, T, C]): reactLib.reactMod.CElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PObjectTComponentCComponentClass[P /* <: js.Object */, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */, C /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](
    `type`: reactLib.reactMod.ClassType[P, T, C],
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.CElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PSVGAttributesTSVGElementReactSVGElement[P /* <: reactLib.reactMod.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any): reactLib.reactMod.ReactSVGElement = js.native
  @JSName("createElement")
  def createElement_PSVGAttributesTSVGElementReactSVGElement[P /* <: reactLib.reactMod.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any,
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactSVGElement = js.native
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @JSName("createElement")
  def createElement_input(`type`: whyDashDidDashYouDashUpdateLib.whyDashDidDashYouDashUpdateLibStrings.input): reactLib.reactMod.DetailedReactHTMLElement[
    reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
    reactLib.HTMLInputElement
  ] = js.native
  @JSName("createElement")
  def createElement_input(
    `type`: whyDashDidDashYouDashUpdateLib.whyDashDidDashYouDashUpdateLibStrings.input,
    props: reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement] with (reactLib.reactMod.ClassAttributes[reactLib.HTMLInputElement] | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DetailedReactHTMLElement[
    reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
    reactLib.HTMLInputElement
  ] = js.native
  def createFactory(`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any): reactLib.reactMod.SVGFactory = js.native
  def createFactory[P](
    `type`: reactLib.reactMod.ClassType[
      P, 
      reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState], 
      reactLib.reactMod.ClassicComponentClass[P]
    ]
  ): reactLib.reactMod.CFactory[P, reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState]] = js.native
  def createFactory[P](`type`: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]): reactLib.reactMod.Factory[P] = js.native
  // Custom components
  def createFactory[P](`type`: reactLib.reactMod.FunctionComponent[P]): reactLib.reactMod.FunctionComponentFactory[P] = js.native
  def createFactory[P /* <: reactLib.reactMod.DOMAttributes[T] */, T /* <: reactLib.Element */](`type`: java.lang.String): reactLib.reactMod.DOMFactory[P, T] = js.native
  @JSName("createFactory")
  def createFactory_PTComponentCComponentClass[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */, C /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](`type`: reactLib.reactMod.ClassType[P, T, C]): reactLib.reactMod.CFactory[P, T] = js.native
  //
  // Top Level API
  // ----------------------------------------------------------------------
  // DOM Elements
  @JSName("createFactory")
  def createFactory_THTMLElementHTMLFactory[T /* <: reactLib.HTMLElement */](`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 115 */ js.Any): reactLib.reactMod.HTMLFactory[T] = js.native
  def createRef[T](): reactLib.reactMod.RefObject[T] = js.native
  def forwardRef[T, P](Component: reactLib.reactMod.RefForwardingComponent[T, P]): reactLib.reactMod.ForwardRefExoticComponent[reactLib.reactMod.PropsWithoutRef[P] with reactLib.reactMod.RefAttributes[T]] = js.native
  def isValidElement[P](): /* is react.react.ReactElement<P> */ scala.Boolean = js.native
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement<P> */ scala.Boolean = js.native
  def `lazy`[T /* <: reactLib.reactMod.ComponentType[_] */](factory: js.Function0[js.Promise[reactLib.Anon_Default[T]]]): reactLib.reactMod.LazyExoticComponent[T] = js.native
  def memo[T /* <: reactLib.reactMod.ComponentType[_] */](Component: T): reactLib.reactMod.MemoExoticComponent[T] = js.native
  def memo[T /* <: reactLib.reactMod.ComponentType[_] */](
    Component: T,
    propsAreEqual: js.Function2[
      /* prevProps */ stdLib.Readonly[reactLib.reactMod.ComponentProps[T]], 
      /* nextProps */ stdLib.Readonly[reactLib.reactMod.ComponentProps[T]], 
      scala.Boolean
    ]
  ): reactLib.reactMod.MemoExoticComponent[T] = js.native
  def memo[P /* <: js.Object */](Component: reactLib.reactMod.SFC[P]): reactLib.reactMod.NamedExoticComponent[P] = js.native
  def memo[P /* <: js.Object */](
    Component: reactLib.reactMod.SFC[P],
    propsAreEqual: js.Function2[
      /* prevProps */ stdLib.Readonly[reactLib.reactMod.PropsWithChildren[P]], 
      /* nextProps */ stdLib.Readonly[reactLib.reactMod.PropsWithChildren[P]], 
      scala.Boolean
    ]
  ): reactLib.reactMod.NamedExoticComponent[P] = js.native
  // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
  // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
  /**
    * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
    * has changed.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecallback
    */
  // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: reactLib.reactMod.DependencyList): T = js.native
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  def useContext[T](context: reactLib.reactMod.Context[T]): T = js.native
  /**
    * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
    *
    * NOTE: We don’t recommend adding debug values to every custom hook.
    * It’s most valuable for custom hooks that are part of shared libraries.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
    */
  // the name of the custom hook is itself derived from the function name at runtime:
  // it's just the function name without the "use" prefix.
  def useDebugValue[T](value: T): scala.Unit = js.native
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): scala.Unit = js.native
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  def useEffect(effect: reactLib.reactMod.EffectCallback): scala.Unit = js.native
  def useEffect(effect: reactLib.reactMod.EffectCallback, deps: reactLib.reactMod.DependencyList): scala.Unit = js.native
  // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
  /**
    * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
    * `ref`. As always, imperative code using refs should be avoided in most cases.
    *
    * `useImperativeHandle` should be used with `React.forwardRef`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
    */
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[reactLib.reactMod.Ref[T]], init: js.Function0[R]): scala.Unit = js.native
  def useImperativeHandle[T, R /* <: T */](
    ref: js.UndefOr[reactLib.reactMod.Ref[T]],
    init: js.Function0[R],
    deps: reactLib.reactMod.DependencyList
  ): scala.Unit = js.native
  /**
    * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
    * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
    * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
    *
    * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
    *
    * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
    * `componentDidMount` and `componentDidUpdate`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
    */
  def useLayoutEffect(effect: reactLib.reactMod.EffectCallback): scala.Unit = js.native
  def useLayoutEffect(effect: reactLib.reactMod.EffectCallback, deps: reactLib.reactMod.DependencyList): scala.Unit = js.native
  def useMemo[T](factory: js.Function0[T]): T = js.native
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
    * the second argument.
    *
    * ```ts
    * function expensive () { ... }
    *
    * function Component () {
    *   const expensiveResult = useMemo(expensive, [expensive])
    *   return ...
    * }
    * ```
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usememo
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  def useMemo[T](factory: js.Function0[T], deps: reactLib.reactMod.DependencyList): T = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
  // The Flow types do have an overload for 3-ary invocation with undefined initializer.
  // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
  // supertype between the reducer's return type and the initialState (or the initializer's return type),
  // which would prevent autocompletion from ever working.
  // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
  // in older versions, or a regression in newer versions of the typescript completion service.
  def useReducer[R /* <: reactLib.reactMod.Reducer[_, _] */](reducer: R, initialState: reactLib.reactMod.ReducerState[R]): js.Tuple2[
    reactLib.reactMod.ReducerState[R], 
    reactLib.reactMod.Dispatch[reactLib.reactMod.ReducerAction[R]]
  ] = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  def useReducer[R /* <: reactLib.reactMod.Reducer[_, _] */, I](
    reducer: R,
    initializerArg: (I with reactLib.reactMod.ReducerState[R]) | I,
    initializer: js.Function1[
      (/* arg */ I with reactLib.reactMod.ReducerState[R]) | (/* arg */ I), 
      reactLib.reactMod.ReducerState[R]
    ]
  ): js.Tuple2[
    reactLib.reactMod.ReducerState[R], 
    reactLib.reactMod.Dispatch[reactLib.reactMod.ReducerAction[R]]
  ] = js.native
  // convenience overload for potentially undefined initialValue / call with 0 arguments
  // has a default to stop it from defaulting to {} instead
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  def useRef[T](): reactLib.reactMod.MutableRefObject[js.UndefOr[T]] = js.native
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  def useRef[T](initialValue: T): reactLib.reactMod.MutableRefObject[T] = js.native
  @JSName("useRef")
  def useRef_TRefObject[T](): reactLib.reactMod.RefObject[T] = js.native
  // convenience overload for refs given as a ref prop as they typically start with a null value
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
    * of the generic argument.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @JSName("useRef")
  def useRef_TRefObject[T](initialValue: T): reactLib.reactMod.RefObject[T] = js.native
  // convenience overload when first argument is ommitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  def useState[S](): js.Tuple2[
    js.UndefOr[S], 
    reactLib.reactMod.Dispatch[reactLib.reactMod.SetStateAction[js.UndefOr[S]]]
  ] = js.native
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  def useState[S](initialState: S): js.Tuple2[S, reactLib.reactMod.Dispatch[reactLib.reactMod.SetStateAction[S]]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, reactLib.reactMod.Dispatch[reactLib.reactMod.SetStateAction[S]]] = js.native
}

