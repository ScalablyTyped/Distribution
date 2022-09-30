package typings.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Expression
import typings.estree.mod.SequenceExpression
import typings.std.Partial
import typings.std.PropertyKey
import typings.vegaExpression.anon.Code
import typings.vegaExpression.mod.CodegenOptions
import typings.vegaTypings.anon.Ast
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.dataMod.Format
import typings.vegaTypings.dataflowMod.Changeset_
import typings.vegaTypings.rendererMod.RenderModule_
import typings.vegaTypings.runtimeMod.LoaderOptions
import typings.vegaTypings.runtimeMod.Loader_
import typings.vegaTypings.runtimeMod.TypeInference
import typings.vegaTypings.runtimeMod.ViewOptions
import typings.vegaTypings.runtimeRuntimeMod.Runtime
import typings.vegaTypings.sceneMod.Scene
import typings.vegaTypings.sceneMod.SceneGroup
import typings.vegaTypings.sceneMod.SceneItem
import typings.vegaTypings.specMod.Spec
import typings.vegaTypings.vegaTypingsBooleans.`false`
import typings.vegaTypings.vegaTypingsBooleans.`true`
import typings.vegaTypings.vegaTypingsInts.`0`
import typings.vegaTypings.vegaTypingsInts.`1`
import typings.vegaTypings.vegaTypingsStrings.DEBUG
import typings.vegaTypings.vegaTypingsStrings.ERROR
import typings.vegaTypings.vegaTypingsStrings.INFO
import typings.vegaTypings.vegaTypingsStrings.WARN
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.error_
import typings.vegaTypings.vegaTypingsStrings.left
import typings.vegaTypings.vegaTypingsStrings.log
import typings.vegaTypings.vegaTypingsStrings.right
import typings.vegaTypings.vegaTypingsStrings.warn_
import typings.vegaUtil.mod.AccessorFn
import typings.vegaUtil.mod.FastMap_
import typings.vegaUtil.mod.Fn
import typings.vegaUtil.mod.LoggerInterface
import typings.vegaUtil.mod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-typings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-typings", "Bounds")
  @js.native
  open class Bounds ()
    extends typings.vegaTypings.runtimeMod.Bounds
  
  @JSImport("vega-typings", "CanvasHandler")
  @js.native
  open class CanvasHandler ()
    extends typings.vegaTypings.runtimeMod.CanvasHandler
  
  @JSImport("vega-typings", "Debug")
  @js.native
  val Debug: Double = js.native
  
  @JSImport("vega-typings", "Error")
  @js.native
  val Error_ : Double = js.native
  
  @JSImport("vega-typings", "Handler")
  @js.native
  open class Handler ()
    extends typings.vegaTypings.runtimeMod.Handler
  
  @JSImport("vega-typings", "Info")
  @js.native
  val Info: Double = js.native
  
  @JSImport("vega-typings", "None")
  @js.native
  val None: Double = js.native
  
  @JSImport("vega-typings", "Operator")
  @js.native
  open class Operator ()
    extends typings.vegaTypings.runtimeMod.Operator {
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
  
  @JSImport("vega-typings", "Renderer")
  @js.native
  open class Renderer protected ()
    extends typings.vegaTypings.runtimeMod.Renderer {
    def this(loader: Loader_) = this()
  }
  
  @JSImport("vega-typings", "Transform")
  @js.native
  open class Transform ()
    extends typings.vegaTypings.runtimeMod.Transform {
    def this(init: Any) = this()
    def this(init: Any, params: Any) = this()
    def this(init: Unit, params: Any) = this()
  }
  
  @JSImport("vega-typings", "View")
  @js.native
  open class View protected ()
    extends typings.vegaTypings.runtimeMod.View {
    def this(runtime: Runtime) = this()
    def this(runtime: Runtime, opt: ViewOptions) = this()
  }
  
  @JSImport("vega-typings", "Warn")
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
  
  inline def projection(`type`: String, projection: Any): typings.vegaTypings.runtimeMod.View = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(`type`.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.vegaTypings.runtimeMod.View]
  
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
  
  @JSImport("vega-typings", "version")
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
}
