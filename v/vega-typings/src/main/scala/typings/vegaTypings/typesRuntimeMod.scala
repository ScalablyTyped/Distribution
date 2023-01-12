package typings.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Expression
import typings.estree.mod.SequenceExpression
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.RequestInit
import typings.std.TouchEvent
import typings.vegaExpression.anon.Code
import typings.vegaExpression.mod.CodegenOptions
import typings.vegaTypings.anon.Ast
import typings.vegaTypings.anon.Data
import typings.vegaTypings.anon.Fill
import typings.vegaTypings.anon.Href
import typings.vegaTypings.anon.Signals
import typings.vegaTypings.typesRuntimeDataflowMod.Changeset_
import typings.vegaTypings.typesRuntimeRendererMod.RenderModule_
import typings.vegaTypings.typesRuntimeRendererMod.Renderers
import typings.vegaTypings.typesRuntimeRuntimeMod.Runtime
import typings.vegaTypings.typesRuntimeSceneMod.Scene
import typings.vegaTypings.typesRuntimeSceneMod.SceneGroup
import typings.vegaTypings.typesRuntimeSceneMod.SceneItem
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecConfigMod.Config
import typings.vegaTypings.typesSpecDataMod.Format
import typings.vegaTypings.typesSpecEncodeMod.EncodeEntryName
import typings.vegaTypings.typesSpecMod.Spec
import typings.vegaTypings.typesSpecPaddingMod.Padding
import typings.vegaTypings.typesSpecSignalMod.SignalValue
import typings.vegaTypings.vegaTypingsBooleans.`false`
import typings.vegaTypings.vegaTypingsBooleans.`true`
import typings.vegaTypings.vegaTypingsInts.`0`
import typings.vegaTypings.vegaTypingsInts.`1`
import typings.vegaTypings.vegaTypingsStrings.DEBUG
import typings.vegaTypings.vegaTypingsStrings.ERROR
import typings.vegaTypings.vegaTypingsStrings.INFO
import typings.vegaTypings.vegaTypingsStrings.WARN
import typings.vegaTypings.vegaTypingsStrings.`axis-label`
import typings.vegaTypings.vegaTypingsStrings.`legend-label`
import typings.vegaTypings.vegaTypingsStrings.`legend-symbol`
import typings.vegaTypings.vegaTypingsStrings.arc
import typings.vegaTypings.vegaTypingsStrings.area
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.error_
import typings.vegaTypings.vegaTypingsStrings.file
import typings.vegaTypings.vegaTypingsStrings.group
import typings.vegaTypings.vegaTypingsStrings.http
import typings.vegaTypings.vegaTypingsStrings.https
import typings.vegaTypings.vegaTypingsStrings.image
import typings.vegaTypings.vegaTypingsStrings.left
import typings.vegaTypings.vegaTypingsStrings.line
import typings.vegaTypings.vegaTypingsStrings.log
import typings.vegaTypings.vegaTypingsStrings.mark
import typings.vegaTypings.vegaTypingsStrings.path
import typings.vegaTypings.vegaTypingsStrings.rect
import typings.vegaTypings.vegaTypingsStrings.right
import typings.vegaTypings.vegaTypingsStrings.symbol
import typings.vegaTypings.vegaTypingsStrings.text
import typings.vegaTypings.vegaTypingsStrings.warn_
import typings.vegaUtil.mod.AccessorFn
import typings.vegaUtil.mod.FastMap_
import typings.vegaUtil.mod.Fn
import typings.vegaUtil.mod.LoggerInterface
import typings.vegaUtil.mod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeMod {
  
  @JSImport("vega-typings/types/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "Bounds")
  @js.native
  open class Bounds ()
    extends typings.vegaTypings.typesRuntimeSceneMod.Bounds
  
  @JSImport("vega-typings/types/runtime", "CanvasHandler")
  @js.native
  open class CanvasHandler ()
    extends typings.vegaTypings.typesRuntimeRendererMod.CanvasHandler
  
  @JSImport("vega-typings/types/runtime", "Debug")
  @js.native
  val Debug: Double = js.native
  
  @JSImport("vega-typings/types/runtime", "Error")
  @js.native
  val Error_ : Double = js.native
  
  @JSImport("vega-typings/types/runtime", "Handler")
  @js.native
  open class Handler ()
    extends typings.vegaTypings.typesRuntimeRendererMod.Handler
  
  @JSImport("vega-typings/types/runtime", "Info")
  @js.native
  val Info: Double = js.native
  
  @JSImport("vega-typings/types/runtime", "None")
  @js.native
  val None: Double = js.native
  
  @JSImport("vega-typings/types/runtime", "Operator")
  @js.native
  open class Operator ()
    extends typings.vegaTypings.typesRuntimeDataflowMod.Operator {
    def this(init: Any) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any]) = this()
    def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any]) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any) = this()
    def this(init: Any, update: Unit, params: Any) = this()
    def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any) = this()
    def this(init: Unit, update: Unit, params: Any) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any, react: Boolean) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Unit, react: Boolean) = this()
    def this(init: Any, update: Unit, params: Any, react: Boolean) = this()
    def this(init: Any, update: Unit, params: Unit, react: Boolean) = this()
    def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any, react: Boolean) = this()
    def this(
      init: Unit,
      update: js.Function2[/* obj */ Any, /* pulse */ Any, Any],
      params: Unit,
      react: Boolean
    ) = this()
    def this(init: Unit, update: Unit, params: Any, react: Boolean) = this()
    def this(init: Unit, update: Unit, params: Unit, react: Boolean) = this()
  }
  
  @JSImport("vega-typings/types/runtime", "Renderer")
  @js.native
  open class Renderer protected ()
    extends typings.vegaTypings.typesRuntimeRendererMod.Renderer {
    def this(loader: Loader_) = this()
  }
  
  @JSImport("vega-typings/types/runtime", "Transform")
  @js.native
  open class Transform ()
    extends typings.vegaTypings.typesRuntimeDataflowMod.Transform {
    def this(init: Any) = this()
    def this(init: Any, params: Any) = this()
    def this(init: Unit, params: Any) = this()
  }
  
  @JSImport("vega-typings/types/runtime", "View")
  @js.native
  open class View protected () extends StObject {
    def this(runtime: Runtime) = this()
    def this(runtime: Runtime, opt: ViewOptions) = this()
    
    def addDataListener(name: String, handler: DataListenerHandler): this.type = js.native
    
    def addEventListener(`type`: String, handler: EventListenerHandler): this.type = js.native
    
    def addResizeListener(handler: ResizeHandler): this.type = js.native
    
    def addSignalListener(name: String, handler: SignalListenerHandler): this.type = js.native
    
    def background(): Color = js.native
    def background(s: Color): this.type = js.native
    
    def change(name: String, changeset: Changeset_): this.type = js.native
    
    def changeset(): Changeset_ = js.native
    
    def container(): HTMLElement | Null = js.native
    
    def data(name: String): js.Array[Any] = js.native
    def data(name: String, tuples: Any): this.type = js.native
    
    def description(): String = js.native
    def description(s: String): this.type = js.native
    
    def dirty(item: Any): Unit = js.native
    
    // Event Handling
    def events(source: Any, `type`: Any): Any = js.native
    def events(source: Any, `type`: Any, filter: js.Function1[/* _ */ Any, Boolean]): Any = js.native
    
    def getState(): Signals = js.native
    def getState(options: Data): Signals = js.native
    
    def globalCursor(flag: Boolean): Any = js.native
    
    def height(): Double = js.native
    def height(h: Double): this.type = js.native
    
    def hover(): this.type = js.native
    def hover(hoverSet: Unit, leaveSet: EncodeEntryName): this.type = js.native
    def hover(hoverSet: EncodeEntryName): this.type = js.native
    def hover(hoverSet: EncodeEntryName, leaveSet: EncodeEntryName): this.type = js.native
    
    // View Configuration
    def initialize(): this.type = js.native
    def initialize(container: String): this.type = js.native
    def initialize(container: String, bindContainer: String): this.type = js.native
    def initialize(container: String, bindContainer: Element): this.type = js.native
    def initialize(container: Unit, bindContainer: String): this.type = js.native
    def initialize(container: Unit, bindContainer: Element): this.type = js.native
    def initialize(container: Element): this.type = js.native
    def initialize(container: Element, bindContainer: String): this.type = js.native
    def initialize(container: Element, bindContainer: Element): this.type = js.native
    
    def insert(name: String, tuples: Any): this.type = js.native
    
    def loader(): Loader_ = js.native
    def loader(loader: Loader_): this.type = js.native
    
    def locale(): LocaleFormatters = js.native
    // Undocumented (https://github.com/vega/vega/issues/2844, https://github.com/vega/vega/issues/2845)
    def locale(locale: LocaleFormatters): this.type = js.native
    
    def logLevel(): Double = js.native
    def logLevel(level: Double): this.type = js.native
    
    def logger(): LoggerInterface = js.native
    def logger(logger: LoggerInterface): this.type = js.native
    
    def origin(): js.Tuple2[Double, Double] = js.native
    
    def padding(): Padding = js.native
    def padding(p: Padding): this.type = js.native
    
    def preventDefault(flag: Boolean): Unit = js.native
    
    def remove(name: String, tuples: Any): this.type = js.native
    
    def removeDataListener(name: String, handler: DataListenerHandler): this.type = js.native
    
    def removeEventListener(`type`: String, handler: EventListenerHandler): this.type = js.native
    
    def removeResizeListener(handler: ResizeHandler): this.type = js.native
    
    def removeSignalListener(name: String, handler: SignalListenerHandler): this.type = js.native
    
    def renderer(): Renderers = js.native
    def renderer(renderer: Renderers): this.type = js.native
    
    def resize(): this.type = js.native
    
    def run(): this.type = js.native
    def run(encode: String): this.type = js.native
    
    def runAfter(callback: js.Function1[/* view */ this.type, Unit]): this.type = js.native
    def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean): this.type = js.native
    def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean, priority: Double): this.type = js.native
    def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Unit, priority: Double): this.type = js.native
    
    // Dataflow and Rendering
    def runAsync(): js.Promise[View] = js.native
    
    // Data and Scales
    def scale(name: String): Any = js.native
    
    def scenegraph(): Scene = js.native
    
    def setState(state: Signals): this.type = js.native
    
    def signal(name: String): SignalValue = js.native
    // Signals
    def signal(name: String, value: SignalValue): this.type = js.native
    
    // Image Export
    def toCanvas(): js.Promise[HTMLCanvasElement] = js.native
    def toCanvas(scaleFactor: Double): js.Promise[HTMLCanvasElement] = js.native
    def toCanvas(scaleFactor: Double, options: ToCanvasOptions): js.Promise[HTMLCanvasElement] = js.native
    def toCanvas(scaleFactor: Unit, options: ToCanvasOptions): js.Promise[HTMLCanvasElement] = js.native
    
    def toImageURL(`type`: String): js.Promise[String] = js.native
    def toImageURL(`type`: String, scaleFactor: Double): js.Promise[String] = js.native
    
    def toSVG(): js.Promise[String] = js.native
    def toSVG(scaleFactor: Double): js.Promise[String] = js.native
    
    def tooltip(handler: TooltipHandler): this.type = js.native
    
    def width(): Double = js.native
    def width(w: Double): this.type = js.native
  }
  
  @JSImport("vega-typings/types/runtime", "Warn")
  @js.native
  val Warn: Double = js.native
  
  inline def accessor[R](fn: Fn[R]): AccessorFn[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[R]]
  inline def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  inline def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  inline def accessor[R](fn: Fn[R], fields: Unit, name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  
  inline def accessorFields(fn: AccessorFn[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorFields")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def accessorName(fn: AccessorFn[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def array[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def array[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def ascending(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def changeset(): Changeset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("changeset")().asInstanceOf[Changeset_]
  
  inline def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampRange")(range.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def codegenExpression(options: CodegenOptions): js.Function1[/* ast */ Any, Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("codegenExpression")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ast */ Any, Code]]
  
  inline def compare(fields: String): js.Function2[/* a */ Any, /* b */ Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: String, orders: Order): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[Any] | String]): js.Function2[/* a */ Any, /* b */ Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[Any] | String], orders: js.Array[Order]): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[Any] | String], orders: Order): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: AccessorFn[Any]): js.Function2[/* a */ Any, /* b */ Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: AccessorFn[Any], orders: js.Array[Order]): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  inline def compare(fields: AccessorFn[Any], orders: Order): js.Function2[/* a */ Any, /* b */ Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Double]]
  
  inline def constant[V](v: V): js.Function0[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[V]]
  
  inline def debounce[F /* <: js.Function */](delay: Double, func: F): F = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(delay.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[F]
  
  inline def error(msg: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def expressionFunction(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def expressionFunction(name: String, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def expressionFunction(name: String, fn: Any, visitor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def expressionFunction(name: String, fn: Unit, visitor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def extend[T](target: T, source: Partial[T]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(target.asInstanceOf[js.Any]).`++`(source.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
  
  inline def extent(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def extent(array: js.Array[Double], accessor: AccessorFn[Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def extentIndex(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def extentIndex(array: js.Array[Double], accessor: AccessorFn[Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def falsy(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("falsy")().asInstanceOf[`false`]
  
  inline def fastmap(): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")().asInstanceOf[FastMap_]
  inline def fastmap(_underscore: js.Object): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")(_underscore.asInstanceOf[js.Any]).asInstanceOf[FastMap_]
  
  inline def field(field: String): AccessorFn[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[Any]]
  inline def field(field: String, name: String): AccessorFn[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[Any]]
  
  inline def flush[T /* <: Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(range.asInstanceOf[js.Any], value.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def formatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def id(_underscore: js.Object): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  
  inline def identity[V](v: V): V = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[V]
  
  inline def inferType(values: js.Array[Any]): TypeInference = ^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any]).asInstanceOf[TypeInference]
  inline def inferType(values: js.Array[Any], field: String): TypeInference = (^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TypeInference]
  
  inline def inferTypes(values: js.Array[Any], fields: js.Array[String]): StringDictionary[TypeInference] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferTypes")(values.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TypeInference]]
  
  inline def ingest(datum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ingest")(datum.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[C & P]
  inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[C & P]
  
  inline def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inrange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  inline def isArray[T](a: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isBoolean(a: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(a: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction(a: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isIterable(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(a: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(a: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(a.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isRegExp(a: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isTuple(t: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuple")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  inline def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any], flat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  
  inline def lerp(array: js.Array[Double], fraction: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(array.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def loader(): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")().asInstanceOf[Loader_]
  inline def loader(opt: LoaderOptions): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")(opt.asInstanceOf[js.Any]).asInstanceOf[Loader_]
  
  inline def log(
    method: error_ | warn_ | typings.vegaTypings.vegaTypingsStrings.log,
    level: ERROR | WARN | INFO | DEBUG,
    input: js.Array[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(method.asInstanceOf[js.Any], level.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logger(): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")().asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Double): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any]).asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Double, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  inline def logger(
    _underscore: Double,
    method: String,
    handler: js.Function3[
      /* method */ error_ | warn_ | log, 
      /* level */ ERROR | WARN | INFO | DEBUG, 
      /* input */ js.Array[Any], 
      Unit
    ]
  ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  inline def logger(
    _underscore: Double,
    method: Unit,
    handler: js.Function3[
      /* method */ error_ | warn_ | log, 
      /* level */ ERROR | WARN | INFO | DEBUG, 
      /* input */ js.Array[Any], 
      Unit
    ]
  ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Unit, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  inline def logger(
    _underscore: Unit,
    method: String,
    handler: js.Function3[
      /* method */ error_ | warn_ | log, 
      /* level */ ERROR | WARN | INFO | DEBUG, 
      /* input */ js.Array[Any], 
      Unit
    ]
  ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  inline def logger(
    _underscore: Unit,
    method: Unit,
    handler: js.Function3[
      /* method */ error_ | warn_ | log, 
      /* level */ ERROR | WARN | INFO | DEBUG, 
      /* input */ js.Array[Any], 
      Unit
    ]
  ): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  
  inline def merge(
    compare: js.Function2[/* a */ Any, /* b */ Any, Double],
    array1: js.Array[Any],
    array2: js.Array[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def merge(
    compare: js.Function2[/* a */ Any, /* b */ Any, Double],
    array1: js.Array[Any],
    array2: js.Array[Any],
    output: js.Array[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeConfig[C /* <: js.Object */](c: C*): C = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(c.asInstanceOf[Seq[js.Any]]*).asInstanceOf[C]
  
  inline def merge_Array(
    compare: js.Function2[/* a */ Any, /* b */ Any, Double],
    array1: js.Array[Any],
    array2: js.Array[Any]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def one(): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[`1`]
  
  inline def pad(str: String, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad(str: String, len: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad(str: String, len: Double, char: String, align: left | center | right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad(str: String, len: Double, char: Unit, align: left | center | right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLinear")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panPow")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panSymlog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def parse(spec: Spec): Runtime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any]).asInstanceOf[Runtime]
  inline def parse(spec: Spec, config: Unit, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  inline def parse(spec: Spec, config: Config): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  inline def parse(spec: Spec, config: Config, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  
  inline def parseExpression(expression: String): Expression | SequenceExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[Expression | SequenceExpression]
  
  inline def parseSelector(selectorName: String, source: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selectorName.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def peek(array: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def projection(`type`: String, projection: Any): View = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(`type`.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[View]
  
  inline def quarter(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def quarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def read(data: String, schema: Format): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, js.Date]): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], dateParse.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  inline def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("renderModule")(moduleName.asInstanceOf[js.Any], renderModule.asInstanceOf[js.Any])).asInstanceOf[RenderModule_]
  
  inline def repeat(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def scale(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def scale(`type`: String, scale: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scheme(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def scheme(name: String, scheme: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def schemeDiscretized(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def schemeDiscretized(name: String, scheme: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def schemeDiscretized(name: String, scheme: Any, interpolator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def schemeDiscretized(name: String, scheme: Unit, interpolator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def span(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def splitAccessPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAccessPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringValue(a: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringValue")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def timeFormatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toBoolean(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toDate(a: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toDate(a: Any, parser: js.Function1[/* _ */ Any, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toNumber(a: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toSet[T](array: js.Array[T]): StringDictionary[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSet")(array.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[`true`]]
  
  inline def toString_(a: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def truncate(a: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate(a: String, length: Double, align: left | center | right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate(a: String, length: Double, align: left | center | right, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate(a: String, length: Double, align: Unit, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truthy(): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")().asInstanceOf[`true`]
  
  inline def tupleid(t: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleid")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def utcquarter(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def utcquarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("vega-typings/types/runtime", "version")
  @js.native
  val version: String = js.native
  
  inline def visitArray(
    array: js.Array[Any],
    filter: js.Function1[/* any */ Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ Any, /* i */ Double, /* arr */ js.Array[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visitArray(
    array: Unit,
    filter: js.Function1[/* any */ Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ Any, /* i */ Double, /* arr */ js.Array[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: Any, recurse: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: Any, recurse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zero(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[`0`]
  
  inline def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  type DataListenerHandler = js.Function2[/* name */ String, /* value */ Any, Unit]
  
  trait DefineMark[T /* <: String */, I, R /* <: String */] extends StObject {
    
    var group: Any
    
    var items: js.Array[Item[I]]
    
    var marktype: T
    
    var role: mark | R
  }
  object DefineMark {
    
    inline def apply[T /* <: String */, I, R /* <: String */](group: Any, items: js.Array[Item[I]], marktype: T, role: mark | R): DefineMark[T, I, R] = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineMark[T, I, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefineMark[?, ?, ?], T /* <: String */, I, R /* <: String */] (val x: Self & (DefineMark[T, I, R])) extends AnyVal {
      
      inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Item[I]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item[I]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMarktype(value: T): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      inline def setRole(value: mark | R): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  type EventListenerHandler = js.Function2[/* event */ ScenegraphEvent, /* item */ js.UndefOr[Item[Any] | Null], Unit]
  
  trait Item[T] extends StObject {
    
    /**
      * The underlying data element to which this item corresponds.
      */
    var datum: T
    
    /**
      * The mark to which this item belongs.
      */
    var mark: RuntimeMark
  }
  object Item {
    
    inline def apply[T](datum: T, mark: RuntimeMark): Item[T] = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item[?], T] (val x: Self & Item[T]) extends AnyVal {
      
      inline def setDatum(value: T): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setMark(value: RuntimeMark): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoaderOptions extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var defaultProtocol: js.UndefOr[http | https | String] = js.undefined
    
    var http: js.UndefOr[RequestInit] = js.undefined
    
    var mode: js.UndefOr[file | http] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object LoaderOptions {
    
    inline def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setDefaultProtocol(value: http | https | String): Self = StObject.set(x, "defaultProtocol", value.asInstanceOf[js.Any])
      
      inline def setDefaultProtocolUndefined: Self = StObject.set(x, "defaultProtocol", js.undefined)
      
      inline def setHttp(value: RequestInit): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setMode(value: file | http): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait Loader_ extends StObject {
    
    def file(filename: String): js.Promise[String] = js.native
    
    def http(uri: String, options: Any): js.Promise[String] = js.native
    
    def load(uri: String): js.Promise[String] = js.native
    def load(uri: String, options: Any): js.Promise[String] = js.native
    
    def sanitize(uri: String, options: Any): js.Promise[Href] = js.native
  }
  
  trait LocaleFormatters extends StObject {
    
    def format(spec: String): NumberFormat
    
    def formatFloat(spec: String): NumberFormat
    
    def formatPrefix(spec: String, value: Double): NumberFormat
    
    def formatSpan(start: Double, stop: Double, count: Double, spec: String): NumberFormat
    
    def timeFormat(spec: String): TimeFormat
    
    def timeParse(spec: String): TimeParse
    
    def utcFormat(spec: String): TimeFormat
    
    def utcParse(spec: String): TimeParse
  }
  object LocaleFormatters {
    
    inline def apply(
      format: String => NumberFormat,
      formatFloat: String => NumberFormat,
      formatPrefix: (String, Double) => NumberFormat,
      formatSpan: (Double, Double, Double, String) => NumberFormat,
      timeFormat: String => TimeFormat,
      timeParse: String => TimeParse,
      utcFormat: String => TimeFormat,
      utcParse: String => TimeParse
    ): LocaleFormatters = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatFloat = js.Any.fromFunction1(formatFloat), formatPrefix = js.Any.fromFunction2(formatPrefix), formatSpan = js.Any.fromFunction4(formatSpan), timeFormat = js.Any.fromFunction1(timeFormat), timeParse = js.Any.fromFunction1(timeParse), utcFormat = js.Any.fromFunction1(utcFormat), utcParse = js.Any.fromFunction1(utcParse))
      __obj.asInstanceOf[LocaleFormatters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleFormatters] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String => NumberFormat): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatFloat(value: String => NumberFormat): Self = StObject.set(x, "formatFloat", js.Any.fromFunction1(value))
      
      inline def setFormatPrefix(value: (String, Double) => NumberFormat): Self = StObject.set(x, "formatPrefix", js.Any.fromFunction2(value))
      
      inline def setFormatSpan(value: (Double, Double, Double, String) => NumberFormat): Self = StObject.set(x, "formatSpan", js.Any.fromFunction4(value))
      
      inline def setTimeFormat(value: String => TimeFormat): Self = StObject.set(x, "timeFormat", js.Any.fromFunction1(value))
      
      inline def setTimeParse(value: String => TimeParse): Self = StObject.set(x, "timeParse", js.Any.fromFunction1(value))
      
      inline def setUtcFormat(value: String => TimeFormat): Self = StObject.set(x, "utcFormat", js.Any.fromFunction1(value))
      
      inline def setUtcParse(value: String => TimeParse): Self = StObject.set(x, "utcParse", js.Any.fromFunction1(value))
    }
  }
  
  type NumberFormat = js.Function1[/* number */ Double, String]
  
  type ResizeHandler = js.Function2[/* width */ Double, /* height */ Double, Unit]
  
  type RuntimeMark = DefineMark[
    group | rect | symbol | path | arc | area | line | image | text, 
    Fill | js.Object, 
    `legend-symbol` | `axis-label` | `legend-label` | scala.Nothing
  ]
  
  type ScenegraphEvent = MouseEvent | TouchEvent | KeyboardEvent
  
  type SignalListenerHandler = js.Function2[/* name */ String, /* value */ SignalValue, Unit]
  
  type TimeFormat = js.Function1[/* date */ js.Date | Double, String]
  
  type TimeParse = js.Function1[/* dateString */ String, js.Date]
  
  trait ToCanvasOptions extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var externalContext: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToCanvasOptions {
    
    inline def apply(): ToCanvasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToCanvasOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToCanvasOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setExternalContext(value: Any): Self = StObject.set(x, "externalContext", value.asInstanceOf[js.Any])
      
      inline def setExternalContextUndefined: Self = StObject.set(x, "externalContext", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type TooltipHandler = js.Function4[/* handler */ Any, /* event */ MouseEvent, /* item */ Item[Any], /* value */ Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.typesSpecDataMod.DataType
    - typings.vegaTypings.vegaTypingsStrings.integer
  */
  trait TypeInference extends StObject
  
  trait ViewOptions extends StObject {
    
    var background: js.UndefOr[Color] = js.undefined
    
    var bind: js.UndefOr[Element | String] = js.undefined
    
    var container: js.UndefOr[Element | String] = js.undefined
    
    var expr: js.UndefOr[Any] = js.undefined
    
    var hover: js.UndefOr[Boolean] = js.undefined
    
    var loader: js.UndefOr[Loader_] = js.undefined
    
    var locale: js.UndefOr[LocaleFormatters] = js.undefined
    
    var logLevel: js.UndefOr[Double] = js.undefined
    
    var logger: js.UndefOr[LoggerInterface] = js.undefined
    
    var renderer: js.UndefOr[Renderers] = js.undefined
    
    var tooltip: js.UndefOr[TooltipHandler] = js.undefined
  }
  object ViewOptions {
    
    inline def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBind(value: Element | String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setExpr(value: Any): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setLoader(value: Loader_): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLocale(value: LocaleFormatters): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogger(value: LoggerInterface): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRenderer(value: Renderers): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setTooltip(value: (/* handler */ Any, /* event */ MouseEvent, /* item */ Item[Any], /* value */ Any) => Unit): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
