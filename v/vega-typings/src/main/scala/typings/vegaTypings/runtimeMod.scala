package typings.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Element
import typings.std.Error
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.RequestInit
import typings.std.TouchEvent
import typings.vegaTypings.anon.Ast
import typings.vegaTypings.anon.Background
import typings.vegaTypings.anon.Data
import typings.vegaTypings.anon.Fill
import typings.vegaTypings.anon.Href
import typings.vegaTypings.anon.Signals
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.dataMod.Format
import typings.vegaTypings.dataflowMod.Changeset_
import typings.vegaTypings.encodeMod.EncodeEntryName
import typings.vegaTypings.paddingMod.Padding
import typings.vegaTypings.rendererMod.RenderModule_
import typings.vegaTypings.rendererMod.Renderers
import typings.vegaTypings.sceneMod.Scene
import typings.vegaTypings.sceneMod.SceneGroup
import typings.vegaTypings.sceneMod.SceneItem
import typings.vegaTypings.signalMod.SignalValue
import typings.vegaTypings.specMod.Spec
import typings.vegaTypings.vegaTypingsBooleans.`false`
import typings.vegaTypings.vegaTypingsBooleans.`true`
import typings.vegaTypings.vegaTypingsNumbers.`0`
import typings.vegaTypings.vegaTypingsNumbers.`1`
import typings.vegaTypings.vegaTypingsStrings.`axis-label`
import typings.vegaTypings.vegaTypingsStrings.`legend-label`
import typings.vegaTypings.vegaTypingsStrings.`legend-symbol`
import typings.vegaTypings.vegaTypingsStrings.arc
import typings.vegaTypings.vegaTypingsStrings.area
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.file
import typings.vegaTypings.vegaTypingsStrings.group
import typings.vegaTypings.vegaTypingsStrings.http
import typings.vegaTypings.vegaTypingsStrings.https
import typings.vegaTypings.vegaTypingsStrings.image
import typings.vegaTypings.vegaTypingsStrings.left
import typings.vegaTypings.vegaTypingsStrings.line
import typings.vegaTypings.vegaTypingsStrings.mark
import typings.vegaTypings.vegaTypingsStrings.path
import typings.vegaTypings.vegaTypingsStrings.rect
import typings.vegaTypings.vegaTypingsStrings.right
import typings.vegaTypings.vegaTypingsStrings.symbol
import typings.vegaTypings.vegaTypingsStrings.text
import typings.vegaUtil.mod.AccessorFn
import typings.vegaUtil.mod.FastMap_
import typings.vegaUtil.mod.Fn
import typings.vegaUtil.mod.LoggerInterface
import typings.vegaUtil.mod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @JSImport("vega-typings/types/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "Bounds")
  @js.native
  class Bounds ()
    extends typings.vegaTypings.sceneMod.Bounds
  
  @JSImport("vega-typings/types/runtime", "CanvasHandler")
  @js.native
  class CanvasHandler ()
    extends typings.vegaTypings.rendererMod.CanvasHandler
  
  @JSImport("vega-typings/types/runtime", "Debug")
  @js.native
  val Debug: Double = js.native
  
  @JSImport("vega-typings/types/runtime", "Error")
  @js.native
  val Error_ : Double = js.native
  
  @JSImport("vega-typings/types/runtime", "Handler")
  @js.native
  class Handler ()
    extends typings.vegaTypings.rendererMod.Handler
  
  @JSImport("vega-typings/types/runtime", "Info")
  @js.native
  val Info: Double = js.native
  
  @JSImport("vega-typings/types/runtime", "None")
  @js.native
  val None: Double = js.native
  
  @JSImport("vega-typings/types/runtime", "Operator")
  @js.native
  class Operator ()
    extends typings.vegaTypings.dataflowMod.Operator {
    def this(init: js.Any) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any]) = this()
    def this(init: Unit, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any]) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any], params: js.Any) = this()
    def this(init: js.Any, update: Unit, params: js.Any) = this()
    def this(init: Unit, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any], params: js.Any) = this()
    def this(init: Unit, update: Unit, params: js.Any) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: js.Any,
      react: Boolean
    ) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: Unit,
      react: Boolean
    ) = this()
    def this(init: js.Any, update: Unit, params: js.Any, react: Boolean) = this()
    def this(init: js.Any, update: Unit, params: Unit, react: Boolean) = this()
    def this(
      init: Unit,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: js.Any,
      react: Boolean
    ) = this()
    def this(
      init: Unit,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: Unit,
      react: Boolean
    ) = this()
    def this(init: Unit, update: Unit, params: js.Any, react: Boolean) = this()
    def this(init: Unit, update: Unit, params: Unit, react: Boolean) = this()
  }
  
  @JSImport("vega-typings/types/runtime", "Renderer")
  @js.native
  class Renderer protected ()
    extends typings.vegaTypings.rendererMod.Renderer {
    def this(loader: Loader_) = this()
  }
  
  @JSImport("vega-typings/types/runtime", "Transform")
  @js.native
  class Transform ()
    extends typings.vegaTypings.dataflowMod.Transform {
    def this(init: js.Any) = this()
    def this(init: js.Any, params: js.Any) = this()
    def this(init: Unit, params: js.Any) = this()
  }
  
  @JSImport("vega-typings/types/runtime", "View")
  @js.native
  class View protected () extends StObject {
    def this(runtime: Runtime) = this()
    def this(runtime: Runtime, opt: Background) = this()
    
    def addDataListener(name: String, handler: DataListenerHandler): this.type = js.native
    
    def addEventListener(`type`: String, handler: EventListenerHandler): this.type = js.native
    
    def addResizeListener(handler: ResizeHandler): this.type = js.native
    
    def addSignalListener(name: String, handler: SignalListenerHandler): this.type = js.native
    
    def background(): Color = js.native
    def background(s: Color): this.type = js.native
    
    def change(name: String, changeset: Changeset_): this.type = js.native
    
    def changeset(): Changeset_ = js.native
    
    def container(): HTMLElement | Null = js.native
    
    def data(name: String): js.Array[js.Any] = js.native
    def data(name: String, tuples: js.Any): this.type = js.native
    
    def description(): String = js.native
    def description(s: String): this.type = js.native
    
    def dirty(item: js.Any): Unit = js.native
    
    // Event Handling
    def events(source: js.Any, `type`: js.Any): js.Any = js.native
    def events(source: js.Any, `type`: js.Any, filter: js.Function1[/* _ */ js.Any, Boolean]): js.Any = js.native
    
    def getState(): Signals = js.native
    def getState(options: Data): Signals = js.native
    
    def globalCursor(flag: Boolean): js.Any = js.native
    
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
    
    def insert(name: String, tuples: js.Any): this.type = js.native
    
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
    
    def remove(name: String, tuples: js.Any): this.type = js.native
    
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
    def scale(name: String): js.Any = js.native
    
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
  
  inline def accessorFields(fn: AccessorFn[js.Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorFields")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def accessorName(fn: AccessorFn[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def array[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def array[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def ascending(a: js.Any, b: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def changeset(): Changeset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("changeset")().asInstanceOf[Changeset_]
  
  inline def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampRange")(range.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[js.Any] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[js.Any] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[js.Any] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: AccessorFn[js.Any]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: AccessorFn[js.Any], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: AccessorFn[js.Any], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  
  inline def constant[V](v: V): js.Function0[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[V]]
  
  inline def debounce[F /* <: js.Function */](delay: Double, func: F): F = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(delay.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[F]
  
  inline def error(msg: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def expressionFunction(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def expressionFunction(name: String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def expressionFunction(name: String, fn: js.Any, visitor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def expressionFunction(name: String, fn: Unit, visitor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def extend[T](target: T, source: Partial[T]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def extent(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def extent(array: js.Array[Double], accessor: AccessorFn[js.Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def extentIndex(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def extentIndex(array: js.Array[Double], accessor: AccessorFn[js.Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def falsy(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("falsy")().asInstanceOf[`false`]
  
  inline def fastmap(): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")().asInstanceOf[FastMap_]
  inline def fastmap(_underscore: js.Object): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")(_underscore.asInstanceOf[js.Any]).asInstanceOf[FastMap_]
  
  inline def field(field: String): AccessorFn[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[js.Any]]
  inline def field(field: String, name: String): AccessorFn[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[js.Any]]
  
  inline def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(range.asInstanceOf[js.Any], value.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def formatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def id(_underscore: js.Object): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  
  inline def identity[V](v: V): V = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[V]
  
  inline def inferType(values: js.Array[js.Any]): TypeInference = ^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any]).asInstanceOf[TypeInference]
  inline def inferType(values: js.Array[js.Any], field: String): TypeInference = (^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TypeInference]
  
  inline def inferTypes(values: js.Array[js.Any], fields: js.Array[String]): StringDictionary[TypeInference] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferTypes")(values.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TypeInference]]
  
  inline def ingest(datum: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ingest")(datum.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[C & P]
  inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[C & P]
  
  inline def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inrange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  inline def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isBoolean(a: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(a: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction(a: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isIterable(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(a: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(a: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(a.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(a: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isTuple(t: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuple")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  inline def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any], flat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  
  inline def lerp(array: js.Array[Double], fraction: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(array.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def loader(): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")().asInstanceOf[Loader_]
  inline def loader(opt: LoaderOptions): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")(opt.asInstanceOf[js.Any]).asInstanceOf[Loader_]
  
  inline def log(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logger(): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")().asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Double): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any]).asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Double, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Unit, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  
  inline def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any],
    output: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeConfig[C /* <: js.Object */](c: C*): C = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(c.asInstanceOf[js.Any]).asInstanceOf[C]
  
  inline def merge_Array(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def one(): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[`1`]
  
  inline def pad(str: String, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad(str: String, len: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pad_center(str: String, len: Double, char: String, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad_center(str: String, len: Double, char: Unit, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pad_left(str: String, len: Double, char: String, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad_left(str: String, len: Double, char: Unit, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pad_right(str: String, len: Double, char: String, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad_right(str: String, len: Double, char: Unit, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLinear")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panPow")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panSymlog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def parse(spec: Spec): Runtime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any]).asInstanceOf[Runtime]
  inline def parse(spec: Spec, config: Unit, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  inline def parse(spec: Spec, config: Config): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  inline def parse(spec: Spec, config: Config, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  
  inline def peek(array: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")(array.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def projection(`type`: String, projection: js.Any): View = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(`type`.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[View]
  
  inline def quarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def quarter(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def read(data: String, schema: Format): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, Date]): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], dateParse.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  inline def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("renderModule")(moduleName.asInstanceOf[js.Any], renderModule.asInstanceOf[js.Any])).asInstanceOf[RenderModule_]
  
  inline def repeat(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def scale(`type`: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def scale(`type`: String, scale: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scheme(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def scheme(name: String, scheme: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def schemeDiscretized(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def schemeDiscretized(name: String, scheme: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def schemeDiscretized(name: String, scheme: js.Any, interpolator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def schemeDiscretized(name: String, scheme: Unit, interpolator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def span(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def splitAccessPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAccessPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringValue(a: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringValue")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def timeFormatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toBoolean(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toDate(a: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toNumber(a: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toSet[T](array: js.Array[T]): StringDictionary[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSet")(array.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[`true`]]
  
  inline def toString_(a: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def truncate(a: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate(a: String, length: Double, align: Unit, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncate_center(a: String, length: Double, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncate_left(a: String, length: Double, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncate_right(a: String, length: Double, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truthy(): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")().asInstanceOf[`true`]
  
  inline def tupleid(t: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleid")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def utcquarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def utcquarter(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("vega-typings/types/runtime", "version")
  @js.native
  val version: String = js.native
  
  inline def visitArray(
    array: js.Array[js.Any],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visitArray(
    array: Unit,
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zero(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[`0`]
  
  inline def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  type DataListenerHandler = js.Function2[/* name */ String, /* value */ js.Any, Unit]
  
  trait DefineMark[T /* <: String */, I, R /* <: String */] extends StObject {
    
    var group: js.Any
    
    var items: js.Array[Item[I]]
    
    var marktype: T
    
    var role: mark | R
  }
  object DefineMark {
    
    inline def apply[T /* <: String */, I, R /* <: String */](group: js.Any, items: js.Array[Item[I]], marktype: T, role: mark | R): DefineMark[T, I, R] = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineMark[T, I, R]]
    }
    
    extension [Self <: DefineMark[?, ?, ?], T /* <: String */, I, R /* <: String */](x: Self & (DefineMark[T, I, R])) {
      
      inline def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Item[I]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item[I]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMarktype(value: T): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      inline def setRole(value: mark | R): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  type EventListenerHandler = js.Function2[/* event */ ScenegraphEvent, /* item */ js.UndefOr[Item[js.Any]], Unit]
  
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
    
    extension [Self <: Item[?], T](x: Self & Item[T]) {
      
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
    
    extension [Self <: LoaderOptions](x: Self) {
      
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
    
    def http(uri: String, options: js.Any): js.Promise[String] = js.native
    
    def load(uri: String): js.Promise[String] = js.native
    def load(uri: String, options: js.Any): js.Promise[String] = js.native
    
    def sanitize(uri: String, options: js.Any): js.Promise[Href] = js.native
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
    
    extension [Self <: LocaleFormatters](x: Self) {
      
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
  
  type Runtime = js.Any
  
  type RuntimeMark = DefineMark[
    group | rect | symbol | path | arc | area | line | image | text, 
    Fill | js.Object, 
    `legend-symbol` | `axis-label` | `legend-label` | scala.Nothing
  ]
  
  type ScenegraphEvent = MouseEvent | TouchEvent | KeyboardEvent
  
  type SignalListenerHandler = js.Function2[/* name */ String, /* value */ SignalValue, Unit]
  
  type TimeFormat = js.Function1[/* date */ Date | Double, String]
  
  type TimeParse = js.Function1[/* dateString */ String, Date]
  
  trait ToCanvasOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var externalContext: js.UndefOr[js.Any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToCanvasOptions {
    
    inline def apply(): ToCanvasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToCanvasOptions]
    }
    
    extension [Self <: ToCanvasOptions](x: Self) {
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setExternalContext(value: js.Any): Self = StObject.set(x, "externalContext", value.asInstanceOf[js.Any])
      
      inline def setExternalContextUndefined: Self = StObject.set(x, "externalContext", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ MouseEvent, 
    /* item */ Item[js.Any], 
    /* value */ js.Any, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.dataMod.DataType
    - typings.vegaTypings.vegaTypingsStrings.integer
  */
  trait TypeInference extends StObject
}
