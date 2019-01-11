package typings
package atUirouterCoreLib.libCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("equals")
  val `equals_F^`: js.Any = js.native
  val extend: atUirouterCoreLib.Anon_Source = js.native
  val forEach: js.Any = js.native
  val fromJson: js.Any = js.native
  val hostRegex: stdLib.RegExp = js.native
  val inArray: atUirouterCoreLib.Anon_Array = js.native
  val isDefined: atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any] = js.native
  val isNullOrUndefined: atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any] = js.native
  var mapObj: js.Function3[
    /* collection */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* callback */ atUirouterCoreLib.libCommonCommonMod.Mapper[js.Any, js.Any], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.native
  val propEq: js.Function = js.native
  val pushTo: atUirouterCoreLib.Anon_Arr = js.native
  val removeFrom: atUirouterCoreLib.Anon_ArrayObj = js.native
  val root: js.Any = js.native
  val services: atUirouterCoreLib.libCommonCoreservicesMod.CoreServices = js.native
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
  def all(fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): js.Function1[/* arr */ js.Array[_], scala.Boolean] = js.native
  def allTrueR(memo: scala.Boolean, elem: js.Any): js.Any = js.native
  def ancestors(
    first: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    second: atUirouterCoreLib.libStateStateObjectMod.StateObject
  ): js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  def and(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def any(fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): js.Function1[/* arr */ js.Array[_], scala.Boolean] = js.native
  def anyTrueR(memo: scala.Boolean, elem: js.Any): js.Any = js.native
  def applyPairs(memo: atUirouterCoreLib.libCommonCommonMod.TypedMap[_], keyValTuple: js.Array[_]): atUirouterCoreLib.libCommonCommonMod.TypedMap[_] = js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: java.lang.String): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: java.lang.String): js.Function1[/* t */ T, U] = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = js.native
  def assertPredicate[T](predicate: atUirouterCoreLib.libCommonCommonMod.Predicate[T], errMsg: java.lang.String): atUirouterCoreLib.libCommonCommonMod.Predicate[T] = js.native
  def assertPredicate[T](predicate: atUirouterCoreLib.libCommonCommonMod.Predicate[T], errMsg: js.Function): atUirouterCoreLib.libCommonCommonMod.Predicate[T] = js.native
  def beforeAfterSubstr(char: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
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
  def deregAll(functions: js.Array[js.Function]): scala.Unit = js.native
  def eq(comp: js.Any): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
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
  def flatten(arr: js.Array[_]): js.Any = js.native
  def flattenR(memo: js.Array[_], elem: js.Any): js.Any = js.native
  def fnToString(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def identity(x: js.Any): js.Any = js.native
  def inherit(parent: atUirouterCoreLib.libCommonCommonMod.Obj): js.Any = js.native
  def inherit(parent: atUirouterCoreLib.libCommonCommonMod.Obj, extra: atUirouterCoreLib.libCommonCommonMod.Obj): js.Any = js.native
  def invoke(fnName: java.lang.String): js.Function = js.native
  def invoke(fnName: java.lang.String, args: js.Array[_]): js.Function = js.native
  def is[T](ctor: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ scala.Boolean] = js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def isDate(x: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isFunction(x: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isInjectable(`val`: js.Any): scala.Boolean = js.native
  def isNull(o: js.Any): scala.Boolean = js.native
  def isNumber(x: js.Any): /* is number */ scala.Boolean = js.native
  def isObject(x: js.Any): scala.Boolean = js.native
  def isPromise(x: js.Any): /* is std.Promise<any> */ scala.Boolean = js.native
  def isRegExp(x: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def isString(x: js.Any): /* is string */ scala.Boolean = js.native
  def isUndefined(x: js.Any): scala.Boolean = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: java.lang.String): java.lang.String = js.native
  def makeStub[T](service: java.lang.String, methods: js.Array[java.lang.String]): T = js.native
  def map[T, U](collection: js.Array[T], callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U]): js.Array[U] = js.native
  def map[T, U](
    collection: js.Array[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = js.native
  def map[T, U](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U]
  ): org.scalablytyped.runtime.StringDictionary[U] = js.native
  def map[T, U](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    callback: atUirouterCoreLib.libCommonCommonMod.Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): org.scalablytyped.runtime.StringDictionary[U] = js.native
  def maxLength(max: scala.Double, str: java.lang.String): java.lang.String = js.native
  def mergeR(memo: atUirouterCoreLib.libCommonCommonMod.Obj, item: atUirouterCoreLib.libCommonCommonMod.Obj): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def noop(): js.Any = js.native
  def not(fn: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def omit(obj: atUirouterCoreLib.libCommonCommonMod.Obj, propNames: js.Array[java.lang.String]): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def or(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def padString(length: scala.Double, str: java.lang.String): java.lang.String = js.native
  def pairs(obj: atUirouterCoreLib.libCommonCommonMod.Obj): js.Array[js.Array[_]] = js.native
  def parse(name: java.lang.String): js.Any = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pick(obj: atUirouterCoreLib.libCommonCommonMod.Obj, propNames: js.Array[java.lang.String]): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  def pluck(collection: org.scalablytyped.runtime.StringDictionary[js.Any], propName: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def pluck[T](collection: js.Array[atUirouterCoreLib.libCommonCommonMod.Obj], propName: java.lang.String): js.Array[T] = js.native
  def prop(name: java.lang.String): js.Function1[/* obj */ js.Any, _] = js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  def silenceUncaughtInPromise(promise: js.Promise[_]): js.Promise[_] = js.native
  def silentRejection(error: js.Any): js.Promise[_] = js.native
  def splitEqual(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitHash(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitOnDelim(delim: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def splitQuery(str: java.lang.String): js.Array[java.lang.String] = js.native
  def stringify(o: js.Any): java.lang.String = js.native
  def stripLastPathElement(str: java.lang.String): java.lang.String = js.native
  def tail[T](arr: js.Array[T]): T = js.native
  def trimHashVal(str: java.lang.String): java.lang.String = js.native
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = js.native
  def unnest(arr: js.Array[_]): js.Any = js.native
  def unnestR(memo: js.Array[_], elem: js.Array[_]): js.Array[_] = js.native
  def `val`[T](v: T): js.Function0[T] = js.native
  def values[T](obj: atUirouterCoreLib.libCommonCommonMod.TypedMap[T]): js.Array[T] = js.native
}

