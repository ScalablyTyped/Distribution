package typings.uirouterCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.commonCommonMod.Mapper
import typings.uirouterCore.commonCommonMod.Obj
import typings.uirouterCore.commonCommonMod.Predicate
import typings.uirouterCore.commonCommonMod.TypedMap
import typings.uirouterCore.coreservicesMod.CoreServices
import typings.uirouterCore.stateObjectMod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@uirouter/core/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Trace categories Enum
    *
    * Enable or disable a category using [[Trace.enable]] or [[Trace.disable]]
    *
    * `trace.enable(Category.TRANSITION)`
    *
    * These can also be provided using a matching string, or position ordinal
    *
    * `trace.enable("TRANSITION")`
    *
    * `trace.enable(1)`
    */
  @JSImport("@uirouter/core/lib/common", "Category")
  @js.native
  object Category extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.traceMod.Category with Double] = js.native
    
    /* 2 */ val HOOK: typings.uirouterCore.traceMod.Category.HOOK with Double = js.native
    
    /* 0 */ val RESOLVE: typings.uirouterCore.traceMod.Category.RESOLVE with Double = js.native
    
    /* 1 */ val TRANSITION: typings.uirouterCore.traceMod.Category.TRANSITION with Double = js.native
    
    /* 3 */ val UIVIEW: typings.uirouterCore.traceMod.Category.UIVIEW with Double = js.native
    
    /* 4 */ val VIEWCONFIG: typings.uirouterCore.traceMod.Category.VIEWCONFIG with Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/common", "Glob")
  @js.native
  class Glob protected ()
    extends typings.uirouterCore.globMod.Glob {
    def this(text: String) = this()
  }
  /* static members */
  object Glob {
    
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    @JSImport("@uirouter/core/lib/common", "Glob.fromString")
    @js.native
    def fromString(text: String): typings.uirouterCore.globMod.Glob = js.native
    
    /** Returns true if the string has glob-like characters in it */
    @JSImport("@uirouter/core/lib/common", "Glob.is")
    @js.native
    def is(text: String): Boolean = js.native
  }
  
  @JSImport("@uirouter/core/lib/common", "Queue")
  @js.native
  class Queue[T] ()
    extends typings.uirouterCore.queueMod.Queue[T] {
    def this(_items: js.Array[T]) = this()
    def this(_items: js.UndefOr[scala.Nothing], _limit: Double) = this()
    def this(_items: js.Array[T], _limit: Double) = this()
  }
  
  @JSImport("@uirouter/core/lib/common", "Trace")
  @js.native
  /** @internal */
  class Trace_ ()
    extends typings.uirouterCore.traceMod.Trace_
  
  @JSImport("@uirouter/core/lib/common", "_extend")
  @js.native
  def _extend(toObj: Obj, fromObjs: Obj*): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "_inArray")
  @js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, Boolean] = js.native
  @JSImport("@uirouter/core/lib/common", "_inArray")
  @js.native
  def _inArray(array: js.Array[_], obj: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "_pushTo")
  @js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  @JSImport("@uirouter/core/lib/common", "_pushTo")
  @js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  
  @JSImport("@uirouter/core/lib/common", "_removeFrom")
  @js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  @JSImport("@uirouter/core/lib/common", "_removeFrom")
  @js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common", "all")
  @js.native
  def all(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  
  @JSImport("@uirouter/core/lib/common", "allTrueR")
  @js.native
  def allTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "ancestors")
  @js.native
  def ancestors(first: StateObject, second: StateObject): js.Array[StateObject] = js.native
  
  @JSImport("@uirouter/core/lib/common", "and")
  @js.native
  def and(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "any")
  @js.native
  def any(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  
  @JSImport("@uirouter/core/lib/common", "anyTrueR")
  @js.native
  def anyTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "applyPairs")
  @js.native
  def applyPairs(memo: TypedMap[_], keyValTuple: js.Array[_]): TypedMap[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "arrayTuples")
  @js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "assertFn")
  @js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  @JSImport("@uirouter/core/lib/common", "assertFn")
  @js.native
  def assertFn(predicateOrMap: js.Function, errMsg: String): js.Any = js.native
  @JSImport("@uirouter/core/lib/common", "assertFn")
  @js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "assertMap")
  @js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: String): js.Function1[/* t */ T, U] = js.native
  @JSImport("@uirouter/core/lib/common", "assertMap")
  @js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = js.native
  
  @JSImport("@uirouter/core/lib/common", "assertPredicate")
  @js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: String): Predicate[T] = js.native
  @JSImport("@uirouter/core/lib/common", "assertPredicate")
  @js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = js.native
  
  @JSImport("@uirouter/core/lib/common", "beforeAfterSubstr")
  @js.native
  def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  
  @JSImport("@uirouter/core/lib/common", "compose")
  @js.native
  def compose(): js.Function0[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "copy")
  @js.native
  def copy(src: Obj): js.Any = js.native
  @JSImport("@uirouter/core/lib/common", "copy")
  @js.native
  def copy(src: Obj, dest: Obj): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = js.native
  @JSImport("@uirouter/core/lib/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(
    source: js.Function,
    target: Obj,
    bind: js.Function,
    fnNames: js.UndefOr[scala.Nothing],
    latebind: Boolean
  ): Obj = js.native
  @JSImport("@uirouter/core/lib/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = js.native
  @JSImport("@uirouter/core/lib/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = js.native
  
  @JSImport("@uirouter/core/lib/common", "curry")
  @js.native
  def curry(fn: js.Function): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common", "defaults")
  @js.native
  def defaults(opts: js.Any, defaultsList: Obj*): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "deregAll")
  @js.native
  def deregAll(functions: js.Array[js.Function]): Unit = js.native
  
  @JSImport("@uirouter/core/lib/common", "eq")
  @js.native
  def eq_(comp: js.Any): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "equals")
  @js.native
  val equals_ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "extend")
  @js.native
  val extend: js.Function2[/* toObj */ Obj, /* repeated */ Obj, js.Any] = js.native
  
  @JSImport("@uirouter/core/lib/common", "filter")
  @js.native
  def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = js.native
  @JSImport("@uirouter/core/lib/common", "filter")
  @js.native
  def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = js.native
  
  @JSImport("@uirouter/core/lib/common", "find")
  @js.native
  def find[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  @JSImport("@uirouter/core/lib/common", "find")
  @js.native
  def find[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
  
  @JSImport("@uirouter/core/lib/common", "flatten")
  @js.native
  def flatten(arr: js.Array[_]): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "flattenR")
  @js.native
  def flattenR(memo: js.Array[_], elem: js.Any): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "fnToString")
  @js.native
  def fnToString(fn: IInjectable): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "forEach")
  @js.native
  val forEach: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "fromJson")
  @js.native
  val fromJson: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "functionToString")
  @js.native
  def functionToString(fn: js.Function): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "hostRegex")
  @js.native
  val hostRegex: RegExp = js.native
  
  @JSImport("@uirouter/core/lib/common", "identity")
  @js.native
  def identity(x: js.Any): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "inArray")
  @js.native
  def inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, Boolean] = js.native
  @JSImport("@uirouter/core/lib/common", "inArray")
  @js.native
  def inArray(array: js.Array[_], obj: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "inherit")
  @js.native
  def inherit(parent: Obj): js.Any = js.native
  @JSImport("@uirouter/core/lib/common", "inherit")
  @js.native
  def inherit(parent: Obj, extra: Obj): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "invoke")
  @js.native
  def invoke(fnName: String): js.Function = js.native
  @JSImport("@uirouter/core/lib/common", "invoke")
  @js.native
  def invoke(fnName: String, args: js.Array[_]): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common", "is")
  @js.native
  def is[T](ctor: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ Boolean] = js.native
  
  @JSImport("@uirouter/core/lib/common", "isArray")
  @js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isDate")
  @js.native
  def isDate(x: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isDefined")
  @js.native
  val isDefined: Predicate[js.Any] = js.native
  
  @JSImport("@uirouter/core/lib/common", "isFunction")
  @js.native
  def isFunction(x: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isInjectable")
  @js.native
  def isInjectable(`val`: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isNull")
  @js.native
  def isNull(o: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isNullOrUndefined")
  @js.native
  val isNullOrUndefined: Predicate[js.Any] = js.native
  
  @JSImport("@uirouter/core/lib/common", "isNumber")
  @js.native
  def isNumber(x: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isObject")
  @js.native
  def isObject(x: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isPromise")
  @js.native
  def isPromise(x: js.Any): /* is std.Promise<any> */ Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isRegExp")
  @js.native
  def isRegExp(x: js.Any): /* is std.RegExp */ Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isString")
  @js.native
  def isString(x: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "isUndefined")
  @js.native
  def isUndefined(x: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common", "joinNeighborsR")
  @js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "kebobString")
  @js.native
  def kebobString(camelCase: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common", "makeStub")
  @js.native
  def makeStub[T](service: String, methods: js.Array[/* keyof T */ String]): T = js.native
  
  @JSImport("@uirouter/core/lib/common", "map")
  @js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = js.native
  @JSImport("@uirouter/core/lib/common", "map")
  @js.native
  def map[T, U](
    collection: js.Array[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = js.native
  @JSImport("@uirouter/core/lib/common", "map")
  @js.native
  def map[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = js.native
  @JSImport("@uirouter/core/lib/common", "map")
  @js.native
  def map[T, U](
    collection: StringDictionary[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): StringDictionary[U] = js.native
  
  @JSImport("@uirouter/core/lib/common", "mapObj")
  @js.native
  def mapObj: js.Function3[
    /* collection */ StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    StringDictionary[js.Any]
  ] = js.native
  @scala.inline
  def mapObj_=(
    x: js.Function3[
      /* collection */ StringDictionary[js.Any], 
      /* callback */ Mapper[js.Any, js.Any], 
      /* target */ js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
      ], 
      StringDictionary[js.Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapObj")(x.asInstanceOf[js.Any])
  
  @JSImport("@uirouter/core/lib/common", "maxLength")
  @js.native
  def maxLength(max: Double, str: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common", "mergeR")
  @js.native
  def mergeR(memo: Obj, item: Obj): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "noop")
  @js.native
  def noop(): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "not")
  @js.native
  def not(fn: Predicate[_]): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "omit")
  @js.native
  def omit(obj: Obj, propNames: js.Array[String]): Obj = js.native
  
  @JSImport("@uirouter/core/lib/common", "or")
  @js.native
  def or(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "padString")
  @js.native
  def padString(length: Double, str: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common", "pairs")
  @js.native
  def pairs(obj: Obj): js.Array[js.Array[_]] = js.native
  
  @JSImport("@uirouter/core/lib/common", "parse")
  @js.native
  def parse(name: String): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "pattern")
  @js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common", "pick")
  @js.native
  def pick(obj: Obj, propNames: js.Array[String]): Obj = js.native
  
  @JSImport("@uirouter/core/lib/common", "pipe")
  @js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  
  @JSImport("@uirouter/core/lib/common", "pluck")
  @js.native
  def pluck(collection: StringDictionary[js.Any], propName: String): StringDictionary[js.Any] = js.native
  @JSImport("@uirouter/core/lib/common", "pluck")
  @js.native
  def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common", "prop")
  @js.native
  def prop(name: String): js.Function1[/* obj */ js.Any, _] = js.native
  
  @JSImport("@uirouter/core/lib/common", "propEq")
  @js.native
  val propEq: js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common", "pushR")
  @js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "pushTo")
  @js.native
  def pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  @JSImport("@uirouter/core/lib/common", "pushTo")
  @js.native
  def pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  
  @JSImport("@uirouter/core/lib/common", "removeFrom")
  @js.native
  def removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  @JSImport("@uirouter/core/lib/common", "removeFrom")
  @js.native
  def removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common", "root")
  @js.native
  val root: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "services")
  @js.native
  val services: CoreServices = js.native
  
  @JSImport("@uirouter/core/lib/common", "silenceUncaughtInPromise")
  @js.native
  def silenceUncaughtInPromise(promise: js.Promise[_]): js.Promise[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "silentRejection")
  @js.native
  def silentRejection(error: js.Any): js.Promise[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "splitEqual")
  @js.native
  def splitEqual(str: String): js.Array[String] = js.native
  
  @JSImport("@uirouter/core/lib/common", "splitHash")
  @js.native
  def splitHash(str: String): js.Array[String] = js.native
  
  @JSImport("@uirouter/core/lib/common", "splitOnDelim")
  @js.native
  def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  
  @JSImport("@uirouter/core/lib/common", "splitQuery")
  @js.native
  def splitQuery(str: String): js.Array[String] = js.native
  
  @JSImport("@uirouter/core/lib/common", "stringify")
  @js.native
  def stringify(o: js.Any): String = js.native
  
  @JSImport("@uirouter/core/lib/common", "stripLastPathElement")
  @js.native
  def stripLastPathElement(str: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common", "tail")
  @js.native
  def tail[T](arr: js.Array[T]): T = js.native
  
  @JSImport("@uirouter/core/lib/common", "toJson")
  @js.native
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
  @JSImport("@uirouter/core/lib/common", "trace")
  @js.native
  val trace: typings.uirouterCore.traceMod.Trace_ = js.native
  
  @JSImport("@uirouter/core/lib/common", "trimHashVal")
  @js.native
  def trimHashVal(str: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common", "uniqR")
  @js.native
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common", "unnest")
  @js.native
  def unnest(arr: js.Array[_]): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "unnestR")
  @js.native
  def unnestR(memo: js.Array[_], elem: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common", "values")
  @js.native
  def values[T](obj: TypedMap[T]): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common", "val")
  @js.native
  def `val`[T](v: T): js.Function0[T] = js.native
}
