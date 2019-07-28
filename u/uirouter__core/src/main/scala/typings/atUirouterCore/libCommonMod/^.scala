package typings.atUirouterCore.libCommonMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libCommonCommonMod.IInjectable
import typings.atUirouterCore.libCommonCommonMod.Mapper
import typings.atUirouterCore.libCommonCommonMod.Obj
import typings.atUirouterCore.libCommonCommonMod.Predicate
import typings.atUirouterCore.libCommonCommonMod.TypedMap
import typings.atUirouterCore.libCommonCoreservicesMod.CoreServices
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("equals")
  val `equals_F^`: js.Any = js.native
  val forEach: js.Any = js.native
  val fromJson: js.Any = js.native
  val hostRegex: RegExp = js.native
  val isDefined: Predicate[js.Any] = js.native
  val isNullOrUndefined: Predicate[js.Any] = js.native
  var mapObj: js.Function3[
    /* collection */ StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    StringDictionary[js.Any]
  ] = js.native
  val propEq: js.Function = js.native
  val root: js.Any = js.native
  val services: CoreServices = js.native
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
  val trace: typings.atUirouterCore.libCommonTraceMod.Trace = js.native
  def _extend(toObj: Obj, fromObjs: Obj*): js.Any = js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def _inArray(array: js.Array[_], obj: js.Any): Boolean = js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  def all(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  def allTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  def ancestors(first: StateObject, second: StateObject): js.Array[StateObject] = js.native
  def and(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  def any(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  def anyTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  def applyPairs(memo: TypedMap[_], keyValTuple: js.Array[_]): TypedMap[_] = js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: String): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: String): js.Function1[/* t */ T, U] = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: String): Predicate[T] = js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = js.native
  def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def compose(): js.Function0[_] = js.native
  def copy(src: Obj): Obj = js.native
  def copy(src: Obj, dest: Obj): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = js.native
  def curry(fn: js.Function): js.Function = js.native
  def defaults(opts: js.Any, defaultsList: Obj*): js.Any = js.native
  def deregAll(functions: js.Array[js.Function]): Unit = js.native
  def eq(comp: js.Any): Predicate[_] = js.native
  def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = js.native
  def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = js.native
  def find[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  def find[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
  def flatten(arr: js.Array[_]): js.Any = js.native
  def flattenR(memo: js.Array[_], elem: js.Any): js.Any = js.native
  def fnToString(fn: IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def identity(x: js.Any): js.Any = js.native
  def inherit(parent: Obj): js.Any = js.native
  def inherit(parent: Obj, extra: Obj): js.Any = js.native
  def invoke(fnName: String): js.Function = js.native
  def invoke(fnName: String, args: js.Array[_]): js.Function = js.native
  def is[T](ctor: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ Boolean] = js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  def isDate(x: js.Any): /* is std.Date */ Boolean = js.native
  def isFunction(x: js.Any): /* is std.Function */ Boolean = js.native
  def isInjectable(`val`: js.Any): Boolean = js.native
  def isNull(o: js.Any): Boolean = js.native
  def isNumber(x: js.Any): /* is number */ Boolean = js.native
  def isObject(x: js.Any): Boolean = js.native
  def isPromise(x: js.Any): /* is std.Promise<any> */ Boolean = js.native
  def isRegExp(x: js.Any): /* is std.RegExp */ Boolean = js.native
  def isString(x: js.Any): /* is string */ Boolean = js.native
  def isUndefined(x: js.Any): Boolean = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: String): String = js.native
  def makeStub[T](service: String, methods: js.Array[String]): T = js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = js.native
  def map[T, U](
    collection: js.Array[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = js.native
  def map[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = js.native
  def map[T, U](
    collection: StringDictionary[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): StringDictionary[U] = js.native
  def maxLength(max: Double, str: String): String = js.native
  def mergeR(memo: Obj, item: Obj): Obj = js.native
  def noop(): js.Any = js.native
  def not(fn: Predicate[_]): Predicate[_] = js.native
  def omit(obj: Obj, propNames: js.Array[String]): Obj = js.native
  def or(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  def padString(length: Double, str: String): String = js.native
  def pairs(obj: Obj): js.Array[js.Array[_]] = js.native
  def parse(name: String): js.Any = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pick(obj: Obj, propNames: js.Array[String]): Obj = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  def pluck(collection: StringDictionary[js.Any], propName: String): StringDictionary[js.Any] = js.native
  def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = js.native
  def prop(name: String): js.Function1[/* obj */ js.Any, _] = js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  def silenceUncaughtInPromise(promise: js.Promise[_]): js.Promise[_] = js.native
  def silentRejection(error: js.Any): js.Promise[_] = js.native
  def splitEqual(str: String): js.Array[String] = js.native
  def splitHash(str: String): js.Array[String] = js.native
  def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def splitQuery(str: String): js.Array[String] = js.native
  def stringify(o: js.Any): String = js.native
  def stripLastPathElement(str: String): String = js.native
  def tail[T](arr: js.Array[T]): T = js.native
  def trimHashVal(str: String): String = js.native
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = js.native
  def unnest(arr: js.Array[_]): js.Any = js.native
  def unnestR(memo: js.Array[_], elem: js.Array[_]): js.Array[_] = js.native
  def `val`[T](v: T): js.Function0[T] = js.native
  def values[T](obj: TypedMap[T]): js.Array[T] = js.native
}

