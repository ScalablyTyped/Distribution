package typings.wordpressElement

import typings.react.anon.Children
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
import typings.react.mod.SVGAttributes
import typings.react.mod.SetStateAction
import typings.react.mod.SuspenseProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.TransitionFunction
import typings.react.mod.TransitionStartFunction
import typings.std.Element
import typings.std.Event
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.SVGElement
import typings.wordpressElement.wordpressElementStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReactMod {
  
  @JSImport("@wordpress/element/build-types/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Sync with `ReactChildren` until `ReactChildren` is removed.
  object Children {
    
    @JSImport("@wordpress/element/build-types/react", "Children")
    @js.native
    val ^ : js.Any = js.native
    
    inline def count(children: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(children.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
    inline def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
    
    inline def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(children.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any]
    
    inline def toArray(children: js.Array[ReactNode]): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]]]
    inline def toArray(children: ReactNode): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]]]
  }
  
  // Base component for plain JS classes
  @JSImport("@wordpress/element/build-types/react", "Component")
  @js.native
  open class Component[P, S, SS] protected ()
    extends typings.react.mod.Component[P, S, SS] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
  }
  object Component {
    
    @JSImport("@wordpress/element/build-types/react", "Component")
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
      * @see https://react.dev/reference/react/Component#static-contexttype
      */
    /* static member */
    @JSImport("@wordpress/element/build-types/react", "Component.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/element/build-types/react", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  @JSImport("@wordpress/element/build-types/react", "StrictMode")
  @js.native
  val StrictMode: ExoticComponent[Children] = js.native
  
  @JSImport("@wordpress/element/build-types/react", "Suspense")
  @js.native
  val Suspense: ExoticComponent[SuspenseProps] = js.native
  
  // Custom components
  inline def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def cloneElement[P](element: ReactElement, props: Partial[P] & Attributes, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def cloneElement[P](element: ReactElement, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, Any] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def cloneElement[P, T /* <: typings.react.mod.Component[P, ComponentState, Any] */](element: CElement[P, T], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  // DOM Elements
  // ReactHTMLElement
  inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  // SVGElement
  inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  
  // ReactHTMLElement, less specific
  inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
  inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
  
  inline def concatChildren(childrenArguments: (Any | Null)*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatChildren")(childrenArguments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
  
  inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Unit,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  // Custom components
  inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.wordpressElement.wordpressElementStrings.a, typings.wordpressElement.wordpressElementStrings.abbr, typings.wordpressElement.wordpressElementStrings.address */ Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.wordpressElement.wordpressElementStrings.a, typings.wordpressElement.wordpressElementStrings.abbr, typings.wordpressElement.wordpressElementStrings.address */ Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117, starting with typings.wordpressElement.wordpressElementStrings.a, typings.wordpressElement.wordpressElementStrings.abbr, typings.wordpressElement.wordpressElementStrings.address */ Any,
    props: Unit,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: typings.react.mod.Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  
  inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
  
  inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.wordpressElement.wordpressElementStrings.animate, typings.wordpressElement.wordpressElementStrings.circle, typings.wordpressElement.wordpressElementStrings.clipPath */ Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.wordpressElement.wordpressElementStrings.animate, typings.wordpressElement.wordpressElementStrings.circle, typings.wordpressElement.wordpressElementStrings.clipPath */ Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.wordpressElement.wordpressElementStrings.animate, typings.wordpressElement.wordpressElementStrings.circle, typings.wordpressElement.wordpressElementStrings.clipPath */ Any,
    props: Unit,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  
  inline def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  inline def createElement_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
  
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  inline def createElement_input(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def createElement_input(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  
  inline def createRef[T](): typings.react.mod.RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typings.react.mod.RefObject[T]]
  
  inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]
  
  inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
  inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]
  
  inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
  inline def memo[T /* <: ComponentType[Any] */](
    Component: T,
    propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
  ): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
  inline def memo[P /* <: js.Object */](Component: FunctionComponent[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
  inline def memo[P /* <: js.Object */](
    Component: FunctionComponent[P],
    propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
  ): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]
  
  inline def startTransition(scope: TransitionFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def switchChildrenNodeName(children: Any, nodeName: String): Any | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchChildrenNodeName")(children.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Any | Null]
  inline def switchChildrenNodeName(children: Null, nodeName: String): Any | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchChildrenNodeName")(children.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Any | Null]
  
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
  inline def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useContext
    */
  inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useEffect
    */
  inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  
  inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useInsertionEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useMemo
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
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
  inline def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
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
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  // overload where dispatch could accept 0 arguments.
  inline def useReducer[R /* <: Reducer[Any, Any] */, I](
    reducer: R,
    initializerArg: (I & ReducerState[R]) | I,
    initializer: js.Function1[
      (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
      ReducerState[R] | ReducerStateWithoutAction[R]
    ]
  ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
  
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
  inline def useRef[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
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
  inline def useRef[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
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
  inline def useRef_T_RefObject[T](): typings.react.mod.RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typings.react.mod.RefObject[T]]
  inline def useRef_T_RefObject[T](initialValue: T): typings.react.mod.RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.RefObject[T]]
  
  // convenience overload when first argument is omitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useState
    */
  inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useState
    */
  inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useSyncExternalStore[Snapshot](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot]
  ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
  inline def useSyncExternalStore[Snapshot](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: js.Function0[Snapshot]
  ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
  
  inline def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[Boolean, TransitionStartFunction]]
  
  type RefObject[T] = typings.react.mod.RefObject[T]
  
  type WPComponent = ComponentType[js.Object]
  
  type WPElement = ReactElement
  
  type WPSyntheticEvent = SyntheticEvent[Element, Event]
}
