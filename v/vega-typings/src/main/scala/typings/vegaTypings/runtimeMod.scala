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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
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
    def this(init: js.UndefOr[scala.Nothing], update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _]) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _]) = this()
    def this(init: js.UndefOr[scala.Nothing], update: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.Any
    ) = this()
    def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _], params: js.Any) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      react: Boolean
    ) = this()
    def this(init: js.UndefOr[scala.Nothing], update: js.UndefOr[scala.Nothing], params: js.Any, react: Boolean) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.UndefOr[scala.Nothing],
      react: Boolean
    ) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.Any,
      react: Boolean
    ) = this()
    def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], react: Boolean) = this()
    def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.Any, react: Boolean) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.UndefOr[scala.Nothing],
      react: Boolean
    ) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.Any,
      react: Boolean
    ) = this()
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
    def this(init: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(init: js.Any, params: js.Any) = this()
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
    
    def data(name: String): js.Array[_] = js.native
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
    def hover(hoverSet: js.UndefOr[scala.Nothing], leaveSet: EncodeEntryName): this.type = js.native
    def hover(hoverSet: EncodeEntryName): this.type = js.native
    def hover(hoverSet: EncodeEntryName, leaveSet: EncodeEntryName): this.type = js.native
    
    // View Configuration
    def initialize(): this.type = js.native
    def initialize(container: js.UndefOr[scala.Nothing], bindContainer: String): this.type = js.native
    def initialize(container: js.UndefOr[scala.Nothing], bindContainer: Element): this.type = js.native
    def initialize(container: String): this.type = js.native
    def initialize(container: String, bindContainer: String): this.type = js.native
    def initialize(container: String, bindContainer: Element): this.type = js.native
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
    def runAfter(
      callback: js.Function1[/* view */ this.type, Unit],
      enqueue: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean): this.type = js.native
    def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean, priority: Double): this.type = js.native
    
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
    def toCanvas(scaleFactor: js.UndefOr[scala.Nothing], options: ToCanvasOptions): js.Promise[HTMLCanvasElement] = js.native
    def toCanvas(scaleFactor: Double): js.Promise[HTMLCanvasElement] = js.native
    def toCanvas(scaleFactor: Double, options: ToCanvasOptions): js.Promise[HTMLCanvasElement] = js.native
    
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
  
  @JSImport("vega-typings/types/runtime", "accessor")
  @js.native
  def accessor[R](fn: Fn[R]): AccessorFn[R] = js.native
  @JSImport("vega-typings/types/runtime", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.UndefOr[scala.Nothing], name: String): AccessorFn[R] = js.native
  @JSImport("vega-typings/types/runtime", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  @JSImport("vega-typings/types/runtime", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
  
  @JSImport("vega-typings/types/runtime", "accessorFields")
  @js.native
  def accessorFields(fn: AccessorFn[_]): js.Array[String] = js.native
  
  @JSImport("vega-typings/types/runtime", "accessorName")
  @js.native
  def accessorName(fn: AccessorFn[_]): String = js.native
  
  @JSImport("vega-typings/types/runtime", "array")
  @js.native
  def array[T](v: T): js.Array[T] = js.native
  @JSImport("vega-typings/types/runtime", "array")
  @js.native
  def array[T](v: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("vega-typings/types/runtime", "ascending")
  @js.native
  def ascending(a: js.Any, b: js.Any): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "changeset")
  @js.native
  def changeset(): Changeset_ = js.native
  
  @JSImport("vega-typings/types/runtime", "clampRange")
  @js.native
  def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: AccessorFn[_], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings/types/runtime", "compare")
  @js.native
  def compare(fields: AccessorFn[_], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "constant")
  @js.native
  def constant[V](v: V): js.Function0[V] = js.native
  
  @JSImport("vega-typings/types/runtime", "debounce")
  @js.native
  def debounce[F /* <: js.Function */](delay: Double, func: F): F = js.native
  
  @JSImport("vega-typings/types/runtime", "error")
  @js.native
  def error(msg: String): Error = js.native
  
  @JSImport("vega-typings/types/runtime", "expressionFunction")
  @js.native
  def expressionFunction(name: String): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "expressionFunction")
  @js.native
  def expressionFunction(name: String, fn: js.UndefOr[scala.Nothing], visitor: js.Any): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "expressionFunction")
  @js.native
  def expressionFunction(name: String, fn: js.Any): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "expressionFunction")
  @js.native
  def expressionFunction(name: String, fn: js.Any, visitor: js.Any): js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "extend")
  @js.native
  def extend[T](target: T, source: Partial[T]*): T = js.native
  
  @JSImport("vega-typings/types/runtime", "extent")
  @js.native
  def extent(array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("vega-typings/types/runtime", "extent")
  @js.native
  def extent(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "extentIndex")
  @js.native
  def extentIndex(array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("vega-typings/types/runtime", "extentIndex")
  @js.native
  def extentIndex(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "falsy")
  @js.native
  def falsy(): `false` = js.native
  
  @JSImport("vega-typings/types/runtime", "fastmap")
  @js.native
  def fastmap(): FastMap_ = js.native
  @JSImport("vega-typings/types/runtime", "fastmap")
  @js.native
  def fastmap(_underscore: js.Object): FastMap_ = js.native
  
  @JSImport("vega-typings/types/runtime", "field")
  @js.native
  def field(field: String): AccessorFn[_] = js.native
  @JSImport("vega-typings/types/runtime", "field")
  @js.native
  def field(field: String, name: String): AccessorFn[_] = js.native
  
  @JSImport("vega-typings/types/runtime", "flush")
  @js.native
  def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = js.native
  
  @JSImport("vega-typings/types/runtime", "formatLocale")
  @js.native
  def formatLocale(definition: js.Object): Unit = js.native
  
  @JSImport("vega-typings/types/runtime", "hasOwnProperty")
  @js.native
  def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "id")
  @js.native
  def id(_underscore: js.Object): js.Symbol = js.native
  
  @JSImport("vega-typings/types/runtime", "identity")
  @js.native
  def identity[V](v: V): V = js.native
  
  @JSImport("vega-typings/types/runtime", "inferType")
  @js.native
  def inferType(values: js.Array[_]): TypeInference = js.native
  @JSImport("vega-typings/types/runtime", "inferType")
  @js.native
  def inferType(values: js.Array[_], field: String): TypeInference = js.native
  
  @JSImport("vega-typings/types/runtime", "inferTypes")
  @js.native
  def inferTypes(values: js.Array[_], fields: js.Array[String]): StringDictionary[TypeInference] = js.native
  
  @JSImport("vega-typings/types/runtime", "ingest")
  @js.native
  def ingest(datum: js.Any): js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "inherits")
  @js.native
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C with P = js.native
  @JSImport("vega-typings/types/runtime", "inherits")
  @js.native
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C with P = js.native
  
  @JSImport("vega-typings/types/runtime", "inrange")
  @js.native
  def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isArray")
  @js.native
  def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = js.native
  @JSImport("vega-typings/types/runtime", "isArray")
  @js.native
  def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isBoolean")
  @js.native
  def isBoolean(a: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isDate")
  @js.native
  def isDate(a: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isFunction")
  @js.native
  def isFunction(a: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isIterable")
  @js.native
  def isIterable(a: js.Any): Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isNumber")
  @js.native
  def isNumber(a: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isObject")
  @js.native
  def isObject(a: js.Any): /* is object */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isRegExp")
  @js.native
  def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isString")
  @js.native
  def isString(a: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "isTuple")
  @js.native
  def isTuple(t: js.Any): Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "key")
  @js.native
  def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = js.native
  @JSImport("vega-typings/types/runtime", "key")
  @js.native
  def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = js.native
  
  @JSImport("vega-typings/types/runtime", "lerp")
  @js.native
  def lerp(array: js.Array[Double], fraction: Double): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "loader")
  @js.native
  def loader(): Loader_ = js.native
  @JSImport("vega-typings/types/runtime", "loader")
  @js.native
  def loader(opt: LoaderOptions): Loader_ = js.native
  
  @JSImport("vega-typings/types/runtime", "log")
  @js.native
  def log(args: js.Any*): Unit = js.native
  
  @JSImport("vega-typings/types/runtime", "logger")
  @js.native
  def logger(): LoggerInterface = js.native
  @JSImport("vega-typings/types/runtime", "logger")
  @js.native
  def logger(_underscore: js.UndefOr[scala.Nothing], method: String): LoggerInterface = js.native
  @JSImport("vega-typings/types/runtime", "logger")
  @js.native
  def logger(_underscore: Double): LoggerInterface = js.native
  @JSImport("vega-typings/types/runtime", "logger")
  @js.native
  def logger(_underscore: Double, method: String): LoggerInterface = js.native
  
  @JSImport("vega-typings/types/runtime", "merge")
  @js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): Unit = js.native
  @JSImport("vega-typings/types/runtime", "merge")
  @js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_],
    output: js.Array[_]
  ): Unit = js.native
  
  @JSImport("vega-typings/types/runtime", "mergeConfig")
  @js.native
  def mergeConfig[C /* <: js.Object */](c: C*): C = js.native
  
  @JSImport("vega-typings/types/runtime", "merge")
  @js.native
  def merge_Array(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): js.Array[_] = js.native
  
  @JSImport("vega-typings/types/runtime", "one")
  @js.native
  def one(): `1` = js.native
  
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad(str: String, len: Double): String = js.native
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad(str: String, len: Double, char: String): String = js.native
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad_center(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: center): String = js.native
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad_center(str: String, len: Double, char: String, align: center): String = js.native
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad_left(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: left): String = js.native
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad_left(str: String, len: Double, char: String, align: left): String = js.native
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad_right(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: right): String = js.native
  @JSImport("vega-typings/types/runtime", "pad")
  @js.native
  def pad_right(str: String, len: Double, char: String, align: right): String = js.native
  
  @JSImport("vega-typings/types/runtime", "panLinear")
  @js.native
  def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "panLog")
  @js.native
  def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "panPow")
  @js.native
  def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "panSymlog")
  @js.native
  def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "parse")
  @js.native
  def parse(spec: Spec): Runtime = js.native
  @JSImport("vega-typings/types/runtime", "parse")
  @js.native
  def parse(spec: Spec, config: js.UndefOr[scala.Nothing], opt: Ast): Runtime = js.native
  @JSImport("vega-typings/types/runtime", "parse")
  @js.native
  def parse(spec: Spec, config: Config): Runtime = js.native
  @JSImport("vega-typings/types/runtime", "parse")
  @js.native
  def parse(spec: Spec, config: Config, opt: Ast): Runtime = js.native
  
  @JSImport("vega-typings/types/runtime", "peek")
  @js.native
  def peek(array: js.Array[_]): js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "projection")
  @js.native
  def projection(`type`: String, projection: js.Any): View = js.native
  
  @JSImport("vega-typings/types/runtime", "quarter")
  @js.native
  def quarter(date: Double): Double = js.native
  @JSImport("vega-typings/types/runtime", "quarter")
  @js.native
  def quarter(date: Date): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "read")
  @js.native
  def read(data: String, schema: Format): js.Array[js.Object] = js.native
  @JSImport("vega-typings/types/runtime", "read")
  @js.native
  def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, Date]): js.Array[js.Object] = js.native
  
  @JSImport("vega-typings/types/runtime", "renderModule")
  @js.native
  def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = js.native
  
  @JSImport("vega-typings/types/runtime", "repeat")
  @js.native
  def repeat(str: String, count: Double): String = js.native
  
  @JSImport("vega-typings/types/runtime", "scale")
  @js.native
  def scale(`type`: String): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "scale")
  @js.native
  def scale(`type`: String, scale: js.Any): js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "sceneVisit")
  @js.native
  def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  @JSImport("vega-typings/types/runtime", "sceneVisit")
  @js.native
  def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  
  @JSImport("vega-typings/types/runtime", "scheme")
  @js.native
  def scheme(name: String): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "scheme")
  @js.native
  def scheme(name: String, scheme: js.Any): js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String, scheme: js.UndefOr[scala.Nothing], interpolator: js.Any): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String, scheme: js.Any): js.Any = js.native
  @JSImport("vega-typings/types/runtime", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String, scheme: js.Any, interpolator: js.Any): js.Any = js.native
  
  @JSImport("vega-typings/types/runtime", "span")
  @js.native
  def span(array: js.Array[Double]): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "splitAccessPath")
  @js.native
  def splitAccessPath(path: String): js.Array[String] = js.native
  
  @JSImport("vega-typings/types/runtime", "stringValue")
  @js.native
  def stringValue(a: js.Any): String = js.native
  
  @JSImport("vega-typings/types/runtime", "timeFormatLocale")
  @js.native
  def timeFormatLocale(definition: js.Object): Unit = js.native
  
  @JSImport("vega-typings/types/runtime", "toBoolean")
  @js.native
  def toBoolean(a: js.Any): Boolean = js.native
  
  @JSImport("vega-typings/types/runtime", "toDate")
  @js.native
  def toDate(a: js.Any): Double = js.native
  @JSImport("vega-typings/types/runtime", "toDate")
  @js.native
  def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "toNumber")
  @js.native
  def toNumber(a: js.Any): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "toSet")
  @js.native
  def toSet[T](array: js.Array[T]): StringDictionary[`true`] = js.native
  
  @JSImport("vega-typings/types/runtime", "toString")
  @js.native
  def toString_(a: js.Any): String = js.native
  
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate(a: String, length: Double): String = js.native
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate(a: String, length: Double, align: js.UndefOr[scala.Nothing], ellipsis: String): String = js.native
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate_center(a: String, length: Double, align: center): String = js.native
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = js.native
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate_left(a: String, length: Double, align: left): String = js.native
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = js.native
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate_right(a: String, length: Double, align: right): String = js.native
  @JSImport("vega-typings/types/runtime", "truncate")
  @js.native
  def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = js.native
  
  @JSImport("vega-typings/types/runtime", "truthy")
  @js.native
  def truthy(): `true` = js.native
  
  @JSImport("vega-typings/types/runtime", "tupleid")
  @js.native
  def tupleid(t: js.Any): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "utcquarter")
  @js.native
  def utcquarter(date: Double): Double = js.native
  @JSImport("vega-typings/types/runtime", "utcquarter")
  @js.native
  def utcquarter(date: Date): Double = js.native
  
  @JSImport("vega-typings/types/runtime", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("vega-typings/types/runtime", "visitArray")
  @js.native
  def visitArray(
    array: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  @JSImport("vega-typings/types/runtime", "visitArray")
  @js.native
  def visitArray(
    array: js.Array[_],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  
  @JSImport("vega-typings/types/runtime", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = js.native
  @JSImport("vega-typings/types/runtime", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = js.native
  @JSImport("vega-typings/types/runtime", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = js.native
  
  @JSImport("vega-typings/types/runtime", "zero")
  @js.native
  def zero(): `0` = js.native
  
  @JSImport("vega-typings/types/runtime", "zoomLinear")
  @js.native
  def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  @JSImport("vega-typings/types/runtime", "zoomLinear")
  @js.native
  def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "zoomLog")
  @js.native
  def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  @JSImport("vega-typings/types/runtime", "zoomLog")
  @js.native
  def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "zoomPow")
  @js.native
  def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = js.native
  @JSImport("vega-typings/types/runtime", "zoomPow")
  @js.native
  def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings/types/runtime", "zoomSymlog")
  @js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = js.native
  @JSImport("vega-typings/types/runtime", "zoomSymlog")
  @js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = js.native
  
  type DataListenerHandler = js.Function2[/* name */ String, /* value */ js.Any, Unit]
  
  @js.native
  trait DefineMark[T /* <: String */, I, R /* <: String */] extends StObject {
    
    var group: js.Any = js.native
    
    var items: js.Array[Item[I]] = js.native
    
    var marktype: T = js.native
    
    var role: mark | R = js.native
  }
  object DefineMark {
    
    @scala.inline
    def apply[T /* <: String */, I, R /* <: String */](group: js.Any, items: js.Array[Item[I]], marktype: T, role: mark | R): DefineMark[T, I, R] = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineMark[T, I, R]]
    }
    
    @scala.inline
    implicit class DefineMarkMutableBuilder[Self <: DefineMark[_, _, _], T /* <: String */, I, R /* <: String */] (val x: Self with (DefineMark[T, I, R])) extends AnyVal {
      
      @scala.inline
      def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[Item[I]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Item[I]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMarktype(value: T): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: mark | R): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  type EventListenerHandler = js.Function2[/* event */ ScenegraphEvent, /* item */ js.UndefOr[Item[js.Any]], Unit]
  
  @js.native
  trait Item[T] extends StObject {
    
    /**
      * The underlying data element to which this item corresponds.
      */
    var datum: T = js.native
    
    /**
      * The mark to which this item belongs.
      */
    var mark: RuntimeMark = js.native
  }
  object Item {
    
    @scala.inline
    def apply[T](datum: T, mark: RuntimeMark): Item[T] = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[T]]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item[_], T] (val x: Self with Item[T]) extends AnyVal {
      
      @scala.inline
      def setDatum(value: T): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMark(value: RuntimeMark): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoaderOptions extends StObject {
    
    var baseURL: js.UndefOr[String] = js.native
    
    var defaultProtocol: js.UndefOr[http | https | String] = js.native
    
    var http: js.UndefOr[RequestInit] = js.native
    
    var mode: js.UndefOr[file | http] = js.native
    
    var target: js.UndefOr[String] = js.native
  }
  object LoaderOptions {
    
    @scala.inline
    def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setDefaultProtocol(value: http | https | String): Self = StObject.set(x, "defaultProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultProtocolUndefined: Self = StObject.set(x, "defaultProtocol", js.undefined)
      
      @scala.inline
      def setHttp(value: RequestInit): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setMode(value: file | http): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
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
  
  @js.native
  trait LocaleFormatters extends StObject {
    
    def format(spec: String): NumberFormat = js.native
    
    def formatFloat(spec: String): NumberFormat = js.native
    
    def formatPrefix(spec: String, value: Double): NumberFormat = js.native
    
    def formatSpan(start: Double, stop: Double, count: Double, spec: String): NumberFormat = js.native
    
    def timeFormat(spec: String): TimeFormat = js.native
    
    def timeParse(spec: String): TimeParse = js.native
    
    def utcFormat(spec: String): TimeFormat = js.native
    
    def utcParse(spec: String): TimeParse = js.native
  }
  object LocaleFormatters {
    
    @scala.inline
    def apply(
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
    implicit class LocaleFormattersMutableBuilder[Self <: LocaleFormatters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String => NumberFormat): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatFloat(value: String => NumberFormat): Self = StObject.set(x, "formatFloat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatPrefix(value: (String, Double) => NumberFormat): Self = StObject.set(x, "formatPrefix", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatSpan(value: (Double, Double, Double, String) => NumberFormat): Self = StObject.set(x, "formatSpan", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTimeFormat(value: String => TimeFormat): Self = StObject.set(x, "timeFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimeParse(value: String => TimeParse): Self = StObject.set(x, "timeParse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtcFormat(value: String => TimeFormat): Self = StObject.set(x, "utcFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtcParse(value: String => TimeParse): Self = StObject.set(x, "utcParse", js.Any.fromFunction1(value))
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
  
  @js.native
  trait ToCanvasOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var externalContext: js.UndefOr[js.Any] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object ToCanvasOptions {
    
    @scala.inline
    def apply(): ToCanvasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToCanvasOptions]
    }
    
    @scala.inline
    implicit class ToCanvasOptionsMutableBuilder[Self <: ToCanvasOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setExternalContext(value: js.Any): Self = StObject.set(x, "externalContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalContextUndefined: Self = StObject.set(x, "externalContext", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
