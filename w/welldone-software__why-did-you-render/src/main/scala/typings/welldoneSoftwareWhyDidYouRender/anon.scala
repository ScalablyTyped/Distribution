package typings.welldoneSoftwareWhyDidYouRender

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.anon.Default
import typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.CFactory
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DOMFactory
import typings.react.mod.DependencyList
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.Dispatch
import typings.react.mod.DispatchWithoutAction
import typings.react.mod.EffectCallback
import typings.react.mod.ExoticComponent
import typings.react.mod.Factory
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.FunctionComponentFactory
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLFactory
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.LazyExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ProfilerProps
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactHTMLElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.Reducer
import typings.react.mod.ReducerAction
import typings.react.mod.ReducerState
import typings.react.mod.ReducerStateWithoutAction
import typings.react.mod.ReducerWithoutAction
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.SVGAttributes
import typings.react.mod.SVGFactory
import typings.react.mod.SetStateAction
import typings.react.mod.SuspenseProps
import typings.react.mod.TransitionFunction
import typings.react.mod.TransitionStartFunction
import typings.react.nextMod.reactAugmentingMod.ServerContext
import typings.react.nextMod.reactAugmentingMod.ServerContextJSONValue
import typings.react.nextMod.reactAugmentingMod.Usable
import typings.std.Element
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.SVGElement
import typings.welldoneSoftwareWhyDidYouRender.mod.WhyDidYouRenderComponentMember
import typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofChildren extends StObject {
    
    def count(children: Any): Double = js.native
    
    def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
    def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
    
    def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
    def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
    
    def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = js.native
    
    def toArray(children: js.Array[ReactNode]): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = js.native
    def toArray(children: ReactNode): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = js.native
  }
  
  trait TypeofComponent extends StObject {
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://react.dev/reference/react/Component#static-contexttype
      */
    /* static member */
    var contextType: js.UndefOr[Context[Any]] = js.undefined
    
    val whyDidYouRender: WhyDidYouRenderComponentMember
  }
  object TypeofComponent {
    
    inline def apply(whyDidYouRender: WhyDidYouRenderComponentMember): TypeofComponent = {
      val __obj = js.Dynamic.literal(whyDidYouRender = whyDidYouRender.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofComponent] (val x: Self) extends AnyVal {
      
      inline def setContextType(value: Context[Any]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
      
      inline def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = StObject.set(x, "whyDidYouRender", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofReact extends StObject {
    
    // Sync with `ReactChildren` until `ReactChildren` is removed.
    val Children: TypeofChildren = js.native
    
    // Base component for plain JS classes
    var Component: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
        typings.react.mod.Component[js.Object, js.Object, js.Object]
      ] = js.native
    
    val Fragment: ExoticComponent[typings.react.anon.Children] = js.native
    
    val JSX: Any = js.native
    
    val Profiler: ExoticComponent[ProfilerProps] = js.native
    
    var PureComponent: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
        typings.react.mod.PureComponent[js.Object, js.Object, js.Object]
      ] = js.native
    
    val StrictMode: ExoticComponent[typings.react.anon.Children] = js.native
    
    val Suspense: ExoticComponent[SuspenseProps] = js.native
    
    val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    def cache[CachedFunction /* <: js.Function */](fn: CachedFunction): CachedFunction = js.native
    
    // Custom components
    def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: ReactNode*): FunctionComponentElement[P] = js.native
    def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = js.native
    def cloneElement[P](element: ReactElement, props: Partial[P] & Attributes, children: ReactNode*): ReactElement = js.native
    def cloneElement[P](element: ReactElement, props: Unit, children: ReactNode*): ReactElement = js.native
    def cloneElement[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
    def cloneElement[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], props: Unit, children: ReactNode*): CElement[P, T] = js.native
    // DOM Element (has to be the last, because type checking stops at first overload that fits)
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = js.native
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: Unit, children: ReactNode*): DOMElement[P, T] = js.native
    // ReactHTMLElement, less specific
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = js.native
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: ReactNode*): ReactHTMLElement[T] = js.native
    // SVGElement
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = js.native
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: ReactNode*): ReactSVGElement = js.native
    // DOM Elements
    // ReactHTMLElement
    @JSName("cloneElement")
    def cloneElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
    @JSName("cloneElement")
    def cloneElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
    
    def createContext[T](
      // If you thought this should be optional, see
    // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
    defaultValue: T
    ): Context[T] = js.native
    
    def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
      children: ReactNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: Null,
      children: ReactNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: Unit,
      children: ReactNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = js.native
    // Custom components
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.a, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.abbr, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.address */ Any,
      props: ClassAttributes[T] & P,
      children: ReactNode*
    ): DetailedReactHTMLElement[P, T] = js.native
    def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.a, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.abbr, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.address */ Any,
      props: Null,
      children: ReactNode*
    ): DetailedReactHTMLElement[P, T] = js.native
    def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.a, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.abbr, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.address */ Any,
      props: Unit,
      children: ReactNode*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.animate, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.circle, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.clipPath */ Any,
      props: ClassAttributes[T] & P,
      children: ReactNode*
    ): ReactSVGElement = js.native
    @JSName("createElement")
    def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.animate, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.circle, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.clipPath */ Any,
      props: Null,
      children: ReactNode*
    ): ReactSVGElement = js.native
    @JSName("createElement")
    def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.animate, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.circle, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.clipPath */ Any,
      props: Unit,
      children: ReactNode*
    ): ReactSVGElement = js.native
    @JSName("createElement")
    def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = js.native
    // DOM Elements
    // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
    @JSName("createElement")
    def createElement_input(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
      children: ReactNode*
    ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    
    def createFactory(
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.animate, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.circle, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.clipPath */ Any
    ): SVGFactory = js.native
    def createFactory[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, ComponentState]] = js.native
    def createFactory[P](`type`: ComponentClass[P, ComponentState]): Factory[P] = js.native
    // Custom components
    def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = js.native
    def createFactory[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String): DOMFactory[P, T] = js.native
    @JSName("createFactory")
    def createFactory_PTC_CFactory[P, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C]): CFactory[P, T] = js.native
    //
    // Top Level API
    // ----------------------------------------------------------------------
    // DOM Elements
    @JSName("createFactory")
    def createFactory_T_HTMLFactory[T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.a, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.abbr, typings.welldoneSoftwareWhyDidYouRender.welldoneSoftwareWhyDidYouRenderStrings.address */ Any
    ): HTMLFactory[T] = js.native
    
    def createRef[T](): RefObject[T] = js.native
    
    def createServerContext(globalName: String, defaultValue: String): ServerContext[String] = js.native
    def createServerContext(globalName: String, defaultValue: js.Array[ServerContextJSONValue]): ServerContext[js.Array[ServerContextJSONValue]] = js.native
    def createServerContext(globalName: String, defaultValue: Boolean): ServerContext[Boolean] = js.native
    def createServerContext(globalName: String, defaultValue: Double): ServerContext[Double] = js.native
    def createServerContext(globalName: String, defaultValue: Null): ServerContext[Null] = js.native
    def createServerContext[T /* <: StringDictionary[ServerContextJSONValue] */](globalName: String, defaultValue: T): ServerContext[T] = js.native
    
    def experimental_useEffectEvent[T /* <: js.Function */](event: T): T = js.native
    
    def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = js.native
    
    def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
    def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
    
    def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = js.native
    
    def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = js.native
    def memo[T /* <: ComponentType[Any] */](
      Component: T,
      propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
    ): MemoExoticComponent[T] = js.native
    def memo[P /* <: js.Object */](Component: FunctionComponent[P]): NamedExoticComponent[P] = js.native
    def memo[P /* <: js.Object */](
      Component: FunctionComponent[P],
      propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
    ): NamedExoticComponent[P] = js.native
    
    def startTransition(scope: TransitionFunction): Unit = js.native
    
    def unstable_useCacheRefresh(): js.Function0[Unit] = js.native
    
    def use[T](usable: Usable[T]): T = js.native
    
    // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
    // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
    /**
      * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
      * has changed.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useCallback
      */
    // A specific function type would not trigger implicit any.
    // See https://github.com/DefinitelyTyped/DefinitelyTyped/issues/52873#issuecomment-845806435 for a comparison between `Function` and more specific types.
    // tslint:disable-next-line ban-types
    def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = js.native
    
    // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
    /**
      * Accepts a context object (the value returned from `React.createContext`) and returns the current
      * context value, as given by the nearest context provider for the given context.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useContext
      */
    def useContext[T](context: Context[T]): T = js.native
    
    /**
      * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
      *
      * NOTE: We don’t recommend adding debug values to every custom hook.
      * It’s most valuable for custom hooks that are part of shared libraries.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useDebugValue
      */
    // the name of the custom hook is itself derived from the function name at runtime:
    // it's just the function name without the "use" prefix.
    def useDebugValue[T](value: T): Unit = js.native
    def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = js.native
    
    def useDeferredValue[T](value: T): T = js.native
    
    /**
      * Accepts a function that contains imperative, possibly effectful code.
      *
      * @param effect Imperative function that can return a cleanup function
      * @param deps If present, effect will only activate if the values in the list change.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useEffect
      */
    def useEffect(effect: EffectCallback): Unit = js.native
    def useEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    
    def useId(): String = js.native
    
    def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = js.native
    def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = js.native
    // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
    /**
      * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
      * `ref`. As always, imperative code using refs should be avoided in most cases.
      *
      * `useImperativeHandle` should be used with `React.forwardRef`.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useImperativeHandle
      */
    def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = js.native
    def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = js.native
    
    def useInsertionEffect(effect: EffectCallback): Unit = js.native
    def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    
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
      * @see https://react.dev/reference/react/useLayoutEffect
      */
    def useLayoutEffect(effect: EffectCallback): Unit = js.native
    def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    
    /**
      * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useMemo
      */
    // allow undefined, but don't make it optional as that is very likely a mistake
    def useMemo[T](factory: js.Function0[T]): T = js.native
    def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = js.native
    
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useReducer
      */
    // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
    // The Flow types do have an overload for 3-ary invocation with undefined initializer.
    // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
    // supertype between the reducer's return type and the initialState (or the initializer's return type),
    // which would prevent autocompletion from ever working.
    // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
    // in older versions, or a regression in newer versions of the typescript completion service.
    def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useReducer
      */
    // overload where dispatch could accept 0 arguments.
    def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useReducer
      */
    // overload where dispatch could accept 0 arguments.
    // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
    // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
    // the last overload effectively behaves as if the identity function (x => x) is the initializer.
    // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
    def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
      reducer: R,
      initializerArg: (I & ReducerState[R]) | I,
      initializer: js.Function1[
          (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
          ReducerState[R] | ReducerStateWithoutAction[R]
        ]
    ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
    
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
      * @see https://react.dev/reference/react/useRef
      */
    def useRef[T](): MutableRefObject[js.UndefOr[T]] = js.native
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useRef
      */
    def useRef[T](initialValue: T): MutableRefObject[T] = js.native
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
      * @see https://react.dev/reference/react/useRef
      */
    @JSName("useRef")
    def useRef_T_RefObject[T](): RefObject[T] = js.native
    @JSName("useRef")
    def useRef_T_RefObject[T](initialValue: T): RefObject[T] = js.native
    
    // convenience overload when first argument is omitted
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useState
      */
    def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useState
      */
    def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    
    def useSyncExternalStore[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot]
    ): Snapshot = js.native
    def useSyncExternalStore[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: js.Function0[Snapshot]
    ): Snapshot = js.native
    
    def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = js.native
    
    val version: String = js.native
  }
}
