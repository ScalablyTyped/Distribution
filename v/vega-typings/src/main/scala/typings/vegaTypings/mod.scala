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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-typings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def this(init: js.Any, params: js.Any) = this()
    def this(init: Unit, params: js.Any) = this()
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
  
  @scala.inline
  def accessor[R](fn: Fn[R]): AccessorFn[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[R]]
  @scala.inline
  def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  @scala.inline
  def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  @scala.inline
  def accessor[R](fn: Fn[R], fields: Unit, name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  
  @scala.inline
  def accessorFields(fn: AccessorFn[js.Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorFields")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def accessorName(fn: AccessorFn[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def array[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def array[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def ascending(a: js.Any, b: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def changeset(): Changeset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("changeset")().asInstanceOf[Changeset_]
  
  @scala.inline
  def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampRange")(range.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: js.Array[AccessorFn[js.Any] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: js.Array[AccessorFn[js.Any] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: js.Array[AccessorFn[js.Any] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: AccessorFn[js.Any]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: AccessorFn[js.Any], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  @scala.inline
  def compare(fields: AccessorFn[js.Any], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  
  @scala.inline
  def constant[V](v: V): js.Function0[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[V]]
  
  @scala.inline
  def debounce[F /* <: js.Function */](delay: Double, func: F): F = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(delay.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[F]
  
  @scala.inline
  def error(msg: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  @scala.inline
  def expressionFunction(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def expressionFunction(name: String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def expressionFunction(name: String, fn: js.Any, visitor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def expressionFunction(name: String, fn: Unit, visitor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionFunction")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def extend[T](target: T, source: Partial[T]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def extent(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def extent(array: js.Array[Double], accessor: AccessorFn[js.Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def extentIndex(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def extentIndex(array: js.Array[Double], accessor: AccessorFn[js.Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def falsy(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("falsy")().asInstanceOf[`false`]
  
  @scala.inline
  def fastmap(): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")().asInstanceOf[FastMap_]
  @scala.inline
  def fastmap(_underscore: js.Object): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")(_underscore.asInstanceOf[js.Any]).asInstanceOf[FastMap_]
  
  @scala.inline
  def field(field: String): AccessorFn[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[js.Any]]
  @scala.inline
  def field(field: String, name: String): AccessorFn[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[js.Any]]
  
  @scala.inline
  def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(range.asInstanceOf[js.Any], value.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def formatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def id(_underscore: js.Object): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  
  @scala.inline
  def identity[V](v: V): V = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[V]
  
  @scala.inline
  def inferType(values: js.Array[js.Any]): TypeInference = ^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any]).asInstanceOf[TypeInference]
  @scala.inline
  def inferType(values: js.Array[js.Any], field: String): TypeInference = (^.asInstanceOf[js.Dynamic].applyDynamic("inferType")(values.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TypeInference]
  
  @scala.inline
  def inferTypes(values: js.Array[js.Any], fields: js.Array[String]): StringDictionary[TypeInference] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferTypes")(values.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TypeInference]]
  
  @scala.inline
  def ingest(datum: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ingest")(datum.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[C & P]
  @scala.inline
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[C & P]
  
  @scala.inline
  def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inrange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  @scala.inline
  def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  @scala.inline
  def isBoolean(a: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  @scala.inline
  def isDate(a: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  @scala.inline
  def isFunction(a: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isIterable(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNumber(a: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @scala.inline
  def isObject(a: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(a.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  @scala.inline
  def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  @scala.inline
  def isString(a: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def isTuple(t: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuple")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  @scala.inline
  def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any], flat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  
  @scala.inline
  def lerp(array: js.Array[Double], fraction: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(array.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def loader(): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")().asInstanceOf[Loader_]
  @scala.inline
  def loader(opt: LoaderOptions): Loader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loader")(opt.asInstanceOf[js.Any]).asInstanceOf[Loader_]
  
  @scala.inline
  def log(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def logger(): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")().asInstanceOf[LoggerInterface]
  @scala.inline
  def logger(_underscore: Double): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any]).asInstanceOf[LoggerInterface]
  @scala.inline
  def logger(_underscore: Double, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  @scala.inline
  def logger(_underscore: Unit, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  
  @scala.inline
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any],
    output: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mergeConfig[C /* <: js.Object */](c: C*): C = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(c.asInstanceOf[js.Any]).asInstanceOf[C]
  
  @scala.inline
  def merge_Array(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def one(): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[`1`]
  
  @scala.inline
  def pad(str: String, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pad(str: String, len: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pad_center(str: String, len: Double, char: String, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pad_center(str: String, len: Double, char: Unit, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pad_left(str: String, len: Double, char: String, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pad_left(str: String, len: Double, char: Unit, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pad_right(str: String, len: Double, char: String, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pad_right(str: String, len: Double, char: Unit, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLinear")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panPow")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panSymlog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def parse(spec: Spec): Runtime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any]).asInstanceOf[Runtime]
  @scala.inline
  def parse(spec: Spec, config: Unit, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  @scala.inline
  def parse(spec: Spec, config: Config): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  @scala.inline
  def parse(spec: Spec, config: Config, opt: Ast): Runtime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Runtime]
  
  @scala.inline
  def peek(array: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")(array.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def projection(`type`: String, projection: js.Any): typings.vegaTypings.runtimeMod.View = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(`type`.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.vegaTypings.runtimeMod.View]
  
  @scala.inline
  def quarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def quarter(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def read(data: String, schema: Format): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def read(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, Date]): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], dateParse.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  @scala.inline
  def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("renderModule")(moduleName.asInstanceOf[js.Any], renderModule.asInstanceOf[js.Any])).asInstanceOf[RenderModule_]
  
  @scala.inline
  def repeat(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def scale(`type`: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def scale(`type`: String, scale: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(`type`.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sceneVisit")(scene.asInstanceOf[js.Any], itemCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def scheme(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def scheme(name: String, scheme: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def schemeDiscretized(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def schemeDiscretized(name: String, scheme: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def schemeDiscretized(name: String, scheme: js.Any, interpolator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def schemeDiscretized(name: String, scheme: Unit, interpolator: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("schemeDiscretized")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def span(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def splitAccessPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAccessPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stringValue(a: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringValue")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def timeFormatLocale(definition: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatLocale")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def toBoolean(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def toDate(a: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def toNumber(a: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toSet[T](array: js.Array[T]): StringDictionary[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSet")(array.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[`true`]]
  
  @scala.inline
  def toString_(a: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def truncate(a: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def truncate(a: String, length: Double, align: Unit, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def truncate_center(a: String, length: Double, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def truncate_left(a: String, length: Double, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def truncate_right(a: String, length: Double, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def truthy(): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")().asInstanceOf[`true`]
  
  @scala.inline
  def tupleid(t: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleid")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def utcquarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def utcquarter(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("vega-typings", "version")
  @js.native
  val version: String = js.native
  
  @scala.inline
  def visitArray(
    array: js.Array[js.Any],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def visitArray(
    array: Unit,
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def zero(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[`0`]
  
  @scala.inline
  def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
