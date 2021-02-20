package typings.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import typings.std.PropertyKey
import typings.vegaTypings.anon.Ast
import typings.vegaTypings.anon.Background
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.dataMod.Format
import typings.vegaTypings.dataflowMod.Changeset_
import typings.vegaTypings.rendererMod.RenderModule_
import typings.vegaTypings.runtimeMod.LoaderOptions
import typings.vegaTypings.runtimeMod.Loader_
import typings.vegaTypings.runtimeMod.Runtime
import typings.vegaTypings.runtimeMod.TypeInference
import typings.vegaTypings.sceneMod.Scene
import typings.vegaTypings.sceneMod.SceneGroup
import typings.vegaTypings.sceneMod.SceneItem
import typings.vegaTypings.specMod.Spec
import typings.vegaTypings.vegaTypingsBooleans.`false`
import typings.vegaTypings.vegaTypingsBooleans.`true`
import typings.vegaTypings.vegaTypingsNumbers.`0`
import typings.vegaTypings.vegaTypingsNumbers.`1`
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.left
import typings.vegaTypings.vegaTypingsStrings.right
import typings.vegaUtil.mod.AccessorFn
import typings.vegaUtil.mod.FastMap_
import typings.vegaUtil.mod.Fn
import typings.vegaUtil.mod.LoggerInterface
import typings.vegaUtil.mod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-typings", "Bounds")
  @js.native
  class Bounds ()
    extends typings.vegaTypings.runtimeMod.Bounds
  
  @JSImport("vega-typings", "CanvasHandler")
  @js.native
  class CanvasHandler ()
    extends typings.vegaTypings.runtimeMod.CanvasHandler
  
  @JSImport("vega-typings", "Debug")
  @js.native
  val Debug: Double = js.native
  
  @JSImport("vega-typings", "Error")
  @js.native
  val Error_ : Double = js.native
  
  @JSImport("vega-typings", "Handler")
  @js.native
  class Handler ()
    extends typings.vegaTypings.runtimeMod.Handler
  
  @JSImport("vega-typings", "Info")
  @js.native
  val Info: Double = js.native
  
  @JSImport("vega-typings", "None")
  @js.native
  val None: Double = js.native
  
  @JSImport("vega-typings", "Operator")
  @js.native
  class Operator ()
    extends typings.vegaTypings.runtimeMod.Operator {
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
  
  @JSImport("vega-typings", "Renderer")
  @js.native
  class Renderer protected ()
    extends typings.vegaTypings.runtimeMod.Renderer {
    def this(loader: Loader_) = this()
  }
  
  @JSImport("vega-typings", "Transform")
  @js.native
  class Transform ()
    extends typings.vegaTypings.runtimeMod.Transform {
    def this(init: js.Any) = this()
    def this(init: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(init: js.Any, params: js.Any) = this()
  }
  
  @JSImport("vega-typings", "View")
  @js.native
  class View protected ()
    extends typings.vegaTypings.runtimeMod.View {
    def this(runtime: Runtime) = this()
    def this(runtime: Runtime, opt: Background) = this()
  }
  
  @JSImport("vega-typings", "Warn")
  @js.native
  val Warn: Double = js.native
  
  @JSImport("vega-typings", "accessor")
  @js.native
  def accessor[R](fn: Fn[R]): AccessorFn[R] = js.native
  @JSImport("vega-typings", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.UndefOr[scala.Nothing], name: String): AccessorFn[R] = js.native
  @JSImport("vega-typings", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  @JSImport("vega-typings", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
  
  @JSImport("vega-typings", "accessorFields")
  @js.native
  def accessorFields(fn: AccessorFn[_]): js.Array[String] = js.native
  
  @JSImport("vega-typings", "accessorName")
  @js.native
  def accessorName(fn: AccessorFn[_]): String = js.native
  
  @JSImport("vega-typings", "array")
  @js.native
  def array[T](v: T): js.Array[T] = js.native
  @JSImport("vega-typings", "array")
  @js.native
  def array[T](v: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("vega-typings", "ascending")
  @js.native
  def ascending(a: js.Any, b: js.Any): Double = js.native
  
  @JSImport("vega-typings", "changeset")
  @js.native
  def changeset(): Changeset_ = js.native
  
  @JSImport("vega-typings", "clampRange")
  @js.native
  def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: AccessorFn[_], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-typings", "compare")
  @js.native
  def compare(fields: AccessorFn[_], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  
  @JSImport("vega-typings", "constant")
  @js.native
  def constant[V](v: V): js.Function0[V] = js.native
  
  @JSImport("vega-typings", "debounce")
  @js.native
  def debounce[F /* <: js.Function */](delay: Double, func: F): F = js.native
  
  @JSImport("vega-typings", "error")
  @js.native
  def error(msg: String): Error = js.native
  
  @JSImport("vega-typings", "expressionFunction")
  @js.native
  def expressionFunction(name: String): js.Any = js.native
  @JSImport("vega-typings", "expressionFunction")
  @js.native
  def expressionFunction(name: String, fn: js.UndefOr[scala.Nothing], visitor: js.Any): js.Any = js.native
  @JSImport("vega-typings", "expressionFunction")
  @js.native
  def expressionFunction(name: String, fn: js.Any): js.Any = js.native
  @JSImport("vega-typings", "expressionFunction")
  @js.native
  def expressionFunction(name: String, fn: js.Any, visitor: js.Any): js.Any = js.native
  
  @JSImport("vega-typings", "extend")
  @js.native
  def extend[T](target: T, source: Partial[T]*): T = js.native
  
  @JSImport("vega-typings", "extent")
  @js.native
  def extent(array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("vega-typings", "extent")
  @js.native
  def extent(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "extentIndex")
  @js.native
  def extentIndex(array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("vega-typings", "extentIndex")
  @js.native
  def extentIndex(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "falsy")
  @js.native
  def falsy(): `false` = js.native
  
  @JSImport("vega-typings", "fastmap")
  @js.native
  def fastmap(): FastMap_ = js.native
  @JSImport("vega-typings", "fastmap")
  @js.native
  def fastmap(_underscore: js.Object): FastMap_ = js.native
  
  @JSImport("vega-typings", "field")
  @js.native
  def field(field: String): AccessorFn[_] = js.native
  @JSImport("vega-typings", "field")
  @js.native
  def field(field: String, name: String): AccessorFn[_] = js.native
  
  @JSImport("vega-typings", "flush")
  @js.native
  def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = js.native
  
  @JSImport("vega-typings", "formatLocale")
  @js.native
  def formatLocale(definition: js.Object): Unit = js.native
  
  @JSImport("vega-typings", "hasOwnProperty")
  @js.native
  def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = js.native
  
  @JSImport("vega-typings", "id")
  @js.native
  def id(_underscore: js.Object): js.Symbol = js.native
  
  @JSImport("vega-typings", "identity")
  @js.native
  def identity[V](v: V): V = js.native
  
  @JSImport("vega-typings", "inferType")
  @js.native
  def inferType(values: js.Array[_]): TypeInference = js.native
  @JSImport("vega-typings", "inferType")
  @js.native
  def inferType(values: js.Array[_], field: String): TypeInference = js.native
  
  @JSImport("vega-typings", "inferTypes")
  @js.native
  def inferTypes(values: js.Array[_], fields: js.Array[String]): StringDictionary[TypeInference] = js.native
  
  @JSImport("vega-typings", "ingest")
  @js.native
  def ingest(datum: js.Any): js.Any = js.native
  
  @JSImport("vega-typings", "inherits")
  @js.native
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C with P = js.native
  @JSImport("vega-typings", "inherits")
  @js.native
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C with P = js.native
  
  @JSImport("vega-typings", "inrange")
  @js.native
  def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = js.native
  
  @JSImport("vega-typings", "isArray")
  @js.native
  def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = js.native
  @JSImport("vega-typings", "isArray")
  @js.native
  def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = js.native
  
  @JSImport("vega-typings", "isBoolean")
  @js.native
  def isBoolean(a: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("vega-typings", "isDate")
  @js.native
  def isDate(a: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("vega-typings", "isFunction")
  @js.native
  def isFunction(a: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("vega-typings", "isIterable")
  @js.native
  def isIterable(a: js.Any): Boolean = js.native
  
  @JSImport("vega-typings", "isNumber")
  @js.native
  def isNumber(a: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("vega-typings", "isObject")
  @js.native
  def isObject(a: js.Any): /* is object */ Boolean = js.native
  
  @JSImport("vega-typings", "isRegExp")
  @js.native
  def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = js.native
  
  @JSImport("vega-typings", "isString")
  @js.native
  def isString(a: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("vega-typings", "isTuple")
  @js.native
  def isTuple(t: js.Any): Boolean = js.native
  
  @JSImport("vega-typings", "key")
  @js.native
  def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = js.native
  @JSImport("vega-typings", "key")
  @js.native
  def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = js.native
  
  @JSImport("vega-typings", "lerp")
  @js.native
  def lerp(array: js.Array[Double], fraction: Double): Double = js.native
  
  @JSImport("vega-typings", "loader")
  @js.native
  def loader(): Loader_ = js.native
  @JSImport("vega-typings", "loader")
  @js.native
  def loader(opt: LoaderOptions): Loader_ = js.native
  
  @JSImport("vega-typings", "log")
  @js.native
  def log(args: js.Any*): Unit = js.native
  
  @JSImport("vega-typings", "logger")
  @js.native
  def logger(): LoggerInterface = js.native
  @JSImport("vega-typings", "logger")
  @js.native
  def logger(_underscore: js.UndefOr[scala.Nothing], method: String): LoggerInterface = js.native
  @JSImport("vega-typings", "logger")
  @js.native
  def logger(_underscore: Double): LoggerInterface = js.native
  @JSImport("vega-typings", "logger")
  @js.native
  def logger(_underscore: Double, method: String): LoggerInterface = js.native
  
  @JSImport("vega-typings", "merge")
  @js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): Unit = js.native
  @JSImport("vega-typings", "merge")
  @js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_],
    output: js.Array[_]
  ): Unit = js.native
  
  @JSImport("vega-typings", "mergeConfig")
  @js.native
  def mergeConfig[C /* <: js.Object */](c: C*): C = js.native
  
  @JSImport("vega-typings", "merge")
  @js.native
  def merge_Array(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): js.Array[_] = js.native
  
  @JSImport("vega-typings", "one")
  @js.native
  def one(): `1` = js.native
  
  @JSImport("vega-typings", "pad")
  @js.native
  def pad(str: String, len: Double): String = js.native
  @JSImport("vega-typings", "pad")
  @js.native
  def pad(str: String, len: Double, char: String): String = js.native
  @JSImport("vega-typings", "pad")
  @js.native
  def pad_center(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: center): String = js.native
  @JSImport("vega-typings", "pad")
  @js.native
  def pad_center(str: String, len: Double, char: String, align: center): String = js.native
  @JSImport("vega-typings", "pad")
  @js.native
  def pad_left(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: left): String = js.native
  @JSImport("vega-typings", "pad")
  @js.native
  def pad_left(str: String, len: Double, char: String, align: left): String = js.native
  @JSImport("vega-typings", "pad")
  @js.native
  def pad_right(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: right): String = js.native
  @JSImport("vega-typings", "pad")
  @js.native
  def pad_right(str: String, len: Double, char: String, align: right): String = js.native
  
  @JSImport("vega-typings", "panLinear")
  @js.native
  def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "panLog")
  @js.native
  def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "panPow")
  @js.native
  def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "panSymlog")
  @js.native
  def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "parse")
  @js.native
  def parse(spec: Spec): Runtime = js.native
  @JSImport("vega-typings", "parse")
  @js.native
  def parse(spec: Spec, config: js.UndefOr[scala.Nothing], opt: Ast): Runtime = js.native
  @JSImport("vega-typings", "parse")
  @js.native
  def parse(spec: Spec, config: Config): Runtime = js.native
  @JSImport("vega-typings", "parse")
  @js.native
  def parse(spec: Spec, config: Config, opt: Ast): Runtime = js.native
  
  @JSImport("vega-typings", "peek")
  @js.native
  def peek(array: js.Array[_]): js.Any = js.native
  
  @JSImport("vega-typings", "projection")
  @js.native
  def projection(`type`: String, projection: js.Any): typings.vegaTypings.runtimeMod.View = js.native
  
  @JSImport("vega-typings", "quarter")
  @js.native
  def quarter(date: Double): Double = js.native
  @JSImport("vega-typings", "quarter")
  @js.native
  def quarter(date: Date): Double = js.native
  
  @JSImport("vega-typings", "read")
  @js.native
  def read(data: String, schema: Format): js.Array[js.Object] = js.native
  @JSImport("vega-typings", "read")
  @js.native
  def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, Date]): js.Array[js.Object] = js.native
  
  @JSImport("vega-typings", "renderModule")
  @js.native
  def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = js.native
  
  @JSImport("vega-typings", "repeat")
  @js.native
  def repeat(str: String, count: Double): String = js.native
  
  @JSImport("vega-typings", "scale")
  @js.native
  def scale(`type`: String): js.Any = js.native
  @JSImport("vega-typings", "scale")
  @js.native
  def scale(`type`: String, scale: js.Any): js.Any = js.native
  
  @JSImport("vega-typings", "sceneVisit")
  @js.native
  def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  @JSImport("vega-typings", "sceneVisit")
  @js.native
  def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  
  @JSImport("vega-typings", "scheme")
  @js.native
  def scheme(name: String): js.Any = js.native
  @JSImport("vega-typings", "scheme")
  @js.native
  def scheme(name: String, scheme: js.Any): js.Any = js.native
  
  @JSImport("vega-typings", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String): js.Any = js.native
  @JSImport("vega-typings", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String, scheme: js.UndefOr[scala.Nothing], interpolator: js.Any): js.Any = js.native
  @JSImport("vega-typings", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String, scheme: js.Any): js.Any = js.native
  @JSImport("vega-typings", "schemeDiscretized")
  @js.native
  def schemeDiscretized(name: String, scheme: js.Any, interpolator: js.Any): js.Any = js.native
  
  @JSImport("vega-typings", "span")
  @js.native
  def span(array: js.Array[Double]): Double = js.native
  
  @JSImport("vega-typings", "splitAccessPath")
  @js.native
  def splitAccessPath(path: String): js.Array[String] = js.native
  
  @JSImport("vega-typings", "stringValue")
  @js.native
  def stringValue(a: js.Any): String = js.native
  
  @JSImport("vega-typings", "timeFormatLocale")
  @js.native
  def timeFormatLocale(definition: js.Object): Unit = js.native
  
  @JSImport("vega-typings", "toBoolean")
  @js.native
  def toBoolean(a: js.Any): Boolean = js.native
  
  @JSImport("vega-typings", "toDate")
  @js.native
  def toDate(a: js.Any): Double = js.native
  @JSImport("vega-typings", "toDate")
  @js.native
  def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = js.native
  
  @JSImport("vega-typings", "toNumber")
  @js.native
  def toNumber(a: js.Any): Double = js.native
  
  @JSImport("vega-typings", "toSet")
  @js.native
  def toSet[T](array: js.Array[T]): StringDictionary[`true`] = js.native
  
  @JSImport("vega-typings", "toString")
  @js.native
  def toString_(a: js.Any): String = js.native
  
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate(a: String, length: Double): String = js.native
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate(a: String, length: Double, align: js.UndefOr[scala.Nothing], ellipsis: String): String = js.native
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate_center(a: String, length: Double, align: center): String = js.native
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = js.native
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate_left(a: String, length: Double, align: left): String = js.native
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = js.native
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate_right(a: String, length: Double, align: right): String = js.native
  @JSImport("vega-typings", "truncate")
  @js.native
  def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = js.native
  
  @JSImport("vega-typings", "truthy")
  @js.native
  def truthy(): `true` = js.native
  
  @JSImport("vega-typings", "tupleid")
  @js.native
  def tupleid(t: js.Any): Double = js.native
  
  @JSImport("vega-typings", "utcquarter")
  @js.native
  def utcquarter(date: Double): Double = js.native
  @JSImport("vega-typings", "utcquarter")
  @js.native
  def utcquarter(date: Date): Double = js.native
  
  @JSImport("vega-typings", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("vega-typings", "visitArray")
  @js.native
  def visitArray(
    array: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  @JSImport("vega-typings", "visitArray")
  @js.native
  def visitArray(
    array: js.Array[_],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  
  @JSImport("vega-typings", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = js.native
  @JSImport("vega-typings", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = js.native
  @JSImport("vega-typings", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = js.native
  
  @JSImport("vega-typings", "zero")
  @js.native
  def zero(): `0` = js.native
  
  @JSImport("vega-typings", "zoomLinear")
  @js.native
  def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  @JSImport("vega-typings", "zoomLinear")
  @js.native
  def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "zoomLog")
  @js.native
  def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  @JSImport("vega-typings", "zoomLog")
  @js.native
  def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "zoomPow")
  @js.native
  def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = js.native
  @JSImport("vega-typings", "zoomPow")
  @js.native
  def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = js.native
  
  @JSImport("vega-typings", "zoomSymlog")
  @js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = js.native
  @JSImport("vega-typings", "zoomSymlog")
  @js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = js.native
}
