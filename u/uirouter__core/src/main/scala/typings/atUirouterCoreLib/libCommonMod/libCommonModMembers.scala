package typings
package atUirouterCoreLib.libCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common", JSImport.Namespace)
@js.native
object libCommonModMembers extends js.Object {
  val all: js.Function1[
    /* fn1 */ atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any], 
    js.Function1[/* arr */ js.Array[js.Any], scala.Boolean]
  ] = js.native
  val allTrueR: js.Function2[/* memo */ scala.Boolean, /* elem */ js.Any, js.Any] = js.native
  val any: js.Function1[
    /* fn1 */ atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any], 
    js.Function1[/* arr */ js.Array[js.Any], scala.Boolean]
  ] = js.native
  val anyTrueR: js.Function2[/* memo */ scala.Boolean, /* elem */ js.Any, js.Any] = js.native
  val assertMap: js.Function2[
    /* mapFn */ js.Function1[/* t */ js.Any, js.Any], 
    /* errMsg */ java.lang.String | js.Function, 
    js.Function1[/* t */ js.Any, js.Any]
  ] = js.native
  val assertPredicate: js.Function2[
    /* predicate */ atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any], 
    /* errMsg */ java.lang.String | js.Function, 
    atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any]
  ] = js.native
  val beforeAfterSubstr: js.Function1[
    /* char */ java.lang.String, 
    js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]]
  ] = js.native
  val deregAll: js.Function1[/* functions */ js.Array[js.Function], scala.Unit] = js.native
  @JSName("eq")
  val eq_FlibCommonModMembers: js.Function1[/* comp */ js.Any, atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any]] = js.native
  @JSName("equals")
  val equals_FlibCommonModMembers: js.Any = js.native
  val extend: atUirouterCoreLib.Anon_Target = js.native
  val flatten: js.Function1[/* arr */ js.Array[js.Any], js.Any] = js.native
  val flattenR: js.Function2[/* memo */ js.Array[js.Any], /* elem */ js.Any, js.Any] = js.native
  val forEach: js.Any = js.native
  val fromJson: js.Any = js.native
  val hostRegex: stdLib.RegExp = js.native
  val inArray: js.Function1[/* array */ js.Array[js.Any], js.Function1[/* obj */ js.Any, scala.Boolean]] = js.native
  val inherit: js.Function2[
    /* parent */ atUirouterCoreLib.libCommonCommonMod.Obj, 
    /* extra */ js.UndefOr[atUirouterCoreLib.libCommonCommonMod.Obj], 
    js.Any
  ] = js.native
  val is: js.Function1[
    /* ctor */ ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any], 
    js.Function1[/* obj */ js.Any, /* is any */scala.Boolean]
  ] = js.native
  val isArray: js.Function1[/* arg */ js.Any, /* is Array */scala.Boolean] = js.native
  val isDate: js.Function1[/* x */ js.Any, /* is Date */scala.Boolean] = js.native
  val isDefined: atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any] = js.native
  val isFunction: js.Function1[/* x */ js.Any, /* is Function */scala.Boolean] = js.native
  val isNull: js.Function1[/* o */ js.Any, scala.Boolean] = js.native
  val isNullOrUndefined: atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any] = js.native
  val isNumber: js.Function1[/* x */ js.Any, /* is number */scala.Boolean] = js.native
  val isObject: js.Function1[/* x */ js.Any, scala.Boolean] = js.native
  val isPromise: js.Function1[/* x */ js.Any, /* is Promise */scala.Boolean] = js.native
  val isRegExp: js.Function1[/* x */ js.Any, /* is RegExp */scala.Boolean] = js.native
  val isString: js.Function1[/* x */ js.Any, /* is string */scala.Boolean] = js.native
  val isUndefined: js.Function1[/* x */ js.Any, scala.Boolean] = js.native
  val makeStub: js.Function2[/* service */ java.lang.String, /* methods */ js.Array[java.lang.String], js.Any] = js.native
  var mapObj: js.Function3[
    /* collection */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    /* callback */ atUirouterCoreLib.libCommonCommonMod.Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[js.Any], 
    ScalablyTyped.runtime.StringDictionary[js.Any]
  ] = js.native
  val mergeR: js.Function2[
    /* memo */ atUirouterCoreLib.libCommonCommonMod.Obj, 
    /* item */ atUirouterCoreLib.libCommonCommonMod.Obj, 
    atUirouterCoreLib.libCommonCommonMod.Obj
  ] = js.native
  val not: js.Function1[
    /* fn */ atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any], 
    atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any]
  ] = js.native
  val pairs: js.Function1[/* obj */ atUirouterCoreLib.libCommonCommonMod.Obj, js.Array[js.Array[js.Any]]] = js.native
  val parse: js.Function1[/* name */ java.lang.String, js.Any] = js.native
  val prop: js.Function1[/* name */ java.lang.String, js.Function1[/* obj */ js.Any, js.Any]] = js.native
  val propEq: js.Function = js.native
  val pushTo: js.Function1[/* arr */ js.Array[js.Any], js.Function1[/* val */ js.Any, js.Any]] = js.native
  val removeFrom: js.Function1[/* array */ js.Array[js.Any], js.Function1[/* obj */ js.Any, js.Array[js.Any]]] = js.native
  val root: js.Any = js.native
  val services: atUirouterCoreLib.libCommonCoreservicesMod.CoreServices = js.native
  val silenceUncaughtInPromise: js.Function1[/* promise */ js.Promise[js.Any], js.Promise[js.Any]] = js.native
  val silentRejection: js.Function1[/* error */ js.Any, js.Promise[js.Any]] = js.native
  val splitEqual: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  val splitHash: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  val splitQuery: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  val stripLastPathElement: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  val toJson: js.Any = js.native
  /**
   * The [[Trace]] singleton
   *
   * #### Example:
   * ```js
   * import {trace} from "@uirouter/core";
   * trace.enable(1, 5);
   * ```
   */
  val trace: atUirouterCoreLib.libCommonTraceMod.Trace = js.native
  val trimHashVal: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  val uniqR: js.Function2[/* acc */ js.Array[js.Any], /* token */ js.Any, js.Array[js.Any]] = js.native
  val unnest: js.Function1[/* arr */ js.Array[js.Any], js.Any] = js.native
  val unnestR: js.Function2[/* memo */ js.Array[js.Any], /* elem */ js.Array[js.Any], js.Array[js.Any]] = js.native
  val `val`: js.Function1[/* v */ js.Any, js.Function0[js.Any]] = js.native
  val values: js.Function1[/* obj */ atUirouterCoreLib.libCommonCommonMod.TypedMap[js.Any], js.Array[js.Any]] = js.native
  def _extend(
    toObj: atUirouterCoreLib.libCommonCommonMod.Obj,
    fromObjs: atUirouterCoreLib.libCommonCommonMod.Obj*
  ): js.Any = js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  def _inArray(array: js.Array[_], obj: js.Any): scala.Boolean = js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  def ancestors(
    first: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    second: atUirouterCoreLib.libStateStateObjectMod.StateObject
  ): js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  def and(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def applyPairs(memo: atUirouterCoreLib.libCommonCommonMod.TypedMap[_], keyValTuple: js.Array[_]): atUirouterCoreLib.libCommonCommonMod.TypedMap[_] = js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: java.lang.String): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  def compose(): js.Function0[_] = js.native
  def copy(src: atUirouterCoreLib.libCommonCommonMod.Obj): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def copy(src: atUirouterCoreLib.libCommonCommonMod.Obj, dest: atUirouterCoreLib.libCommonCommonMod.Obj): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def createProxyFunctions(source: js.Function, target: atUirouterCoreLib.libCommonCommonMod.Obj, bind: js.Function): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def createProxyFunctions(
    source: js.Function,
    target: atUirouterCoreLib.libCommonCommonMod.Obj,
    bind: js.Function,
    fnNames: js.Array[java.lang.String]
  ): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def createProxyFunctions(
    source: js.Function,
    target: atUirouterCoreLib.libCommonCommonMod.Obj,
    bind: js.Function,
    fnNames: js.Array[java.lang.String],
    latebind: scala.Boolean
  ): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def curry(fn: js.Function): js.Function = js.native
  def defaults(opts: js.Any, defaultsList: atUirouterCoreLib.libCommonCommonMod.Obj*): js.Any = js.native
  def filter[T](
    collection: atUirouterCoreLib.libCommonCommonMod.TypedMap[T],
    callback: js.Function2[/* t */ T, /* key */ js.UndefOr[java.lang.String], scala.Boolean]
  ): atUirouterCoreLib.libCommonCommonMod.TypedMap[T] = js.native
  def filter[T](
    collection: js.Array[T],
    callback: js.Function2[/* t */ T, /* key */ js.UndefOr[scala.Double], scala.Boolean]
  ): js.Array[T] = js.native
  def find[T](
    collection: atUirouterCoreLib.libCommonCommonMod.TypedMap[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Predicate[T]
  ): T = js.native
  def find[T](collection: js.Array[T], callback: atUirouterCoreLib.libCommonCommonMod.Predicate[T]): T = js.native
  def fnToString(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def identity(x: js.Any): js.Any = js.native
  def invoke(fnName: java.lang.String): js.Function = js.native
  def invoke(fnName: java.lang.String, args: js.Array[_]): js.Function = js.native
  def isInjectable(`val`: js.Any): scala.Boolean = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: java.lang.String): java.lang.String = js.native
  def map[T, U](
    collection: ScalablyTyped.runtime.StringDictionary[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U]
  ): ScalablyTyped.runtime.StringDictionary[U] = js.native
  def map[T, U](
    collection: ScalablyTyped.runtime.StringDictionary[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U],
    target: js.Any
  ): ScalablyTyped.runtime.StringDictionary[U] = js.native
  def map[T, U](collection: js.Array[T], callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U]): js.Array[U] = js.native
  def map[T, U](
    collection: js.Array[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U],
    target: js.Any
  ): js.Array[U] = js.native
  def maxLength(max: scala.Double, str: java.lang.String): java.lang.String = js.native
  def noop(): js.Any = js.native
  def omit(obj: atUirouterCoreLib.libCommonCommonMod.Obj, propNames: js.Array[java.lang.String]): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def or(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def padString(length: scala.Double, str: java.lang.String): java.lang.String = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pick(obj: atUirouterCoreLib.libCommonCommonMod.Obj, propNames: js.Array[java.lang.String]): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  def pluck(collection: ScalablyTyped.runtime.StringDictionary[js.Any], propName: java.lang.String): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def pluck[T](collection: js.Array[atUirouterCoreLib.libCommonCommonMod.Obj], propName: java.lang.String): js.Array[T] = js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  def splitOnDelim(delim: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def stringify(o: js.Any): java.lang.String = js.native
  def tail[T](arr: js.Array[T]): T = js.native
}

