package typings.wordpressElement

import typings.react.anon.Default
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DependencyList
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.Dispatch
import typings.react.mod.DispatchWithoutAction
import typings.react.mod.EffectCallback
import typings.react.mod.ExoticComponent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.LazyExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactHTMLElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.react.mod.ReactSVGElement
import typings.react.mod.Reducer
import typings.react.mod.ReducerAction
import typings.react.mod.ReducerState
import typings.react.mod.ReducerStateWithoutAction
import typings.react.mod.ReducerWithoutAction
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.react.mod.SetStateAction
import typings.react.mod.SuspenseProps
import typings.react.mod.global.JSX.Element
import typings.reactDom.mod.Renderer
import typings.std.DocumentFragment
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.SVGElement
import typings.std.Text
import typings.wordpressElement.anon.childrenstringPickDetaile
import typings.wordpressElement.wordpressElementStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/element", "Children")
  @js.native
  val Children: ReactChildren = js.native
  
  // Base component for plain JS classes
  @JSImport("@wordpress/element", "Component")
  @js.native
  class Component[P, S, SS] protected ()
    extends typings.wordpressElement.reactMod.Component[P, S, SS] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  object Component {
    
    @JSImport("@wordpress/element", "Component")
    @js.native
    val ^ : js.Any = js.native
    
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
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    /* static member */
    @JSImport("@wordpress/element", "Component.contextType")
    @js.native
    def contextType: js.UndefOr[Context[js.Any]] = js.native
    @scala.inline
    def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/element", "Fragment")
  @js.native
  val Fragment: ExoticComponent[typings.react.anon.Children] = js.native
  
  object Platform {
    
    @JSImport("@wordpress/element", "Platform.OS")
    @js.native
    val OS: String = js.native
    
    @JSImport("@wordpress/element", "Platform.select")
    @js.native
    def select(spec: js.Any): js.Any = js.native
  }
  
  @JSImport("@wordpress/element", "RawHTML")
  @js.native
  def RawHTML(hasChildrenProps: childrenstringPickDetaile): Element = js.native
  
  @JSImport("@wordpress/element", "StrictMode")
  @js.native
  val StrictMode: ExoticComponent[typings.react.anon.Children] = js.native
  
  /**
    * This feature is not yet available for server-side rendering.
    * Suspense support will be added in a later release.
    */
  @JSImport("@wordpress/element", "Suspense")
  @js.native
  val Suspense: ExoticComponent[SuspenseProps] = js.native
  
  // Custom components
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](element: FunctionComponentElement[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](element: ReactElement, props: Partial[P] with Attributes, children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](element: ReactElement, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, _] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, _] */](element: CElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](element: DOMElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
  // DOM Elements
  // ReactHTMLElement
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactSVGElement = js.native
  // ReactHTMLElement, less specific
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactHTMLElement[T] = js.native
  
  @JSImport("@wordpress/element", "concatChildren")
  @js.native
  def concatChildren(childrenArguments: js.Any*): js.Array[_] = js.native
  
  @JSImport("@wordpress/element", "createContext")
  @js.native
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): Context[T] = js.native
  
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
  // Custom components
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = js.native
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_input(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_input(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  
  @JSImport("@wordpress/element", "createInterpolateElement")
  @js.native
  def createInterpolateElement(interpolatedString: String, conversionMap: js.Any): ReactElement = js.native
  
  @JSImport("@wordpress/element", "createPortal")
  @js.native
  def createPortal(children: ReactNode, container: typings.std.Element): ReactPortal = js.native
  @JSImport("@wordpress/element", "createPortal")
  @js.native
  def createPortal(children: ReactNode, container: typings.std.Element, key: String): ReactPortal = js.native
  
  @JSImport("@wordpress/element", "createRef")
  @js.native
  def createRef[T](): RefObject[T] = js.native
  
  @JSImport("@wordpress/element", "findDOMNode")
  @js.native
  def findDOMNode(): typings.std.Element | Null | Text = js.native
  @JSImport("@wordpress/element", "findDOMNode")
  @js.native
  def findDOMNode(instance: ReactInstance): typings.std.Element | Null | Text = js.native
  
  @JSImport("@wordpress/element", "forwardRef")
  @js.native
  def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]] = js.native
  
  @JSImport("@wordpress/element", "isEmptyElement")
  @js.native
  def isEmptyElement(element: js.Any): Boolean = js.native
  
  @JSImport("@wordpress/element", "isValidElement")
  @js.native
  def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
  @JSImport("@wordpress/element", "isValidElement")
  @js.native
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[T /* <: ComponentType[_] */](Component: T): MemoExoticComponent[T] = js.native
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[T /* <: ComponentType[_] */](
    Component: T,
    propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
  ): MemoExoticComponent[T] = js.native
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[P /* <: js.Object */](Component: SFC[P]): NamedExoticComponent[P] = js.native
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[P /* <: js.Object */](
    Component: SFC[P],
    propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
  ): NamedExoticComponent[P] = js.native
  
  @JSImport("@wordpress/element", "render")
  @js.native
  val render: Renderer = js.native
  
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactNode): String = js.native
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactNode, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactNode, context: js.Any): String = js.native
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactNode, context: js.Any, legacyContext: js.Any): String = js.native
  
  @JSImport("@wordpress/element", "switchChildrenNodeName")
  @js.native
  def switchChildrenNodeName(children: js.Any, nodeName: String): js.Any = js.native
  
  @JSImport("@wordpress/element", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  @JSImport("@wordpress/element", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: typings.std.Element): Boolean = js.native
  
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
  @JSImport("@wordpress/element", "useCallback")
  @js.native
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: DependencyList): T = js.native
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  @JSImport("@wordpress/element", "useContext")
  @js.native
  def useContext[T](context: Context[T]): T = js.native
  
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
  @JSImport("@wordpress/element", "useDebugValue")
  @js.native
  def useDebugValue[T](value: T): Unit = js.native
  @JSImport("@wordpress/element", "useDebugValue")
  @js.native
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): Unit = js.native
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  @JSImport("@wordpress/element", "useEffect")
  @js.native
  def useEffect(effect: EffectCallback): Unit = js.native
  @JSImport("@wordpress/element", "useEffect")
  @js.native
  def useEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
  
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
  @JSImport("@wordpress/element", "useImperativeHandle")
  @js.native
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R]): Unit = js.native
  @JSImport("@wordpress/element", "useImperativeHandle")
  @js.native
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R], deps: DependencyList): Unit = js.native
  
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
  @JSImport("@wordpress/element", "useLayoutEffect")
  @js.native
  def useLayoutEffect(effect: EffectCallback): Unit = js.native
  @JSImport("@wordpress/element", "useLayoutEffect")
  @js.native
  def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
  
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
  @JSImport("@wordpress/element", "useMemo")
  @js.native
  def useMemo[T](factory: js.Function0[T]): T = js.native
  @JSImport("@wordpress/element", "useMemo")
  @js.native
  def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = js.native
  
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
  // overload where dispatch could accept 0 arguments.
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer[R /* <: ReducerWithoutAction[_] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
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
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer[R /* <: Reducer[_, _] */, I](
    reducer: R,
    initializerArg: (I with ReducerState[R]) | I,
    initializer: js.Function1[(/* arg */ I with ReducerState[R]) | (/* arg */ I), ReducerState[R]]
  ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
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
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer_R_ReducerWildcardWildcard[R /* <: Reducer[_, _] */](reducer: R, initialState: ReducerState[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
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
  // overload where dispatch could accept 0 arguments.
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer_R_ReducerWithoutActionWildcardI[R /* <: ReducerWithoutAction[_] */, I](
    reducer: R,
    initializerArg: I,
    initializer: js.Function1[/* arg */ I, ReducerStateWithoutAction[R]]
  ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
  
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
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef[T](): RefObject[T] = js.native
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef[T](initialValue: T): RefObject[T] = js.native
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
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = js.native
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
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = js.native
  
  // convenience overload when first argument is omitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @JSImport("@wordpress/element", "useState")
  @js.native
  def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @JSImport("@wordpress/element", "useState")
  @js.native
  def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  @JSImport("@wordpress/element", "useState")
  @js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  
  @JSImport("@wordpress/element", "lazy")
  @js.native
  def `lazy`[T /* <: ComponentType[_] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = js.native
}
