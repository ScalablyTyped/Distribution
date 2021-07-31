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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@wordpress/element", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/element", "Platform.OS")
    @js.native
    val OS: String = js.native
    
    @scala.inline
    def select(spec: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def RawHTML(hasChildrenProps: childrenstringPickDetaile): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RawHTML")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
  @scala.inline
  def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](element: ReactElement, props: Partial[P] & Attributes, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def cloneElement[P](element: ReactElement, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  @scala.inline
  def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */](element: CElement[P, T], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  @scala.inline
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](element: DOMElement[P, T], props: DOMAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  @scala.inline
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](element: DOMElement[P, T], props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  // DOM Elements
  // ReactHTMLElement
  @scala.inline
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  @scala.inline
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  // SVGElement
  @scala.inline
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  @scala.inline
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  
  // ReactHTMLElement, less specific
  @scala.inline
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactHTMLElement[T]]
  @scala.inline
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactHTMLElement[T]]
  
  @scala.inline
  def concatChildren(childrenArguments: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatChildren")(childrenArguments.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
  
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Unit,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  // Custom components
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  @scala.inline
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  @scala.inline
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  @scala.inline
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  
  @scala.inline
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  @scala.inline
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @scala.inline
  def createElement_input(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  @scala.inline
  def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  @scala.inline
  def createElement_input(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  
  @scala.inline
  def createInterpolateElement(interpolatedString: String, conversionMap: js.Any): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterpolateElement")(interpolatedString.asInstanceOf[js.Any], conversionMap.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @scala.inline
  def createPortal(children: ReactNode, container: typings.std.Element): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  @scala.inline
  def createPortal(children: ReactNode, container: typings.std.Element, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  
  @scala.inline
  def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
  
  @scala.inline
  def findDOMNode(): typings.std.Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")().asInstanceOf[typings.std.Element | Null | Text]
  @scala.inline
  def findDOMNode(instance: ReactInstance): typings.std.Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element | Null | Text]
  
  @scala.inline
  def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]
  
  @scala.inline
  def isEmptyElement(element: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
  @scala.inline
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  @scala.inline
  def `lazy`[T /* <: ComponentType[js.Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]
  
  @scala.inline
  def memo[T /* <: ComponentType[js.Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
  @scala.inline
  def memo[T /* <: ComponentType[js.Any] */](
    Component: T,
    propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
  ): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
  @scala.inline
  def memo[P /* <: js.Object */](Component: SFC[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
  @scala.inline
  def memo[P /* <: js.Object */](
    Component: SFC[P],
    propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
  ): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]
  
  @JSImport("@wordpress/element", "render")
  @js.native
  val render: Renderer = js.native
  
  @scala.inline
  def renderToString(element: ReactNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def renderToString(element: ReactNode, context: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderToString(element: ReactNode, context: js.Any, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def renderToString(element: ReactNode, context: Unit, legacyContext: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any], context.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def switchChildrenNodeName(children: js.Any, nodeName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("switchChildrenNodeName")(children.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def unmountComponentAtNode(container: typings.std.Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  @scala.inline
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  @scala.inline
  def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  @scala.inline
  def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  @scala.inline
  def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  @scala.inline
  def useReducer[R /* <: ReducerWithoutAction[js.Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
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
  @scala.inline
  def useReducer[R /* <: ReducerWithoutAction[js.Any] */, I](
    reducer: R,
    initializerArg: I,
    initializer: js.Function1[/* arg */ I, ReducerStateWithoutAction[R]]
  ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
  
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
  @scala.inline
  def useReducer_R_ReducerAnyAny[R /* <: Reducer[js.Any, js.Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
  
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
  @scala.inline
  def useReducer_R_ReducerAnyAnyI[R /* <: Reducer[js.Any, js.Any] */, I](
    reducer: R,
    initializerArg: (I & ReducerState[R]) | I,
    initializer: js.Function1[(/* arg */ I & ReducerState[R]) | (/* arg */ I), ReducerState[R]]
  ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
  
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
  @scala.inline
  def useRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefObject[T]]
  @scala.inline
  def useRef[T](initialValue: T): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]
  
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
  @scala.inline
  def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
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
  @scala.inline
  def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  // convenience overload when first argument is omitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @scala.inline
  def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @scala.inline
  def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  @scala.inline
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
}
